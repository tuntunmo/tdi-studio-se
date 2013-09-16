// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.actions.importproject;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.dialogs.EventLoopProgressMonitor;
import org.eclipse.ui.internal.wizards.datatransfer.ArchiveFileManipulations;
import org.eclipse.ui.internal.wizards.datatransfer.TarException;
import org.eclipse.ui.internal.wizards.datatransfer.TarFile;
import org.eclipse.ui.internal.wizards.datatransfer.TarLeveledStructureProvider;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceExportPage1;
import org.eclipse.ui.internal.wizards.datatransfer.ZipLeveledStructureProvider;
import org.osgi.framework.Bundle;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.exception.MessageBoxExceptionHandler;
import org.talend.commons.ui.swt.dialogs.ProgressDialog;
import org.talend.core.model.utils.TalendPropertiesUtil;
import org.talend.repository.i18n.Messages;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.ItemRecord;
import org.talend.repository.items.importexport.manager.ResourcesManager;

public class ImportDemoProjectItemsPage extends WizardFileSystemResourceExportPage1 implements ICheckStateListener {

    private CheckboxTableViewer wizardSelectionViewer;

    private Browser descriptionBrowser;

    private Text descriptionText;

    private List<DemoProjectBean> demoProjectList;

    private List<ResourcesManager> selectedDemoManagers = new ArrayList<ResourcesManager>();

    // private final ImportNodesBuilder nodesBuilder = new ImportNodesBuilder();

    private final static String DEFAUTL_DEMO_ICON = "icons/java.png";

    /**
     * ImportDemoProjectPage constructor.
     * 
     * @param selection
     */
    public ImportDemoProjectItemsPage(IStructuredSelection selection) {
        super(selection);
        this.setMessage(Messages.getString("ImportDemoProjectPage.message1")); //$NON-NLS-1$
        this.setTitle(Messages.getString("ImportDemoProjectPage.title")); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceExportPage1#createControl(org.eclipse.swt
     * .widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.verticalSpacing = 10;
        container.setLayout(layout);
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Label label = new Label(container, SWT.NONE);
        label.setText(Messages.getString("ImportDemoProjectPage.availableProjectsPrompt")); //$NON-NLS-1$
        GridData gd = new GridData();
        label.setLayoutData(gd);

        SashForm sashForm = new SashForm(container, SWT.HORIZONTAL);
        gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 300;
        sashForm.setLayoutData(gd);

        wizardSelectionViewer = CheckboxTableViewer.newCheckList(sashForm, SWT.CHECK);
        wizardSelectionViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));

        wizardSelectionViewer.addCheckStateListener(this);
        wizardSelectionViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                if (((IStructuredSelection) event.getSelection()).getFirstElement() instanceof DemoProjectBean) {
                    DemoProjectBean selectNode = (DemoProjectBean) ((IStructuredSelection) event.getSelection())
                            .getFirstElement();
                    showDescriptionIn(selectNode);
                }
            }
        });
        createDescriptionIn(sashForm);

        initializeViewer();
        Dialog.applyDialogFont(container);
        setControl(container);
    }

    /**
     * DOC Administrator Comment method "createDescriptionIn".
     * 
     * @param composite
     */
    public void createDescriptionIn(Composite composite) {

        if (TalendPropertiesUtil.isEnabledUseBrowser()) {
            descriptionBrowser = new Browser(composite, SWT.BORDER);
            descriptionBrowser.setText(""); //$NON-NLS-1$
            GridData gd = new GridData(GridData.FILL_BOTH);
            gd.widthHint = 200;
            descriptionBrowser.setLayoutData(gd);
        } else {
            descriptionText = new Text(composite, SWT.BORDER | SWT.WRAP);
            descriptionText.setText(""); //$NON-NLS-1$
            GridData gd = new GridData(GridData.FILL_BOTH);
            gd.widthHint = 200;
            descriptionText.setLayoutData(gd);
        }
    }

    public void showDescriptionIn(DemoProjectBean node) {
        String currentProDes = node.getDescriptionContents();
        if (descriptionBrowser != null && TalendPropertiesUtil.isEnabledUseBrowser() && !descriptionBrowser.isDisposed()) {
            descriptionBrowser.setText(currentProDes);
        } else if (descriptionText != null && !descriptionText.isDisposed()) {
            descriptionText.setText(currentProDes);
        }
    }

    /**
     * initializeViewer.
     */
    private void initializeViewer() {
        wizardSelectionViewer.setContentProvider(new IStructuredContentProvider() {

            @Override
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dispose() {
                // TODO Auto-generated method stub

            }

            @Override
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof List) {
                    return ((List) inputElement).toArray();
                }
                return null;
            }
        });
        wizardSelectionViewer.setLabelProvider(new ITableLabelProvider() {

            @Override
            public void removeListener(ILabelProviderListener listener) {

            }

            @Override
            public boolean isLabelProperty(Object element, String property) {
                return false;
            }

            @Override
            public void dispose() {

            }

            @Override
            public void addListener(ILabelProviderListener listener) {

            }

            @Override
            public String getColumnText(Object element, int columnIndex) {
                if (element instanceof DemoProjectBean) {
                    DemoProjectBean field = (DemoProjectBean) element;
                    return field.getDemoDesc();
                }
                return "";
            }

            @Override
            public Image getColumnImage(Object element, int columnIndex) {
                if (element instanceof DemoProjectBean) {
                    return getFullImagePath((DemoProjectBean) element);
                }
                return null;
            }
        });
        wizardSelectionViewer.setInput(this.demoProjectList);
    }

    private Set<String> getDemoProjectNodes() {
        Set<String> demoProjectNodes = new HashSet<String>();
        for (DemoProjectBean pro : this.demoProjectList) {
            demoProjectNodes.add(pro.getDescriptionContents());
        }
        return demoProjectNodes;
    }

    /**
     * getFullImagePath.
     * 
     * @param languageName
     * @return
     */
    private Image getFullImagePath(DemoProjectBean node) {
        URL url = null;
        String pluginPath = null;
        String relatedImagePath = null;
        Bundle bundle = null;
        if (node != null) {
            relatedImagePath = node.getIconUrl();//$NON-NLS-1$;
            bundle = Platform.getBundle(node.getPluginId());
        } else {
            relatedImagePath = DEFAUTL_DEMO_ICON;
            bundle = Platform.getBundle(org.talend.repository.RepositoryPlugin.PLUGIN_ID);
        }
        try {
            // url = FileLocator.resolve(bundle.getEntry(relatedImagePath));
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path(relatedImagePath), null));
            pluginPath = new Path(url.getFile()).toOSString();
        } catch (IOException e1) {
            ExceptionHandler.process(e1);
        }

        return new Image(null, pluginPath);
    }

    /**
     * Sets import demo project list.
     * 
     * @param demoProjectList
     */
    public void setImportDemoProjectList(List<DemoProjectBean> demoProjectList) {
        this.demoProjectList = demoProjectList;
        if (demoProjectList != null && demoProjectList.size() > 1) {
            this.setMessage(Messages.getString("ImportDemoProjectPage.message")); //$NON-NLS-1$
        }
    }

    /**
     * Gets the index of selected demo project.
     * 
     * @return
     */
    public List<ResourcesManager> getSelectedDemoManagers() {
        return selectedDemoManagers;
    }

    public boolean performCancel() {
        return true;
    }

    private List<DemoProjectBean> getCheckedElements() {
        List<DemoProjectBean> checkedElements = new ArrayList<DemoProjectBean>();
        for (Object obj : wizardSelectionViewer.getCheckedElements()) {
            if (obj instanceof DemoProjectBean) {
                checkedElements.add((DemoProjectBean) obj);
            }
        }
        return checkedElements;
    }

    public boolean performFinish() {
        List<DemoProjectBean> checkedElements = getCheckedElements();
        final List<ResourcesManager> finalCheckManagers = getResourceManagers(checkedElements);

        ProgressDialog progressDialog = new ProgressDialog(getShell()) {

            private IProgressMonitor monitorWrap;

            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                monitorWrap = new EventLoopProgressMonitor(monitor);

                for (ResourcesManager resManager : finalCheckManagers) {
                    List<ItemRecord> projectRecords = ImportExportHandlersManager.getInstance().populateImportingItems(
                            resManager, true, monitorWrap);
                    ImportExportHandlersManager.getInstance().importItemRecords(monitorWrap, resManager, projectRecords, true,
                            projectRecords.toArray(new ItemRecord[0]), null);
                }

                monitorWrap.done();
                MessageDialog.openInformation(getShell(),
                        Messages.getString("ImportDemoProjectAction.messageDialogTitle.demoProject"), //$NON-NLS-1$
                        Messages.getString("ImportDemoProjectAction.messageDialogContent.demoProjectImportedSuccessfully")); //$NON-NLS-1$
            }
        };

        try {
            progressDialog.executeProcess();
        } catch (InvocationTargetException e) {
            MessageBoxExceptionHandler.process(e.getTargetException(), getShell());
        } catch (InterruptedException e) {
            // Nothing to do
        }

        return true;
    }

    private List<ResourcesManager> getResourceManagers(List<DemoProjectBean> checkedProjectBean) {
        List<ResourcesManager> resManagers = new ArrayList<ResourcesManager>();
        try {

            for (DemoProjectBean pro : checkedProjectBean) {
                ResourcesManager resManager = null;

                Bundle bundle = Platform.getBundle(pro.getPluginId());
                URL demoURL = FileLocator.find(bundle, new Path(pro.getDemoProjectFilePath()), null);
                demoURL = FileLocator.toFileURL(demoURL);
                String filePath = new Path(demoURL.getFile()).toOSString();
                File srcFile = new File(filePath);
                Object path2Object = srcFile;
                if (ArchiveFileManipulations.isTarFile(filePath)) {
                    TarFile sourceTarFile = getSpecifiedTarSourceFile(srcFile);
                    if (sourceTarFile == null) {
                        continue;
                    }
                    TarLeveledStructureProvider provider = new TarLeveledStructureProvider(sourceTarFile);
                    resManager = org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory.getInstance()
                            .createResourcesManager(provider);
                    path2Object = provider.getRoot();

                } else if (ArchiveFileManipulations.isZipFile(filePath)) {
                    ZipFile sourceFile = getSpecifiedZipSourceFile(srcFile);
                    if (sourceFile == null) {
                        continue;
                    }
                    ZipLeveledStructureProvider provider = new ZipLeveledStructureProvider(sourceFile);
                    resManager = org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory.getInstance()
                            .createResourcesManager(provider);
                    path2Object = provider.getRoot();

                } else if (srcFile.isDirectory()) {
                    resManager = org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory.getInstance()
                            .createResourcesManager();
                }
                resManager.collectPath2Object(path2Object);
                if (resManager != null) {
                    resManagers.add(resManager);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resManagers;
    }

    private TarFile getSpecifiedTarSourceFile(File srcFile) {
        if (!srcFile.exists()) {
            return null;
        }
        try {
            return new TarFile(srcFile);
        } catch (TarException e) {
            displayErrorDialog(Messages.getString("ImportItemsWizardPage_TarImport_badFormat")); //$NON-NLS-1$ 
        } catch (IOException e) {
            displayErrorDialog(Messages.getString("ImportItemsWizardPage_couldNotRead")); //$NON-NLS-1$ 
        }

        return null;
    }

    private ZipFile getSpecifiedZipSourceFile(File srcFile) {
        if (!srcFile.exists()) {
            return null;
        }
        try {
            return new ZipFile(srcFile);
        } catch (ZipException e) {
            displayErrorDialog(Messages.getString("ImportItemsWizardPage_ZipImport_badFormat")); //$NON-NLS-1$ 
        } catch (IOException e) {
            displayErrorDialog(Messages.getString("ImportItemsWizardPage_couldNotRead")); //$NON-NLS-1$ 
        }

        return null;
    }

    @Override
    public void checkStateChanged(CheckStateChangedEvent event) {
        if (event.getElement() instanceof DemoProjectBean) {
            DemoProjectBean proNode = (DemoProjectBean) event.getElement();
            showDescriptionIn(proNode);
        }
    }
}
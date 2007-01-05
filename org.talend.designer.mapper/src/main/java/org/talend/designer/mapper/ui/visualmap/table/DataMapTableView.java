// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.designer.mapper.ui.visualmap.table;

import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.talend.commons.ui.image.EImage;
import org.talend.commons.ui.swt.extended.table.AbstractExtendedTableViewer;
import org.talend.commons.ui.swt.proposal.ContentProposalAdapterExtended;
import org.talend.commons.ui.swt.proposal.TextCellEditorWithProposal;
import org.talend.commons.ui.swt.tableviewer.IModifiedBeanListener;
import org.talend.commons.ui.swt.tableviewer.ModifiedBeanEvent;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreatorColumn;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator.LAYOUT_MODE;
import org.talend.commons.ui.swt.tableviewer.behavior.CellEditorValueAdapter;
import org.talend.commons.ui.swt.tableviewer.behavior.DefaultTableLabelProvider;
import org.talend.commons.ui.swt.tableviewer.behavior.ITableCellValueModifiedListener;
import org.talend.commons.ui.swt.tableviewer.behavior.TableCellValueModifiedEvent;
import org.talend.commons.ui.swt.tableviewer.data.ModifiedObjectInfo;
import org.talend.commons.ui.swt.tableviewer.selection.ILineSelectionListener;
import org.talend.commons.ui.swt.tableviewer.selection.LineSelectionEvent;
import org.talend.commons.ui.utils.TableUtils;
import org.talend.commons.ui.ws.WindowSystem;
import org.talend.commons.utils.data.list.IListenableListListener;
import org.talend.commons.utils.data.list.ListenableListEvent;
import org.talend.commons.utils.threading.AsynchronousThreading;
import org.talend.commons.utils.threading.ExecutionLimiter;
import org.talend.core.ui.proposal.ProcessProposalProvider;
import org.talend.designer.mapper.MapperMain;
import org.talend.designer.mapper.managers.MapperManager;
import org.talend.designer.mapper.managers.UIManager;
import org.talend.designer.mapper.model.table.AbstractDataMapTable;
import org.talend.designer.mapper.model.table.AbstractInOutTable;
import org.talend.designer.mapper.model.table.OutputTable;
import org.talend.designer.mapper.model.tableentry.AbstractInOutTableEntry;
import org.talend.designer.mapper.model.tableentry.FilterTableEntry;
import org.talend.designer.mapper.model.tableentry.IColumnEntry;
import org.talend.designer.mapper.model.tableentry.ITableEntry;
import org.talend.designer.mapper.ui.color.ColorInfo;
import org.talend.designer.mapper.ui.color.ColorProviderMapper;
import org.talend.designer.mapper.ui.dnd.DragNDrop;
import org.talend.designer.mapper.ui.event.MousePositionAnalyser;
import org.talend.designer.mapper.ui.event.ResizeHelper;
import org.talend.designer.mapper.ui.event.ResizeHelper.RESIZE_MODE;
import org.talend.designer.mapper.ui.font.FontInfo;
import org.talend.designer.mapper.ui.font.FontProviderMapper;
import org.talend.designer.mapper.ui.image.ImageInfo;
import org.talend.designer.mapper.ui.image.ImageProviderMapper;
import org.talend.designer.mapper.ui.proposal.expression.ExpressionProposalProvider;
import org.talend.designer.mapper.ui.tabs.MapperColorStyledText;
import org.talend.designer.mapper.ui.tabs.StyledTextHandler;
import org.talend.designer.mapper.ui.visualmap.zone.Zone;

/**
 * DOC amaumont class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public abstract class DataMapTableView extends Composite {

    private Table tableForEntries;

    private final ResizeHelper resizeHelper = new ResizeHelper();

    protected MapperManager mapperManager;

    protected TableViewerCreator tableViewerCreatorForColumns;

    protected AbstractDataMapTable abstractDataMapTable;

    private Composite headerComposite;

    private Label nameLabel;

    private ToolItem minimizeButton;

    protected int heightForRestore;

    protected Layout parentLayout;

    protected TableViewerCreator tableViewerCreatorForFilters;

    protected Table tableForConstraints;

    private boolean executeSelectionEvent = true;

    protected ToolBar toolBarActions;

    private ExpressionProposalProvider expressionProposalProvider;

    protected Point expressionEditorTextSelectionBeforeFocusLost;

    protected Composite centerComposite;

    private Text columnExpressionTextEditor;

    private Text constraintExpressionTextEditor;

    protected boolean dragDetected;

    private Cursor currentCursor;

    private ExpressionColorProvider expressionColorProvider;

    private Listener showErrorMessageListener;

    protected boolean forceExecuteSelectionEvent;

    private AbstractExtendedTableViewer<IColumnEntry> extendedTableViewerForColumns;

    protected AbstractExtendedTableViewer<FilterTableEntry> extendedTableViewerForFilters;

    private static Image imageKey;

    private static Image imageEmpty;

    private static int constraintCounter = 0;

    private static final int MINIMUM_HEIGHT = 24;

    protected static final int TIME_BEFORE_NEW_REFRESH_BACKGROUND = 150;

    protected static final int OFFSET_HEIGHT_TRIGGER = 15;

    protected static final int COLUMN_EXPRESSION_SIZE_WEIGHT = 60;

    protected static final int COLUMN_NAME_SIZE_WEIGHT = 40;

    protected static final int ADJUST_WIDTH_VALUE = 0;

    private static final int HEADER_HEIGHT = 23;

    public static final String ID_NAME_COLUMN = "ID_NAME_COLUMN";

    public static final String ID_EXPRESSION_COLUMN = "ID_EXPRESSION_COLUMN";

    public static final String COLUMN_NAME = "Column";

    protected GridData tableForConstraintsGridData;

    /**
     * 
     * Call finalizeInitialization(...) after instanciate this class.
     * 
     * @param parent
     * @param style
     * @param abstractDataMapTable
     * @param mapperManager
     */
    public DataMapTableView(Composite parent, int style, AbstractDataMapTable abstractDataMapTable, MapperManager mapperManager) {
        super(parent, style);
        this.mapperManager = mapperManager;
        this.abstractDataMapTable = abstractDataMapTable;
        expressionColorProvider = new ExpressionColorProvider();
        createComponents();
        addListeners();
        mapperManager.addTablePair(DataMapTableView.this, abstractDataMapTable);
    }

    private void createComponents() {

        final Display display = this.getDisplay();
        // final Color listForeground = display.getSystemColor(SWT.COLOR_WIDGET_FOREGROUND);
        final Color listBackground = display.getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW);

        this.setBackground(listBackground);

        GridLayout mainLayout = new GridLayout();
        int marginMainLayout = 0;
        mainLayout.marginLeft = marginMainLayout;
        mainLayout.marginRight = marginMainLayout;
        mainLayout.marginTop = marginMainLayout;
        mainLayout.marginBottom = marginMainLayout;
        mainLayout.marginWidth = marginMainLayout;
        mainLayout.marginHeight = marginMainLayout;
        int spacingMainLayout = 2;
        mainLayout.horizontalSpacing = spacingMainLayout;
        mainLayout.verticalSpacing = spacingMainLayout;
        setLayout(mainLayout);

        headerComposite = new Composite(this, SWT.NONE);
        GridData headerGridData = new GridData(GridData.FILL_HORIZONTAL);
        headerGridData.heightHint = HEADER_HEIGHT;
        headerComposite.setLayoutData(headerGridData);
        GridLayout headerLayout = new GridLayout();

        int margin = 0;
        headerLayout.marginLeft = 3;
        headerLayout.marginRight = margin;
        headerLayout.marginTop = margin;
        headerLayout.marginBottom = margin;
        headerLayout.marginWidth = margin;
        headerLayout.marginHeight = margin;
        int spacing = 2;
        headerLayout.horizontalSpacing = spacing;
        headerLayout.verticalSpacing = spacing;
        headerComposite.setLayout(headerLayout);

        // Button check = new Button(headerComposite, SWT.CHECK);
        // check.setLayoutData(new GridData(SWT.BEGINNING));

        nameLabel = new Label(headerComposite, SWT.NONE);
        nameLabel.setFont(FontProviderMapper.getFont(FontInfo.FONT_SYSTEM_BOLD));
        nameLabel.setText(abstractDataMapTable.getName());
        nameLabel.setToolTipText(abstractDataMapTable.getName());
        nameLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.FILL_HORIZONTAL));

        int rightStyle = toolbarNeededToBeRightStyle() ? SWT.RIGHT : SWT.NONE;
        toolBarActions = new ToolBar(headerComposite, SWT.FLAT | rightStyle);

        if (addToolItems()) {
            addToolItemSeparator();
        }

        minimizeButton = new ToolItem(toolBarActions, SWT.PUSH);

        Point sizeToolBar = toolBarActions.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        if (toolbarNeededToBeRightStyle() && WindowSystem.isWIN32()) {
            gridData.widthHint = sizeToolBar.x;
            // to correct invalid margin when SWT.RIGHT style set in ToolBar
            gridData.widthHint -= 48;
            // gridData.widthHint -= 34;
        }
        if (
        // toolbarNeededToBeRightStyle() &&
        WindowSystem.isGTK()) {
            // gridData.widthHint += 5;
            gridData.heightHint = 26;
        }
        toolBarActions.setLayoutData(gridData);

        headerLayout.numColumns = headerComposite.getChildren().length;

        centerComposite = new Composite(this, SWT.NONE);
        GridData centerData = new GridData(GridData.FILL_BOTH);
        centerComposite.setLayoutData(centerData);

        GridLayout centerLayout = new GridLayout();
        int marginCenterLayout = 0;
        centerLayout.marginLeft = marginCenterLayout;
        centerLayout.marginRight = marginCenterLayout;
        centerLayout.marginTop = marginCenterLayout;
        centerLayout.marginBottom = marginCenterLayout;
        centerLayout.marginWidth = marginCenterLayout;
        centerLayout.marginHeight = marginCenterLayout;
        int spacingCenterLayout = 2;
        centerLayout.horizontalSpacing = spacingCenterLayout;
        centerLayout.verticalSpacing = spacingCenterLayout;
        centerComposite.setLayout(centerLayout);

        initTableFilters();

        createTableForColumns();

        new DragNDrop(mapperManager, tableForEntries, true, true);

        Composite footerComposite = new Composite(this, SWT.NONE);
        GridData footerGridData = new GridData(10, 2);
        footerComposite.setLayoutData(footerGridData);

    }

    /**
     * DOC amaumont Comment method "addToolItemSeparator".
     */
    protected void addToolItemSeparator() {
        ToolItem separator = new ToolItem(toolBarActions, SWT.SEPARATOR);
        separator.setWidth(10);
        // separator.setControl(headerComposite);
    }

    /**
     * DOC amaumont Comment method "createTableForColumns".
     */
    private void createTableForColumns() {
        this.extendedTableViewerForColumns = new AbstractExtendedTableViewer<IColumnEntry>(abstractDataMapTable
                .getTableColumnsEntriesModel(), centerComposite) {

            @Override
            protected void createColumns(TableViewerCreator<IColumnEntry> tableViewerCreator, Table table) {
                initColumnsOfTableColumns(tableViewerCreator);
            }

            /*
             * (non-Javadoc)
             * 
             * @see org.talend.commons.ui.swt.extended.macrotable.AbstractExtendedTableViewer#setTableViewerCreatorOptions(org.talend.commons.ui.swt.tableviewer.TableViewerCreator)
             */
            @Override
            protected void setTableViewerCreatorOptions(final TableViewerCreator<IColumnEntry> newTableViewerCreator) {
                super.setTableViewerCreatorOptions(newTableViewerCreator);
                newTableViewerCreator.setColumnsResizableByDefault(true);
                newTableViewerCreator.setBorderVisible(false);
                newTableViewerCreator.setLayoutMode(LAYOUT_MODE.FILL_HORIZONTAL);
                // tableViewerCreatorForColumns.setUseCustomItemColoring(this.getDataMapTable() instanceof
                // AbstractInOutTable);
                newTableViewerCreator.setFirstColumnMasked(true);

                if (getDataMapTable() instanceof AbstractInOutTable) {

                    if (imageKey == null) {
                        imageKey = org.talend.commons.ui.image.ImageProvider.getImage(EImage.KEY_ICON);
                    }
                    if (imageEmpty == null) {
                        imageEmpty = org.talend.commons.ui.image.ImageProvider.getImage(EImage.EMPTY);
                    }
                }
                newTableViewerCreator.setLabelProvider(new DefaultTableLabelProvider(newTableViewerCreator) {

                    @Override
                    public Color getBackground(Object element, int columnIndex) {
                        return getBackgroundCellColor(newTableViewerCreator, element, columnIndex);
                    }

                    @Override
                    public Color getForeground(Object element, int columnIndex) {
                        return getForegroundCellColor(newTableViewerCreator, element, columnIndex);
                    }

                    @Override
                    public Image getColumnImage(Object element, int columnIndex) {
                        return getColumnImageExecute(element, columnIndex);
                    }

                    /**
                     * DOC amaumont Comment method "getColumnImageExecute".
                     * 
                     * @param element
                     * @param columnIndex
                     * @return
                     */
                    private Image getColumnImageExecute(Object element, int columnIndex) {
                        if (getDataMapTable() instanceof AbstractInOutTable) {
                            AbstractInOutTableEntry entry = (AbstractInOutTableEntry) element;
                            TableViewerCreatorColumn column = (TableViewerCreatorColumn) newTableViewerCreator.getColumns()
                                    .get(columnIndex);
                            if (column.getId().equals(ID_NAME_COLUMN)) {
                                if (entry.getMetadataColumn().isKey()) {
                                    return imageKey;
                                } else {
                                    return imageEmpty;
                                }
                            }
                        }
                        return null;
                    }

                });

            }

        };
        tableViewerCreatorForColumns = this.extendedTableViewerForColumns.getTableViewerCreator();
        this.extendedTableViewerForColumns.setCommandStack(mapperManager.getCommandStack());

        tableForEntries = tableViewerCreatorForColumns.getTable();

        GridData tableEntriesGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        tableEntriesGridData.grabExcessVerticalSpace = true;
        tableEntriesGridData.minimumHeight = tableForEntries.getHeaderHeight() + tableForEntries.getItemHeight();
        tableForEntries.setLayoutData(tableEntriesGridData);

        addTableForColumnsListeners();

    }

    /**
     * DOC amaumont Comment method "addTableForColumnsListeners".
     */
    private void addTableForColumnsListeners() {
        tableViewerCreatorForColumns.addCellValueModifiedListener(new ITableCellValueModifiedListener() {

            public void cellValueModified(TableCellValueModifiedEvent e) {
                unselectAllEntriesIfErrorDetected(e);
            }
        });

        final TableViewer tableViewerForEntries = tableViewerCreatorForColumns.getTableViewer();

        tableViewerForEntries.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                selectThisDataMapTableView();
                if (!dragDetected) { // useful when drag finished
                    onSelectedEntries(event.getSelection(), tableViewerForEntries.getTable().getSelectionIndices());
                }
                dragDetected = false;
            }

        });

        tableForEntries.addListener(SWT.DragDetect, new Listener() {

            public void handleEvent(Event event) {
                dragDetected = true;
                onSelectedEntries(tableViewerForEntries.getSelection(), tableViewerForEntries.getTable().getSelectionIndices());
            }

        });

        tableViewerCreatorForColumns.getSelectionHelper().addAfterSelectionListener(new ILineSelectionListener() {

            public void handle(LineSelectionEvent e) {
                if (forceExecuteSelectionEvent) {
                    forceExecuteSelectionEvent = false;
                    onSelectedEntries(tableViewerForEntries.getSelection(), tableViewerForEntries.getTable().getSelectionIndices());
                }
            }

        });
        tableForEntries.addListener(SWT.KeyDown, new Listener() {

            public void handleEvent(Event event) {
                processEnterKeyDown(tableViewerCreatorForColumns, event);
            }

        });

        abstractDataMapTable.getTableColumnsEntriesModel().addModifiedBeanListener(new IModifiedBeanListener<IColumnEntry>() {

            public void handleEvent(ModifiedBeanEvent<IColumnEntry> event) {

                TableViewerCreator tableViewerCreator = tableViewerCreatorForColumns;
                ITableEntry tableEntry = event.bean;

                parseExpression(event, tableViewerCreator, tableEntry);
            }

        });

        if (abstractDataMapTable instanceof OutputTable) {
            OutputTable outputTable = (OutputTable) abstractDataMapTable;
            outputTable.getTableFiltersEntriesModel().addAfterOperationListListener(new IListenableListListener<FilterTableEntry>() {

                public void handleEvent(ListenableListEvent<FilterTableEntry> event) {

                    resizeAtExpandedSize();

                }

            });
            outputTable.getTableFiltersEntriesModel().addModifiedBeanListener(new IModifiedBeanListener<FilterTableEntry>() {

                public void handleEvent(ModifiedBeanEvent<FilterTableEntry> event) {

                    TableViewerCreator tableViewerCreator = tableViewerCreatorForFilters;
                    ITableEntry tableEntry = event.bean;

                    parseExpression(event, tableViewerCreator, tableEntry);
                }

            });
        }
    }

    /**
     * DOC amaumont Comment method "initShowMessageErrorListener".
     * 
     * @param table
     */
    protected void initShowMessageErrorListener(final Table table) {
        showErrorMessageListener = new Listener() {

            public void handleEvent(Event event) {

                switch (event.type) {
                case SWT.MouseMove:

                    // System.out.println("ToolTipText:" + table.getToolTipText());

                    Point cursorPositionFromTableOrigin = TableUtils.getCursorPositionFromTableOrigin(table, event);
                    TableColumn tableColumn = TableUtils.getTableColumn(table, cursorPositionFromTableOrigin);
                    if (tableColumn == null) {
                        setTableToolTipText(table, null, null, null);
                        return;
                    }
                    TableItem tableItem = TableUtils.getTableItem(table, cursorPositionFromTableOrigin);

                    if (tableItem == null) {
                        setTableToolTipText(table, tableColumn, null, null);
                        return;
                    }
                    ITableEntry tableEntry = (ITableEntry) tableItem.getData();
                    String toolTip = tableEntry.getProblem() == null ? null : tableEntry.getProblem().getDescription();
                    String tableToolTip = table.getToolTipText();
                    if (!WindowSystem.isGTK()
                            || WindowSystem.isGTK()
                            && ((tableToolTip == null || tableToolTip.equals("")) && toolTip != null || tableToolTip != null
                                    && toolTip == null || toolTip != null && !toolTip.equals(tableToolTip))) {
                        setTableToolTipText(table, tableColumn, tableEntry, toolTip);
                    }
                    break;
                default:
                }
            }

            /**
             * DOC amaumont Comment method "setTableToolTipText".
             * 
             * @param table
             * @param tableColumn
             * @param text
             */
            private void setTableToolTipText(final Table table, TableColumn tableColumn, ITableEntry tableEntry, String text) {
                table.setToolTipText(text);
            }

        };
        table.addListener(SWT.MouseMove, showErrorMessageListener);
    }

    /**
     * DOC amaumont Comment method "addEntriesActionsComponents".
     * 
     * @return true if one or more ToolItem has been added
     */
    protected abstract boolean addToolItems();

    /**
     * DOC amaumont Comment method "initTableConstraints".
     */
    protected abstract void initTableFilters();

    /**
     * DOC amaumont Comment method "addListeners".
     */
    protected void addListeners() {

        final UIManager uiManager = mapperManager.getUiManager();

        MouseTrackListener mouseTracker = new MouseTrackListener() {

            public void mouseEnter(MouseEvent e) {
            }

            public void mouseExit(MouseEvent e) {
                setDefaultCursor();
                resizeHelper.stopDrag();
            }

            public void mouseHover(MouseEvent e) {
            }

        };
        this.addMouseTrackListener(mouseTracker);

        SelectionListener scrollListener = new SelectionAdapter() {

            public void widgetSelected(SelectionEvent event) {
                uiManager.refreshBackground(true, false);
            }
        };

        tableForEntries.getVerticalBar().addSelectionListener(scrollListener);

        // /////////////////////////////////////////////////////////////////

        addManualTableResizeListeners(uiManager);
        // /////////////////////////////////////////////////////////////////

        // /////////////////////////////////////////////////////////////////
        Listener onSelectDataMapTableViewListener = new Listener() {

            public void handleEvent(Event event) {
                switch (event.type) {
                case SWT.MouseDown:
                    onSelectDataMapTableView();
                    break;
                default:
                }

            }
        };

        this.addListener(SWT.MouseDown, onSelectDataMapTableViewListener);
        headerComposite.addListener(SWT.MouseDown, onSelectDataMapTableViewListener);
        if (tableForConstraints != null) {
            tableForConstraints.addListener(SWT.MouseDown, onSelectDataMapTableViewListener);
        }
        nameLabel.addListener(SWT.MouseDown, onSelectDataMapTableViewListener);
        // /////////////////////////////////////////////////////////////////

        // /////////////////////////////////////////////////////////////////
        minimizeButton.addSelectionListener(new SelectionListener() {

            public void widgetDefaultSelected(SelectionEvent e) {
                // TODO Auto-generated method stub

            }

            public void widgetSelected(SelectionEvent e) {
                minimizeTable(!abstractDataMapTable.isMinimized());
            }

        });

        // /////////////////////////////////////////////////////////////////

        initShowMessageErrorListener(tableForEntries);

    }

    /**
     * DOC amaumont Comment method "addManualTableResizeListeners".
     * 
     * @param uiManager
     */
    private void addManualTableResizeListeners(final UIManager uiManager) {
        this.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(DisposeEvent e) {
                if (currentCursor != null) {
                    currentCursor.dispose();
                }
            }

        });

        Listener tableResizerListener = new Listener() {

            public void handleEvent(Event event) {

                MousePositionAnalyser mpa = new MousePositionAnalyser(DataMapTableView.this);
                Point eventPoint = new Point(event.x, event.y);

                boolean leftMouseButton = (event.stateMask & SWT.BUTTON1) != 0 || event.button == 1;

                switch (event.type) {
                case SWT.MouseMove:
                    if (resizeHelper.isDragging()) {
                        Point newPoint = convertToParentOrigin(DataMapTableView.this, eventPoint);
                        Point dragPoint = resizeHelper.getLastDragPoint();
                        Point diff = new Point(newPoint.x - dragPoint.x, newPoint.y - dragPoint.y);
                        if (mpa.isOnLeftBorder(eventPoint)) {
                            diff.x *= -1;
                        }
                        Rectangle rect = DataMapTableView.this.getClientArea();
                        rect.width += 2 * DataMapTableView.this.getBorderWidth();
                        rect.height += 2 * DataMapTableView.this.getBorderWidth();

                        RESIZE_MODE currentMode = resizeHelper.getCurrentMode();
                        int newWidth = (currentMode == RESIZE_MODE.HORIZONTAL || currentMode == RESIZE_MODE.BOTH) ? rect.width + diff.x * 2
                                : rect.width;
                        int newHeight = (currentMode == RESIZE_MODE.VERTICAL || currentMode == RESIZE_MODE.BOTH) ? rect.height + diff.y
                                : rect.height;

                        if (newHeight < MINIMUM_HEIGHT + OFFSET_HEIGHT_TRIGGER && diff.y < 0) {
                            changeMinimizeState(true);
                            newHeight = MINIMUM_HEIGHT;
                        } else if (newHeight > MINIMUM_HEIGHT + OFFSET_HEIGHT_TRIGGER && diff.y > 0) {
                            changeMinimizeState(false);
                        }
                        changeSize(new Point(newWidth, newHeight), false, true);
                        resizeHelper.setLastDragPoint(newPoint);
                    } else if (!resizeHelper.isDragging()) {
                        Cursor cursor = null;
                        if (mpa.isOnLeftBottomCorner(eventPoint)) {
                            // cursor = new Cursor(dataMapTableView.getDisplay(), org.eclipse.swt.SWT.CURSOR_SIZESW);
                            // resizeHelper.setCurrentMode(RESIZE_MODE.BOTH);
                        } else if (mpa.isOnRightBottomCorner(eventPoint)) {
                            // cursor = new Cursor(dataMapTableView.getDisplay(), org.eclipse.swt.SWT.CURSOR_SIZESE);
                            // resizeHelper.setCurrentMode(RESIZE_MODE.BOTH);
                        } else if (mpa.isOnLeftBorder(eventPoint)) {
                            // cursor = new Cursor(dataMapTableView.getDisplay(), org.eclipse.swt.SWT.CURSOR_SIZEE);
                            // resizeHelper.setCurrentMode(RESIZE_MODE.HORIZONTAL);
                        } else if (mpa.isOnRightBorder(eventPoint)) {
                            // cursor = new Cursor(dataMapTableView.getDisplay(), org.eclipse.swt.SWT.CURSOR_SIZEW);
                            // resizeHelper.setCurrentMode(RESIZE_MODE.HORIZONTAL);
                        } else if (mpa.isOnBottomBorder(eventPoint)) {
                            cursor = new Cursor(DataMapTableView.this.getDisplay(), org.eclipse.swt.SWT.CURSOR_SIZES);
                            resizeHelper.setCurrentMode(RESIZE_MODE.VERTICAL);
                        }
                        if (cursor != null) {
                            DataMapTableView.this.setCursor(cursor);
                        } else {
                            setDefaultCursor();
                            resizeHelper.setCurrentMode(RESIZE_MODE.NONE);
                        }
                    }

                    break;
                case SWT.MouseDown:
                    if (leftMouseButton) {
                        if (mpa.isOnLeftBorder(eventPoint) || mpa.isOnRightBorder(eventPoint) || mpa.isOnBottomBorder(eventPoint)) {
                            resizeHelper.startDrag(convertToParentOrigin(DataMapTableView.this, new Point(event.x, event.y)));
                        } else {
                            setDefaultCursor();
                        }
                        parentLayout = DataMapTableView.this.getParent().getLayout();
                        DataMapTableView.this.getParent().setLayout(null);
                    }
                    break;
                case SWT.MouseUp:
                    if (leftMouseButton) {
                        resizeHelper.stopDrag();
                        // gridData = (GridData) dataMapTableView.getLayoutData();
                        // gridData.exclude = false;
                        DataMapTableView.this.getParent().setLayout(parentLayout);
                        DataMapTableView.this.getParent().layout();
                        uiManager.resizeTablesZoneViewAtComputedSize(getZone());
                        uiManager.refreshBackground(true, false);
                    }
                    break;
                case SWT.MouseExit:
                    setDefaultCursor();
                    break;
                default:
                }

            }

        };

        this.addListener(SWT.MouseMove, tableResizerListener);
        this.addListener(SWT.MouseDown, tableResizerListener);
        this.addListener(SWT.MouseUp, tableResizerListener);
    }

    /**
     * DOC amaumont Comment method "showTableConstraints".
     */
    protected void showTableConstraints(boolean visible) {

        if (visible) {
            tableForConstraintsGridData.exclude = false;
            tableForConstraints.setVisible(true);
            if (WindowSystem.isGTK()) {
                updateGridDataHeightForTableConstraints();
            }
        } else {
            tableForConstraintsGridData.exclude = true;
            tableForConstraints.setVisible(false);
        }
        tableViewerCreatorForFilters.getTableViewer().refresh();
        resizeAtExpandedSize();
    }

    /**
     * DOC amaumont Comment method "onSelectDataMapTableView".
     */
    protected void onSelectDataMapTableView() {
        mapperManager.getUiManager().selectDataMapTableView(this, true);
    }

    /**
     * DOC amaumont Comment method "initClumns".
     */
    public abstract void initColumnsOfTableColumns(TableViewerCreator tableViewerCreator);

    public TableViewerCreator getTableViewerCreatorForColumns() {
        return this.tableViewerCreatorForColumns;
    }

    public TableViewerCreator getTableViewerCreatorForFilters() {
        return this.tableViewerCreatorForFilters;
    }

    public Point convertToParentOrigin(Composite child, Point point) {
        Rectangle bounds = child.getBounds();
        return new Point(bounds.x + point.x, bounds.y + point.y);
    }

    private void setDefaultCursor() {
        Cursor cursor = new Cursor(DataMapTableView.this.getDisplay(), 0);
        DataMapTableView.this.setCursor(cursor);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    public MapperManager getMapperManager() {
        return this.mapperManager;
    }

    public abstract Zone getZone();

    /**
     * DOC amaumont Comment method "resizeWithPreferredSize".
     */
    public void resizeAtExpandedSize() {
        changeSize(getPreferredSize(false, true, false), true, true);
    }

    /**
     * 
     * Change size of the DataMapTableView.
     * 
     * @param newWidth
     * @param newHeight
     * @param refreshNow refresh background with links if true
     * @param recalculateParentSize
     */
    public void changeSize(Point newSize, boolean refreshNow, boolean recalculateParentSize) {
        if (newSize.y < MINIMUM_HEIGHT) {
            newSize.y = MINIMUM_HEIGHT;
        }
        FormData formData = (FormData) DataMapTableView.this.getLayoutData();
        formData.width = newSize.x;
        formData.height = newSize.y;
        DataMapTableView.this.setSize(newSize);
        UIManager uiManager = mapperManager.getUiManager();
        if (recalculateParentSize) {
            uiManager.resizeTablesZoneViewAtComputedSize(getZone());
        }
        if (refreshNow) {
            uiManager.refreshBackground(true, false);
        } else {
            uiManager.refreshBackground(true, TIME_BEFORE_NEW_REFRESH_BACKGROUND, true);
        }
        // dataMapTableView.redraw();
        // dataMapTableView.layout(true, true);
    }

    public void onSelectedEntries(ISelection selection, int[] selectionIndices) {
        if (executeSelectionEvent) {
            UIManager uiManager = mapperManager.getUiManager();
            uiManager.processSelectedDataMapEntries(DataMapTableView.this, uiManager.extractSelectedTableEntries(selection), false);
            uiManager.selectLinkedMetadataEditorEntries(this, selectionIndices);
        }
    }

    public AbstractDataMapTable getDataMapTable() {
        return this.abstractDataMapTable;
    }

    /**
     * DOC amaumont Comment method "setTableSelection".
     * 
     * @param selectionIndices
     */
    public void setTableSelection(int[] selectionIndices) {
        this.executeSelectionEvent = false;
        this.tableViewerCreatorForColumns.getSelectionHelper().setSelection(selectionIndices);
        this.executeSelectionEvent = true;

    }

    protected void createFiltersToolItems() {

        ToolItem addFilterButton = new ToolItem(toolBarActions, SWT.PUSH);
        addFilterButton.setToolTipText("Add filter row");
        addFilterButton.setImage(ImageProviderMapper.getImage(ImageInfo.ADD_FILTER_ICON));

        // /////////////////////////////////////////////////////////////////
        if (addFilterButton != null) {

            addFilterButton.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent e) {
                }

                public void widgetSelected(SelectionEvent e) {

                    Table tableConstraints = tableViewerCreatorForFilters.getTable();
                    int index = tableConstraints.getItemCount();
                    int[] selection = tableViewerCreatorForFilters.getTable().getSelectionIndices();
                    if (selection.length > 0) {
                        index = selection[selection.length - 1] + 1;
                    }
                    mapperManager.addNewFilterEntry(DataMapTableView.this, "newFilter" + ++constraintCounter, index);
                    updateGridDataHeightForTableConstraints();
                    DataMapTableView.this.changeSize(DataMapTableView.this.getPreferredSize(false, true, true), true, true);
                    tableViewerCreatorForFilters.getTableViewer().refresh();
                    mapperManager.getUiManager().refreshBackground(true, false);
                    showTableConstraints(true);
                    changeMinimizeState(false);
                    tableViewerCreatorForFilters.layout();
                }

            });
        }
        // /////////////////////////////////////////////////////////////////

        // ToolItem removeConstraintButton = new ToolItem(toolBarActions, SWT.PUSH);
        // removeConstraintButton.setImage(ImageProviderMapper.getImage(ImageInfo.REMOVE_CONSTRAINT_ICON));
        // removeConstraintButton.setToolTipText("Remove selected constraints");
        // // /////////////////////////////////////////////////////////////////
        // if (removeConstraintButton != null) {
        //
        // removeConstraintButton.addSelectionListener(new SelectionListener() {
        //
        // public void widgetDefaultSelected(SelectionEvent e) {
        // }
        //
        // public void widgetSelected(SelectionEvent e) {
        //
        // StructuredSelection selection = (StructuredSelection) tableViewerCreatorForConstraints
        // .getTableViewer().getSelection();
        // List list = tableViewerCreatorForConstraints.getInputList();
        // int sizeBeforeRemoving = list.size();
        // Iterator iterator = selection.iterator();
        // for (; iterator.hasNext();) {
        // mapperManager.removeTableEntry((ITableEntry) iterator.next());
        // }
        // if (sizeBeforeRemoving != list.size()) {
        // tableViewerCreatorForConstraints.getTableViewer().refresh();
        // updateGridDataHeightForTableConstraints();
        // if (list != null && list.size() == 0) {
        // showTableConstraints(false);
        // } else {
        // showTableConstraints(true);
        // }
        // }
        // }
        //
        // });
        // }

        // /////////////////////////////////////////////////////////////////

        // final ToolItem rejectFilterCheck = new ToolItem(toolBarActions, SWT.CHECK);
        // rejectFilterCheck.setToolTipText("Active/unactive reject");
        // boolean isReject = ((OutputTable) abstractDataMapTable).isReject();
        // Image image = ImageProviderMapper.getImage(isReject ? ImageInfo.CHECKED_ICON : ImageInfo.UNCHECKED_ICON);
        // if (WindowSystem.isGTK()) {
        // rejectFilterCheck.setImage(image);
        // rejectFilterCheck.setHotImage(image);
        // } else {
        // rejectFilterCheck.setImage(ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON));
        // rejectFilterCheck.setHotImage(image);
        // }
        // rejectFilterCheck.setSelection(isReject);
        // rejectFilterCheck.setText("Reject");
        //        
        // // /////////////////////////////////////////////////////////////////
        // if (rejectFilterCheck != null) {
        //
        // rejectFilterCheck.addSelectionListener(new SelectionListener() {
        //
        // public void widgetDefaultSelected(SelectionEvent e) {
        // }
        //
        // public void widgetSelected(SelectionEvent e) {
        // Image image = null;
        // if (rejectFilterCheck.getSelection()) {
        // ((OutputTable) abstractDataMapTable).setReject(true);
        // image = ImageProviderMapper.getImage(ImageInfo.CHECKED_ICON);
        // } else {
        // ((OutputTable) abstractDataMapTable).setReject(false);
        // image = ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON);
        // }
        // if (WindowSystem.isGTK()) {
        // rejectFilterCheck.setImage(image);
        // rejectFilterCheck.setHotImage(image);
        // } else {
        // rejectFilterCheck.setHotImage(image);
        // }
        // }
        //
        // });
        //
        // }

        // /////////////////////////////////////////////////////////////////

        final ToolItem rejectFilterCheck = new ToolItem(toolBarActions, SWT.CHECK);
        rejectFilterCheck.setToolTipText("Enable/disable output reject");
        boolean isReject = ((OutputTable) abstractDataMapTable).isReject();
        // Image image = ImageProviderMapper.getImage(isReject ? ImageInfo.CHECKED_ICON : ImageInfo.UNCHECKED_ICON);
        Image image = ImageProviderMapper.getImage(isReject ? ImageInfo.REJECT_FILTER_ICON : ImageInfo.REJECT_FILTER_ICON);
        if (WindowSystem.isGTK()) {
            rejectFilterCheck.setImage(image);
            rejectFilterCheck.setHotImage(image);
        } else {
            rejectFilterCheck.setImage(ImageProviderMapper.getImage(ImageInfo.REJECT_FILTER_ICON));
            rejectFilterCheck.setHotImage(image);
        }
        rejectFilterCheck.setSelection(isReject);
        // rejectFilterCheck.setText("Reject");

        // /////////////////////////////////////////////////////////////////
        if (rejectFilterCheck != null) {

            rejectFilterCheck.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent e) {
                }

                public void widgetSelected(SelectionEvent e) {
                    Image image = null;
                    if (rejectFilterCheck.getSelection()) {
                        ((OutputTable) abstractDataMapTable).setReject(true);
                        image = ImageProviderMapper.getImage(ImageInfo.REJECT_FILTER_ICON);
                    } else {
                        ((OutputTable) abstractDataMapTable).setReject(false);
                        image = ImageProviderMapper.getImage(ImageInfo.REJECT_FILTER_ICON);
                    }
                    if (WindowSystem.isGTK()) {
                        rejectFilterCheck.setImage(image);
                        rejectFilterCheck.setHotImage(image);
                    } else {
                        rejectFilterCheck.setHotImage(image);
                    }
                }

            });

        }

        // final ToolItem rejectInnerJoinFilterCheck = new ToolItem(toolBarActions, SWT.CHECK);
        // rejectInnerJoinFilterCheck.setToolTipText("Active/unactive reject lookup inner join");
        // boolean isRejectInnerJoin = ((OutputTable) abstractDataMapTable).isRejectInnerJoin();
        // image = ImageProviderMapper.getImage(isRejectInnerJoin ? ImageInfo.CHECKED_ICON : ImageInfo.UNCHECKED_ICON);
        // if (WindowSystem.isGTK()) {
        // rejectInnerJoinFilterCheck.setImage(image);
        // rejectInnerJoinFilterCheck.setHotImage(image);
        // } else {
        // rejectInnerJoinFilterCheck.setImage(ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON));
        // rejectInnerJoinFilterCheck.setHotImage(image);
        // }
        // rejectInnerJoinFilterCheck.setSelection(isRejectInnerJoin);
        // rejectInnerJoinFilterCheck.setText("Reject2");
        // // /////////////////////////////////////////////////////////////////
        // if (rejectInnerJoinFilterCheck != null) {
        //            
        // rejectInnerJoinFilterCheck.addSelectionListener(new SelectionListener() {
        //                
        // public void widgetDefaultSelected(SelectionEvent e) {
        // }
        //                
        // public void widgetSelected(SelectionEvent e) {
        // Image image = null;
        // if (rejectInnerJoinFilterCheck.getSelection()) {
        // ((OutputTable) abstractDataMapTable).setRejectInnerJoin(true);
        // image = ImageProviderMapper.getImage(ImageInfo.CHECKED_ICON);
        // } else {
        // ((OutputTable) abstractDataMapTable).setRejectInnerJoin(false);
        // image = ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON);
        // }
        // if (WindowSystem.isGTK()) {
        // rejectInnerJoinFilterCheck.setImage(image);
        // rejectInnerJoinFilterCheck.setHotImage(image);
        // } else {
        // rejectInnerJoinFilterCheck.setHotImage(image);
        // }
        // }
        //                
        // });
        //            
        // }
        //        
        // // /////////////////////////////////////////////////////////////////
        final ToolItem rejectInnerJoinFilterCheck = new ToolItem(toolBarActions, SWT.CHECK);
        rejectInnerJoinFilterCheck.setToolTipText("Enable/disable lookup inner join reject");
        boolean isRejectInnerJoin = ((OutputTable) abstractDataMapTable).isRejectInnerJoin();
        // image = ImageProviderMapper.getImage(isRejectInnerJoin ? ImageInfo.CHECKED_ICON : ImageInfo.UNCHECKED_ICON);
        image = ImageProviderMapper.getImage(isRejectInnerJoin ? ImageInfo.REJECT_LOOKUP_ICON : ImageInfo.REJECT_LOOKUP_ICON);
        if (WindowSystem.isGTK()) {
            rejectInnerJoinFilterCheck.setImage(image);
            rejectInnerJoinFilterCheck.setHotImage(image);
        } else {
            rejectInnerJoinFilterCheck.setImage(ImageProviderMapper.getImage(ImageInfo.REJECT_LOOKUP_ICON));
            // rejectInnerJoinFilterCheck.setImage(ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON));
            rejectInnerJoinFilterCheck.setHotImage(image);
        }
        rejectInnerJoinFilterCheck.setSelection(isRejectInnerJoin);
        // rejectInnerJoinFilterCheck.setText("Reject2");
        // /////////////////////////////////////////////////////////////////
        if (rejectInnerJoinFilterCheck != null) {

            rejectInnerJoinFilterCheck.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent e) {
                }

                public void widgetSelected(SelectionEvent e) {
                    Image image = null;
                    if (rejectInnerJoinFilterCheck.getSelection()) {
                        ((OutputTable) abstractDataMapTable).setRejectInnerJoin(true);
                        image = ImageProviderMapper.getImage(ImageInfo.REJECT_LOOKUP_ICON);
                        // image = ImageProviderMapper.getImage(ImageInfo.CHECKED_ICON);
                    } else {
                        ((OutputTable) abstractDataMapTable).setRejectInnerJoin(false);
                        image = ImageProviderMapper.getImage(ImageInfo.REJECT_LOOKUP_ICON);
                        // image = ImageProviderMapper.getImage(ImageInfo.UNCHECKED_ICON);
                    }
                    if (WindowSystem.isGTK()) {
                        rejectInnerJoinFilterCheck.setImage(image);
                        rejectInnerJoinFilterCheck.setHotImage(image);
                    } else {
                        rejectInnerJoinFilterCheck.setHotImage(image);
                    }
                }

            });

        }

        // /////////////////////////////////////////////////////////////////

    }

    protected void createToolItems() {

    }

    public void minimizeTable(boolean minimize) {
        Point size = DataMapTableView.this.getSize();
        if (minimize) {
            // System.out.println("store height before minimize"+size.y);
            this.heightForRestore = size.y - 4;
            changeSize(new Point(size.x, MINIMUM_HEIGHT), true, true);
            changeMinimizeState(true);
        } else {
            if (heightForRestore != MINIMUM_HEIGHT && heightForRestore > 0) {
                size.y = heightForRestore;
            } else {
                size = DataMapTableView.this.getPreferredSize(false, true, false);
            }
            changeSize(size, true, true);
            changeMinimizeState(false);
        }
    }

    public void changeMinimizeState(boolean newStateIsMinimized) {
        if (newStateIsMinimized) {
            abstractDataMapTable.setMinimized(true);
            minimizeButton.setSelection(true);
            minimizeButton.setImage(ImageProviderMapper.getImage(ImageInfo.RESTORE_ICON));
            minimizeButton.setToolTipText("Restore");
        } else {
            abstractDataMapTable.setMinimized(false);
            minimizeButton.setSelection(false);
            minimizeButton.setImage(ImageProviderMapper.getImage(ImageInfo.MINIMIZE_ICON));
            minimizeButton.setToolTipText("Minimize");
        }
    }

    /**
     * 
     * Return current size of DataMapTableView.
     * 
     * @return
     */
    public Point getPreferredSize() {
        return getPreferredSize(false, false, false);
    }

    /**
     * 
     * DOC amaumont Comment method "getPreferredSize".
     * 
     * @param newTableEntryWillBeAdded
     * @param expandedSize
     * @param newConstraintEntryWillBeAdded
     * @return
     */
    public Point getPreferredSize(boolean newTableEntryWillBeAdded, boolean expandedSize, boolean newConstraintEntryWillBeAdded) {
        int heightOffset = 0;
        int tableEntryItemHeight = tableViewerCreatorForColumns.getTable().getItemHeight();
        // heightOffset += newTableEntryWillBeAdded ? tableEntryItemHeight : 0;
        heightOffset += newConstraintEntryWillBeAdded ? tableViewerCreatorForFilters.getTable().getItemHeight() : 0;

        int newHeight = this.computeSize(SWT.DEFAULT, SWT.DEFAULT).y - tableEntryItemHeight + heightOffset;
        if (WindowSystem.isGTK()) {
            newHeight += tableEntryItemHeight;
        }
        if (tableViewerCreatorForColumns.getInputList().size() == 0) {
            newHeight += tableEntryItemHeight;
        } else {
            newHeight += 5;
        }

        if (abstractDataMapTable.isMinimized() && !expandedSize) {
            newHeight = MINIMUM_HEIGHT;
        }
        return new Point(this.getSize().x, newHeight);
    }

    public void registerStyledExpressionEditor(final StyledTextHandler styledTextHandler) {
        if (columnExpressionTextEditor != null) {
            attachCellExpressionToStyledTextEditor(tableViewerCreatorForColumns, columnExpressionTextEditor, styledTextHandler);
        }
        if (constraintExpressionTextEditor != null) {
            attachCellExpressionToStyledTextEditor(tableViewerCreatorForFilters, constraintExpressionTextEditor, styledTextHandler);
        }
    }

    /**
     * DOC amaumont Comment method "attachCellExpressionToStyledTextEditor".
     * 
     * @param tableViewerCreator TODO
     * @param styledTextHandler
     * @param expressionEditorText2
     */
    protected void attachCellExpressionToStyledTextEditor(final TableViewerCreator tableViewerCreator, final Text expressionTextEditor,
            final StyledTextHandler styledTextHandler) {
        expressionTextEditor.addModifyListener(new ModifyListener() {

            public void modifyText(ModifyEvent e) {
                ITableEntry currentModifiedEntry = (ITableEntry) tableViewerCreator.getModifiedObjectInfo().getCurrentModifiedBean();
                styledTextHandler.setCurrentEntry(currentModifiedEntry);
                Text text = (Text) e.widget;
                if (Math.abs(text.getText().length() - styledTextHandler.getStyledText().getText().length()) > 1) {
                    styledTextHandler.setTextWithoutNotifyListeners(text.getText());
                    // highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
                }
            }

        });

        expressionTextEditor.addKeyListener(new KeyListener() {

            /*
             * (non-Javadoc)
             * 
             * @see org.eclipse.swt.events.KeyListener#keyPressed(org.eclipse.swt.events.KeyEvent)
             */
            public void keyPressed(KeyEvent e) {
                // System.out.println("e.character=" + e.character);
                // System.out.println("keyCode=" + e.keyCode);

                boolean ctrl = (e.stateMask & SWT.CTRL) != 0;
                boolean altgr = (e.stateMask & SWT.ALT) != 0;
                if (e.character == '\0' || ctrl && !altgr) {
                    highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
                } else {
                    MapperColorStyledText mapperColorStyledText = (MapperColorStyledText) styledTextHandler.getStyledText();
                    Point selection = expressionTextEditor.getSelection();
                    if (e.character == '\r' || e.character == '\u001b') {
                        e.doit = false;
                        styledTextHandler.setTextWithoutNotifyListeners(expressionTextEditor.getText());
                        highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
                    } else {
                        if (e.character == SWT.BS || e.character == SWT.DEL) {
                            if (selection.x == selection.y) {

                                if (e.character == SWT.BS) {
                                    if (selection.x - 1 > 0) {
                                        char previousChar = mapperColorStyledText.getText().charAt(selection.x - 1);
                                        if (previousChar == '\n') {
                                            mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x - 2, 2, "");
                                        } else {
                                            mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x - 1, 1, "");
                                        }
                                    }
                                } else {
                                    if (selection.x < mapperColorStyledText.getText().length()) {
                                        char nextChar = mapperColorStyledText.getText().charAt(selection.x);
                                        if (nextChar == '\r') {
                                            mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x, 2, "");
                                        } else {
                                            mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x, 1, "");
                                        }
                                    }
                                }

                            } else {
                                mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x, selection.y - selection.x, "");
                                highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
                            }
                        } else {
                            // System.out.println("selection.x="+selection.x);
                            // System.out.println("selection.y="+selection.y);
                            // System.out.println("mapperColorStyledText.getText()="+mapperColorStyledText.getText().length());
                            mapperColorStyledText.replaceTextRangeWithoutNotifyListeners(selection.x, selection.y - selection.x, String
                                    .valueOf(e.character));
                            highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
                        }
                    }

                }
            }

            public void keyReleased(KeyEvent e) {
                // highlightLineOfCursorPosition();
            }

        });

        // expressionTextEditor.addListener(SWT.KeyDown, new Listener() {
        //
        // public void handleEvent(Event event) {
        // // highlightLineOfCursorPosition();
        // }
        //
        // });

        expressionTextEditor.addMouseListener(new MouseListener() {

            public void mouseDoubleClick(MouseEvent e) {
                highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
            }

            public void mouseDown(MouseEvent e) {
                highlightLineAndSetSelectionOfStyledText(expressionTextEditor);
            }

            public void mouseUp(MouseEvent e) {

            }

        });

    }

    private void highlightLineAndSetSelectionOfStyledText(final Text expressionTextEditor) {
        final StyledTextHandler styledTextHandler = mapperManager.getUiManager().getTabFolderEditors().getStyledTextHandler();

        Runnable runnable = new Runnable() {

            public void run() {

                StyledText styledText = styledTextHandler.getStyledText();
                if (styledText.isDisposed()) {
                    return;
                }

                String text = expressionTextEditor.getText();
                Point selection = expressionTextEditor.getSelection();
                if (selection.x - 1 > 0) {
                    while (expressionTextEditor.getLineDelimiter().equals(text.charAt(selection.x - 1))) {
                        selection.x++;
                    }
                }
                if (selection.y - 1 > 0) {
                    while (expressionTextEditor.getLineDelimiter().equals(text.charAt(selection.y - 1))) {
                        selection.y++;
                    }
                }
                int length = styledText.getText().length();
                if (selection.x < 0) {
                    selection.x = 0;
                }
                if (selection.x > length) {
                    selection.x = length;
                }
                if (selection.y < 0) {
                    selection.y = 0;
                }
                if (selection.y > length) {
                    selection.y = length;
                }
                styledText.setSelection(selection);
                styledTextHandler.highlightLineOfCursorPosition(selection);

            }
        };
        new AsynchronousThreading(50, true, DataMapTableView.this.getDisplay(), runnable).start();

    }

    /**
     * 
     * Init proposals of Text control, and StyledText in tab "Expression editor".
     * 
     * @param textControl
     * @param zones
     * @param tableViewerCreator
     * @param currentModifiedEntry
     */
    protected void initExpressionProposals(final TextCellEditorWithProposal textCellEditor, Zone[] zones,
            final TableViewerCreator tableViewerCreator, ITableEntry currentModifiedEntry) {
        if (this.expressionProposalProvider == null) {
            IContentProposalProvider[] contentProposalProviders = new IContentProposalProvider[0];
            if (!MapperMain.isStandAloneMode()) {
                contentProposalProviders = new IContentProposalProvider[] { new ProcessProposalProvider(mapperManager.getComponent()
                        .getProcess()) };
            }
            this.expressionProposalProvider = new ExpressionProposalProvider(mapperManager, contentProposalProviders);
        }
        this.expressionProposalProvider.init(abstractDataMapTable, zones, currentModifiedEntry);
        textCellEditor.setContentProposalProvider(this.expressionProposalProvider);

        StyledTextHandler styledTextHandler = mapperManager.getUiManager().getTabFolderEditors().getStyledTextHandler();
        styledTextHandler.getStyledText().setEnabled(true);

        ContentProposalAdapterExtended expressionProposalStyledText = styledTextHandler.getContentProposalAdapter();
        expressionProposalStyledText.setContentProposalProvider(this.expressionProposalProvider);

        // System.out.println("init expression proposal:"+this.expressionProposal);
    }

    protected TextCellEditor createExpressionCellEditor(final TableViewerCreator tableViewerCreator, TableViewerCreatorColumn column,
            final Zone[] zones, boolean isConstraintExpressionCellEditor) {
        final TextCellEditorWithProposal cellEditor = new TextCellEditorWithProposal(tableViewerCreator.getTable(), SWT.MULTI | SWT.BORDER,
                column);
        final Text expressionTextEditor = (Text) cellEditor.getControl();

        if (isConstraintExpressionCellEditor) {
            constraintExpressionTextEditor = expressionTextEditor;
        } else {
            columnExpressionTextEditor = expressionTextEditor;
        }

        cellEditor.addListener(new ICellEditorListener() {

            Text text = (Text) cellEditor.getControl();

            public void applyEditorValue() {
                ModifiedObjectInfo modifiedObjectInfo = tableViewerCreator.getModifiedObjectInfo();
                mapperManager.getUiManager().parseNewExpression(text.getText(), (ITableEntry) modifiedObjectInfo.getCurrentModifiedBean(),
                        true);
            }

            public void cancelEditor() {
                ModifiedObjectInfo modifiedObjectInfo = tableViewerCreator.getModifiedObjectInfo();
                text.setText((String) modifiedObjectInfo.getOriginalPropertyBeanValue());
                ITableEntry tableEntry = (ITableEntry) (modifiedObjectInfo.getCurrentModifiedBean() != null ? modifiedObjectInfo
                        .getCurrentModifiedBean() : modifiedObjectInfo.getPreviousModifiedBean());
                String originalExpression = (String) modifiedObjectInfo.getOriginalPropertyBeanValue();
                mapperManager.getUiManager().parseNewExpression(originalExpression, tableEntry, true);
            }

            public void editorValueChanged(boolean oldValidState, boolean newValidState) {

                if (expressionTextEditor.isFocusControl()) {
                    ModifiedObjectInfo modifiedObjectInfo = tableViewerCreator.getModifiedObjectInfo();
                    ITableEntry tableEntry = (ITableEntry) (modifiedObjectInfo.getCurrentModifiedBean() != null ? modifiedObjectInfo
                            .getCurrentModifiedBean() : modifiedObjectInfo.getPreviousModifiedBean());
                    mapperManager.getUiManager().parseNewExpression(text.getText(), tableEntry, false);
                    resizeTextEditor(text, tableViewerCreator);
                }
            }

        });
        expressionTextEditor.addControlListener(new ControlListener() {

            ExecutionLimiter executionLimiter = null;

            public void controlMoved(ControlEvent e) {
            }

            public void controlResized(ControlEvent e) {
                if (executionLimiter == null) {
                    executionLimiter = new ExecutionLimiter(50, true) {

                        @Override
                        public void execute(boolean isFinalExecution) {

                            if (isFinalExecution) {
                                expressionTextEditor.getDisplay().syncExec(new Runnable() {

                                    public void run() {
                                        if (expressionTextEditor.isDisposed()) {
                                            return;
                                        }
                                        resizeTextEditor(expressionTextEditor, tableViewerCreator);
                                    }

                                });
                            }
                        }

                    };
                }
                executionLimiter.startIfExecutable();
            }

        });
        expressionTextEditor.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent e) {
                ITableEntry currentModifiedEntry = (ITableEntry) tableViewerCreator.getModifiedObjectInfo().getCurrentModifiedBean();
                initExpressionProposals(cellEditor, zones, tableViewerCreator, currentModifiedEntry);
                resizeTextEditor(expressionTextEditor, tableViewerCreator);
                StyledTextHandler styledTextHandler = mapperManager.getUiManager().getTabFolderEditors().getStyledTextHandler();
                styledTextHandler.setCurrentEntry(currentModifiedEntry);
                styledTextHandler.getStyledText().setText(
                        currentModifiedEntry.getExpression() == null ? "" : currentModifiedEntry.getExpression());
            }

            public void focusLost(FocusEvent e) {
                expressionEditorTextSelectionBeforeFocusLost = expressionTextEditor.getSelection();
                if (WindowSystem.isGTK()) {

                    new AsynchronousThreading(50, false, expressionTextEditor.getDisplay(), new Runnable() {

                        public void run() {

                            tableViewerCreator.layout();

                        }
                    }).start();

                }
            }

        });
        column.setCellEditor(cellEditor, new CellEditorValueAdapter() {

            @Override
            public Object getCellEditorTypedValue(CellEditor cellEditor, Object originalTypedValue) {
                return super.getCellEditorTypedValue(cellEditor, originalTypedValue);
            }

            @Override
            public String getColumnText(CellEditor cellEditor, Object cellEditorTypedValue) {
                return super.getColumnText(cellEditor, cellEditorTypedValue).replaceAll("[\r\n\t]+", " ... ");
            }

            @Override
            public Object getOriginalTypedValue(CellEditor cellEditor, Object cellEditorTypedValue) {
                return super.getOriginalTypedValue(cellEditor, cellEditorTypedValue);
            }

        });
        return cellEditor;
    }

    private void resizeTextEditor(Text textEditor, TableViewerCreator tableViewerCreator) {

        Point currentSize = textEditor.getSize();
        Rectangle currentBounds = textEditor.getBounds();
        String text = textEditor.getText();
        Table currentTable = tableViewerCreator.getTable();
        int itemHeight = currentTable.getItemHeight();
        int minHeight = itemHeight + 3;
        int maxHeight = 2 * itemHeight + 4;
        int newHeight = 0;
        if ((text.contains("\n") || text.contains("\r")) && currentBounds.y + maxHeight < currentTable.getBounds().height) {
            newHeight = maxHeight;
        } else {
            newHeight = minHeight;
        }
        if (currentSize.y != newHeight) {
            textEditor.setSize(textEditor.getSize().x, newHeight);
        }
    }

    /**
     * DOC amaumont Comment method "updateGridDataHeightForTableConstraints".
     */
    public void updateGridDataHeightForTableConstraints() {

        int moreSpace = WindowSystem.isGTK() ? tableForConstraints.getItemHeight() : 0;
        tableForConstraintsGridData.heightHint = ((OutputTable) abstractDataMapTable).getFilterEntries().size()
                * tableForConstraints.getItemHeight() + tableForConstraints.getItemHeight() / 2 + moreSpace;
    }

    /**
     * DOC amaumont Comment method "unselectAllEntries".
     */
    public void unselectAllEntries() {
        unselectAllColumnEntries();
        unselectAllConstraintEntries();
    }

    /**
     * DOC amaumont Comment method "unselectAllConstraintEntries".
     */
    public void unselectAllConstraintEntries() {
        // nothing by default, override if necessary
    }

    /**
     * DOC amaumont Comment method "unselectAllColumnEntries".
     */
    public void unselectAllColumnEntries() {
        tableViewerCreatorForColumns.getSelectionHelper().deselectAll();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.widgets.Control#setCursor(org.eclipse.swt.graphics.Cursor)
     */
    @Override
    public void setCursor(Cursor cursor) {
        if (this.currentCursor != null) {
            this.currentCursor.dispose();
        }
        this.currentCursor = cursor;
        super.setCursor(cursor);
    }

    /**
     * DOC amaumont Comment method "selectThisDataMapTableView".
     */
    protected void selectThisDataMapTableView() {
        UIManager uiManager = mapperManager.getUiManager();
        if (uiManager.getCurrentSelectedInputTableView() != DataMapTableView.this
                && uiManager.getCurrentSelectedOutputTableView() != DataMapTableView.this) {

            uiManager.selectDataMapTableView(DataMapTableView.this, true);
        }
    }

    /**
     * 
     * Provide a color provider for Constraints table and dataMap table.
     * 
     * 
     * <br/>
     * 
     * $Id$
     * 
     */
    class ExpressionColorProvider {

        /**
         * DOC amaumont Comment method "getBackgroundColor".
         * 
         * @param expression
         */
        public Color getBackgroundColor(boolean validCell) {

            if (validCell) {
                return null;
            } else {
                return ColorProviderMapper.getColor(ColorInfo.COLOR_BACKGROUND_ERROR_EXPRESSION_CELL);
            }

        }

        /**
         * DOC amaumont Comment method "getBackgroundColor".
         * 
         * @param expression
         */
        public Color getForegroundColor(boolean validCell) {
            if (validCell) {
                return null;
            } else {
                return ColorProviderMapper.getColor(ColorInfo.COLOR_FOREGROUND_ERROR_EXPRESSION_CELL);
            }

        }

    }

    protected ExpressionColorProvider getExpressionColorProvider() {
        return this.expressionColorProvider;
    }

    /**
     * DOC amaumont Comment method "getCommonBackgroundColor".
     * 
     * @param element
     * @param columnIndex
     * @return
     */
    protected Color getBackgroundCellColor(TableViewerCreator tableViewerCreator, Object element, int columnIndex) {
        ITableEntry entry = (ITableEntry) element;
        TableViewerCreatorColumn column = (TableViewerCreatorColumn) tableViewerCreator.getColumns().get(columnIndex);
        if (column.getId().equals(ID_EXPRESSION_COLUMN)) {
            return expressionColorProvider.getBackgroundColor(entry.getProblem() == null ? true : false);
        }
        return null;
    }

    /**
     * DOC amaumont Comment method "getCommonBackgroundColor".
     * 
     * @param element
     * @param columnIndex
     * @return
     */
    protected Color getForegroundCellColor(TableViewerCreator tableViewerCreator, Object element, int columnIndex) {
        ITableEntry entry = (ITableEntry) element;
        TableViewerCreatorColumn column = (TableViewerCreatorColumn) tableViewerCreator.getColumns().get(columnIndex);
        if (column.getId().equals(ID_EXPRESSION_COLUMN)) {
            return expressionColorProvider.getForegroundColor(entry.getProblem() == null ? true : false);
        }
        return null;
    }

    /**
     * DOC amaumont Comment method "unselectAllEntriesIfErrorDetected".
     * 
     * @param e
     */
    protected void unselectAllEntriesIfErrorDetected(TableCellValueModifiedEvent e) {
        if (e.column.getId().equals(ID_EXPRESSION_COLUMN)) {
            ITableEntry currentEntry = (ITableEntry) e.bean;
            TableViewer tableViewer = null;
            if (currentEntry instanceof IColumnEntry) {
                tableViewer = DataMapTableView.this.getTableViewerCreatorForColumns().getTableViewer();
            } else if (currentEntry instanceof FilterTableEntry) {
                tableViewer = DataMapTableView.this.getTableViewerCreatorForFilters().getTableViewer();
            }
            if (currentEntry.getProblem() != null) {
                tableViewer.getTable().deselectAll();
            }
        }
    }

    /**
     * DOC amaumont Comment method "processEnterKeyDown".
     * 
     * @param tableViewer
     * @param event
     */
    protected void processEnterKeyDown(final TableViewerCreator tableViewerCreator, Event event) {
        if (event.character == '\r') {
            Object element = null;
            if (tableViewerCreator.getTable().getSelectionCount() == 1) {
                element = tableViewerCreator.getTable().getSelection()[0].getData();
            } else {
                element = tableViewerCreator.getModifiedObjectInfo().getPreviousModifiedBean();
            }
            if (element != null) {
                tableViewerCreator.getTableViewer().editElement(element, 1);
            }
        }
    }

    public abstract boolean toolbarNeededToBeRightStyle();

    /**
     * DOC amaumont Comment method "parseExpression".
     * 
     * @param event
     * @param tableViewerCreator
     * @param tableEntry
     */
    private void parseExpression(ModifiedBeanEvent event, TableViewerCreator tableViewerCreator, ITableEntry tableEntry) {
        if (event.column == tableViewerCreator.getColumn(DataMapTableView.ID_EXPRESSION_COLUMN)) {
            mapperManager.getUiManager().parseExpression(tableEntry.getExpression(), tableEntry, false, false, false);
            mapperManager.getUiManager().refreshBackground(false, false);
        }
    }

    /**
     * Getter for extendedTableViewerForColumns.
     * 
     * @return the extendedTableViewerForColumns
     */
    public AbstractExtendedTableViewer<IColumnEntry> getExtendedTableViewerForColumns() {
        return this.extendedTableViewerForColumns;
    }

    /**
     * Getter for extendedTableViewerForFilters.
     * 
     * @return the extendedTableViewerForFilters
     */
    public AbstractExtendedTableViewer<FilterTableEntry> getExtendedTableViewerForFilters() {
        return this.extendedTableViewerForFilters;
    }

}

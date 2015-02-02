// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.connections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.graphics.Color;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.utils.image.ColorUtils;
import org.talend.core.PluginChecker;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IConnectionProperty;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.subjobcontainer.SubjobContainer;
import org.talend.designer.core.utils.ParallelExecutionUtils;
import org.talend.designer.core.utils.ResourceDisposeUtil;

/**
 * Figure corresponding the the connection. <br/>
 * 
 * $Id$
 * 
 */
public class ConnectionFigure extends PolylineConnection {

    private IConnectionProperty connectionProperty;

    private INode linkedNode;

    private IConnection connection;

    private ParallelFigure pationerFigure;

    private ParallelFigure collectorFigure;

    private ParallelFigure departionerFigure;

    private ParallelFigure recollectorFigure;

    private ParallelFigure collectorFigureAfter;

    private ParallelFigure repartionerFigureBefore;

    private ParallelFigure repartionerFigureAfter;

    Map<IElementParameter, Set<ParallelFigure>> figureMap = new HashMap<IElementParameter, Set<ParallelFigure>>();

    /**
     * Used for standard connections.
     * 
     * @param connection
     * @param connectionProperty
     * @param node
     */
    public ConnectionFigure(IConnection connection, IConnectionProperty connectionProperty, INode node) {
        linkedNode = node;
        this.connection = connection;
        // this.setLineStyle(Graphics.LINE_SOLID);
        setDecoration();
        this.setLineWidth(2);
        // this.setBorder(new
        // org.eclipse.draw2d.LineBorder(ColorUtils.getCacheColor(ColorUtils.parseStringToRGB("255;255;255"))));
        // this.setSmoothness(SMOOTH_MORE);
        // this.setRoundedBendpointsRadius(12);
        // setTargetDecoration(new PolygonDecoration());
        setConnectionProperty(connectionProperty);

        if (PluginChecker.isAutoParalelPluginLoaded()) {
            addParallelFigure();
            // TDI-26611
            if (connection != null) {
                initFigureMap();
            }
        }
    }

    private void setDecoration() {
        setTargetDecoration(new DecorationFigure(this, true));
        setSourceDecoration(new DecorationFigure(this, false));
    }

    private void initFigureMap() {
        figureMap.clear();
        Set<ParallelFigure> parFigures = new HashSet<ParallelFigure>();
        Set<ParallelFigure> keepParFigures = new HashSet<ParallelFigure>();
        Set<ParallelFigure> deparFigures = new HashSet<ParallelFigure>();
        Set<ParallelFigure> reparFigures = new HashSet<ParallelFigure>();
        IElementParameter enableParatitoner = connection.getElementParameter(EParameterName.PARTITIONER.getName());
        IElementParameter enableDepatitoner = connection.getElementParameter(EParameterName.DEPARTITIONER.getName());
        IElementParameter none = connection.getElementParameter(EParameterName.NONE.getName());
        IElementParameter enableRepatitoner = connection.getElementParameter(EParameterName.REPARTITIONER.getName());
        parFigures.add(pationerFigure);
        parFigures.add(collectorFigure);
        keepParFigures.add(collectorFigureAfter);
        deparFigures.add(departionerFigure);
        deparFigures.add(recollectorFigure);
        reparFigures.add(repartionerFigureBefore);
        reparFigures.add(repartionerFigureAfter);
        if (enableParatitoner != null) {
            figureMap.put(enableParatitoner, parFigures);
        }
        if (enableDepatitoner != null) {
            figureMap.put(enableDepatitoner, deparFigures);
        }
        if (none != null) {
            figureMap.put(none, keepParFigures);
        }
        if (enableRepatitoner != null) {
            figureMap.put(enableRepatitoner, reparFigures);
        }
    }

    private void addParallelFigure() {
        pationerFigure = new ParallelFigure();
        pationerFigure.setImage(ImageProvider.getImage(EImage.PARTITIONER_ICON));
        pationerFigure.setVisible(false);
        add(pationerFigure, new ParallelLocator(this, 0));

        collectorFigure = new ParallelFigure();
        collectorFigure.setImage(ImageProvider.getImage(EImage.COLLECTOR_ICON));
        collectorFigure.setVisible(false);
        add(collectorFigure, new DparallelLocator(this, 0));

        collectorFigureAfter = new ParallelFigure();
        collectorFigureAfter.setImage(ImageProvider.getImage(EImage.COLLECTOR_ICON));
        collectorFigureAfter.setVisible(false);
        add(collectorFigureAfter, new DparallelLocator(this, 0));

        departionerFigure = new ParallelFigure();
        departionerFigure.setImage(ImageProvider.getImage(EImage.DEPARTITIONER_ICON));
        departionerFigure.setVisible(false);
        add(departionerFigure, new ParallelLocator(this, 0));

        recollectorFigure = new ParallelFigure();
        recollectorFigure.setImage(ImageProvider.getImage(EImage.RECOLLECTOR_ICON));
        recollectorFigure.setVisible(false);
        add(recollectorFigure, new DparallelLocator(this, 0));

        repartionerFigureBefore = new ParallelFigure();
        repartionerFigureBefore.setImage(ImageProvider.getImage(EImage.REPARTITION_ICON));
        repartionerFigureBefore.setVisible(false);
        add(repartionerFigureBefore, new ParallelLocator(this, 0));

        repartionerFigureAfter = new ParallelFigure();
        repartionerFigureAfter.setImage(ImageProvider.getImage(EImage.COLLECTOR_ICON));
        repartionerFigureAfter.setVisible(false);
        add(repartionerFigureAfter, new DparallelLocator(this, 0));

    }

    public void updateStatus() {
        for (IElementParameter enableParallel : figureMap.keySet()) {
            // TDI-25822:until now ,we only support IConnectionCategory.DATA
            if (connection.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA) && enableParallel != null) {
                if (enableParallel.getValue().equals(true)) {
                    // For NONE ,maybe its icon need to keep partitioning
                    if (enableParallel.getName().equals(EParameterName.NONE.getName())) {
                        boolean isDisplayKeepPartion = false;
                        isDisplayKeepPartion = ParallelExecutionUtils.isExistPreviousParCon((Node) connection.getSource());
                        if (isDisplayKeepPartion) {
                            // one connection need to display two icons maybe
                            for (ParallelFigure pf : figureMap.get(enableParallel)) {
                                pf.setVisible(true);
                            }
                        } else {
                            for (ParallelFigure pf : figureMap.get(enableParallel)) {
                                pf.setVisible(false);
                            }
                        }
                    } else {
                        for (ParallelFigure pf : figureMap.get(enableParallel)) {
                            pf.setVisible(true);
                        }
                    }
                } else {
                    for (ParallelFigure pf : figureMap.get(enableParallel)) {
                        pf.setVisible(false);
                    }
                }
            }
        }
    }

    /**
     * Only used for partial connections used for dummy state.
     * 
     * @param connectionProperty
     * @param node
     */
    public ConnectionFigure(IConnectionProperty connectionProperty, Node node) {
        this(null, connectionProperty, node);
    }

    @Override
    public void paint(Graphics graphics) {
        if (((Node) linkedNode).getJobletNode() != null) {
            Node jnode = (Node) ((Node) linkedNode).getJobletNode();
            SubjobContainer subjobCon = jnode.getNodeContainer().getSubjobContainer();
            if (subjobCon != null && subjobCon.isCollapsed() && connection != null && !connection.isSubjobConnection()) {

                Node subjobStartNode = jnode.getNodeContainer().getSubjobContainer().getSubjobStartNode();
                if (subjobStartNode.equals(jnode) && ((Node) connection.getTarget()).getJobletNode() != null) {
                    // do nothing
                } else {
                    // only dependency links will be drawn
                    if (!connection.getLineStyle().hasConnectionCategory(IConnectionCategory.DEPENDENCY)) {
                        return;
                    }
                    if (!connection.getSource().equals(subjobStartNode) && !connection.getTarget().equals(subjobStartNode)) {
                        return;
                    }
                    if (connection.getTarget().getDesignSubjobStartNode().equals(subjobStartNode)) {
                        return;
                    }
                }

            }
        } else {
            if (((Node) linkedNode).getNodeContainer().getSubjobContainer() != null
                    && ((Node) linkedNode).getNodeContainer().getSubjobContainer().isCollapsed() && connection != null
                    && !connection.isSubjobConnection()) {

                Node subjobStartNode = ((Node) linkedNode).getNodeContainer().getSubjobContainer().getSubjobStartNode();
                // only dependency links will be drawn
                if (!connection.getLineStyle().hasConnectionCategory(IConnectionCategory.DEPENDENCY)) {
                    return;
                }
                if (!connection.getSource().equals(subjobStartNode) && !connection.getTarget().equals(subjobStartNode)) {
                    return;
                }
                if (connection.getTarget().getDesignSubjobStartNode().equals(subjobStartNode)) {
                    return;
                }
            }
        }

        if (getAlpha() != null && getAlpha() != -1) {
            graphics.setAlpha(getAlpha());
        }
        super.paint(graphics);
    }

    protected void setConnectionProperty(IConnectionProperty connectionProperty) {
        if (connectionProperty == null) {
            return;
        }
        this.connectionProperty = connectionProperty;
        setLineStyle(connectionProperty.getLineStyle());
        Color color = ColorUtils.getCacheColor(connectionProperty.getRGB());
        ResourceDisposeUtil.setAndCheckColor(this, color, true);
    }

    public void disposeColors() {
        // ResourceDisposeUtil.disposeColor(getForegroundColor());
    }

    /**
     * Getter for connectionProperty.
     * 
     * @return the connectionProperty
     */
    public IConnectionProperty getConnectionProperty() {
        return this.connectionProperty;
    }

    /**
     * Getter for connection.
     * 
     * @return the connection
     */
    public IConnection getConnection() {
        return this.connection;
    }

    @Override
    protected void outlineShape(Graphics g) {
        super.outlineShape(g);
    }

}

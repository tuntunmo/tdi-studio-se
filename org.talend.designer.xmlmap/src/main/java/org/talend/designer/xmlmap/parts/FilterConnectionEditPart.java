// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.xmlmap.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.talend.designer.xmlmap.figures.routers.CurveConnectionRouter;
import org.talend.designer.xmlmap.figures.routers.LookupConnectionRouter;
import org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.IConnection;
import org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree;
import org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode;
import org.talend.designer.xmlmap.ui.resource.ColorInfo;
import org.talend.designer.xmlmap.ui.resource.ColorProviderMapper;
import org.talend.designer.xmlmap.util.XmlMapUtil;

/**
 * wchen class global comment. Detailled comment
 */
public class FilterConnectionEditPart extends BaseConnectionEditPart {

    private CurveConnectionRouter curvrRouter;

    private LookupConnectionRouter cr;

    @Override
    protected IFigure createFigure() {
        PolylineConnection connection = new PolylineConnection();
        connection.setTargetDecoration(new PolygonDecoration());
        connection.setForegroundColor(ColorProviderMapper.getColor(ColorInfo.COLOR_UNSELECTED_FILTER_LINK));
        connection.setLineWidth(2);

        return connection;
    }

    private int calculateConnOffset() {
        FilterConnection model = (FilterConnection) getModel();

        if (model.getSource() == null) {
            return 0;
        }
        TreeNode sourceTreeNode = (TreeNode) model.getSource();
        List<IConnection> outConns = new ArrayList<IConnection>();
        EObject eobj = sourceTreeNode.eContainer();
        if (eobj instanceof InputXmlTree) {
            InputXmlTree inputTree = (InputXmlTree) eobj;
            EList<TreeNode> nodeList = inputTree.getNodes();
            for (TreeNode node : nodeList) {
                outConns.addAll(node.getFilterOutGoingConnections());
            }
        }
        int indexOf = outConns.indexOf(model);
        if (indexOf != -1) {
            return -(indexOf + 1) * XmlMapUtil.DEFAULT_OFFSET_FILTER;
        }
        return 0;
    }

    @Override
    public IFigure getFigure() {
        PolylineConnection figure = (PolylineConnection) super.getFigure();
        FilterConnection connectionModel = (FilterConnection) getModel();
        if (connectionModel.getTarget() instanceof OutputXmlTree) {
            if (curvrRouter == null) {
                curvrRouter = new CurveConnectionRouter();
                figure.setConnectionRouter(curvrRouter);
            }
        } else if (connectionModel.getTarget() instanceof InputXmlTree) {
            if (cr == null) {
                cr = new LookupConnectionRouter();
                figure.setConnectionRouter(cr);
            }
        }
        if (cr != null) {
            cr.setOffset(calculateConnOffset());
        }
        return figure;
    }

    @Override
    public void updateForegroundColor(boolean selected) {
        if (selected) {
            getFigure().setForegroundColor(ColorProviderMapper.getColor(ColorInfo.COLOR_SELECTED_FILTER_LINK));
        } else {
            getFigure().setForegroundColor(ColorProviderMapper.getColor(ColorInfo.COLOR_UNSELECTED_FILTER_LINK));
        }
    }
}

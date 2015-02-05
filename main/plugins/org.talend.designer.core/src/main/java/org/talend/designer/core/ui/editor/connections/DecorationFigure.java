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
package org.talend.designer.core.ui.editor.connections;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.talend.core.model.process.IConnection;

/**
 * DOC hwang class global comment. Detailled comment
 */
public class DecorationFigure extends PolygonDecoration implements RotatableDecoration {

    private final static int OFFSET = 3;

    private Dimension size = new Dimension(8, 14);

    private int alignment;

    private boolean isSource = false;

    private IConnection connection;

    private String title = "o";

    public DecorationFigure(ConnectionFigure parent, boolean isSource) {
        this.isSource = isSource;
        setAlignment(PositionConstants.CENTER);
        init(parent);
    }

    /**
     * Calculates the necessary size to display the Image within the figure's client area.
     * 
     * @see org.eclipse.draw2d.Figure#getPreferredSize(int, int)
     */
    @Override
    public Dimension getPreferredSize(int wHint, int hHint) {
        if (getInsets() == NO_INSETS) {
            return size;
        }
        Insets i = getInsets();
        return size.getExpanded(i.getWidth(), i.getHeight());
    }

    /**
     * @see org.eclipse.draw2d.Figure#paintFigure(Graphics)
     */
    @Override
    public void paintFigure(Graphics graphics) {
        super.paintFigure(graphics);

        int x, y;
        Rectangle area = getClientArea();
        switch (alignment & PositionConstants.NORTH_SOUTH) {
        case PositionConstants.NORTH:
            y = area.y;
            break;
        case PositionConstants.SOUTH:
            y = area.y + area.height - size.height;
            break;
        default:
            y = (area.height - size.height) / 2 + area.y;
            break;
        }
        switch (alignment & PositionConstants.EAST_WEST) {
        case PositionConstants.EAST:
            x = area.x + area.width - size.width;
            break;
        case PositionConstants.WEST:
            x = area.x;
            break;
        default:
            x = (area.width - size.width) / 2 + area.x;
            break;
        }
        // graphics.setFont(font);
        if (!isSource) {
            graphics.drawString("o", x, y);
            return;
        }
        graphics.drawString(title, x, y);
    }

    /**
     * Sets the alignment of the Image within this Figure. The alignment comes into play when the ImageFigure is larger
     * than the Image. The alignment could be any valid combination of the following:
     * 
     * <UL>
     * <LI>PositionConstants.NORTH</LI>
     * <LI>PositionConstants.SOUTH</LI>
     * <LI>PositionConstants.EAST</LI>
     * <LI>PositionConstants.WEST</LI>
     * <LI>PositionConstants.CENTER or PositionConstants.NONE</LI>
     * </UL>
     * 
     * @param flag A constant indicating the alignment
     */
    public void setAlignment(int flag) {
        alignment = flag;
    }

    public void init(ConnectionFigure parent) {
        this.connection = parent.getConnection();
        if (this.connection == null) {
            return;
        }
        switch (this.connection.getLineStyle()) {
        case FLOW_MAIN:
            title = "m"; //$NON-NLS-1$
            break;
        case FLOW_REF:
            title = "l"; //$NON-NLS-1$
            break;
        default:
            title = "i";//$NON-NLS-1$
            break;
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.RotatableDecoration#setReferencePoint(org.eclipse.draw2d.geometry.Point)
     */
    @Override
    public void setReferencePoint(Point p) {
        super.setReferencePoint(p);
    }

}

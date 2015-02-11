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

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.BorderItemRectilinearRouter;
import org.talend.core.model.process.EConnectionCategory;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IConnection;
import org.talend.designer.core.ui.editor.nodes.Node;

/**
 * DOC hwang class global comment. Detailled comment
 */
public class TalendBorderItemRectilinearRouter extends BorderItemRectilinearRouter {

    private final static int OFFSET = 16;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ObliqueRouter#routeBendpoints(org.eclipse.draw2d.Connection)
     */
    @Override
    public void routeBendpoints(Connection conn) {
        super.routeBendpoints(conn);
        manualPosition(conn);
    }

    private boolean manualPosition(Connection conn) {
        boolean alreadyHandle = false;
        if (!(conn instanceof ConnectionFigure)) {
            return false;
        }
        IConnection connection = ((ConnectionFigure) conn).getConnection();
        if (!(connection.getSource() instanceof Node)) {
            return false;
        }
        EConnectionCategory category = connection.getLineStyle().getCategory();
        Rectangle sourceBounds = new Rectangle(((Node) connection.getSource()).getLocation(),
                ((Node) connection.getSource()).getSize());
        Rectangle targetBounds = new Rectangle(((Node) connection.getTarget()).getLocation(),
                ((Node) connection.getTarget()).getSize());
        PointList points = conn.getPoints();
        PointList pointList = new PointList();
        Point firstpoint = points.getFirstPoint();
        Point lastpoint = points.getLastPoint();
        if (category == EConnectionCategory.MAIN && connection.getLineStyle() != EConnectionType.FLOW_REF) {
            if ((sourceBounds.x > targetBounds.x) && (sourceBounds.y == targetBounds.y)) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y + 2 * OFFSET);

                pointList.addPoint(lastpoint.x - OFFSET, lastpoint.y + 2 * OFFSET);
                pointList.addPoint(lastpoint.x - OFFSET, lastpoint.y);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if ((sourceBounds.x > targetBounds.x)
                    || (sourceBounds.getTopRight().x == targetBounds.getTopLeft().x)
                    || ((sourceBounds.getTopLeft().x == targetBounds.getTopRight().x) && (sourceBounds.getTopLeft().y != targetBounds
                            .getTopRight().y))) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + OFFSET, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);

                pointList.addPoint(lastpoint.x - OFFSET, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);
                pointList.addPoint(lastpoint.x - OFFSET, lastpoint.y);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if (sourceBounds.x == targetBounds.x) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + 2 * OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + 2 * OFFSET, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);

                pointList.addPoint(lastpoint.x - 2 * OFFSET, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);
                pointList.addPoint(lastpoint.x - 2 * OFFSET, lastpoint.y);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if (Math.abs(sourceBounds.getCenter().y - targetBounds.getCenter().y) == 4 * OFFSET) {
                if (sourceBounds.y < targetBounds.y) {
                    pointList.addPoint(firstpoint);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 - OFFSET, firstpoint.y);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 - OFFSET, firstpoint.y + 2 * OFFSET);

                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2, (firstpoint.y + lastpoint.y) / 2);

                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 + OFFSET, lastpoint.y - 2 * OFFSET);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 + OFFSET, lastpoint.y);
                    pointList.addPoint(lastpoint);
                    alreadyHandle = true;
                } else {
                    pointList.addPoint(firstpoint);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 - OFFSET, firstpoint.y);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 - OFFSET, firstpoint.y - 2 * OFFSET);

                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2, (firstpoint.y + lastpoint.y) / 2);

                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 + OFFSET, lastpoint.y + 2 * OFFSET);
                    pointList.addPoint((firstpoint.x + lastpoint.x) / 2 + OFFSET, lastpoint.y);
                    pointList.addPoint(lastpoint);
                    alreadyHandle = true;
                }
            }
        } else if (category == EConnectionCategory.OTHER
                && (connection.getLineStyle() == EConnectionType.FLOW_REF || connection.getLineStyle() == EConnectionType.TABLE_REF)) {
            if ((sourceBounds.y == targetBounds.y) && sourceBounds.x < targetBounds.x) {
                pointList.addPoint(firstpoint);
                pointList.addPoint((sourceBounds.getCenter().x + targetBounds.getCenter().x) / 2, sourceBounds.getCenter().y);
                pointList.addPoint((sourceBounds.getCenter().x + targetBounds.getCenter().x) / 2, lastpoint.y + OFFSET);

                pointList.addPoint(lastpoint.x, lastpoint.y + OFFSET);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if ((sourceBounds.y == targetBounds.y) && sourceBounds.x >= targetBounds.x) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y + 2 * OFFSET);

                pointList.addPoint(lastpoint.x, lastpoint.y + OFFSET);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if (targetBounds.getBottomRight().y == sourceBounds.getTopLeft().y) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y + 2 * OFFSET);

                pointList.addPoint(lastpoint.x, lastpoint.y + 3 * OFFSET);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if (targetBounds.getTopRight().y == sourceBounds.getBottomLeft().y) {
                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y - 2 * OFFSET);

                pointList.addPoint(lastpoint.x, lastpoint.y - 3 * OFFSET);
                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            } else if (sourceBounds.x >= targetBounds.x) {

                pointList.addPoint(firstpoint);
                pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y);
                if (targetBounds.getTopRight().x == sourceBounds.getBottomLeft().x) {
                    if (sourceBounds.y > targetBounds.y) {
                        pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y - 2 * OFFSET);
                        pointList.addPoint(lastpoint.x, firstpoint.y - 2 * OFFSET);
                    } else {
                        pointList.addPoint(firstpoint.x + OFFSET, firstpoint.y + 2 * OFFSET);
                        pointList.addPoint(lastpoint.x, firstpoint.y + 2 * OFFSET);
                    }
                } else {
                    pointList.addPoint(firstpoint.x + OFFSET, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);
                    pointList.addPoint(lastpoint.x, (sourceBounds.getCenter().y + targetBounds.getCenter().y) / 2);
                }

                pointList.addPoint(lastpoint);
                alreadyHandle = true;
            }
        }
        if (alreadyHandle && pointList.size() > 0) {
            conn.setPoints(pointList);
        }
        return alreadyHandle;
    }

}

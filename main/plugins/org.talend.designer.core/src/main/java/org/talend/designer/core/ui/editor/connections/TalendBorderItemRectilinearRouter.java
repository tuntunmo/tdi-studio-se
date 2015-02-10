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
        resetPosition(conn);
    }

    private void resetPosition(Connection conn) {
        if (!(conn instanceof ConnectionFigure)) {
            return;
        }
        IConnection connection = ((ConnectionFigure) conn).getConnection();
        if (!(connection.getSource() instanceof Node)) {
            return;
        }
        EConnectionCategory category = connection.getLineStyle().getCategory();
        Rectangle sourceBounds = new Rectangle(((Node) connection.getSource()).getLocation(),
                ((Node) connection.getSource()).getSize());
        Rectangle targetBounds = new Rectangle(((Node) connection.getTarget()).getLocation(),
                ((Node) connection.getTarget()).getSize());
        boolean horizontalSource = false;
        boolean verticalSource = false;
        boolean horizontalTarget = false;
        boolean verticalTarget = false;
        PointList points = conn.getPoints();
        if (points.size() >= 2) {
            Point first = points.getFirstPoint();
            Point sencond = points.getPoint(1);
            Point minPoint = first.min(first, sencond);
            if (first.x == sencond.x) {
                verticalSource = new Rectangle(minPoint.x - 2, minPoint.y, 4, Math.abs(sencond.y - first.y))
                        .contains(sourceBounds.getCenter());
            }
            if (first.y == sencond.y) {
                horizontalSource = new Rectangle(minPoint.x, minPoint.y - 2, Math.abs(sencond.x - first.x), 4)
                        .contains(sourceBounds.getCenter());
            }

            Point lastSecond = points.getPoint(points.size() - 2);
            Point last = points.getLastPoint();
            minPoint = lastSecond.min(lastSecond, last);
            if (lastSecond.x == last.x) {
                verticalTarget = new Rectangle(minPoint.x - 2, minPoint.y, 4, Math.abs(last.y - lastSecond.y))
                        .contains(targetBounds.getCenter());
            }
            if (lastSecond.y == last.y) {
                horizontalTarget = new Rectangle(minPoint.x, minPoint.y - 2, Math.abs(last.x - lastSecond.x), 4)
                        .contains(targetBounds.getCenter());
            }
        }

        PointList pointList = new PointList();

        for (int i = 0; i < points.size(); i++) {
            boolean alreadyAdded = false;
            if (horizontalSource) {
                if (i == 0) {
                    pointList.addPoint(points.getPoint(i));
                    pointList.addPoint(manualPosition(connection, points.getPoint(i), true));
                    if (category == EConnectionCategory.MAIN && connection.getLineStyle() != EConnectionType.FLOW_REF) {
                        pointList.addPoint(points.getPoint(i).x + OFFSET, points.getPoint(i).y + 3 * OFFSET);
                        if (points.size() > 1) {
                            pointList.addPoint(points.getPoint(i + 1).x, points.getPoint(i + 1).y + 3 * OFFSET);
                        }
                    } else if (category == EConnectionCategory.OTHER
                            && (connection.getLineStyle() == EConnectionType.FLOW_REF || connection.getLineStyle() == EConnectionType.TABLE_REF)) {
                        if (sourceBounds.y < targetBounds.y) {
                            pointList.addPoint(points.getPoint(i).x + OFFSET, points.getPoint(i).y - 3 * OFFSET);
                            if (points.size() > 1) {
                                pointList.addPoint(points.getPoint(i + 1).x, points.getPoint(i + 1).y - 3 * OFFSET);
                            }
                        } else {
                            pointList.addPoint(points.getPoint(i).x + OFFSET, points.getPoint(i).y + 3 * OFFSET);
                            if (points.size() > 1) {
                                pointList.addPoint(points.getPoint(i + 1).x, points.getPoint(i + 1).y + 3 * OFFSET);
                            }
                        }

                    }
                    alreadyAdded = true;
                }
            } else if (verticalSource) {
                if (i == 0) {
                    pointList.addPoint(points.getPoint(i));
                    pointList.addPoint(points.getPoint(i).x + OFFSET, points.getPoint(i).y);
                    if (points.size() > 1) {
                        pointList.addPoint(points.getPoint(i + 1).x + OFFSET, points.getPoint(i + 1).y);
                    }
                    alreadyAdded = true;
                }
            }

            if (horizontalTarget) {
                if (i == points.size() - 1) {

                    if (category == EConnectionCategory.MAIN && connection.getLineStyle() != EConnectionType.FLOW_REF) {
                        pointList.addPoint(points.getPoint(i).x - 16, points.getPoint(i).y + 3 * OFFSET);
                    } else if (category == EConnectionCategory.OTHER
                            && (connection.getLineStyle() == EConnectionType.FLOW_REF || connection.getLineStyle() == EConnectionType.TABLE_REF)) {
                        if (sourceBounds.y < targetBounds.y) {
                            pointList.addPoint(points.getPoint(i).x - OFFSET, points.getPoint(i).y - 3 * OFFSET);
                        } else {
                            pointList.addPoint(points.getPoint(i).x - OFFSET, points.getPoint(i).y + 3 * OFFSET);
                        }

                    }

                    pointList.addPoint(manualPosition(connection, points.getPoint(i), false));
                } else {
                }
            } else if (verticalTarget) {
                if (i == points.size() - 1) {

                    if (category == EConnectionCategory.MAIN && connection.getLineStyle() != EConnectionType.FLOW_REF) {
                        pointList.addPoint(points.getPoint(i).x + 3 * OFFSET, points.getPoint(i).y);
                    } else if (category == EConnectionCategory.OTHER
                            && (connection.getLineStyle() == EConnectionType.FLOW_REF || connection.getLineStyle() == EConnectionType.TABLE_REF)) {
                        if (sourceBounds.y < targetBounds.y) {
                            pointList.addPoint(points.getPoint(i).x, points.getPoint(i).y - 3 * OFFSET);
                        } else {
                            pointList.addPoint(points.getPoint(i).x, points.getPoint(i).y + 3 * OFFSET);
                        }

                    }
                }
            }
            if (!alreadyAdded) {
                pointList.addPoint(points.getPoint(i));
            }
        }
        conn.setPoints(pointList);

    }

    private boolean connectionIntersects(PointList points, Rectangle bounds) {
        if (points.size() <= 0) {
            return false;
        }
        for (int i = 0; i < points.size() - 1; i++) {
            boolean intersect = bounds.intersects(new Rectangle(points.getPoint(i), points.getPoint(i + 1)));
            if (intersect) {
                return intersect;
            }
        }
        return false;
    }

    private void resetPosition1(Connection conn) {
        if (!(conn instanceof ConnectionFigure)) {
            return;
        }
        IConnection connection = ((ConnectionFigure) conn).getConnection();
        if (!(connection.getSource() instanceof Node)) {
            return;
        }
        Rectangle sourceBounds = new Rectangle(((Node) connection.getSource()).getLocation(),
                ((Node) connection.getSource()).getSize());
        Rectangle targetBounds = new Rectangle(((Node) connection.getTarget()).getLocation(),
                ((Node) connection.getTarget()).getSize());
        PointList points = conn.getPoints();

        boolean sourceIntersect = connectionIntersects(points, sourceBounds);
        boolean targetIntersect = connectionIntersects(points, targetBounds);

        PointList pointList = new PointList();

        for (int i = 0; i < points.size(); i++) {
            boolean alreadyAdded = false;
            if (sourceIntersect) {
                if (i == 0) {
                    pointList.addPoint(points.getPoint(i));
                    pointList.addPoint(manualPosition(connection, points.getPoint(i), true));
                    // if (sourceBounds.y > targetBounds.y) {
                    // pointList.addPoint(points.getPoint(i).x + 16, points.getPoint(i).y - 48);
                    // if (points.size() > 1) {
                    // pointList.addPoint(points.getPoint(i + 1).x, points.getPoint(i + 1).y - 48);
                    // }
                    // } else {
                    pointList.addPoint(points.getPoint(i).x + 16, points.getPoint(i).y + 48);
                    if (points.size() > 1) {
                        pointList.addPoint(points.getPoint(i + 1).x, points.getPoint(i + 1).y + 48);
                        // }
                    }

                    alreadyAdded = true;
                }
            }
            if (targetIntersect) {
                if (i == points.size() - 1) {
                    // if (sourceBounds.y > targetBounds.y) {
                    pointList.addPoint(points.getPoint(i).x - 16, points.getPoint(i).y + 48);
                    pointList.addPoint(manualPosition(connection, points.getPoint(i), false));
                    // } else {
                    // pointList.addPoint(points.getPoint(i).x - 16, points.getPoint(i).y - 48);
                    // pointList.addPoint(manualPosition(connection, points.getPoint(i), false));
                    // }
                }
            }
            if (!alreadyAdded) {
                pointList.addPoint(points.getPoint(i));
            }
        }
        conn.setPoints(pointList);

    }

    private Point manualPosition(IConnection connection, Point point, boolean isResource) {
        EConnectionCategory category = connection.getLineStyle().getCategory();
        if (category == EConnectionCategory.MAIN && connection.getLineStyle() != EConnectionType.FLOW_REF) {
            if (isResource) {
                point.x = point.x + 16;
            } else {
                point.x = point.x - 16;
            }
        } else if (category == EConnectionCategory.OTHER
                && (connection.getLineStyle() == EConnectionType.FLOW_REF || connection.getLineStyle() == EConnectionType.TABLE_REF)) {
            if (isResource) {
                point.x = point.x + 16;
            }
        }
        return point;
    }
}

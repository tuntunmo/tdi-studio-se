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

import org.eclipse.draw2d.AbstractRouter;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.talend.commons.ui.runtime.geometry.Curve2DBezier;
import org.talend.commons.ui.runtime.geometry.Point2D;
import org.talend.commons.ui.runtime.geometry.Point2DList;

/**
 * DOC Talend class global comment. Detailled comment
 */
public class BezierCurveConnectionRouter extends AbstractRouter {

    // private Curve2DBezier curve;

    // protected Rectangle boundsOfCalculate;

    public BezierCurveConnectionRouter() {
    }

    /**
     * @see ConnectionRouter#route(Connection)
     */
    @Override
    public void route(Connection conn) {
        // conn.getSourceAnchor();
        // conn.getTargetAnchor();
        Point startPoint = getStartPoint(conn);
        Point endPoint = getEndPoint(conn);
        Point2DList pl = null;

        // int spaceBetweenPoints = 1;

        double distance = new java.awt.Point(startPoint.x, startPoint.y).distance(endPoint.x, endPoint.y);
        Curve2DBezier curve = null;
        if (curve == null) {
            curve = new Curve2DBezier();
            pl = new Point2DList();
            curve.setPointList(pl);
            for (int i = 0; i < 5; i++) {
                pl.add(new Point2D());
            }
        } else {
            pl = (Point2DList) curve.getPointList();
        }

        int subdiv = (int) (20000 / distance);
        curve.setSubdiv(subdiv > 0 ? subdiv : 2);

        pl.get(0).setLocation(startPoint.x, startPoint.y);

        Point p = getMiddlePoint(startPoint, endPoint, 1);
        if (p == null) {
            drawStraightLine(conn, startPoint, endPoint);
            return;
        } else {
            pl.get(1).setLocation(p.x, p.y);
        }

        p = getMiddlePoint(startPoint, endPoint, 2);
        if (p == null) {
            drawStraightLine(conn, startPoint, endPoint);
            return;
        } else {
            pl.get(2).setLocation(p.x, p.y);
        }

        p = getMiddlePoint(startPoint, endPoint, 3);
        if (p == null) {
            drawStraightLine(conn, startPoint, endPoint);
            return;
        } else {
            pl.get(3).setLocation(p.x, p.y);
        }

        pl.get(4).setLocation(endPoint.x, endPoint.y);

        curve.draw(null, pl, pl, 0, 0);
        if (curve.getPoints() != null) {
            int[] points = curve.getPoints();
            PointList pointList = new PointList(points.length / 2);
            for (int i = 0; (i + 1) < points.length; i += 2) {
                pointList.addPoint(points[i], points[i + 1]);
            }
            conn.setPoints(pointList);
        } else {
            drawStraightLine(conn, startPoint, endPoint);
            return;
        }

    }

    private void drawStraightLine(Connection conn, Point startPoint, Point endPoint) {
        PointList pointList = new PointList(2);
        pointList.addPoint(startPoint);
        pointList.addPoint(endPoint);
        conn.setPoints(pointList);
    }

    private Point getMiddlePoint(Point start, Point end, int index) {
        double x = 0;
        double y = 0;
        if (start.x == end.x) {
            return null;
        }
        if (start.y == end.y) {
            return null;
        }
        if (end.y > start.y) {
            y = end.y;
            x = start.x;
            if (index == 1) {
                if (y > 32) {
                    y = y - 32;
                }
            } else if (index == 3) {
                x = x + 32;
            }
        } else {
            y = start.y;
            x = end.x;
            if (index == 1) {
                if (x > 32) {
                    x = x - 32;
                }

            } else if (index == 3) {
                if (y > 32) {
                    y = y - 32;
                }

            }
        }
        if (index == 2) {
            return new Point(x, y);
        }
        return new Point(x, y);
    }

}

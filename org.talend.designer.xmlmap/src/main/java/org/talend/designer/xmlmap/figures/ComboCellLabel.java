// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.xmlmap.figures;

import org.eclipse.draw2d.Label;
import org.talend.designer.xmlmap.figures.cells.IComboCell;
import org.talend.designer.xmlmap.parts.directedit.DirectEditType;

/**
 * DOC Administrator class global comment. Detailled comment
 */
public class ComboCellLabel extends Label implements IComboCell {

    private DirectEditType type;

    public void setDirectEditType(DirectEditType type) {
        this.type = type;
    }

    public DirectEditType getDirectEditType() {
        return this.type;
    }

}
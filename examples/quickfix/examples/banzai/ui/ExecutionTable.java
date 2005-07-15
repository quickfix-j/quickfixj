/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix.examples.banzai.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import quickfix.examples.banzai.ExecutionTableModel;

public class ExecutionTable extends JTable {
    public ExecutionTable(ExecutionTableModel executionTableModel) {
        super(executionTableModel);
    }

    public Component prepareRenderer(TableCellRenderer renderer,
                                     int row, int column) {
//        Execution execution = (Execution)((ExecutionTableModel)dataModel)
//                              .getExecution(row);

        DefaultTableCellRenderer r = (DefaultTableCellRenderer)renderer;
        r.setForeground(Color.black);

        if((row%2) == 0)
            r.setBackground(Color.white);
        else
            r.setBackground(Color.lightGray);

        return super.prepareRenderer(renderer, row, column);
    }
}

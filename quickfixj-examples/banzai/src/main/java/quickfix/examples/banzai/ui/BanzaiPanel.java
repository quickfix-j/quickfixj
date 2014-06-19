/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.examples.banzai.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import quickfix.examples.banzai.BanzaiApplication;
import quickfix.examples.banzai.ExecutionTableModel;
import quickfix.examples.banzai.Order;
import quickfix.examples.banzai.OrderTableModel;

/**
 * Main content panel
 */
public class BanzaiPanel extends JPanel implements Observer, ActionListener {

    private OrderEntryPanel orderEntryPanel;
    private OrderPanel orderPanel;
    private CancelReplacePanel cancelReplacePanel;
    private OrderTableModel orderTableModel;

    public BanzaiPanel(OrderTableModel orderTableModel,
                ExecutionTableModel executionTableModel,
                BanzaiApplication application) {
        setName("BanzaiPanel");
        this.orderTableModel = orderTableModel;

        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1;

        orderEntryPanel = new OrderEntryPanel(orderTableModel, application);
        constraints.insets = new Insets(0, 0, 5, 0);
        add(orderEntryPanel, constraints);

        constraints.gridx++;
        constraints.weighty = 10;

        JTabbedPane tabbedPane = new JTabbedPane();
        orderPanel = new OrderPanel(orderTableModel, application);
        ExecutionPanel executionPanel = new ExecutionPanel(executionTableModel);

        tabbedPane.add("Orders", orderPanel);
        tabbedPane.add("Executions", executionPanel);
        add(tabbedPane, constraints);

        cancelReplacePanel = new CancelReplacePanel(application);
        constraints.weighty = 0;
        add(cancelReplacePanel, constraints);
        cancelReplacePanel.setEnabled(false);

        orderEntryPanel.addActionListener(this);
        orderPanel.orderTable().getSelectionModel().addListSelectionListener(new OrderSelection());
        cancelReplacePanel.addActionListener(this);
        application.addOrderObserver(this);
    }

    public void update(Observable o, Object arg) {
        cancelReplacePanel.update();
    }

    public void actionPerformed(ActionEvent e) {
        ListSelectionModel selection = orderPanel.orderTable().getSelectionModel();
        selection.clearSelection();
    }

    private class OrderSelection implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel selection = orderPanel.orderTable().getSelectionModel();
            if (selection.isSelectionEmpty()) {
                orderEntryPanel.clearMessage();
                return;
            }

            int firstIndex = e.getFirstIndex();
            int lastIndex = e.getLastIndex();
            int selectedRow = 0;
            int numSelected = 0;

            for (int i = firstIndex; i <= lastIndex; ++i) {
                if (selection.isSelectedIndex(i)) {
                    selectedRow = i;
                    numSelected++;
                }
            }

            if (numSelected > 1)
                orderEntryPanel.clearMessage();
            else {
                Order order = orderTableModel.getOrder(selectedRow);
                if (order != null) {
                    orderEntryPanel.setMessage(order.getMessage());
                    cancelReplacePanel.setOrder(order);
                }
            }
        }
    }
}

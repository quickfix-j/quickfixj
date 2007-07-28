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

package quickfix.examples.banzai;

import java.util.HashMap;

import javax.swing.table.AbstractTableModel;

public class ExecutionTableModel extends AbstractTableModel {

    private final static int SYMBOL = 0;
    private final static int QUANTITY = 1;
    private final static int SIDE = 2;
    private final static int PRICE = 3;

    private HashMap<Integer, Execution> rowToExecution;
    private HashMap<String, Integer> idToRow;
    private HashMap<String, Execution> idToExecution;
    private HashMap<String, Execution> exchangeIdToExecution;

    private String[] headers;

    public ExecutionTableModel() {
        rowToExecution = new HashMap<Integer, Execution>();
        idToRow = new HashMap<String, Integer>();
        idToExecution = new HashMap<String, Execution>();
        exchangeIdToExecution = new HashMap<String, Execution>();

        headers = new String[]
                  {"Symbol", "Quantity", "Side", "Price"};
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void addExecution(Execution execution) {
        int row = rowToExecution.size();

        if(exchangeIdToExecution.get(execution.getExchangeID()) != null)
            return;

        rowToExecution.put(Integer.valueOf(row), execution);
        idToRow.put(execution.getID(), Integer.valueOf(row));
        idToExecution.put(execution.getID(), execution);
        exchangeIdToExecution.put(execution.getExchangeID(), execution);

        fireTableRowsInserted(row, row);
    }

    public Execution getExchangeExecution(String exchangeID) {
        return exchangeIdToExecution.get(exchangeID);
    }

    public Execution getExecution(int row) {
        return rowToExecution.get(Integer.valueOf(row));
    }

    public void setValueAt(Object value, int rowIndex,
                           int columnIndex) {}

    public Class<String> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getRowCount() {
        return rowToExecution.size();
    }

    public int getColumnCount() {
        return headers.length;
    }

    public String getColumnName(int columnIndex) {
        return headers[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Execution execution = rowToExecution.get
                              (Integer.valueOf(rowIndex));

        switch(columnIndex) {
        case SYMBOL:
            return execution.getSymbol();
        case QUANTITY:
            return Integer.valueOf(execution.getQuantity());
        case SIDE:
            return execution.getSide();
        case PRICE:
            return new Double(execution.getPrice());
        }
        return "";
    }
}

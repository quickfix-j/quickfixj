/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX/J FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixj.org 
 * license as defined by quickfixj.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixj.org/LICENSE for licensing information. 
 * 
 ******************************************************************************/

package org.quickfixj.jmx.mbean.stats;

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.TabularData;
import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.TabularType;

import org.quickfixj.jmx.openmbean.CompositeDataFactory;
import org.quickfixj.jmx.openmbean.CompositeTypeFactory;

import com.jamonapi.MonKey;
import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

class JamonStatistics implements JamonStatisticsMBean {
    private static final String IS_PRIMARY_KEY = "Primary?";
    private static final String MAX_ACTIVE_KEY = "Max Active";
    private static final String ACTIVE_KEY = "Active";
    private static final String LAST_ACCESS_KEY = "Last Access";
    private static final String FIRST_ACCESS_KEY = "First Access";
    private static final String STD_DEV_KEY = "Std. Dev.";
    private static final String HITS_KEY = "Hits";
    private static final String MAX_KEY = "Max.";
    private static final String MIN_KEY = "Min.";
    private static final String AVG_KEY = "Avg.";
    private static final String TOTAL_KEY = "Total";
    private static final String LABEL_KEY = "Label";
    private static final String CATEGORY_KEY = "Category";
    
    private CompositeType jaMonRowType;

    public JamonStatistics() throws OpenDataException {
        CompositeTypeFactory factory = new CompositeTypeFactory("monitor", "JAMon Monitor");
        factory.defineItem(CATEGORY_KEY, SimpleType.STRING);
        factory.defineItem(LABEL_KEY, SimpleType.STRING);
        factory.defineItem(TOTAL_KEY, SimpleType.DOUBLE);
        factory.defineItem(AVG_KEY, SimpleType.DOUBLE);
        factory.defineItem(MIN_KEY, SimpleType.DOUBLE);
        factory.defineItem(MAX_KEY, SimpleType.DOUBLE);
        factory.defineItem(HITS_KEY, SimpleType.DOUBLE);
        factory.defineItem(STD_DEV_KEY, SimpleType.DOUBLE);
        factory.defineItem(FIRST_ACCESS_KEY, SimpleType.DATE);
        factory.defineItem(LAST_ACCESS_KEY, SimpleType.DATE);
        factory.defineItem(ACTIVE_KEY, SimpleType.DOUBLE);
        factory.defineItem(MAX_ACTIVE_KEY, SimpleType.DOUBLE);
        factory.defineItem(IS_PRIMARY_KEY, SimpleType.BOOLEAN);
        jaMonRowType = factory.createCompositeType();
    }

    public TabularData getStatistics() throws OpenDataException {
        try {
            TabularType tabularType = new TabularType("monitorTable", "JAMon monitors", jaMonRowType,
                    new String[] { CATEGORY_KEY, LABEL_KEY });
            TabularDataSupport table = new TabularDataSupport(tabularType);
            
            Monitor[] monitors = MonitorFactory.getFactory().getRootMonitor().getMonitors();
            if (monitors == null) {
                return table;
            }

            CompositeDataFactory factory = new CompositeDataFactory(jaMonRowType);
            for (int i = 0; i < monitors.length; i++) {
                factory.clear();
                String[] labelFields = ((String)monitors[i].getMonKey().getValue(MonKey.LABEL_HEADER)).split("/");
                String category = labelFields.length == 2 ? labelFields[0] : "N/A";
                String label = labelFields.length == 2 ? labelFields[1] : labelFields[0];
                factory.setValue(CATEGORY_KEY, category);
                factory.setValue(LABEL_KEY, label);
                factory.setValue(TOTAL_KEY, monitors[i].getTotal());
                factory.setValue(AVG_KEY, monitors[i].getAvg());
                factory.setValue(MIN_KEY, monitors[i].getMin());
                factory.setValue(MAX_KEY, monitors[i].getMax());
                factory.setValue(HITS_KEY, monitors[i].getHits());
                factory.setValue(STD_DEV_KEY, monitors[i].getStdDev());
                factory.setValue(FIRST_ACCESS_KEY, monitors[i].getFirstAccess());
                factory.setValue(LAST_ACCESS_KEY, monitors[i].getLastAccess());
                factory.setValue(ACTIVE_KEY, monitors[i].getActive());
                factory.setValue(MAX_ACTIVE_KEY, monitors[i].getMaxActive());
                factory.setValue(IS_PRIMARY_KEY, monitors[i].isPrimary());
                table.put(factory.createCompositeData());
            }
            return table;
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public void setEnabled(boolean flag) {
        if (flag) {
            MonitorFactory.enable();
        } else {
            MonitorFactory.disable();
        }
    }
    
    public void setDebugEnabled(boolean flag) {
        MonitorFactory.setDebugEnabled(flag);
    }

    public String getJamonVersion() {
        return MonitorFactory.getVersion();
    }

    public boolean isDebugEnabled() {
        return MonitorFactory.isDebugEnabled();
    }

    public boolean isEnabled() {
        return MonitorFactory.isEnabled();
    }

    public void reset() {
        MonitorFactory.reset();
    }


}

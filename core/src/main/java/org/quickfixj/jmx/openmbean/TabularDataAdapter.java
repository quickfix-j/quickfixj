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

package org.quickfixj.jmx.openmbean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.SimpleType;
import javax.management.openmbean.TabularData;
import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.TabularType;

public class TabularDataAdapter {

    public TabularData fromArray(String tableTypeName, String rowTypeName, Object[] objects)
            throws OpenDataException {
        TabularData table = null;
        CompositeTypeFactory rowTypeFactory = new CompositeTypeFactory(rowTypeName, rowTypeName);
        rowTypeFactory.defineItem(rowTypeName, SimpleType.STRING);
        CompositeType rowType = rowTypeFactory.createCompositeType();
        TabularType tableType = new TabularType(tableTypeName, tableTypeName, rowType,
                new String[] { rowTypeName });
        CompositeDataFactory rowDataFactory = new CompositeDataFactory(rowType);
        table = new TabularDataSupport(tableType);
        for (int i = 0; i < objects.length; i++) {
            rowDataFactory.clear();
            rowDataFactory.setValue(rowTypeName, objects[i].toString());
            table.put(rowDataFactory.createCompositeData());
        }
        return table;
    }

    @SuppressWarnings("rawtypes")
    public TabularData fromMap(String keyLabel, String valueLabel, Map data)
            throws OpenDataException {
        TabularData table = null;
        CompositeTypeFactory rowTypeFactory = new CompositeTypeFactory("row", "row");
        rowTypeFactory.defineItem(keyLabel, SimpleType.STRING);
        rowTypeFactory.defineItem(valueLabel, SimpleType.STRING);
        CompositeType rowType = rowTypeFactory.createCompositeType();
        TabularType tableType = new TabularType("TabularData", "TabularData", rowType,
                new String[] { keyLabel, valueLabel });
        CompositeDataFactory rowDataFactory = new CompositeDataFactory(rowType);
        table = new TabularDataSupport(tableType);
        Iterator entries = data.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            rowDataFactory.clear();
            rowDataFactory.setValue(keyLabel, entry.getKey().toString());
            rowDataFactory.setValue(valueLabel, entry.getValue().toString());
            table.put(rowDataFactory.createCompositeData());
        }
        return table;
    }

    public TabularData fromBean(String keyLabel, String valueLabel, Object bean) throws OpenDataException {
        TabularData table = null;
        CompositeTypeFactory rowTypeFactory = new CompositeTypeFactory("row", "row");
        rowTypeFactory.defineItem(keyLabel, SimpleType.STRING);
        rowTypeFactory.defineItem(valueLabel, SimpleType.STRING);
        CompositeType rowType = rowTypeFactory.createCompositeType();
        TabularType tableType = new TabularType("TabularData", "TabularData", rowType,
                new String[] { keyLabel, valueLabel });
        CompositeDataFactory rowDataFactory = new CompositeDataFactory(rowType);
        table = new TabularDataSupport(tableType);
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < pds.length; i++) {
                PropertyDescriptor descriptor = pds[i];
                if (descriptor.getReadMethod() != null && !"class".equals(descriptor.getName())) {
                    rowDataFactory.clear();
                    rowDataFactory.setValue(keyLabel, descriptor.getName());
                    Object value = descriptor.getReadMethod().invoke(bean, (Object[])null);
                    if (value == null) {
                        value = "(null)";
                    }
                    rowDataFactory.setValue(valueLabel, value);
                    table.put(rowDataFactory.createCompositeData());
                }
            }
        } catch (OpenDataException e) {
            throw e;
        } catch (Exception e) {
            OpenDataException ode = new OpenDataException(e.getMessage());
            ode.setStackTrace(e.getStackTrace());
            throw ode;
        }
        return table;
    }

    public TabularData fromBeanList(String tableTypeName, String rowTypeName, String keyProperty,
            List<?> beans) throws OpenDataException {
        TabularData table = null;
        try {
            CompositeTypeFactory rowTypeFactory = new CompositeTypeFactory(rowTypeName, rowTypeName);
            List<String> indexNames = new ArrayList<String>();
            indexNames.add(keyProperty);
            rowTypeFactory.defineItem(formatHeader(keyProperty), SimpleType.STRING);
            for (int i = 0; i < beans.size(); i++) {
                Object bean = beans.get(i);
                BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
                PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
                for (int p = 0; p < pds.length; p++) {
                    PropertyDescriptor descriptor = pds[p];
                    String propertyName = descriptor.getName();
                    if (descriptor.getReadMethod() != null && !"class".equals(propertyName)
                            && !indexNames.contains(propertyName)) {
                        indexNames.add(propertyName);
                        rowTypeFactory.defineItem(formatHeader(propertyName), SimpleType.STRING);
                    }
                }
            }
            CompositeType rowType = rowTypeFactory.createCompositeType();
            TabularType tableType = new TabularType(tableTypeName, tableTypeName, rowType,
                    createTableHeaders(indexNames));
            CompositeDataFactory rowDataFactory = new CompositeDataFactory(rowType);
            table = new TabularDataSupport(tableType);
            for (int i = 0; i < beans.size(); i++) {
                rowDataFactory.clear();
                Object bean = beans.get(i);
                BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
                PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
                for (int p = 0; p < pds.length; p++) {
                    PropertyDescriptor descriptor = pds[p];
                    String propertyName = descriptor.getName();
                    String headerName = formatHeader(propertyName);
                    if (descriptor.getReadMethod() != null && !"class".equals(propertyName)) {
                        Object value = descriptor.getReadMethod().invoke(bean, (Object[])null);
                        if (value == null) {
                            value = "(null)";
                        }
                        rowDataFactory.setValue(headerName, value.toString());
                    }
                }
                table.put(rowDataFactory.createCompositeData());
            }
        } catch (OpenDataException e) {
            throw e;
        } catch (Exception e) {
            OpenDataException ode = new OpenDataException(e.getMessage());
            ode.setStackTrace(e.getStackTrace());
            throw ode;
        }
        return table;
    }

    private String[] createTableHeaders(List<String> indexNames) {
        String[] headers = new String[indexNames.size()];
        for (int i = 0; i < indexNames.size(); i++) {
            String name = indexNames.get(i);
            headers[i] = formatHeader(name);
        }
        return headers;
    }

    private String formatHeader(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

}

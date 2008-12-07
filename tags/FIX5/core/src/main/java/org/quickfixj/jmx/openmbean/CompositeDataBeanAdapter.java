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

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.SimpleType;

public class CompositeDataBeanAdapter {

    private CompositeType compositeType;
    private final Class<?> beanClass;
    private final String defaultPropertyValue;

    public CompositeDataBeanAdapter(Class<?> beanClass) throws OpenDataException, IntrospectionException {
        this(beanClass, null);
    }

    public CompositeDataBeanAdapter(Class<?> beanClass, String defaultPropertyValue)
            throws IntrospectionException, OpenDataException {
        this.beanClass = beanClass;
        this.defaultPropertyValue = defaultPropertyValue;
        BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
        BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
        CompositeTypeFactory typeFactory = new CompositeTypeFactory(beanDescriptor.getName(),
                beanDescriptor.getDisplayName());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < propertyDescriptors.length; i++) {
            PropertyDescriptor pd = propertyDescriptors[i];
            if (isExposed(pd)) {
                typeFactory.defineItem(pd.getDisplayName(), SimpleType.STRING);
            }
        }
        compositeType = typeFactory.createCompositeType();
    }

    private boolean isExposed(PropertyDescriptor pd) {
        return !"class".equals(pd.getName()) && pd.getReadMethod() != null;
    }

    public CompositeData getData(Object bean) throws IntrospectionException,
            InvocationTargetException, OpenDataException, IllegalAccessException {
        CompositeDataFactory dataFactory;
        dataFactory = new CompositeDataFactory(compositeType);
        BeanInfo beanInfo = Introspector.getBeanInfo(beanClass);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < propertyDescriptors.length; i++) {
            PropertyDescriptor pd = propertyDescriptors[i];
            if (isExposed(pd)) {
                Object value = pd.getReadMethod().invoke(bean, (Object[])null);
                if (value == null && defaultPropertyValue != null) {
                    value = defaultPropertyValue;
                }
                dataFactory.setValue(pd.getDisplayName(), value == null ? "" : value.toString());
            }
        }
        return dataFactory.createCompositeData();
    }
}

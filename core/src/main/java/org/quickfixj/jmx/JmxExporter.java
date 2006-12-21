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

package org.quickfixj.jmx;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;

import org.quickfixj.jmx.mbean.connector.ConnectorJmxExporter;
import org.quickfixj.jmx.mbean.stats.JamonJmxExporter;

import quickfix.Connector;
import quickfix.mina.SessionConnector;

public class JmxExporter {

    private final MBeanServer mbeanServer;

    private ConnectorJmxExporter connectorExporter = new ConnectorJmxExporter();
    
    public JmxExporter(MBeanServer mbeanServer) {
        this.mbeanServer = mbeanServer;
    }

    public JmxExporter() throws JMException {
        this.mbeanServer = createMBeanServer();
    }

    private MBeanServer createMBeanServer() throws JMException {
        try {
            Class factoryClass = Class.forName("java.lang.management.ManagementFactory");
            try {
                return (MBeanServer) factoryClass.getMethod("getPlatformMBeanServer", null).invoke(
                        factoryClass, null);
            } catch (Exception e) {
                JMException jme = new JMException(e.getMessage());
                jme.setStackTrace(e.getStackTrace());
                throw jme;
            }
        } catch (ClassNotFoundException e) {
            return MBeanServerFactory.createMBeanServer();
        }
    }

    public void enableStatistics() {
        new JamonJmxExporter().export(mbeanServer);
    }

    public void export(Connector connector) {
        connectorExporter.export(mbeanServer, (SessionConnector)connector);
    }

    public MBeanServer getMBeanServer() {
        return mbeanServer;
    }
}

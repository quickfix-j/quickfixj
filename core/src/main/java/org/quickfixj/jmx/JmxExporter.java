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

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

import org.quickfixj.jmx.mbean.connector.ConnectorJmxExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Connector;
import quickfix.mina.SessionConnector;

public class JmxExporter {

    /**
     * Constant indicating that registration should fail when
     * attempting to register an MBean under a name that already exists.
     * <p>This is the default registration behaviour.
     */
    public static final int REGISTRATION_FAIL_ON_EXISTING = 0;
    /**
     * Constant indicating that registration should ignore the affected MBean
     * when attempting to register an MBean under a name that already exists.
     */
    public static final int REGISTRATION_IGNORE_EXISTING = 1;
    /**
     * Constant indicating that registration should replace the affected MBean
     * when attempting to register an MBean under a name that already exists.
     */
    public static final int REGISTRATION_REPLACE_EXISTING = 2;

    private int registrationBehaviour;

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final MBeanServer mbeanServer;

    private final ConnectorJmxExporter connectorExporter = new ConnectorJmxExporter();

    public JmxExporter(MBeanServer mbeanServer, int registrationBehaviour) {
        this.mbeanServer = mbeanServer;
        this.registrationBehaviour = registrationBehaviour;
    }

    public JmxExporter(MBeanServer mbeanServer) {
        this(mbeanServer, REGISTRATION_FAIL_ON_EXISTING);
    }

    public JmxExporter() throws JMException {
        this(createMBeanServer());
    }

    /**
     * Specify  what action should be taken when attempting to register an MBean
     * under an {@link javax.management.ObjectName} that already exists.
     * <p>Default is REGISTRATION_FAIL_ON_EXISTING.
     * @see #REGISTRATION_FAIL_ON_EXISTING
     * @see #REGISTRATION_IGNORE_EXISTING
     * @see #REGISTRATION_REPLACE_EXISTING
     */
    public void setRegistrationBehavior(int registrationBehaviour) {
        this.registrationBehaviour = registrationBehaviour;
    }

    private static MBeanServer createMBeanServer() throws JMException {
        try {
            final Class<?> factoryClass = Class.forName("java.lang.management.ManagementFactory");
            try {
                return (MBeanServer) factoryClass.getMethod("getPlatformMBeanServer").invoke(
                        factoryClass, (Object[]) null);
            } catch (final Exception e) {
                final JMException jme = new JMException(e.getMessage());
                jme.setStackTrace(e.getStackTrace());
                throw jme;
            }
        } catch (final ClassNotFoundException e) {
            return MBeanServerFactory.createMBeanServer();
        }
    }

    /**
     * Register a connector with JMX
     * @deprecated use register instead
     * @param connector
     */
    public void export(Connector connector) {
        register(connector);
    }

    public ObjectName register(Connector connector) {
        return connectorExporter.register(this, (SessionConnector) connector);
    }
    
    public MBeanServer getMBeanServer() {
        return mbeanServer;
    }

    /**
     * Actually register the MBean with the server. The behaviour when encountering
     * an existing MBean can be configured using the registrationBehaviour constructor or {@link #setRegistrationBehavior(int)}.
     * This design (and also code) was unashamedly cribbed from Spring's
     * <a href="http://static.springframework.org/spring/docs/2.0.x/api/org/springframework/jmx/support/MBeanRegistrationSupport.html">MBeanRegistrationSupport</a>
     * class. Thanks Spring team!
     * @see #REGISTRATION_FAIL_ON_EXISTING
     * @see #REGISTRATION_IGNORE_EXISTING
     * @see #REGISTRATION_REPLACE_EXISTING
     * @param mbean
     * @param objectName
     * @throws JMException
     */
    public void registerMBean(Object mbean, ObjectName objectName) throws JMException {
        try {
            mbeanServer.registerMBean(mbean, objectName);
        } catch (final InstanceAlreadyExistsException ex) {
            if (registrationBehaviour == REGISTRATION_IGNORE_EXISTING) {
                if (log.isDebugEnabled()) {
                    log.debug("Ignoring existing MBean at [" + objectName + "]");
                }
            } else if (registrationBehaviour == REGISTRATION_REPLACE_EXISTING) {
                try {
                    if (log.isDebugEnabled()) {
                        log.debug("Replacing existing MBean at [" + objectName + "]");
                    }
                    mbeanServer.unregisterMBean(objectName);
                    mbeanServer.registerMBean(mbean, objectName);
                } catch (final InstanceNotFoundException ex2) {
                    log.error("Unable to replace existing MBean at [" + objectName + "]", ex2);
                    throw ex;
                }
            } else {
                throw ex;
            }
        }
    }
}

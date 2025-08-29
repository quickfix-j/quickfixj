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

package org.quickfixj.jmx.mbean.connector;

import org.quickfixj.QFJException;
import org.quickfixj.jmx.JmxExporter;
import org.quickfixj.jmx.mbean.JmxSupport;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.quickfixj.jmx.openmbean.TabularDataAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.Connector;
import quickfix.Initiator;
import quickfix.RuntimeError;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.mina.SessionConnector;

import javax.management.MBeanRegistration;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

abstract class ConnectorAdmin implements ConnectorAdminMBean, MBeanRegistration {

    protected static final TabularDataAdapter TABULAR_DATA_ADAPTER = new TabularDataAdapter();

    private final Logger log = LoggerFactory.getLogger(getClass());

    public final static String ACCEPTOR_ROLE = "ACCEPTOR";

    public final static String INITIATOR_ROLE = "INITIATOR";

    private final Connector connector;

    protected final SessionJmxExporter sessionExporter;

    private final JmxExporter jmxExporter;

    private final ObjectName connectorName;

    private final List<ObjectName> sessionNames = new ArrayList<>();

    private final SessionSettings settings;

    private String role = "N/A";

    private MBeanServer mbeanServer;

    public ConnectorAdmin(JmxExporter jmxExporter, Connector connector, ObjectName connectorName,
            SessionSettings settings, SessionJmxExporter sessionExporter) {
        this.jmxExporter = jmxExporter;
        this.connectorName = connectorName;
        this.settings = settings;
        this.sessionExporter = sessionExporter;
        if (connector instanceof Acceptor) {
            role = ACCEPTOR_ROLE;
        } else if (connector instanceof Initiator) {
            role = INITIATOR_ROLE;
        }
        this.connector = connector;
    }

    public String getRole() {
        return role;
    }

    public static class ConnectorSession {
        private final Session session;
        private final ObjectName sessionName;

        public ConnectorSession(Session session, ObjectName sessionName) {
            this.session = session;
            this.sessionName = sessionName;
        }

        public boolean isLoggedOn() {
            return session.isLoggedOn();
        }

        public SessionID getSessionID() {
            return session.getSessionID();
        }

        public ObjectName getSessionName() {
            return sessionName;
        }

        public String getRemoteAddress() {
            String remoteAddress = session.getRemoteAddress();
            return remoteAddress != null ? remoteAddress : "N/A";
        }
    }

    public TabularData getSessions() throws IOException {
        List<ConnectorSession> sessions = new ArrayList<>();
        for (SessionID sessionID : connector.getSessions()) {
            Session session = Session.lookupSession(sessionID);
            sessions.add(new ConnectorSession(session, sessionExporter.getSessionName(sessionID)));
        }
        try {
            return TABULAR_DATA_ADAPTER.fromBeanList("Sessions", "Session", "sessionID", sessions);
        } catch (OpenDataException e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public TabularData getLoggedOnSessions() throws OpenDataException {
        List<ObjectName> names = new ArrayList<>();
        for (SessionID sessionID : connector.getSessions()) {
            Session session = Session.lookupSession(sessionID);
            if (session.isLoggedOn()) {
                names.add(sessionExporter.getSessionName(sessionID));
            }
        }
        return TABULAR_DATA_ADAPTER.fromArray("Sessions", "SessionID", toObjectNameArray(names));
    }

    private ObjectName[] toObjectNameArray(List<ObjectName> sessions) {
        return sessions.toArray(new ObjectName[sessions.size()]);
    }

    public void start() throws IOException {
        log.info("JMX operation: start {} {}", getRole(), this);
        try {
            connector.start();
        } catch (ConfigError | RuntimeError e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public void stop(boolean force) {
        log.info("JMX operation: stop {} {}", getRole(), this);
        connector.stop(force);
    }

    public String getHostName() {
        try {
            return InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            return "[UNKNOWN]";
        }
    }

    public void stop() {
        stop(false);
    }

    public ObjectName preRegister(MBeanServer server, ObjectName name) throws Exception {
        this.mbeanServer = server;
        return name;
    }

    public void postRegister(Boolean registrationDone) {
        if (connector instanceof SessionConnector) {
            ((SessionConnector) connector).addPropertyChangeListener(evt -> {
                if (SessionConnector.SESSIONS_PROPERTY.equals(evt.getPropertyName())) {
                    registerSessions();
                }
            });
        }
        registerSessions();
    }

    private void registerSessions() {
        for (SessionID sessionID : connector.getSessions()) {
            if (sessionExporter.getSessionName(sessionID) == null) {
                try {
                    final ObjectName name = sessionExporter.register(
                        jmxExporter, Session.lookupSession(sessionID),
                        connectorName, settings);
                    sessionNames.add(name);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e) {
                    throw new QFJException("Connector MBean postregistration failed", e);
                }
            }
        }
    }

    public void preDeregister() throws Exception {
    }

    public void postDeregister() {
        for (ObjectName sessionName : sessionNames) {
            try {
                mbeanServer.unregisterMBean(sessionName);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e) {
                throw new QFJException("Connector MBean postregistration failed", e);
            }
        }
    }
}

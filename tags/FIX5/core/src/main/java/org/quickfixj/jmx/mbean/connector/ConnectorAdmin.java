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

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;

import org.quickfixj.jmx.mbean.JmxSupport;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.quickfixj.jmx.openmbean.TabularDataAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Acceptor;
import quickfix.Connector;
import quickfix.Initiator;
import quickfix.Responder;
import quickfix.Session;
import quickfix.SessionID;

abstract class ConnectorAdmin implements ConnectorAdminMBean {
    private Logger log = LoggerFactory.getLogger(getClass());

    public final static String ACCEPTOR_ROLE = "ACCEPTOR";

    public final static String INITIATOR_ROLE = "INITIATOR";

    private String role = "N/A";

    private final Connector connector;

    private static final TabularDataAdapter tabularDataAdapter = new TabularDataAdapter();

    private final SessionJmxExporter sessionExporter;

    public ConnectorAdmin(Connector connector, SessionJmxExporter sessionExporter) {
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
        private Session session;
        private ObjectName sessionName;

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
            Responder responder = session.getResponder();
            return responder != null ? responder.getRemoteIPAddress() : "N/A";
        }
    }

    public TabularData getSessions() throws IOException {
        List<ConnectorSession> sessions = new ArrayList<ConnectorSession>();
        Iterator<SessionID> sessionItr = connector.getSessions().iterator();
        while (sessionItr.hasNext()) {
            SessionID sessionID = (SessionID) sessionItr.next();
            Session session = Session.lookupSession(sessionID);
            sessions.add(new ConnectorSession(session, sessionExporter.getSessionName(sessionID)));
        }
        try {
            return tabularDataAdapter.fromBeanList("Sessions", "Session", "sessionID", sessions);
        } catch (OpenDataException e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public TabularData getLoggedOnSessions() throws OpenDataException {
        List<ObjectName> names = new ArrayList<ObjectName>();
        Iterator<SessionID> sessionItr = connector.getSessions().iterator();
        while (sessionItr.hasNext()) {
            SessionID sessionID = (SessionID) sessionItr.next();
            Session session = Session.lookupSession(sessionID);
            if (session.isLoggedOn()) {
                names.add(sessionExporter.getSessionName(sessionID));
            }
        }
        return tabularDataAdapter.fromArray("Sessions", "SessionID", toObjectNameArray(names));
    }

    private ObjectName[] toObjectNameArray(List<ObjectName> sessions) {
        return sessions.toArray(new ObjectName[sessions.size()]);
    }

    public void stop(boolean force) {
        log.info("JMX operation: stop " + getRole() + " " + this);
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

}

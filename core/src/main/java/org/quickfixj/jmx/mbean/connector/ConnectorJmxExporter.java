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

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.quickfixj.QFJException;
import org.quickfixj.jmx.JmxExporter;
import org.quickfixj.jmx.mbean.ObjectNameFactory;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.Acceptor;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.SessionConnector;
import quickfix.mina.acceptor.AbstractSocketAcceptor;
import quickfix.mina.initiator.AbstractSocketInitiator;

public class ConnectorJmxExporter {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final SessionJmxExporter sessionExporter = new SessionJmxExporter();
    private final static AtomicInteger connectorIdCounter = new AtomicInteger();

    public void export(JmxExporter jmxExporter, SessionConnector connector) {
        export(jmxExporter, connector, Integer.toString(connectorIdCounter.incrementAndGet()));
    }

    public void export(JmxExporter jmxExporter, SessionConnector connector, String connectorId) {
        try {
            ConnectorAdmin connectorAdmin;
            if (connector instanceof AbstractSocketAcceptor) {
                connectorAdmin = new SocketAcceptorAdmin((AbstractSocketAcceptor) connector,
                        sessionExporter);
            } else if (connector instanceof AbstractSocketInitiator) {
                connectorAdmin = new SocketInitiatorAdmin((AbstractSocketInitiator) connector,
                        sessionExporter);
            } else {
                throw new QFJException("Unknown connector type: " + connector.getClass().getName());
            }

            final ObjectName connectorName = getConnectorName(connector, connectorId);

            jmxExporter.registerMBean(connectorAdmin, connectorName);
            final ArrayList<SessionID> sessionIDs = connector.getSessions();
            for (int i = 0; i < sessionIDs.size(); i++) {
                final SessionID sessionID = sessionIDs.get(i);
                sessionExporter.export(jmxExporter, Session.lookupSession(sessionID),
                        connectorName, connector.getSettings());
            }
        } catch (final Exception e) {
            log.error("Failed to export connector MBean", e);
        }
    }

    private ObjectName getConnectorName(SessionConnector connector, String connectorId)
            throws MalformedObjectNameException {
        final ObjectNameFactory nameFactory = new ObjectNameFactory();
        nameFactory.addProperty("type", "Connector");
        nameFactory.addProperty("role", connector instanceof Acceptor ? "Acceptor" : "Initiator");
        nameFactory.addProperty("id", connectorId);
        return nameFactory.createName();
    }

    public ObjectName lookupSessionName(SessionID sessionID) {
        return sessionExporter.getSessionName(sessionID);
    }
}

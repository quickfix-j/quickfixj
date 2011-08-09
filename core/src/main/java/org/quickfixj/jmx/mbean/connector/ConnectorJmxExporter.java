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

import java.util.concurrent.atomic.AtomicInteger;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.quickfixj.QFJException;
import org.quickfixj.jmx.JmxExporter;
import org.quickfixj.jmx.mbean.ObjectNameFactory;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;

import quickfix.Acceptor;
import quickfix.SessionID;
import quickfix.mina.SessionConnector;
import quickfix.mina.acceptor.AbstractSocketAcceptor;
import quickfix.mina.initiator.AbstractSocketInitiator;

public class ConnectorJmxExporter {
    private final SessionJmxExporter sessionExporter = new SessionJmxExporter();
    private final static AtomicInteger connectorIdCounter = new AtomicInteger();

    public ObjectName register(JmxExporter jmxExporter, SessionConnector connector) {
        return register(jmxExporter, connector, Integer.toString(connectorIdCounter.incrementAndGet()));
    }

    public ObjectName register(JmxExporter jmxExporter, SessionConnector connector, String connectorId) {
        try {
            final ObjectName connectorName = getConnectorName(connector, connectorId);

            ConnectorAdmin connectorAdmin;
            if (connector instanceof AbstractSocketAcceptor) {
                connectorAdmin = new SocketAcceptorAdmin(jmxExporter, (AbstractSocketAcceptor) connector,
                        connectorName, sessionExporter);
            } else if (connector instanceof AbstractSocketInitiator) {
                connectorAdmin = new SocketInitiatorAdmin(jmxExporter, (AbstractSocketInitiator) connector,
                        connectorName, sessionExporter);
            } else {
                throw new QFJException("Unknown connector type: " + connector.getClass().getName());
            }

            jmxExporter.registerMBean(connectorAdmin, connectorName);
            
            return connectorName;
        } catch (final RuntimeException e) {
            throw e;
        } catch (final Exception e) {
            throw new QFJException("Failed to export connector MBean", e);           
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

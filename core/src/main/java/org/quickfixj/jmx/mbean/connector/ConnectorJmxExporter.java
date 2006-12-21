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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.quickfixj.QFJException;
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
    private Logger log = LoggerFactory.getLogger(getClass());
    private Map sessionObjectNames = new HashMap();
    private SessionJmxExporter sessionExporter = new SessionJmxExporter();

    public void export(MBeanServer mbeanServer, SessionConnector connector) {
        try {
            ConnectorAdmin connectorAdmin;
            if (connector instanceof AbstractSocketAcceptor) {
                connectorAdmin = new SocketAcceptorAdmin((AbstractSocketAcceptor) connector,
                        Collections.unmodifiableMap(sessionObjectNames));
            } else if (connector instanceof AbstractSocketInitiator) {
                connectorAdmin = new SocketInitiatorAdmin((AbstractSocketInitiator) connector,
                        Collections.unmodifiableMap(sessionObjectNames));
            } else {
                throw new QFJException("Unknown connector type: " + connector.getClass().getName());
            }

            ObjectName connectorName = getConnectorName(connector);
            mbeanServer.registerMBean(connectorAdmin, connectorName);
            ArrayList sessionIDs = connector.getSessions();
            for (int i = 0; i < sessionIDs.size(); i++) {
                SessionID sessionID = (SessionID) sessionIDs.get(i);
                sessionExporter.export(mbeanServer, Session.lookupSession(sessionID),
                        connectorName, connector.getSettings());
            }
        } catch (Exception e) {
            log.error("Failed to export connector MBean", e);
        }
    }

    private ObjectName getConnectorName(SessionConnector connector)
            throws MalformedObjectNameException {
        // org.quickfixj:type=Connector,role=Acceptor,id=12343232
        ObjectNameFactory nameFactory = new ObjectNameFactory();
        nameFactory.addProperty("type", "Connector");
        nameFactory.addProperty("role", connector instanceof Acceptor ? "Acceptor" : "Initiator");
        return nameFactory.createName();
    }

    public ObjectName lookupSessionName(SessionID sessionID) {
        return (ObjectName) sessionObjectNames.get(sessionID);
    }
}

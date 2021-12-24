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

import org.quickfixj.jmx.JmxExporter;
import org.quickfixj.jmx.mbean.JmxSupport;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.quickfixj.jmx.openmbean.TabularDataAdapter;
import quickfix.SessionID;
import quickfix.mina.acceptor.AbstractSocketAcceptor;

import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Implementation of the socket acceptor management interface.
 */
public class SocketAcceptorAdmin extends ConnectorAdmin implements SocketAcceptorAdminMBean {

    private final AbstractSocketAcceptor acceptor;

    public SocketAcceptorAdmin(JmxExporter jmxExporter, AbstractSocketAcceptor connector,
            ObjectName connectorName, SessionJmxExporter sessionExporter) {
        super(jmxExporter, connector, connectorName, connector.getSettings(), sessionExporter);
        acceptor = connector;
    }

    public static class SessionAcceptorAddressRow {

        private final SessionID sessionID;
        private final SocketAddress acceptorAddress;
        private final ObjectName sessionName;

        public SessionAcceptorAddressRow(SessionID sessionID, SocketAddress acceptorAddress,
                ObjectName sessionName) {
            this.sessionID = sessionID;
            this.acceptorAddress = acceptorAddress;
            this.sessionName = sessionName;
        }

        public String getAcceptorAddress() {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) acceptorAddress;
            return inetSocketAddress.getAddress().getHostAddress() + ":"
                    + inetSocketAddress.getPort();
        }

        public SessionID getSessionID() {
            return sessionID;
        }

        public ObjectName getSessionName() {
            return sessionName;
        }
    }

    @Override
    public TabularData getAcceptorAddresses() throws IOException {
        List<SessionAcceptorAddressRow> rows = new ArrayList<>();
        for (Map.Entry<SessionID, SocketAddress> entry : acceptor.getAcceptorAddresses().entrySet()) {
            SessionID sessionID = entry.getKey();
            SocketAddress address = entry.getValue();
            rows.add(new SessionAcceptorAddressRow(sessionID, address, sessionExporter.getSessionName(sessionID)));
        }
        try {
            return TABULAR_DATA_ADAPTER.fromBeanList("AcceptorAddresses", "AddressInfo", "sessionID",
                    rows);
        } catch (OpenDataException e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public int getQueueSize() {
        return acceptor.getQueueSize();
    }

}

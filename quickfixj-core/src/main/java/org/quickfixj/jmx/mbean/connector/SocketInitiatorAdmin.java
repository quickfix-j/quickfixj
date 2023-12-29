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
import quickfix.SessionID;
import quickfix.mina.initiator.AbstractSocketInitiator;
import quickfix.mina.initiator.IoSessionInitiator;

import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;

class SocketInitiatorAdmin extends ConnectorAdmin implements SocketInitiatorAdminMBean {

    private final AbstractSocketInitiator initiator;

    protected SocketInitiatorAdmin(JmxExporter jmxExporter, AbstractSocketInitiator connector,
            ObjectName connectorName, SessionJmxExporter sessionExporter) {
        super(jmxExporter, connector, connectorName, connector.getSettings(), sessionExporter);
        initiator = connector;
    }


    @Override
    public TabularData getInitiatorAddresses() throws IOException {
        List<SessionInitiatorAddressRow> rows = new ArrayList<>();
        for (IoSessionInitiator initiator : initiator.getInitiators()) {
            SessionID sessionID = initiator.getSessionID();
            rows.add(new SessionInitiatorAddressRow(sessionID, initiator.getLocalAddress(),
                                                    initiator.getSocketAddresses(),
                                                    sessionExporter.getSessionName(sessionID)));
        }
        try {
            return TABULAR_DATA_ADAPTER.fromBeanList("InitiatorAddresses", "AddressInfo", "sessionID", rows);
        } catch (OpenDataException e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public int getQueueSize() {
        return initiator.getQueueSize();
    }

    public static class SessionInitiatorAddressRow {

        private final SessionID sessionID;
        private final SocketAddress localInitiatorAddress;
        private final SocketAddress[] initiatorAddresses;
        private final ObjectName sessionName;

        public SessionInitiatorAddressRow(SessionID sessionID, SocketAddress localInitiatorAddress,
                                          SocketAddress[] initiatorAddresses, ObjectName sessionName) {
            this.sessionID = sessionID;
            this.localInitiatorAddress = localInitiatorAddress;
            this.initiatorAddresses = initiatorAddresses;
            this.sessionName = sessionName;
        }

        public String getLocalInitiatorAddress() {
            if (localInitiatorAddress == null) {
                return null;
            } else {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) localInitiatorAddress;
                return inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort();
            }
        }

        public String getInitiatorAddresses() {
            StringBuilder builder = new StringBuilder(128);

            InetSocketAddress inetSocketAddress = (InetSocketAddress) initiatorAddresses[0];
            builder.append(inetSocketAddress.getAddress().getHostAddress()).append(':').append(inetSocketAddress.getPort());

            for (int i = 1; i < initiatorAddresses.length; i++) {
                inetSocketAddress = (InetSocketAddress) initiatorAddresses[i];
                builder.append(',').append(inetSocketAddress.getAddress().getHostAddress()).append(':').append(inetSocketAddress.getPort());
            }

            return builder.toString();
        }

        public SessionID getSessionID() {
            return sessionID;
        }

        public ObjectName getSessionName() {
            return sessionName;
        }
    }
}

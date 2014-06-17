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
import java.util.ArrayList;

import javax.management.ObjectName;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;

import org.quickfixj.jmx.JmxExporter;
import org.quickfixj.jmx.mbean.JmxSupport;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.quickfixj.jmx.openmbean.TabularDataAdapter;

import quickfix.mina.initiator.AbstractSocketInitiator;
import quickfix.mina.initiator.IoSessionInitiator;

class SocketInitiatorAdmin extends ConnectorAdmin implements SocketInitiatorAdminMBean {

    private final TabularDataAdapter tabularDataAdapter = new TabularDataAdapter();

    private final AbstractSocketInitiator initiator;

    protected SocketInitiatorAdmin(JmxExporter jmxExporter, AbstractSocketInitiator connector,
            ObjectName connectorName, SessionJmxExporter sessionExporter) {
        super(jmxExporter, connector, connectorName, connector.getSettings(), sessionExporter);
        initiator = connector;
    }

    public TabularData getEndpoints() throws IOException {
        try {
            return tabularDataAdapter.fromBeanList("Endpoints", "Endpoint", "sessionID",
                    new ArrayList<IoSessionInitiator>(initiator.getInitiators()));
        } catch (OpenDataException e) {
            throw JmxSupport.toIOException(e);
        }
    }

    public int getQueueSize() {
        return initiator.getQueueSize();
    }
}

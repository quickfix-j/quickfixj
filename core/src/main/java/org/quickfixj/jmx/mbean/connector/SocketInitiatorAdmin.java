
package org.quickfixj.jmx.mbean.connector;

import java.io.IOException;
import java.util.ArrayList;

import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.TabularData;

import org.quickfixj.jmx.mbean.JmxSupport;
import org.quickfixj.jmx.mbean.session.SessionJmxExporter;
import org.quickfixj.jmx.openmbean.TabularDataAdapter;

import quickfix.mina.initiator.AbstractSocketInitiator;
import quickfix.mina.initiator.IoSessionInitiator;

class SocketInitiatorAdmin extends ConnectorAdmin implements SocketInitiatorAdminMBean {

    private final TabularDataAdapter tabularDataAdapter = new TabularDataAdapter();

    private final AbstractSocketInitiator initiator;

    protected SocketInitiatorAdmin(AbstractSocketInitiator connector, SessionJmxExporter sessionExporter) {
        super(connector, sessionExporter);
        initiator = (AbstractSocketInitiator) connector;
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

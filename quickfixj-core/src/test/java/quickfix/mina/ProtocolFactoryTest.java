/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina;

import org.apache.mina.core.service.IoConnector;
import org.apache.mina.proxy.ProxyConnector;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.Test;
import quickfix.ConfigError;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertNull;

public class ProtocolFactoryTest {

    @Test
    public void shouldCreateProxyConnectorWithoutPreferredAuthOrder() throws ConfigError {
        InetSocketAddress address = new InetSocketAddress(AvailablePortFinder.getNextAvailable());
        InetSocketAddress proxyAddress = new InetSocketAddress(AvailablePortFinder.getNextAvailable());

        IoConnector connector = ProtocolFactory.createIoConnector(address);
        ProxyConnector proxyConnector = ProtocolFactory
                .createIoProxyConnector((SocketConnector) connector, address, proxyAddress, "http", "1.0", "user",
                                        "password", "domain", "workstation");

        ProxyIoSession proxySession = proxyConnector.getProxyIoSession();
        assertNull(proxySession.getPreferedOrder());
    }
}

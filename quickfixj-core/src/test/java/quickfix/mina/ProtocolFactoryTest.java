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
import org.apache.mina.proxy.handlers.http.HttpProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.Test;
import quickfix.ConfigError;

import java.net.InetSocketAddress;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void shouldSetBasicAuthorizationHeaderForHttpProxy() throws ConfigError {
        InetSocketAddress address = new InetSocketAddress(AvailablePortFinder.getNextAvailable());
        InetSocketAddress proxyAddress = new InetSocketAddress(AvailablePortFinder.getNextAvailable());

        IoConnector connector = ProtocolFactory.createIoConnector(address);
        ProxyConnector proxyConnector = ProtocolFactory
                .createIoProxyConnector((SocketConnector) connector, address, proxyAddress, "http", "1.0", "testuser",
                                        "testpassword", null, null);

        ProxyIoSession proxySession = proxyConnector.getProxyIoSession();
        HttpProxyRequest request = (HttpProxyRequest) proxySession.getRequest();
        
        Map<String, List<String>> headers = request.getHeaders();
        assertNotNull("Headers should not be null", headers);
        assertTrue("Headers should contain Proxy-Authorization", headers.containsKey("Proxy-Authorization"));
        
        List<String> authHeaders = headers.get("Proxy-Authorization");
        assertNotNull("Proxy-Authorization header should not be null", authHeaders);
        assertEquals("Should have exactly one Proxy-Authorization header", 1, authHeaders.size());
        
        String authHeader = authHeaders.get(0);
        assertTrue("Auth header should start with 'Basic '", authHeader.startsWith("Basic "));
        
        // Verify the encoded credentials
        String encodedPart = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(encodedPart));
        assertEquals("Decoded credentials should match", "testuser:testpassword", decoded);
    }

    @Test
    public void shouldNotSetAuthorizationHeaderForNTLMAuthentication() throws ConfigError {
        InetSocketAddress address = new InetSocketAddress(AvailablePortFinder.getNextAvailable());
        InetSocketAddress proxyAddress = new InetSocketAddress(AvailablePortFinder.getNextAvailable());

        IoConnector connector = ProtocolFactory.createIoConnector(address);
        ProxyConnector proxyConnector = ProtocolFactory
                .createIoProxyConnector((SocketConnector) connector, address, proxyAddress, "http", "1.0", "testuser",
                                        "testpassword", "TESTDOMAIN", "TESTWORKSTATION");

        ProxyIoSession proxySession = proxyConnector.getProxyIoSession();
        HttpProxyRequest request = (HttpProxyRequest) proxySession.getRequest();
        
        Map<String, List<String>> headers = request.getHeaders();
        // NTLM requires multi-step handshake, so Proxy-Authorization header should not be set upfront
        assertTrue("Headers should be null or not contain Proxy-Authorization for NTLM", 
                   headers == null || !headers.containsKey("Proxy-Authorization"));
    }

    @Test
    public void shouldNotSetAuthorizationHeaderWhenCredentialsNotProvided() throws ConfigError {
        InetSocketAddress address = new InetSocketAddress(AvailablePortFinder.getNextAvailable());
        InetSocketAddress proxyAddress = new InetSocketAddress(AvailablePortFinder.getNextAvailable());

        IoConnector connector = ProtocolFactory.createIoConnector(address);
        ProxyConnector proxyConnector = ProtocolFactory
                .createIoProxyConnector((SocketConnector) connector, address, proxyAddress, "http", "1.0", null,
                                        null, null, null);

        ProxyIoSession proxySession = proxyConnector.getProxyIoSession();
        HttpProxyRequest request = (HttpProxyRequest) proxySession.getRequest();
        
        Map<String, List<String>> headers = request.getHeaders();
        // Headers should either be null or not contain Proxy-Authorization
        assertTrue("Headers should be null or empty when no credentials provided", 
                   headers == null || !headers.containsKey("Proxy-Authorization"));
    }
}

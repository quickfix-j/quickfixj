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

package quickfix.mina.ssl;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.After;
import org.junit.Test;
import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;
import quickfix.ThreadedSocketAcceptor;
import quickfix.ThreadedSocketInitiator;
import quickfix.test.util.SSLUtil;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SSLContextProviderTest {
    private static final SessionID ACCEPTOR_SESSION = new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU");
    private static final SessionID INITIATOR_SESSION = new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA");
    private static final BigInteger SERVER_SERIAL = new BigInteger("1449683167");
    private static final BigInteger CLIENT_SERIAL = new BigInteger("1449683336");
    private static final char[] PASSWORD = "password".toCharArray();

    @After
    public void tearDown() throws Exception {
        for (SessionID sessionID : new SessionID[] { ACCEPTOR_SESSION, INITIATOR_SESSION }) {
            Session session = Session.lookupSession(sessionID);
            if (session != null) {
                session.close();
            }
        }
    }

    @Test
    public void shouldAuthenticateBothSidesWithInMemoryStores() throws Exception {
        SSLContext serverContext = createContext("server-pkcs12.keystore", "PKCS12",
                "server-jceks.truststore", "JCEKS");
        SSLContext clientContext = createContext("client-jceks.keystore", "JCEKS",
                "client-jceks.keystore", "JCEKS");

        int port = AvailablePortFinder.getNextAvailable();
        SessionSettings acceptorSettings = settings("acceptor", ACCEPTOR_SESSION, port);
        acceptorSettings.setString(SSLSupport.SETTING_NEED_CLIENT_AUTH, "Y");
        SocketAcceptor acceptor = SocketAcceptor.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(acceptorSettings)
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(sslConfig -> serverContext)
                .build();
        SocketInitiator initiator = SocketInitiator.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(settings("initiator", INITIATOR_SESSION, port))
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(sslConfig -> clientContext)
                .build();
        acceptor.start();
        try {
            initiator.start();
            try {
                SSLUtil.assertAuthenticated(initiator, INITIATOR_SESSION, SERVER_SERIAL);
                SSLUtil.assertAuthenticated(acceptor, ACCEPTOR_SESSION, CLIENT_SERIAL);
            } finally {
                initiator.stop(true);
            }
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldAuthenticateBothSidesWithThreadedConnectorsBuiltWithProvider() throws Exception {
        SSLContext serverContext = createContext("server-pkcs12.keystore", "PKCS12",
                "server-jceks.truststore", "JCEKS");
        SSLContext clientContext = createContext("client-jceks.keystore", "JCEKS",
                "client-jceks.keystore", "JCEKS");

        int port = AvailablePortFinder.getNextAvailable();
        SessionSettings acceptorSettings = settings("acceptor", ACCEPTOR_SESSION, port);
        acceptorSettings.setString(SSLSupport.SETTING_NEED_CLIENT_AUTH, "Y");
        ThreadedSocketAcceptor acceptor = ThreadedSocketAcceptor.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(acceptorSettings)
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(sslConfig -> serverContext)
                .build();
        ThreadedSocketInitiator initiator = ThreadedSocketInitiator.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(settings("initiator", INITIATOR_SESSION, port))
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(sslConfig -> clientContext)
                .build();
        acceptor.start();
        try {
            initiator.start();
            try {
                SSLUtil.assertAuthenticated(initiator, INITIATOR_SESSION, SERVER_SERIAL);
                SSLUtil.assertAuthenticated(acceptor, ACCEPTOR_SESSION, CLIENT_SERIAL);
            } finally {
                initiator.stop(true);
            }
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldLoadConfiguredStoresWhenNoProviderIsSet() throws Exception {
        SessionSettings settings = settings("acceptor", ACCEPTOR_SESSION, AvailablePortFinder.getNextAvailable());
        settings.setString(SSLSupport.SETTING_KEY_STORE_NAME, "single-session/server.keystore");
        settings.setString(SSLSupport.SETTING_KEY_STORE_PWD, "password");
        SocketAcceptor acceptor = acceptor(settings, null);
        try {
            acceptor.start();
            assertEquals(1, acceptor.getEndpoints().size());
            assertTrue(acceptor.getEndpoints().iterator().next().isActive());
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldFailInitiatorWhenProviderThrows() throws Exception {
        GeneralSecurityException failure = new GeneralSecurityException("secret unavailable");
        SocketInitiator initiator = initiator(
                settings("initiator", INITIATOR_SESSION, AvailablePortFinder.getNextAvailable()), sslConfig -> {
                    throw failure;
                });
        try {
            initiator.start();
            fail("Expected initiator start to fail");
        } catch (ConfigError e) {
            assertSame(failure, e.getCause());
        } finally {
            initiator.stop(true);
        }
    }

    @Test
    public void shouldFailAcceptorWhenProviderThrows() throws Exception {
        GeneralSecurityException failure = new GeneralSecurityException("secret unavailable");
        SocketAcceptor acceptor = acceptor(
                settings("acceptor", ACCEPTOR_SESSION, AvailablePortFinder.getNextAvailable()), sslConfig -> {
                    throw failure;
                });
        try {
            acceptor.start();
            fail("Expected acceptor start to fail");
        } catch (RuntimeError e) {
            assertSame(failure, e.getCause());
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldSkipAcceptorAddressWhenProviderThrowsAndContinuingInitialization() throws Exception {
        SessionSettings settings = settings("acceptor", ACCEPTOR_SESSION, AvailablePortFinder.getNextAvailable());
        settings.setString(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR, "Y");
        SocketAcceptor acceptor = acceptor(settings, sslConfig -> {
            throw new GeneralSecurityException("secret unavailable");
        });
        try {
            acceptor.start();
            // The endpoint is registered before SSL is installed, but its address must not be bound.
            for (IoAcceptor endpoint : acceptor.getEndpoints()) {
                assertFalse(endpoint.isActive());
            }
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldSkipInitiatorSessionWhenProviderThrowsAndContinuingInitialization() throws Exception {
        SessionSettings settings = settings("initiator", INITIATOR_SESSION, AvailablePortFinder.getNextAvailable());
        settings.setString(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR, "Y");
        SocketInitiator initiator = initiator(settings, sslConfig -> {
            throw new GeneralSecurityException("secret unavailable");
        });
        try {
            initiator.start();
            assertTrue(initiator.getInitiators().isEmpty());
        } finally {
            initiator.stop(true);
        }
    }

    @Test
    public void shouldFailInitiatorWhenProviderReturnsNull() throws Exception {
        SocketInitiator initiator = initiator(
                settings("initiator", INITIATOR_SESSION, AvailablePortFinder.getNextAvailable()), sslConfig -> null);
        try {
            initiator.start();
            fail("Expected initiator start to fail");
        } catch (ConfigError e) {
            assertTrue(String.valueOf(e.getCause()), e.getCause() instanceof GeneralSecurityException);
            assertEquals("SSLContextProvider returned null for " + INITIATOR_SESSION, e.getCause().getMessage());
        } finally {
            initiator.stop(true);
        }
    }

    @Test
    public void shouldFailAcceptorWhenProviderReturnsNull() throws Exception {
        SocketAcceptor acceptor = acceptor(
                settings("acceptor", ACCEPTOR_SESSION, AvailablePortFinder.getNextAvailable()), sslConfig -> null);
        try {
            acceptor.start();
            fail("Expected acceptor start to fail");
        } catch (RuntimeError e) {
            assertTrue(String.valueOf(e.getCause()), e.getCause() instanceof GeneralSecurityException);
            assertTrue(e.getCause().getMessage(), e.getCause().getMessage().startsWith("SSLContextProvider returned null for "));
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldSkipAcceptorAddressWhenProviderReturnsNullAndContinuingInitialization() throws Exception {
        SessionSettings settings = settings("acceptor", ACCEPTOR_SESSION, AvailablePortFinder.getNextAvailable());
        settings.setString(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR, "Y");
        SocketAcceptor acceptor = acceptor(settings, sslConfig -> null);
        try {
            acceptor.start();
            // The endpoint is registered before SSL is installed, but its address must not be bound.
            for (IoAcceptor endpoint : acceptor.getEndpoints()) {
                assertFalse(endpoint.isActive());
            }
        } finally {
            acceptor.stop(true);
        }
    }

    @Test
    public void shouldSkipInitiatorSessionWhenProviderReturnsNullAndContinuingInitialization() throws Exception {
        SessionSettings settings = settings("initiator", INITIATOR_SESSION, AvailablePortFinder.getNextAvailable());
        settings.setString(SessionFactory.SETTING_CONTINUE_INIT_ON_ERROR, "Y");
        SocketInitiator initiator = initiator(settings, sslConfig -> null);
        try {
            initiator.start();
            assertTrue(initiator.getInitiators().isEmpty());
        } finally {
            initiator.stop(true);
        }
    }

    private static SocketAcceptor acceptor(SessionSettings settings, SSLContextProvider provider) throws ConfigError {
        return SocketAcceptor.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(settings)
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(provider)
                .build();
    }

    private static SocketInitiator initiator(SessionSettings settings, SSLContextProvider provider) throws ConfigError {
        return SocketInitiator.newBuilder()
                .withApplication(new ApplicationAdapter())
                .withMessageStoreFactory(new MemoryStoreFactory())
                .withSettings(settings)
                .withLogFactory(new ScreenLogFactory(false, false, false))
                .withSSLContextProvider(provider)
                .build();
    }

    private static SessionSettings settings(String connectionType, SessionID sessionID, int port) {
        SessionSettings settings = new SessionSettings();
        settings.setString("ConnectionType", connectionType);
        settings.setString("StartTime", "00:00:00");
        settings.setString("EndTime", "00:00:00");
        settings.setString("HeartBtInt", "30");
        settings.setString("ReconnectInterval", "1");
        settings.setString("UseDataDictionary", "N");
        settings.setString("SocketAcceptAddress", "127.0.0.1");
        settings.setString("SocketAcceptPort", Integer.toString(port));
        settings.setString("SocketConnectHost", "127.0.0.1");
        settings.setString("SocketConnectPort", Integer.toString(port));
        settings.setString(SSLSupport.SETTING_USE_SSL, "Y");
        settings.setString(sessionID, "BeginString", sessionID.getBeginString());
        return settings;
    }

    /** Builds a context from stores held in memory, the way an application would after decoding a secret. */
    private static SSLContext createContext(String keyStore, String keyStoreType,
            String trustStore, String trustStoreType) throws Exception {
        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(loadFromBytes(keyStore, keyStoreType), PASSWORD);
        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(loadFromBytes(trustStore, trustStoreType));
        SSLContext context = SSLContext.getInstance("TLS");
        context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
        return context;
    }

    private static KeyStore loadFromBytes(String resource, String type) throws Exception {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try (InputStream in = SSLContextProviderTest.class.getResourceAsStream("/single-session/" + resource)) {
            assertNotNull(resource, in);
            byte[] buffer = new byte[4096];
            int n;
            while ((n = in.read(buffer)) != -1) {
                bytes.write(buffer, 0, n);
            }
        }
        KeyStore store = KeyStore.getInstance(type);
        store.load(new ByteArrayInputStream(bytes.toByteArray()), PASSWORD);
        return store;
    }
}

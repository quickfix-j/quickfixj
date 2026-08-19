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

package quickfix.mina.initiator;

import org.apache.mina.util.AvailablePortFinder;
import org.burningwave.tools.net.DefaultHostResolver;
import org.burningwave.tools.net.HostResolutionRequestInterceptor;
import org.burningwave.tools.net.MappedHostResolver;
import org.junit.After;
import org.junit.Test;
import quickfix.Acceptor;
import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;
import quickfix.ThreadedSocketInitiator;
import quickfix.mina.HostResolutionStrategy;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;
import quickfix.mina.ssl.SSLSupport;
import quickfix.test.util.SessionUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * End-to-end test for {@link HostResolutionStrategy} configurations.
 *
 * @see SSLSupport#SETTING_REVERSE_DNS_ENABLED
 */
public class HostResolutionStrategyTest {

    private static final String FAKE_HOSTNAME = "fixserver.example.quickfixj";
    private static final String LOOPBACK_IP = "127.0.0.1";
    private static final byte[] LOOPBACK_IP_BYTES = new byte[]{127, 0, 0, 1};
    private static final String QUICKFIXJ_KEY_STORE = "quickfixj.keystore";
    private static final String QUICKFIXJ_KEY_STORE_PASSWORD = "quickfixjpw";

    private static final SessionID INITIATOR_SESSION_ID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA");
    private static final SessionID ACCEPTOR_SESSION_ID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU");

    private TestAcceptor acceptor;
    private TestInitiator initiator;
    private BlockingReverseDnsResolver reverseDnsResolver;

    @After
    public void tearDown() throws InterruptedException {
        if (reverseDnsResolver != null) {
            reverseDnsResolver.releaseReverseDns();
        }
        if (initiator != null) {
            initiator.stop();
        }
        if (acceptor != null) {
            acceptor.stop();
        }
        Thread.sleep(500);
        HostResolutionRequestInterceptor.INSTANCE.uninstall();
    }

    // --- When reverse DNS is available ---

    @Test
    public void initiatorShouldLogonWhenConnectingToIpAddressWithReverseDnsEnabled() throws Exception {
        assertInitiatorLogsOnWhenReverseDnsAvailable(LOOPBACK_IP, "Y");
    }

    @Test
    public void initiatorShouldLogonWhenConnectingToIpAddressWithReverseDnsDisabled() throws Exception {
        assertInitiatorLogsOnWhenReverseDnsAvailable(LOOPBACK_IP, "N");
    }

    @Test
    public void initiatorShouldLogonWhenConnectingToCustomHostAliasWithReverseDnsEnabled() throws Exception {
        assertInitiatorLogsOnWhenReverseDnsAvailable(FAKE_HOSTNAME, "Y");
    }

    @Test
    public void initiatorShouldLogonWhenConnectingToCustomHostAliasWithReverseDnsDisabled() throws Exception {
        assertInitiatorLogsOnWhenReverseDnsAvailable(FAKE_HOSTNAME, "N");
    }

    // --- When reverse DNS is unavailable ---

    @Test
    public void initiatorShouldAttemptToCallReverseDnsDuringLogonWhenReverseDnsIsEnabled() throws Exception {
        installBlockingResolver();
        int port = AvailablePortFinder.getNextAvailable();

        acceptor = new TestAcceptor(createAcceptorSettings(port, "N"));
        acceptor.start();

        initiator = new TestInitiator(createInitiatorSettings(LOOPBACK_IP, port, "Y"));
        initiator.start();

        assertTrue(reverseDnsResolver.awaitReverseDnsLookup(5, TimeUnit.SECONDS));
        initiator.assertNotLoggedOn(INITIATOR_SESSION_ID, 1, TimeUnit.SECONDS);
        acceptor.assertNotLoggedOn(ACCEPTOR_SESSION_ID, 1, TimeUnit.SECONDS);

        reverseDnsResolver.releaseReverseDns();

        initiator.assertLoggedOn(INITIATOR_SESSION_ID);
        acceptor.assertLoggedOn(ACCEPTOR_SESSION_ID);
        assertEquals(1, reverseDnsResolver.getReverseDnsLookupCount());
    }

    @Test
    public void initiatorShouldLogonImmediatelyWhenReverseDnsIsDisabled() throws Exception {
        installBlockingResolver();
        int port = AvailablePortFinder.getNextAvailable();

        acceptor = new TestAcceptor(createAcceptorSettings(port, "N"));
        acceptor.start();

        initiator = new TestInitiator(createInitiatorSettings(LOOPBACK_IP, port, "N"));
        initiator.start();

        initiator.assertLoggedOn(INITIATOR_SESSION_ID);
        acceptor.assertLoggedOn(ACCEPTOR_SESSION_ID);
        assertFalse(reverseDnsResolver.awaitReverseDnsLookup(250, TimeUnit.MILLISECONDS));
        assertEquals(0, reverseDnsResolver.getReverseDnsLookupCount());
    }

    @Test
    public void acceptorShouldAttemptToCallReverseDnsDuringLogonWhenReverseDnsIsEnabled() throws Exception {
        installBlockingResolver();
        int port = AvailablePortFinder.getNextAvailable();

        acceptor = new TestAcceptor(createAcceptorSettings(port, "Y"));
        acceptor.start();

        initiator = new TestInitiator(createInitiatorSettings(LOOPBACK_IP, port, "N"));
        initiator.start();

        assertTrue(reverseDnsResolver.awaitReverseDnsLookup(5, TimeUnit.SECONDS));
        initiator.assertNotLoggedOn(INITIATOR_SESSION_ID, 1, TimeUnit.SECONDS);
        acceptor.assertNotLoggedOn(ACCEPTOR_SESSION_ID, 1, TimeUnit.SECONDS);

        reverseDnsResolver.releaseReverseDns();

        initiator.assertLoggedOn(INITIATOR_SESSION_ID);
        acceptor.assertLoggedOn(ACCEPTOR_SESSION_ID);
        assertEquals(1, reverseDnsResolver.getReverseDnsLookupCount());
    }

    @Test
    public void initiatorAndAcceptorShouldAttemptToCallReverseDnsDuringLogonWhenReverseDnsIsEnabled()
            throws Exception {
        installBlockingResolver();
        int port = AvailablePortFinder.getNextAvailable();

        acceptor = new TestAcceptor(createAcceptorSettings(port, "Y"));
        acceptor.start();

        initiator = new TestInitiator(createInitiatorSettings(LOOPBACK_IP, port, "Y"));
        initiator.start();

        assertTrue(reverseDnsResolver.awaitReverseDnsLookups(5, TimeUnit.SECONDS));
        initiator.assertNotLoggedOn(INITIATOR_SESSION_ID, 1, TimeUnit.SECONDS);
        acceptor.assertNotLoggedOn(ACCEPTOR_SESSION_ID, 1, TimeUnit.SECONDS);

        reverseDnsResolver.releaseReverseDns();

        initiator.assertLoggedOn(INITIATOR_SESSION_ID);
        acceptor.assertLoggedOn(ACCEPTOR_SESSION_ID);
        assertEquals(2, reverseDnsResolver.getReverseDnsLookupCount());
    }

    // --- Helpers ---

    private void assertInitiatorLogsOnWhenReverseDnsAvailable(String connectHost, String reverseDnsEnabled)
            throws Exception {
        installAvailableResolver();
        int port = AvailablePortFinder.getNextAvailable();

        acceptor = new TestAcceptor(createAcceptorSettings(port));
        acceptor.start();

        initiator = new TestInitiator(createInitiatorSettings(connectHost, port, reverseDnsEnabled));
        initiator.start();

        initiator.assertLoggedOn(INITIATOR_SESSION_ID);
        acceptor.assertLoggedOn(ACCEPTOR_SESSION_ID);
    }

    private void installAvailableResolver() {
        Map<String, String> hostAliases = new HashMap<>();
        hostAliases.put(FAKE_HOSTNAME, LOOPBACK_IP);
        HostResolutionRequestInterceptor.INSTANCE.install(new MappedHostResolver(hostAliases), DefaultHostResolver.INSTANCE);
    }

    private void installBlockingResolver() {
        Map<String, String> hostAliases = new HashMap<>();
        hostAliases.put(FAKE_HOSTNAME, LOOPBACK_IP);
        reverseDnsResolver = new BlockingReverseDnsResolver(hostAliases);
        HostResolutionRequestInterceptor.INSTANCE.install(reverseDnsResolver, DefaultHostResolver.INSTANCE);
    }

    static class TestAcceptor {
        private final SessionConnector connector;

        TestAcceptor(SessionSettings settings) throws ConfigError {
            MessageStoreFactory storeFactory = new MemoryStoreFactory();
            MessageFactory messageFactory = new DefaultMessageFactory();
            connector = new ThreadedSocketAcceptor(new ApplicationAdapter(), storeFactory, settings, messageFactory);
        }

        void start() throws Exception {
            connector.start();
        }

        void stop() {
            connector.stop(true);
        }

        void assertLoggedOn(SessionID sessionID) {
            SessionUtil.assertLoggedOn(connector, sessionID);
        }

        void assertNotLoggedOn(SessionID sessionID, long timeout, TimeUnit unit) {
            SessionUtil.assertNotLoggedOn(connector, sessionID, timeout, unit);
        }
    }

    static class TestInitiator {
        private final SessionConnector connector;

        TestInitiator(SessionSettings settings) throws ConfigError {
            MessageStoreFactory storeFactory = new MemoryStoreFactory();
            MessageFactory messageFactory = new DefaultMessageFactory();
            connector = new ThreadedSocketInitiator(new ApplicationAdapter(), storeFactory, settings, messageFactory);
        }

        void start() throws Exception {
            connector.start();
        }

        void stop() {
            connector.stop(true);
        }

        void assertLoggedOn(SessionID sessionID) {
            SessionUtil.assertLoggedOn(connector, sessionID);
        }

        void assertNotLoggedOn(SessionID sessionID, long timeout, TimeUnit unit) {
            SessionUtil.assertNotLoggedOn(connector, sessionID, timeout, unit);
        }
    }

    private static SessionSettings createAcceptorSettings(int port) {
        return createAcceptorSettings(port, null);
    }

    private static SessionSettings createAcceptorSettings(int port, String reverseDnsEnabled) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(Session.SETTING_START_TIME, "00:00:00");
        defaults.put(Session.SETTING_END_TIME, "00:00:00");
        defaults.put(Session.SETTING_HEARTBTINT, "30");
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "acceptor");
        defaults.put(Acceptor.SETTING_SOCKET_ACCEPT_PORT, Integer.toString(port));
        if (reverseDnsEnabled != null) {
            defaults.put(SSLSupport.SETTING_REVERSE_DNS_ENABLED, reverseDnsEnabled);
        }
        defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, QUICKFIXJ_KEY_STORE);
        defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, QUICKFIXJ_KEY_STORE_PASSWORD);
        defaults.put(SSLSupport.SETTING_TRUST_STORE_NAME, QUICKFIXJ_KEY_STORE);
        defaults.put(SSLSupport.SETTING_TRUST_STORE_PWD, QUICKFIXJ_KEY_STORE_PASSWORD);
        defaults.put(SSLSupport.SETTING_NEED_CLIENT_AUTH, "N");

        SessionSettings settings = new SessionSettings();
        settings.set(defaults);
        settings.setString(ACCEPTOR_SESSION_ID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        settings.setString(ACCEPTOR_SESSION_ID, "DataDictionary", "FIX44.xml");
        settings.setString(ACCEPTOR_SESSION_ID, "SenderCompID", "ALFA");
        settings.setString(ACCEPTOR_SESSION_ID, "TargetCompID", "ZULU");

        return settings;
    }

    private static SessionSettings createInitiatorSettings(String connectHost, int port, String reverseDnsEnabled) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put(Session.SETTING_START_TIME, "00:00:00");
        defaults.put(Session.SETTING_END_TIME, "00:00:00");
        defaults.put(Session.SETTING_HEARTBTINT, "30");
        defaults.put(SessionFactory.SETTING_CONNECTION_TYPE, "initiator");
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PROTOCOL, ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_HOST, connectHost);
        defaults.put(Initiator.SETTING_SOCKET_CONNECT_PORT, Integer.toString(port));
        defaults.put(SSLSupport.SETTING_REVERSE_DNS_ENABLED, reverseDnsEnabled);
        defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, QUICKFIXJ_KEY_STORE);
        defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, QUICKFIXJ_KEY_STORE_PASSWORD);
        defaults.put(SSLSupport.SETTING_TRUST_STORE_NAME, QUICKFIXJ_KEY_STORE);
        defaults.put(SSLSupport.SETTING_TRUST_STORE_PWD, QUICKFIXJ_KEY_STORE_PASSWORD);

        SessionSettings settings = new SessionSettings();
        settings.set(defaults);
        settings.setString(INITIATOR_SESSION_ID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        settings.setString(INITIATOR_SESSION_ID, "DataDictionary", "FIX44.xml");
        settings.setString(INITIATOR_SESSION_ID, "SenderCompID", "ZULU");
        settings.setString(INITIATOR_SESSION_ID, "TargetCompID", "ALFA");

        return settings;
    }

    static class BlockingReverseDnsResolver extends MappedHostResolver {
        private final CountDownLatch reverseDnsLookupStarted;
        private final CountDownLatch reverseDnsLookupReleased = new CountDownLatch(1);
        private final AtomicInteger reverseDnsLookupCount = new AtomicInteger();

        BlockingReverseDnsResolver(Map<String, String> hostAliases) {
            this(hostAliases, 1);
        }

        BlockingReverseDnsResolver(Map<String, String> hostAliases, int expectedReverseDnsLookups) {
            super(hostAliases);
            reverseDnsLookupStarted = new CountDownLatch(expectedReverseDnsLookups);
        }

        @Override
        public Collection<String> getAllHostNamesForHostAddress(Map<String, Object> requestData) {
            if (!Arrays.equals((byte[]) getMethodArguments(requestData)[0], LOOPBACK_IP_BYTES)) {
                return super.getAllHostNamesForHostAddress(requestData);
            }

            reverseDnsLookupCount.incrementAndGet();
            reverseDnsLookupStarted.countDown();

            try {
                if (!reverseDnsLookupReleased.await(5, TimeUnit.SECONDS)) {
                    throw new AssertionError("Timed out waiting to release reverse DNS lookup");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new AssertionError("Interrupted while waiting to release reverse DNS lookup", e);
            }

            return super.getAllHostNamesForHostAddress(requestData);
        }

        boolean awaitReverseDnsLookup(long timeout, TimeUnit unit) throws InterruptedException {
            return awaitReverseDnsLookups(timeout, unit);
        }

        boolean awaitReverseDnsLookups(long timeout, TimeUnit unit) throws InterruptedException {
            return reverseDnsLookupStarted.await(timeout, unit);
        }

        int getReverseDnsLookupCount() {
            return reverseDnsLookupCount.get();
        }

        void releaseReverseDns() {
            reverseDnsLookupReleased.countDown();
        }
    }
}

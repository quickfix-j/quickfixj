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

import quickfix.Acceptor;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.Dictionary;
import quickfix.FixVersions;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.RuntimeError;
import quickfix.SLF4JLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SessionState;
import quickfix.SocketInitiator;
import quickfix.UnitTestApplication;
import quickfix.mina.initiator.AbstractSocketInitiator;
import quickfix.mina.initiator.IoSessionInitiator;
import quickfix.mina.ssl.SSLSupport;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Random;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.hamcrest.Matchers;

public class SessionConnectorTest {
    private final List<PropertyChangeEvent> propertyChangeEvents = new ArrayList<>();

    @Test
    public void testConnector() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        SessionSettings settings = setUpSessionSettings(sessionID);
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new SLF4JLogFactory(new SessionSettings()));

        SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);

        connector.addPropertyChangeListener(new SessionConnectorListener());

        try (Session session = connector.createSession(sessionID)) {
            assertNotNull(session);
            
            Map<SessionID, Session> sessions = Collections.singletonMap(session.getSessionID(), session);
            connector.setSessions(sessions);
            
            assertEquals(1, propertyChangeEvents.size());
            
            assertEquals(1, connector.getManagedSessions().size());
            assertEquals(session, connector.getManagedSessions().get(0));
            
            assertFalse(connector.isLoggedOn());
            
            Field stateField = session.getClass().getDeclaredField("state");
            stateField.setAccessible(true);
            SessionState state = (SessionState) stateField.get(session);
            
            state.setLogonSent(true);
            state.setLogonReceived(true);
            assertTrue(connector.isLoggedOn());
            
            assertTrue(session.isEnabled());
            connector.logoutAllSessions(true);
            // Acceptors should not get re-enabled after initiating Logout
            assertFalse(session.isEnabled());
            
            assertEquals(9999, connector.getIntSetting(Acceptor.SETTING_SOCKET_ACCEPT_PORT));
            
            assertNotNull(connector.getScheduledExecutorService());
            assertEquals(settings, connector.getSettings());
        } finally {
            connector.stop(true);
        }
    }

    @Test
    public void testOneSessionLoggedOnOneSessionNotLoggedOne() throws Exception {
        SessionID sessionID1 = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        SessionSettings settings = setUpSessionSettings(sessionID1);
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new SLF4JLogFactory(new SessionSettings()));

        SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);

        try (Session session1 = connector.createSession(sessionID1)) {
            assertNotNull(session1);

            // test add/remove
            SessionConnectorListener connectorListener = new SessionConnectorListener();
            connector.addPropertyChangeListener(connectorListener);
            connector.removePropertyChangeListener(connectorListener);

            Map<SessionID, Session> sessions = new HashMap<>();
            sessions.put(session1.getSessionID(), session1);
            connector.setSessions(sessions);

            assertEquals(0, propertyChangeEvents.size());

            assertEquals(1, connector.getManagedSessions().size());
            assertEquals(session1, connector.getManagedSessions().get(0));

            assertFalse(connector.isLoggedOn());

            Field stateField = session1.getClass().getDeclaredField("state");
            stateField.setAccessible(true);
            SessionState state = (SessionState) stateField.get(session1);

            state.setLogonSent(true);
            state.setLogonReceived(true);
            assertTrue(connector.isLoggedOn());

            SessionID sessionID2 = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD1");
            settings.setString(sessionID2, SessionFactory.SETTING_CONNECTION_TYPE,
                    SessionFactory.ACCEPTOR_CONNECTION_TYPE);
            try (Session session2 = connector.createSession(sessionID2)) {
                assertNotNull(session2);
                connector.addDynamicSession(session2);
                assertFalse(connector.isLoggedOn());
                assertTrue(connector.anyLoggedOn());
            }
        } finally {
            connector.stop(true);
        }
        
    }

    /**
     * Test that adding/removing dynamic sessions works correctly
     */
    @Test
    public void testAddingRemovingDynamicSessions() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        SessionID sessionID2 = new SessionID(FixVersions.BEGINSTRING_FIX40, "me", "you");
        SessionSettings settings = setUpSessionSettings(sessionID);
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new SLF4JLogFactory(new SessionSettings()));

        SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
        connector.setSessions(new HashMap<>());
        try (Session session = connector.createSession(sessionID)) {
            // one-time use connector to create a slightly different session
            SessionSettings settings2 = setUpSessionSettings(sessionID2);
            SessionConnector connector2 = new SessionConnectorUnderTest(settings2, sessionFactory);
            connector.setSessions(new HashMap<>());
            try (Session session2 = connector2.createSession(sessionID2)) {

                assertNotNull(session);
                assertNotNull(session2);

                assertEquals(0, connector.getManagedSessions().size());
                connector.addDynamicSession(session);
                assertEquals(1, connector.getManagedSessions().size());
                connector.addDynamicSession(session2);
                assertEquals(2, connector.getManagedSessions().size());
                // the list can be in arbitrary order so let's make sure that we get both
                HashMap<SessionID, Session> map = new HashMap<>();
                for (Session s : connector.getManagedSessions()) {
                    map.put(s.getSessionID(), s);
                }
                assertEquals(session, map.get(session.getSessionID()));
                assertEquals(session2, map.get(session2.getSessionID()));

                connector.removeDynamicSession(session.getSessionID());
                assertEquals(1, connector.getManagedSessions().size());
                assertEquals(session2, connector.getManagedSessions().get(0));
                connector.removeDynamicSession(session2.getSessionID());
                assertEquals(0, connector.getManagedSessions().size());
            } finally {
                connector2.stop();
            }
        } finally {
            connector.stop(true);
        }
    }

    /**
     * Test dynamic initiator sessions
     */
    @Test
    public void testDynamicInitiatorSession() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        SessionID sessionID2 = new SessionID(FixVersions.BEGINSTRING_FIX40, "me", "you");
        SessionSettings settings = setUpInitiatorSessionSettings(sessionID);
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new SLF4JLogFactory(new SessionSettings()));

        AbstractSocketInitiatorUnderTest connector = new AbstractSocketInitiatorUnderTest(settings, sessionFactory);
        connector.setSessions(new HashMap<>());
        //Two sessions to test dynamic sessions while check initializers
        connector.createDynamicSession(sessionID);
        connector.createDynamicSession(sessionID2);
        List<Session> sessions = connector.getManagedSessions();
        //Check sessions created and available
        assertEquals(2,sessions.size());
        HashMap<SessionID, Session> map = new HashMap<>();
        for (Session s : sessions) {
            map.put(s.getSessionID(), s);
        }
        assertNotNull(map.get(sessionID));
        assertNotNull(map.get(sessionID2));
        //Check initiators created and not null
        assertEquals(2,  connector.getInitiators().size());
        Set<IoSessionInitiator> initiators =  connector.getInitiators();
        for(IoSessionInitiator initiator: initiators){
            assertNotNull(initiator);
        }
        connector.removeDynamicSession(sessionID);
        connector.removeDynamicSession(sessionID2);
        //Check if initiators are re - created for this sessions but not sessions available
        assertEquals(0,  connector.getManagedSessions().size());
        connector.createSessionInitiators();
        sessions=connector.getManagedSessions();
        initiators=connector.getInitiators();
        //Sessions re created during session initiatore re creation, initiators are stacked
        assertEquals(2, sessions.size());
        assertEquals(4,initiators.size());
        //This should remove initiators
        connector.stopInitiators();
        assertEquals(0,connector.getInitiators().size());
        //Tear down
        for(Session s:sessions){
            s.close();
        }
        connector.stop();
    }

    @Test
    public void testConcurrentAccess() throws ConfigError, InterruptedException {
        final SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(new Dictionary(null, createDefaultSettings()));
        sessionSettings.set(new SessionID("FIX.4.2:FOOBAR_PRICING->*"), new Dictionary("sessions", createPricingSection()));
        sessionSettings.set(new SessionID("FIX.4.2:FOOBAR_TRADING->*"), new Dictionary("sessions", createTradingSection()));

        final DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
                new MemoryStoreFactory(), new SLF4JLogFactory(sessionSettings));
        final SessionConnector connector = new SessionConnectorUnderTest(sessionSettings, sessionFactory);

        // connector is initialised with the wildcard sessions.
        final Map<SessionID, Session> sessions = new HashMap<>();
        for (final Iterator<SessionID> sessionIterator = sessionSettings.sectionIterator(); sessionIterator.hasNext();) {
            final SessionID sessionID = sessionIterator.next();
            sessions.put(sessionID, sessionFactory.create(sessionID, sessionSettings));
        }
        connector.setSessions(sessions);

        // register a listener on the connector, e.g. to simulate MBean registration
        final Set<SessionID> exportedSessionIDs = Collections.newSetFromMap(new ConcurrentHashMap<>());
        connector.addPropertyChangeListener(evt -> {
            exportedSessionIDs.addAll(connector.getSessions());
        });

        final int numClients = 500;
        final CountDownLatch startLatch = new CountDownLatch(1);
        final CountDownLatch countDownLatch = new CountDownLatch(numClients);

        final Random random = new Random();
        for (int clientIndex = 0; clientIndex < numClients; clientIndex++) {
            final String clientPricingSessionIDString = "FIX.4.2:FOOBAR_PRICING->CLIENT" + clientIndex;
            final String clientTradingSessionIDString = "FIX.4.2:FOOBAR_TRADING->CLIENT" + clientIndex;

            int randomSleep = random.nextInt(20);
            final Thread clientThread = new Thread(() -> {
                try {
                    // wait for everyone to be ready
                    startLatch.await();

                    // individual thread to sleep at random interval, to simulate spread connection attempt
                    Thread.sleep(randomSleep);

                    connector.addDynamicSession(connector.createSession(new SessionID(clientPricingSessionIDString)));
                    connector.addDynamicSession(connector.createSession(new SessionID(clientTradingSessionIDString)));

                    // sleep at the end, before we verify the outcome
                    Thread.sleep(randomSleep);
                } catch (final Throwable throwable) {
                    throwable.printStackTrace();
                    fail("This operation shouldn't fail");
                } finally {
                    countDownLatch.countDown();
                }
            },"Client_"+clientIndex);
            clientThread.setDaemon(true);
            clientThread.start();
        }

        // go go go , everyone!
        startLatch.countDown();

        // ok.. wait for everyone to finish
        countDownLatch.await();

        assertThat("We should have all sessions exported. Failure here means initialisation has failed somewhere", exportedSessionIDs.size(), Matchers.equalTo(1002));
        assertTrue(exportedSessionIDs.contains(new SessionID("FIX.4.2:FOOBAR_PRICING->*")));
        assertTrue(exportedSessionIDs.contains(new SessionID("FIX.4.2:FOOBAR_TRADING->*")));
        for (int clientIndex = 0; clientIndex < numClients; clientIndex++) {
            assertTrue(exportedSessionIDs.contains(new SessionID("FIX.4.2:FOOBAR_PRICING->CLIENT" + clientIndex)));
            assertTrue(exportedSessionIDs.contains(new SessionID("FIX.4.2:FOOBAR_TRADING->CLIENT" + clientIndex)));
        }
    }

    private Map<Object, Object> createTradingSection() {
        final Map<Object, Object> tradingSection = new HashMap<>();
        tradingSection.put("PersistMessages","Y");
        tradingSection.put("SocketAcceptPort","7566");
        tradingSection.put("DataDictionary","FIX44_Custom_Test.xml");
        tradingSection.put("ResetOnLogon","N");
        tradingSection.put("MaxLatency","1");
        return tradingSection;
    }

    private Map<Object, Object> createPricingSection() {
        final Map<Object, Object> pricingSection = new HashMap<>();
        pricingSection.put("PersistMessages","N");
        pricingSection.put("SocketAcceptPort","7565");
        pricingSection.put("DataDictionary","FIX44_Custom_Test.xml");
        pricingSection.put("ResetOnLogon","Y");
        pricingSection.put("MaxLatency","120");
        return pricingSection;
    }

    private Map<Object, Object> createDefaultSettings() {
        final Map<Object, Object> defaultSettings = new HashMap<>();
        defaultSettings.put("TimeZone", "UTC");
        defaultSettings.put("StartDay", "Sunday");
        defaultSettings.put("StartTime", "07:00:00");
        defaultSettings.put("EndDay", "Friday");
        defaultSettings.put("EndTime", "17:00:00");
        defaultSettings.put("NonStopSession", "N");
        defaultSettings.put("ConnectionType", "acceptor");
        defaultSettings.put("HeartBtInt", "30");
        defaultSettings.put("UseDataDictionary", "Y");
        defaultSettings.put("ThreadModel", "ThreadPerSession");
        defaultSettings.put("UseJmx", "Y");
        defaultSettings.put("FileStorePath", "/home/wibowoa/var/lib/myApp");
        defaultSettings.put("FileLogPath", "logs/fixlog");
        defaultSettings.put("FileIncludeTimeStampForMessages", "Y");
        defaultSettings.put("FileIncludeMilliseconds", "Y");
        defaultSettings.put("CheckLatency", "Y");
        defaultSettings.put("BeginString", "FIX.4.2");
        defaultSettings.put("AcceptorTemplate", "Y");
        defaultSettings.put("TargetCompID", "*");
        return defaultSettings;
    }

    private SessionSettings setUpSessionSettings(SessionID sessionID) {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        settings.setString(Acceptor.SETTING_SOCKET_ACCEPT_PORT, "9999");
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.ACCEPTOR_CONNECTION_TYPE);
        return settings;
    }
    private SessionSettings setUpInitiatorSessionSettings(SessionID sessionID) {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        settings.setString(Acceptor.SETTING_SOCKET_ACCEPT_PORT, "9999");
        settings.setLong(Session.SETTING_HEARTBTINT,100L);
        settings.setString(SocketInitiator.SETTING_SOCKET_CONNECT_HOST,"127.0.0.1");
        settings.setString(SocketInitiator.SETTING_SOCKET_CONNECT_PORT,"54321");
        settings.setString(SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        settings.setBool( SSLSupport.SETTING_USE_SSL,true);
        settings.setString(Initiator.SETTING_PROXY_TYPE,"socks");
        settings.setString(Initiator.SETTING_PROXY_VERSION,"5");
        settings.setString(Initiator.SETTING_PROXY_USER,"Test Proxy User");
        settings.setString(Initiator.SETTING_PROXY_PASSWORD,"Test Proxy User Password");
        settings.setString(Initiator.SETTING_PROXY_WORKSTATION,"Test Proxy Workstation");
        settings.setString(Initiator.SETTING_PROXY_DOMAIN,"Test Proxy Domain");
        settings.setString(Initiator.SETTING_PROXY_HOST,"Test Proxy Host");
        settings.setString(Initiator.SETTING_PROXY_PORT,"888");
        settings.setBool(Initiator.SETTING_DYNAMIC_SESSION,false);
        settings.setString(sessionID, SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.INITIATOR_CONNECTION_TYPE);
        return settings;
    }

    private final class SessionConnectorListener implements PropertyChangeListener {
        public void propertyChange(PropertyChangeEvent event) {
            if (SessionConnector.SESSIONS_PROPERTY.equals(event.getPropertyName())) {
                propertyChangeEvents.add(event);
            }
        }
    }

    private static class SessionConnectorUnderTest extends SessionConnector {

        public SessionConnectorUnderTest(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }

        public void start() throws ConfigError, RuntimeError {
        }

        public void stop() {
            super.stopSessionTimer();
        }

        public void stop(boolean force) {
            super.stopSessionTimer();
        }
    }

    private static class AbstractSocketInitiatorUnderTest extends AbstractSocketInitiator {

        public AbstractSocketInitiatorUnderTest(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }

        public void start() throws ConfigError, RuntimeError {
        }

        public void stop() {
            clearConnectorSessions();
        }

        public void stopInitiators(){
            super.stopInitiators();
        }

        public void stop(boolean force) {
        }

        @Override
        protected void createSessionInitiators() throws ConfigError {
            super.createSessionInitiators();
        }

        @Override
        protected EventHandlingStrategy getEventHandlingStrategy() {
            return null;
        }
    }
}

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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.*;
import quickfix.mina.EventHandlingStrategy;
import quickfix.mina.SessionConnector;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;

import static org.junit.Assert.*;

/**
 * Test for verifying that calling createDynamicSession multiple times does not
 * create a thread leak by creating multiple session timers.
 */
public class DynamicSessionThreadLeakTest {

    private TestAbstractSocketInitiator initiator;
    private SessionSettings settings;

    @Before
    public void setUp() throws Exception {
        SystemTime.setTimeSource(null);
        
        // Set up minimal session settings
        settings = new SessionSettings();
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        settings.setLong(Session.SETTING_HEARTBTINT, 100L);
        settings.setString(SocketInitiator.SETTING_SOCKET_CONNECT_HOST, "127.0.0.1");
        settings.setString(SocketInitiator.SETTING_SOCKET_CONNECT_PORT, "54321");
        settings.setString(SessionFactory.SETTING_CONNECTION_TYPE, SessionFactory.INITIATOR_CONNECTION_TYPE);
        
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(
                new UnitTestApplication(),
                new MemoryStoreFactory(),
                new SLF4JLogFactory(new SessionSettings()));
        
        initiator = new TestAbstractSocketInitiator(settings, sessionFactory);
    }

    @After
    public void tearDown() throws Exception {
        if (initiator != null) {
            initiator.stop(true);
        }
    }

    /**
     * Test that multiple calls to createDynamicSession do not create multiple session timers.
     * Only one session timer should be running at a time.
     */
    @Test
    public void testMultipleCreateDynamicSessionDoesNotLeakThreads() throws Exception {
        SessionID sessionID1 = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER1", "TARGET1");
        SessionID sessionID2 = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER2", "TARGET2");
        SessionID sessionID3 = new SessionID(FixVersions.BEGINSTRING_FIX42, "SENDER3", "TARGET3");
        
        // Create first dynamic session
        initiator.createDynamicSession(sessionID1);
        assertTrue("Session timer should be running after first createDynamicSession", 
                   initiator.isSessionTimerRunning());
        ScheduledFuture<?> firstTimer = initiator.getSessionTimerFuture();
        assertNotNull("Session timer future should not be null", firstTimer);
        assertFalse("First timer should not be cancelled", firstTimer.isCancelled());
        
        // Create second dynamic session
        initiator.createDynamicSession(sessionID2);
        assertTrue("Session timer should still be running after second createDynamicSession", 
                   initiator.isSessionTimerRunning());
        ScheduledFuture<?> secondTimer = initiator.getSessionTimerFuture();
        assertNotNull("Session timer future should not be null", secondTimer);
        
        // The key assertion: The timer should be the same instance, not a new one
        assertSame("Session timer should be reused, not recreated", firstTimer, secondTimer);
        assertFalse("First timer should still not be cancelled", firstTimer.isCancelled());
        
        // Create third dynamic session
        initiator.createDynamicSession(sessionID3);
        assertTrue("Session timer should still be running after third createDynamicSession", 
                   initiator.isSessionTimerRunning());
        ScheduledFuture<?> thirdTimer = initiator.getSessionTimerFuture();
        assertNotNull("Session timer future should not be null", thirdTimer);
        
        // Verify it's still the same timer
        assertSame("Session timer should be reused, not recreated", firstTimer, thirdTimer);
        assertFalse("First timer should still not be cancelled", firstTimer.isCancelled());
        
        // Verify that all three sessions were created
        assertEquals("Three sessions should be created", 3, initiator.getManagedSessions().size());
        
        // Stop the initiator and verify the timer is cancelled
        initiator.stop(true);
        assertTrue("Timer should be cancelled after stop", firstTimer.isCancelled());
    }

    /**
     * Test implementation of AbstractSocketInitiator for testing purposes.
     */
    private static class TestAbstractSocketInitiator extends AbstractSocketInitiator {
        
        public TestAbstractSocketInitiator(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }

        @Override
        public void start() throws ConfigError, RuntimeError {
            // No-op for testing
        }

        @Override
        public void stop() {
            clearConnectorSessions();
            stopInitiators();
        }

        @Override
        public void stop(boolean force) {
            clearConnectorSessions();
            stopInitiators();
        }

        @Override
        protected EventHandlingStrategy getEventHandlingStrategy() {
            return null;
        }

        /**
         * Expose the session timer running status for testing using reflection.
         */
        public boolean isSessionTimerRunning() throws Exception {
            Field field = SessionConnector.class.getDeclaredField("sessionTimerFuture");
            field.setAccessible(true);
            ScheduledFuture<?> future = (ScheduledFuture<?>) field.get(this);
            return future != null && !future.isDone();
        }

        /**
         * Expose the session timer future for testing using reflection.
         */
        public ScheduledFuture<?> getSessionTimerFuture() throws Exception {
            Field field = SessionConnector.class.getDeclaredField("sessionTimerFuture");
            field.setAccessible(true);
            return (ScheduledFuture<?>) field.get(this);
        }
    }
}

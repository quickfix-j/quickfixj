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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.FieldNotFound;
import quickfix.FixVersions;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.Responder;
import quickfix.SLF4JLogFactory;
import quickfix.Session;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.UnitTestApplication;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.converter.UtcTimestampConverter;
import quickfix.fix40.Logon;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static quickfix.test.util.ReflectionUtil.getField;

public class ThreadPerSessionEventHandlingStrategyTest {
    private final static class ThreadPerSessionEventHandlingStrategyUnderTest extends
            ThreadPerSessionEventHandlingStrategy {

        public ThreadPerSessionEventHandlingStrategyUnderTest() {
            super(null, SessionConnector.DEFAULT_QUEUE_CAPACITY);
        }

        public Exception getNextMessageException;
        public int getMessageCount = 1;

        @Override
        protected void startDispatcherThread(
                ThreadPerSessionEventHandlingStrategy.MessageDispatchingThread dispatcher) {
        }

        @Override
        protected Message getNextMessage(QueueTracker<Message> queueTracker) throws InterruptedException {
            if (getMessageCount-- == 0) {
                throw new InterruptedException("END COUNT");
            }
            if (getNextMessageException != null) {
                if (getNextMessageException instanceof InterruptedException) {
                    throw (InterruptedException) getNextMessageException;
                }
                throw (RuntimeException) getNextMessageException;
            }
            return super.getNextMessage(queueTracker);
        }
    }

    private ThreadPerSessionEventHandlingStrategy strategy;

    @Before
    public void init() {
        strategy = new ThreadPerSessionEventHandlingStrategy(
                null, SessionConnector.DEFAULT_QUEUE_CAPACITY);
    }

    @After
    public void cleanup() {
        strategy.stopDispatcherThreads();
        strategy = null;
    }

    /**
     * Verifies that messages are dispatched via dispatcher threads and that the threads die when
     * the strategy is shut down. See QFJ-410.
     *
     * @throws Exception
     */
    @Test
    public void testEventHandling() throws Exception {

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        final CountDownLatch latch = new CountDownLatch(1);

        final UnitTestApplication application = new UnitTestApplication() {
            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                latch.countDown();
            }
        };

        try (Session session = setUpSession(sessionID, application)) {

            final Message message = new Logon();
            message.getHeader().setString(SenderCompID.FIELD, "ISLD");
            message.getHeader().setString(TargetCompID.FIELD, "TW");
            message.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(new Date(), false));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);
            message.setInt(HeartBtInt.FIELD, 30);
            
            strategy.onMessage(session, message);
            
            // Wait for a received message
            if (!latch.await(5, TimeUnit.SECONDS)) {
                fail("Timeout");
            }
            
            assertEquals(1, application.fromAdminMessages.size());
            
            final Thread[] threads = new Thread[1024];
            Thread.enumerate(threads);
            
            Thread dispatcherThread = null;
            for (final Thread thread : threads) {
                if (thread.getName().startsWith("QF/J Session dispatcher")) {
                    dispatcherThread = thread;
                    // Dispatcher threads are not daemon threads
                    assertThat(dispatcherThread.isDaemon(), is(false));
                    break;
                }
            }
            
            // We should have found the dispatcher thread
            assertThat(dispatcherThread, notNullValue());
            
            // Stop the threads and then check the thread state
            strategy.stopDispatcherThreads();
            
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                if (!dispatcherThread.isAlive()) {
                    break;
                }
            }
            
            // Dispatcher thread should be dead
            assertThat(dispatcherThread.isAlive(), is(false));
            assertNull(strategy.getDispatcher(sessionID));
        }
    }

    /**
     * See QFJ-686. Verify that thread is stopped if Session has no responder.
     */
    @Test
    public void testEventHandlingOnDisconnect() throws Exception {

        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        final CountDownLatch latch = new CountDownLatch(1);

        final UnitTestApplication application = new UnitTestApplication() {
            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                latch.countDown();
            }
        };

        try (Session session = setUpSession(sessionID, application)) {

            final Message message = new Logon();
            message.getHeader().setString(SenderCompID.FIELD, "ISLD");
            message.getHeader().setString(TargetCompID.FIELD, "TW");
            message.getHeader().setString(SendingTime.FIELD,
                    UtcTimestampConverter.convert(new Date(), false));
            message.getHeader().setInt(MsgSeqNum.FIELD, 1);
            message.setInt(HeartBtInt.FIELD, 30);
            
            strategy.onMessage(session, message);
            
            // Wait for a received message
            if (!latch.await(5, TimeUnit.SECONDS)) {
                fail("Timeout");
            }
            
            assertEquals(1, application.fromAdminMessages.size());
            
            Thread[] threads = new Thread[1024];
            Thread.enumerate(threads);
            
            Thread dispatcherThread = null;
            for (final Thread thread : threads) {
                if (thread != null && thread.getName().startsWith("QF/J Session dispatcher")) {
                    dispatcherThread = thread;
                    // Dispatcher threads are not daemon threads
                    assertThat(dispatcherThread.isDaemon(), is(false));
                    break;
                }
            }
            
            assertTrue(session.hasResponder());
            // QFJ-790: we do not check the state of the responder anymore
            // but wait for the END_OF_STREAM message to stop the threads.
            strategy.onMessage(session, EventHandlingStrategy.END_OF_STREAM);
            
            // sleep some time to let the thread stop
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
                if (!dispatcherThread.isAlive()) {
                    break;
                }
            }
            assertNull(strategy.getDispatcher(sessionID));
            
            threads = new Thread[1024];
            Thread.enumerate(threads);
            
            dispatcherThread = null;
            for (final Thread thread : threads) {
                if (thread != null && thread.getName().startsWith("QF/J Session dispatcher")) {
                    dispatcherThread = thread;
                    // Dispatcher threads are not daemon threads
                    assertThat(dispatcherThread.isDaemon(), is(false));
                    break;
                }
            }
            
            // the session dispatcher should be dead and hence not listed in the threads array
            assertNull(dispatcherThread);
            assertFalse(session.hasResponder());
        }
    }

    @Test
    public void testEventHandlingInterruptInRun() throws Exception {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        try (Session session = setUpSession(sessionID)) {
            final Message message = new Logon();
            message.setInt(HeartBtInt.FIELD, 30);
            final ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();
            
            strategy.onMessage(session, message);
            strategy.getNextMessageException = new InterruptedException("TEST");
            strategy.getDispatcher(sessionID).run();
        }
    }

    @Test
    public void testEventHandlingRuntimeException() throws Exception {
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        try (Session session = setUpSession(sessionID)) {
            final Message message = new Logon();
            message.setInt(HeartBtInt.FIELD, 30);
            final ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();
            
            strategy.onMessage(session, message);
            strategy.getNextMessageException = new NullPointerException("TEST");
            strategy.getDispatcher(sessionID).run();
        }
    }

    // verify the assumption that this always returns null
    @Test
    public void testVerifyGetConnectorAssumption() throws Exception {
        final ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();
        assertNull(strategy.getSessionConnector());
    }

    @Test
    public void shouldCreateCorrectTypeOfQueueTracker() throws Exception {
        final Session quickfixSession = mock(Session.class, withSettings().defaultAnswer(RETURNS_DEEP_STUBS));

        assertFalse(getField(
                new ThreadPerSessionEventHandlingStrategy(null, 42)
                        .createDispatcherThread(quickfixSession),
                "queueTracker",
                QueueTracker.class) instanceof WatermarkTracker);

        assertTrue(getField(
                new ThreadPerSessionEventHandlingStrategy(null, 42, 43)
                        .createDispatcherThread(quickfixSession),
                "queueTracker",
                QueueTracker.class) instanceof WatermarkTracker);

        assertFalse(getField(
                new ThreadPerSessionEventHandlingStrategy(null, -1, -1)
                        .createDispatcherThread(quickfixSession),
                "queueTracker",
                QueueTracker.class) instanceof WatermarkTracker);
    }

    private Session setUpSession(SessionID sessionID) throws ConfigError {
        final UnitTestApplication application = new UnitTestApplication();
        return setUpSession(sessionID, application);
    }

    private Session setUpSession(SessionID sessionID, UnitTestApplication application)
            throws ConfigError {
        final DefaultSessionFactory sessionFactory = new DefaultSessionFactory(application,
                new MemoryStoreFactory(), new SLF4JLogFactory(new SessionSettings()));
        final SessionSettings settings = new SessionSettings();
        settings.setString(SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.ACCEPTOR_CONNECTION_TYPE);
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        final Session session = sessionFactory.create(sessionID, settings);
        session.setResponder(mock(Responder.class));
        return session;
    }
}

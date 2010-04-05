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

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import quickfix.*;
import quickfix.field.MsgSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.converter.UtcTimestampConverter;
import quickfix.fix40.Logon;

public class ThreadPerSessionEventHandlingStrategyTest {
    private final static class ThreadPerSessionEventHandlingStrategyUnderTest extends
            ThreadPerSessionEventHandlingStrategy {
        public Exception getNextMessageException;
        public int getMessageCount = 1;

        protected void startDispatcherThread(
                ThreadPerSessionEventHandlingStrategy.MessageDispatchingThread dispatcher) {
        }

        Message getNextMessage(BlockingQueue<Message> messages) throws InterruptedException {
            if (getMessageCount-- == 0) {
                throw new InterruptedException("END COUNT");
            }
            if (getNextMessageException != null) {
                if (getNextMessageException instanceof InterruptedException) {
                    throw (InterruptedException) getNextMessageException;
                }
                throw (RuntimeException) getNextMessageException;
            }
            return super.getNextMessage(messages);
        }
    }

    /**
     * Verifies that messages are dispatched via dispatcher threads and that the threads die when
     * the strategy is shut down. See QFJ-410.
     * @throws Exception
     */
    @Test
    public void testEventHandling() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        
        final CountDownLatch latch = new CountDownLatch(1);
        
        UnitTestApplication application = new UnitTestApplication() {
            @Override
            public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                    IncorrectDataFormat, IncorrectTagValue, RejectLogon {
                super.fromAdmin(message, sessionId);
                latch.countDown();
            }  
        };
        
        Session session = setUpSession(sessionID, application);
        
        Message message = new Logon();
        message.getHeader().setString(SenderCompID.FIELD, "ISLD");
        message.getHeader().setString(TargetCompID.FIELD, "TW");
        message.getHeader().setString(SendingTime.FIELD, UtcTimestampConverter.convert(new Date(), false));
        message.getHeader().setInt(MsgSeqNum.FIELD, 1);
        
        ThreadPerSessionEventHandlingStrategy strategy = new ThreadPerSessionEventHandlingStrategy();

        strategy.onMessage(session, message);
        
        // Wait for a received message
        if (!latch.await(5, TimeUnit.SECONDS)) {
            fail("Timeout");
        }
        
        assertEquals(1, application.fromAdminMessages.size());
        
        Thread[] threads = new Thread[1024];
        Thread.enumerate(threads);
        
        Thread dispatcherThread = null;
        for (Thread thread : threads) {
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
    }

    @Test
    public void testEventHandlingInterruptInRun() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        Session session = setUpSession(sessionID);
        Message message = new Logon();
        ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();

        strategy.onMessage(session, message);
        strategy.getNextMessageException = new InterruptedException("TEST");
        strategy.getDispatcher(sessionID).run();
    }

    @Test
    public void testEventHandlingRuntimeException() throws Exception {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX40, "TW", "ISLD");
        Session session = setUpSession(sessionID);
        Message message = new Logon();
        ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();

        strategy.onMessage(session, message);
        strategy.getNextMessageException = new NullPointerException("TEST");
        strategy.getDispatcher(sessionID).run();
    }

    // verify the assumption that this always returns null
    @Test
    public void testVerifyGetConnectorAssumption() throws Exception {
        ThreadPerSessionEventHandlingStrategyUnderTest strategy = new ThreadPerSessionEventHandlingStrategyUnderTest();
        assertNull(strategy.getSessionConnector());        
    }

    private Session setUpSession(SessionID sessionID) throws ConfigError {
        UnitTestApplication application = new UnitTestApplication();
        return setUpSession(sessionID, application);
    }

    private Session setUpSession(SessionID sessionID, UnitTestApplication application)
            throws ConfigError {
        DefaultSessionFactory sessionFactory = new DefaultSessionFactory(application,
                new MemoryStoreFactory(), new ScreenLogFactory(true, true, true));
        SessionSettings settings = new SessionSettings();
        settings.setString(SessionFactory.SETTING_CONNECTION_TYPE,
                SessionFactory.ACCEPTOR_CONNECTION_TYPE);
        settings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(Session.SETTING_START_TIME, "00:00:00");
        settings.setString(Session.SETTING_END_TIME, "00:00:00");
        Session session = sessionFactory.create(sessionID, settings);
        session.setResponder(mock(Responder.class));
        return session;
    }
}

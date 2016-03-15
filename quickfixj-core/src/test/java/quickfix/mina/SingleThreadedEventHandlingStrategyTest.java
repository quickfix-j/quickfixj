/**
 * *****************************************************************************
 * Copyright (c) quickfixengine.org All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file LICENSE
 * included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing are not
 * clear to you.
 * ****************************************************************************
 */
package quickfix.mina;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import quickfix.Application;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.DefaultSessionFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;
import quickfix.UnitTestApplication;

/**
 *
 * @author chrjohn
 */
public class SingleThreadedEventHandlingStrategyTest {

    DefaultSessionFactory sessionFactory = new DefaultSessionFactory(new UnitTestApplication(),
            new MemoryStoreFactory(), new ScreenLogFactory(true, true, true));

    @Test
    public void testDoubleStart() throws Exception {
        SingleThreadedEventHandlingStrategy ehs = null;
        try {
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            ehs.blockInThread();
            ehs.blockInThread();
            assertQFJMessageProcessorThreads(1);
        } finally {
            if ( ehs != null ) {
                ehs.stopHandlingMessages(true);
            }
        }

    }
    
    @Test
    public void testMultipleStart() throws Exception {
        SingleThreadedEventHandlingStrategy ehs = null;

        try {
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            for (int i = 0; i < 20; i++) {
                ehs.blockInThread();
            }
            assertQFJMessageProcessorThreads(1);
        } finally {
            if (ehs != null) {
                ehs.stopHandlingMessages(true);
            }
        }
    }

    @Test
    public void testStartStop() throws Exception {
        SingleThreadedEventHandlingStrategy ehs = null;
        try {
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            ehs.blockInThread();
            ehs.stopHandlingMessages();
            Thread.sleep(500);
            ehs.blockInThread();
            assertQFJMessageProcessorThreads(1);
        } finally {
            if ( ehs != null ) {
                ehs.stopHandlingMessages(true);
            }
        }

    }

    @Test
    public void testMultipleStartStop() throws Exception {
        SingleThreadedEventHandlingStrategy ehs = null;
        SessionSettings settings = new SessionSettings();
        SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);

        for (int i = 0; i < 20; i++) {
            try {
                ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
                ehs.blockInThread();
                assertQFJMessageProcessorThreads(1);
            } finally {
                if (ehs != null) {
                    ehs.stopHandlingMessages(true);
                }
            }
        }
    }
    
    @Test
    public void shouldCleanUpAcceptorQFJMessageProcessorThreadAfterInterrupt() throws Exception {
        final SocketAcceptor acceptor = createAcceptor(0);
        final CountDownLatch acceptorCountDownLatch = new CountDownLatch(1);

        Thread acceptorThread = new Thread("Acceptor-Thread") {
            @Override
            public void run() {
                try {
                    acceptor.start();
                    acceptorCountDownLatch.await();

                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    acceptor.stop();
                }
            }
        };

        acceptorThread.setDaemon(true);
        acceptorThread.start();

        Thread.sleep(1000);
        acceptorCountDownLatch.countDown();

        Thread.sleep(1000);
        assertQFJMessageProcessorThreads(0);
        
        acceptorThread.join();
    }
    
    @Test
    public void shouldCleanUpInitiatorQFJMessageProcessorThreadAfterInterrupt() throws Exception {
        final SocketInitiator initiator = createInitiator(0);
        final CountDownLatch initiatorCountDownLatch = new CountDownLatch(1);

        Thread initiatorThread = new Thread("Initiator-Thread") {
            @Override
            public void run() {
                try {
                    initiator.start();
                    initiatorCountDownLatch.await();

                    Thread.currentThread().interrupt();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    initiator.stop();
                }
            }
        };

        initiatorThread.setDaemon(true);
        initiatorThread.start();

        Thread.sleep(1000);
        initiatorCountDownLatch.countDown();

        Thread.sleep(1000);
        assertQFJMessageProcessorThreads(0);
        
        initiatorThread.join();
    }
    
    @Test(timeout = 10000)
    public void shouldCleanUpAcceptorQFJMessageProcessorThreadAfterStop() throws Exception {
        final SocketAcceptor acceptor = createAcceptor(1);

        Thread acceptorThread = new Thread("Acceptor-Thread") {
            @Override
            public void run() {
                try {
                    acceptor.block();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    acceptor.stop();
                }
            }
        };

        acceptorThread.setDaemon(true);
        acceptorThread.start();

        Thread.sleep(1000);
        acceptor.stop();
        
        Thread.sleep(1000);
        assertQFJMessageProcessorThreads(0);
        
        acceptorThread.join();
    }
    
    @Test(timeout = 10000)
    public void shouldCleanUpInitiatorQFJMessageProcessorThreadAfterStop() throws Exception {
        final SocketInitiator initiator = createInitiator(1);

        Thread initiatorThread = new Thread("Initiator-Thread") {
            @Override
            public void run() {
                try {
                    initiator.block();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    initiator.stop();
                }
            }
        };

        initiatorThread.setDaemon(true);
        initiatorThread.start();

        Thread.sleep(1000);
        initiator.stop();
        
        Thread.sleep(1000);
        assertQFJMessageProcessorThreads(0);
        
        initiatorThread.join();
    }
    
    private SocketAcceptor createAcceptor(int i) throws ConfigError {
        Map<Object, Object> acceptorProperties = new HashMap<Object, Object>();
        acceptorProperties.put("ConnectionType", "acceptor");
        acceptorProperties.put("HeartBtInt", "5");
        acceptorProperties.put("SocketAcceptHost", "localhost");
        acceptorProperties.put("SocketAcceptPort", String.valueOf(9999 + i) );
        acceptorProperties.put("ReconnectInterval", "2");
        acceptorProperties.put("StartTime", "00:00:00");
        acceptorProperties.put("EndTime", "00:00:00");
        acceptorProperties.put("SenderCompID", "ISLD");
        acceptorProperties.put("TargetCompID", "TW");

        SessionSettings acceptorSettings = new SessionSettings();
        acceptorSettings.set(acceptorProperties);

        SessionID acceptorSessionId = new SessionID(FixVersions.BEGINSTRING_FIX44, "ISLD", "TW");
        acceptorSettings.setString(acceptorSessionId, "BeginString", FixVersions.BEGINSTRING_FIX44);
        acceptorSettings.setString(acceptorSessionId, "DataDictionary", "FIX44.xml");

        SocketAcceptor acceptor = new SocketAcceptor(Mockito.mock(Application.class), new MemoryStoreFactory(),
                acceptorSettings, new DefaultMessageFactory());

        return acceptor;
    }
    
    public SocketInitiator createInitiator(int i) throws ConfigError {
        Map<Object, Object> acceptorProperties = new HashMap<Object, Object>();
        acceptorProperties.put("ConnectionType", "initiator");
        acceptorProperties.put("HeartBtInt", "5");
        acceptorProperties.put("SocketConnectHost", "localhost");
        acceptorProperties.put("SocketConnectPort", String.valueOf(9999 + i) );
        acceptorProperties.put("ReconnectInterval", "2");
        acceptorProperties.put("StartTime", "00:00:00");
        acceptorProperties.put("EndTime", "00:00:00");
        acceptorProperties.put("SenderCompID", "TW");
        acceptorProperties.put("TargetCompID", "ISLD");

        SessionSettings acceptorSettings = new SessionSettings();
        acceptorSettings.set(acceptorProperties);

        SessionID acceptorSessionId = new SessionID(FixVersions.BEGINSTRING_FIX44, "TW", "ISLD");
        acceptorSettings.setString(acceptorSessionId, "BeginString", FixVersions.BEGINSTRING_FIX44);
        acceptorSettings.setString(acceptorSessionId, "DataDictionary", "FIX44.xml");

        SocketInitiator initiator = new SocketInitiator(Mockito.mock(Application.class), new MemoryStoreFactory(),
                acceptorSettings, new DefaultMessageFactory());
        
        return initiator;
    }
    
    private void assertQFJMessageProcessorThreads(int expected) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] dumpAllThreads = bean.dumpAllThreads(false, false);
        int qfjMPThreads = 0;
        for (ThreadInfo threadInfo : dumpAllThreads) {
            if (SingleThreadedEventHandlingStrategy.MESSAGE_PROCESSOR_THREAD_NAME.equals(threadInfo
                    .getThreadName())) {
                qfjMPThreads++;
            }
        }
        if (qfjMPThreads > 1) {
            for (ThreadInfo threadInfo : dumpAllThreads) {
                if (SingleThreadedEventHandlingStrategy.MESSAGE_PROCESSOR_THREAD_NAME.equals(threadInfo
                    .getThreadName())) {
                    System.out.println( threadInfo.getThreadName() + " " + threadInfo.getThreadState());
                    StackTraceElement[] stackTrace = threadInfo.getStackTrace();
                    for (StackTraceElement stackTrace1 : stackTrace) {
                        System.out.println( "     " + stackTrace1 );
                    }
                }
            }
        }
        
        Assert.assertEquals("Expected " + expected + " 'QFJ Message Processor' thread(s)", expected, qfjMPThreads);
    }

    private static class SessionConnectorUnderTest extends SessionConnector {

        public SessionConnectorUnderTest(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }

        @Override
        public void start() throws ConfigError, RuntimeError {
        }

        @Override
        public void stop() {
        }

        @Override
        public void stop(boolean force) {
        }

        @Override
        public void block() throws ConfigError, RuntimeError {
        }
    }

}


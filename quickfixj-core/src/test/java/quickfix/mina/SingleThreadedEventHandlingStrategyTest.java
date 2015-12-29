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
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import quickfix.ConfigError;
import quickfix.DefaultSessionFactory;
import quickfix.MemoryStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionFactory;
import quickfix.SessionSettings;
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
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            ehs.blockInThread();
            ehs.blockInThread();
            checkThreads(bean);
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
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            for (int i = 0; i < 20; i++) {
                ehs.blockInThread();
            }
            checkThreads(bean);
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
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            ehs.blockInThread();
            ehs.stopHandlingMessages();
            Thread.sleep(500);
            ehs.blockInThread();
            checkThreads(bean);
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
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        for (int i = 0; i < 20; i++) {
            try {
                ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
                ehs.blockInThread();
                checkThreads(bean);
            } finally {
                if (ehs != null) {
                    ehs.stopHandlingMessages(true);
                }
            }
        }
    }
    
    private void checkThreads(ThreadMXBean bean) {
        ThreadInfo[] dumpAllThreads = bean.dumpAllThreads(false, false);
        int qfjMPThreads = 0;
        for (ThreadInfo threadInfo : dumpAllThreads) {
            if (SingleThreadedEventHandlingStrategy.MESSAGE_PROCESSOR_THREAD_NAME.equals(threadInfo
                    .getThreadName())) {
                qfjMPThreads++;
            }
        }
        assertEquals("Exactly one 'QFJ Message Processor' thread expected", 1, qfjMPThreads);
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

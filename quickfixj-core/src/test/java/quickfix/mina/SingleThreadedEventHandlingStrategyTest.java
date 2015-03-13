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

    @Test(expected = IllegalStateException.class)
    public void testDoubleStart() throws Exception {
        SingleThreadedEventHandlingStrategy ehs = null;
        try {
            SessionSettings settings = new SessionSettings();
            SessionConnector connector = new SessionConnectorUnderTest(settings, sessionFactory);
            ehs = new SingleThreadedEventHandlingStrategy(connector, 1000);
            ehs.blockInThread();
            ehs.blockInThread();
        } finally {
            if ( ehs != null ) {
                ehs.stopHandlingMessages();
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
        } finally {
            if ( ehs != null ) {
                ehs.stopHandlingMessages();
            }
        }

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

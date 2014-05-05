package quickfix;
import static junit.framework.Assert.*;
import static quickfix.FixVersions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

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

public class LoginTestCase {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            login("BANZAI_" + i);
        }
    }

    private static void login(final String senderCompID) {
        new Thread(new Runnable() {

            public void run() {
                try {
                    SessionSettings settings = createSettings(senderCompID);
                    SessionID sessionID = settings.sectionIterator().next();
                    SocketInitiator initiator = new SocketInitiator(new TestApplication(sessionID),
                            new FileStoreFactory(settings), settings,
                            new ScreenLogFactory(settings), new DefaultMessageFactory());

                    System.out.println(senderCompID + ": starting initiator");
                    initiator.start();

                    new CountDownLatch(1).await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    private static SessionSettings createSettings(String senderCompID) {
        SessionSettings settings = new SessionSettings();

        Map<Object,Object> defaults = new HashMap<Object,Object>();
        defaults.put("FileStorePath", "examples/target/data/banzai");
        defaults.put("ConnectionType", "initiator");
        defaults.put("TargetCompID", "EXEC");
        defaults.put("SocketConnectHost", "localhost");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "3000");
        defaults.put("ReconnectInterval", "5");
        defaults.put("ScreenIncludeMilliseconds", "Y");
        defaults.put("BeginString", BEGINSTRING_FIX44);
        settings.set(defaults);

        settings.setString(new SessionID(BEGINSTRING_FIX44, senderCompID, "EXEC"),
                "SocketConnectPort", "9876");

        return settings;
    }

    private static final class TestApplication extends ApplicationAdapter {
        private final SessionID expectedSessionID;

        public TestApplication(SessionID expectedSessionID) {
            this.expectedSessionID = expectedSessionID;
        }

        @Override
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void onCreate(SessionID sessionId) {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void onLogon(SessionID sessionId) {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void onLogout(SessionID sessionId) {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void toAdmin(Message message, SessionID sessionId) {
            assertEquals(expectedSessionID, sessionId);
        }

        @Override
        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
            assertEquals(expectedSessionID, sessionId);
        }
    }

}

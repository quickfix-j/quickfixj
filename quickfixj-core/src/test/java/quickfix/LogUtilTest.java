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

package quickfix;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class LogUtilTest {

    @Before
    public void setUp() throws Exception {
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }

    @After
    public void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
    }
    
    @Test
    public void testLogThrowable() throws ConfigError, FieldConvertError {
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        LogFactory mockLogFactory = createLogFactory(data);
        createSessionAndGenerateException(mockLogFactory);

        String message = new String(data.toByteArray());
        assertTrue(message.contains("IOException"));
    }

    private void createSessionAndGenerateException(LogFactory mockLogFactory) throws ConfigError,
            FieldConvertError {
        SessionSettings settings = new SessionSettings();
        settings.setString(Session.SETTING_START_TIME, "16:00:00");
        settings.setString(Session.SETTING_END_TIME, "13:00:00");
        SessionID sessionID = new SessionID("FIX.4.2", "SENDER", "TARGET");
        SessionSchedule schedule = new DefaultSessionSchedule(settings, sessionID);
        Session session = new Session(null, sessionID1 -> {
            try {
                return new MemoryStore() {
                    public Date getCreationTime() throws IOException {
                        throw new IOException("test");
                    }
                };
            } catch (IOException e) {
                // ignore
                return null;
            }
        }, sessionID, null, null, schedule, mockLogFactory, null, 0);
        try {
            session.close();
        } catch (IOException e) {
            // ignore
        }
    }

    private LogFactory createLogFactory(ByteArrayOutputStream data) {
        final ScreenLog log = new ScreenLog(true, true, true, true, false, null, new PrintStream(data));
        return new LogFactory() {
            public Log create(SessionID sessionID) {
                return create(sessionID, log.getClass().getName());
            }

            public Log create(SessionID sessionID, String callerFQCN) {
                return log;
            }
        };
    }

}

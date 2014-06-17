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

package quickfix.mina.acceptor;

import static quickfix.mina.acceptor.DynamicAcceptorSessionProvider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import junit.framework.TestCase;

import org.quickfixj.QFJException;

import quickfix.*;
import quickfix.mina.acceptor.DynamicAcceptorSessionProvider.TemplateMapping;
import quickfix.mina.SessionConnector;

public class DynamicAcceptorSessionProviderTest extends TestCase {
    private DynamicAcceptorSessionProvider provider;
    private SessionSettings settings;
    private List<TemplateMapping> templateMappings;
    private Application application;
    private MessageStoreFactory messageStoreFactory;
    private LogFactory logFactory;
    private MessageFactory messageFactory;

    @Override
    protected void setUp() throws Exception {
        settings = new SessionSettings();
        templateMappings = new ArrayList<TemplateMapping>();
        application = new UnitTestApplication();
        messageStoreFactory = new MemoryStoreFactory();
        logFactory = new ScreenLogFactory();
        messageFactory = new DefaultMessageFactory();

        SessionID templateId1 = new SessionID("FIX.4.2", "ANY", "ANY");
        templateMappings.add(new TemplateMapping(new SessionID(WILDCARD, "S1", WILDCARD), templateId1));
        setUpSettings(templateId1, "ResetOnLogout", "Y");

        SessionID templateId2 = new SessionID("FIX.4.4", "S1", "ANY");
        templateMappings.add(new TemplateMapping(new SessionID("FIX.4.4", WILDCARD, WILDCARD), templateId2));
        setUpSettings(templateId2, "RefreshOnLogon", "Y");

        SessionID templateId3 = new SessionID("FIX.4.4", "ANY", "ANY");
        templateMappings.add(new TemplateMapping(new SessionID("FIX.4.2", WILDCARD, WILDCARD,
                WILDCARD, WILDCARD, WILDCARD, WILDCARD, WILDCARD), templateId3));
        setUpSettings(templateId3, "CheckCompID", "N");

        provider = new DynamicAcceptorSessionProvider(settings, templateMappings, application,
                messageStoreFactory, logFactory, messageFactory);
    }

    public void testSessionCreation() throws Exception {

        Session session1 = provider.getSession(new SessionID("FIX.4.2", "SENDER", "SENDERSUB",
                "SENDERLOC", "TARGET", "TARGETSUB", "TARGETLOC", null), null);
        SessionID sessionID1 = session1.getSessionID();
        assertEquals("wrong FIX version", "FIX.4.2", sessionID1.getBeginString());
        assertEquals("wrong sender", "SENDER", sessionID1.getSenderCompID());
        assertEquals("wrong senderSub", "SENDERSUB", sessionID1.getSenderSubID());
        assertEquals("wrong senderLoc", "SENDERLOC", sessionID1.getSenderLocationID());
        assertEquals("wrong target", "TARGET", sessionID1.getTargetCompID());
        assertEquals("wrong targetSub", "TARGETSUB", sessionID1.getTargetSubID());
        assertEquals("wrong targetLoc", "TARGETLOC", sessionID1.getTargetLocationID());
        assertEquals("wrong setting", false, session1.getResetOnLogout());
        assertEquals("wrong setting", false, session1.getRefreshOnLogon());
        assertEquals("wrong setting", false, session1.getCheckCompID());

        Session session2 = provider.getSession(new SessionID("FIX.4.4", "S1", "T"), null);
        SessionID sessionID2 = session2.getSessionID();
        assertEquals("wrong FIX version", "FIX.4.4", sessionID2.getBeginString());
        assertEquals("wrong sender", "S1", sessionID2.getSenderCompID());
        assertEquals("wrong target", "T", sessionID2.getTargetCompID());
        assertEquals("wrong setting", true, session2.getResetOnLogout());
        assertEquals("wrong setting", false, session2.getRefreshOnLogon());
        assertEquals("wrong setting", true, session2.getCheckCompID());

        Session session3 = provider.getSession(new SessionID("FIX.4.4", "X", "Y"), null);
        SessionID sessionID3 = session3.getSessionID();
        assertEquals("wrong FIX version", "FIX.4.4", sessionID3.getBeginString());
        assertEquals("wrong sender", "X", sessionID3.getSenderCompID());
        assertEquals("wrong target", "Y", sessionID3.getTargetCompID());
        assertEquals("wrong setting", false, session3.getResetOnLogout());
        assertEquals("wrong setting", true, session3.getRefreshOnLogon());
        assertEquals("wrong setting", true, session3.getCheckCompID());
    }

    private void setUpSettings(SessionID templateID, String key, String value) {
        settings.setString(templateID, "ConnectionType", "acceptor");
        settings.setString(templateID, "StartTime", "00:00:00");
        settings.setString(templateID, "EndTime", "00:00:00");
        settings.setString(templateID, key, value);
    }

    public void testSessionTemplateNotFound() throws Exception {
        try {
            provider.getSession(new SessionID("FIX.4.3", "S", "T"), null);
            fail("No exception thrown");
        } catch (QFJException e) {
            // Expected
        }
    }

    public void testToString() throws Exception {
        templateMappings.toString(); // be sure there are no NPEs, etc.
    }

    public void testSimpleConstructor() throws Exception {
        provider = new DynamicAcceptorSessionProvider(settings, new SessionID("FIX.4.2", "ANY",
                "ANY"), application, messageStoreFactory, logFactory, messageFactory);

        // Should actually throw an exception if it fails (see previous test)
        assertNotNull(provider.getSession(new SessionID("FIX.4.2", "S", "T"), null));
    }

    /** Verify that if a new session comes in it gets added to the list in session connector */
    public void testDynamicSessionIsAddedToSessionConnector() throws Exception {
        MySessionConnector connector = new MySessionConnector(settings, null);

        SessionID id1 = new SessionID("FIX.4.2", "me", "SENDERSUB",
                "SENDERLOC", "you", "TARGETSUB", "TARGETLOC", null);
        provider.getSession(id1, connector);
        assertEquals(1, connector.sessions.size());
        // try again with same sesionID - should still be 1
        provider.getSession(id1, connector);
        assertEquals(1, connector.sessions.size());

        SessionID id2 = new SessionID("FIX.4.2", "SENDER2", "SENDERSUB",
                "SENDERLOC", "TARGET2", "TARGETSUB", "TARGETLOC", null);
        provider.getSession(id2, connector);
        assertEquals(2, connector.sessions.size());
    }

    private static class MySessionConnector extends SessionConnector {
        private HashMap<SessionID, Session> sessions = new HashMap<SessionID, Session>();

        public MySessionConnector(SessionSettings settings, SessionFactory sessionFactory) throws ConfigError {
            super(settings, sessionFactory);
        }

        @Override
        public void addDynamicSession(Session inSession) {
            sessions.put(inSession.getSessionID(), inSession);
        }

        @Override
        public void removeDynamicSession(SessionID inSessionID) {
            sessions.remove(inSessionID);
        }

        public void start() throws ConfigError, RuntimeError {
        }

        public void stop() {
        }

        public void stop(boolean force) {
        }

        public void block() throws ConfigError, RuntimeError {
        }
    }
}

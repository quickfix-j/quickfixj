package org.quickfixj.jmx.mbean.session;

import junit.framework.TestCase;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionFactoryTestSupport;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.field.NewSeqNo;

import javax.management.ObjectName;
import java.util.ArrayList;

/**
 * Test the {@link SessionAdminMBean} class
 *
 * @author toli
 * @version $Id$
 */
public class SessionAdminTest extends TestCase {

    public void testResetSequence() throws Exception {
        try (Session session = SessionFactoryTestSupport.createSession()) {
            MockSessionAdmin admin = new MockSessionAdmin(session, null, null);
            admin.resetSequence(25);
            assertEquals(1, admin.sentMessages.size());
            assertEquals(25, admin.sentMessages.get(0).getInt(NewSeqNo.FIELD));
        }
    }

    private class MockSessionAdmin extends SessionAdmin {
        final ArrayList<Message> sentMessages = new ArrayList<>();

        public MockSessionAdmin(Session session, ObjectName connectorName, ObjectName settingsName) {
            super(session, connectorName, settingsName);
        }

        protected void doSend(Message message, SessionID sessionID) throws SessionNotFound {
            sentMessages.add(message);
        }
    }

}

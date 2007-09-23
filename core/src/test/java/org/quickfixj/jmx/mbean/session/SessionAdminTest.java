package org.quickfixj.jmx.mbean.session;

import junit.framework.TestCase;
import quickfix.*;
import quickfix.field.NewSeqNo;

import javax.management.ObjectName;
import java.util.ArrayList;

/**
 * Test the {@link SessionAdminMBean} class
 * @author toli
 * @version $Id$
 */

public class SessionAdminTest extends TestCase {

    public void testResetSequence() throws Exception {
        Session session = SessionFactoryTestSupport.createSession();
        MockSessionAdmin admin = new MockSessionAdmin(session, null);
        admin.resetSequence(25);
        assertEquals(1, admin.sentMessages.size());
        assertEquals(25, admin.sentMessages.get(0).getInt(NewSeqNo.FIELD));
    }

    private class MockSessionAdmin extends SessionAdmin {
        ArrayList<Message> sentMessages = new ArrayList<Message>();
        public MockSessionAdmin(Session session, ObjectName connnectorName) {
            super(session, connnectorName);
        }

        protected void doSend(Message message, SessionID sessionID) throws SessionNotFound {
            sentMessages.add(message);
        }
    }


}

package quickfix;

import java.util.ArrayList;

import junit.framework.TestCase;

public abstract class AbstractMessageStoreTestCase extends TestCase {
    private SessionID sessionID;
    private MessageStore store;
    
	public AbstractMessageStoreTestCase(String name) {
		super(name);
	}

    protected void setUp() throws Exception {
        long now = System.currentTimeMillis();
        sessionID = new SessionID("FIX.4.2", "SENDER-"+now, "TARGET-"+now);
		store = getMessageStoreFactory().create(sessionID);
		assertEquals("wrong store type", getMessageStoreClass(), store.getClass());
        super.setUp();
    }
    
	protected abstract MessageStoreFactory getMessageStoreFactory() throws Exception;

    protected abstract Class getMessageStoreClass();

    protected MessageStore getStore() {
        return store;
    }
    
	public void testMessageStoreSequenceNumbers() throws Exception {
		store.reset();
		assertEquals("wrong value", 1, store.getNextSenderMsgSeqNum());
		assertEquals("wrong value", 1, store.getNextTargetMsgSeqNum());

		store.setNextSenderMsgSeqNum(123);
		assertEquals("wrong value", 123, store.getNextSenderMsgSeqNum());

		store.incrNextSenderMsgSeqNum();
		assertEquals("wrong value", 124, store.getNextSenderMsgSeqNum());

		store.setNextTargetMsgSeqNum(321);
		assertEquals("wrong value", 321, store.getNextTargetMsgSeqNum());

		store.incrNextTargetMsgSeqNum();
		assertEquals("wrong value", 322, store.getNextTargetMsgSeqNum());
		
		// test reset again after values have been set
		store.reset();
		assertEquals("wrong value", 1, store.getNextSenderMsgSeqNum());
		assertEquals("wrong value", 1, store.getNextTargetMsgSeqNum());
	}

    protected SessionID getSessionID() {
        return sessionID;
    }

    public void testMessageStorageMessages() throws Exception {
		assertTrue("set failed", store.set(111, "message2"));
		assertTrue("set failed", store.set(113, "message1"));
		assertTrue("set failed", store.set(120, "message3"));
		//assertTrue("set shouldn't succeed", !store.set(120, "message3"));
		
		ArrayList messages = new ArrayList();
		store.get(100, 115, messages);
		// TODO: How are missing sequences handled, if at all?
		assertEquals("wrong # of messages", 2, messages.size());
		assertEquals("wrong message", "message2", messages.get(0));
		assertEquals("wrong message", "message1", messages.get(1));
	}
}
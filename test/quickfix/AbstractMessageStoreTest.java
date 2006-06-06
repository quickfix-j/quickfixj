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

import java.io.IOException;
import java.util.ArrayList;

import junit.framework.TestCase;

public abstract class AbstractMessageStoreTest extends TestCase {
    private SessionID sessionID;
    private MessageStore store;

    // Automatically disable tests if database isn't available
    private boolean testEnabled = true;
    private MessageStoreFactory messageStoreFactory;

    protected void setUp() throws Exception {
        if (!testEnabled) {
            return;
        }
        long now = System.currentTimeMillis();
        sessionID = new SessionID("FIX.4.2", "SENDER-" + now, "TARGET-" + now);
        messageStoreFactory = getMessageStoreFactoryForTest();
        store = messageStoreFactory.create(sessionID);
        assertEquals("wrong store type", getMessageStoreClass(), store.getClass());
        super.setUp();
    }

    private MessageStoreFactory getMessageStoreFactoryForTest() throws Exception {
        if (messageStoreFactory == null) {
            messageStoreFactory = getMessageStoreFactory();
        }
        return messageStoreFactory;
    }

    protected abstract MessageStoreFactory getMessageStoreFactory() throws Exception;

    protected abstract Class getMessageStoreClass();

    protected MessageStore getStore() {
        return store;
    }
    
    protected MessageStore createStore() throws Exception {
        return messageStoreFactory.create(sessionID);
    }

    public void testMessageStoreSequenceNumbers() throws Exception {
        if (!testEnabled) {
            return;
        }

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
        if (!testEnabled) {
            return;
        }

        assertTrue("set failed", store.set(111, "message2"));
        assertTrue("set failed", store.set(113, "message1"));
        assertTrue("set failed", store.set(120, "message3"));

        ArrayList messages = new ArrayList();
        store.get(100, 115, messages);
        assertEquals("wrong # of messages", 2, messages.size());
        assertEquals("wrong message", "message2", messages.get(0));
        assertEquals("wrong message", "message1", messages.get(1));
    }

    public void testRefreshableMessageStore() throws Exception {
        if (!testEnabled) {
            return;
        }

        if (store instanceof MemoryStore == false) {
            MessageStore failoverStore = getMessageStoreFactory().create(sessionID);
            try {
                MessageStore primaryStore = store;

                assertEquals("wrong value", 1, primaryStore.getNextSenderMsgSeqNum());
                assertEquals("wrong value", 1, primaryStore.getNextTargetMsgSeqNum());

                assertEquals("wrong value", 1, failoverStore.getNextSenderMsgSeqNum());
                assertEquals("wrong value", 1, failoverStore.getNextTargetMsgSeqNum());

                primaryStore.setNextSenderMsgSeqNum(20);
                primaryStore.setNextTargetMsgSeqNum(20);

                assertEquals("wrong value", 20, primaryStore.getNextSenderMsgSeqNum());
                assertEquals("wrong value", 20, primaryStore.getNextTargetMsgSeqNum());

                closeMessageStore(primaryStore);

                assertEquals("wrong value", 1, failoverStore.getNextSenderMsgSeqNum());
                assertEquals("wrong value", 1, failoverStore.getNextTargetMsgSeqNum());

                failoverStore.refresh();

                assertEquals("wrong value", 20, failoverStore.getNextSenderMsgSeqNum());
                assertEquals("wrong value", 20, failoverStore.getNextTargetMsgSeqNum());
            } finally {
                closeMessageStore(failoverStore);
            }
        }
    }

    protected void closeMessageStore(MessageStore store) throws IOException {
        // does nothing, by default
    }

    protected String getConfigurationFileName() {
        return "test/test.cfg";
    }

    protected void setTestEnabled(boolean b) {
        testEnabled = b;
    }
}
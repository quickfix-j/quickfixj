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

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;

public class JdbcStoreTest extends AbstractMessageStoreTest {

    public JdbcStoreTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError {
        SessionSettings settings = new SessionSettings();

        JdbcTestSupport.setHypersonicSettings(settings);
        initializeTableDefinitions(null, null);

        return new JdbcStoreFactory(settings);
    }

    public void testSequenceNumbersWithCustomSessionsTableName() throws Exception {
        initializeTableDefinitions("xsessions", "messages");
        JdbcStore store = (JdbcStore) getStore();
        store.setSessionTableName("xsessions");
        store.reset();
        assertEquals("wrong value", 1, store.getNextSenderMsgSeqNum());
        assertEquals("wrong value", 1, store.getNextTargetMsgSeqNum());
    }

    public void testMessageStorageMessagesWithCustomMessagesTableName() throws Exception {
        initializeTableDefinitions("sessions", "xmessages");
        JdbcStore store = (JdbcStore) getStore();
        store.setMessageTableName("xmessages");

        assertTrue("set failed", store.set(111, "message2"));
        assertTrue("set failed", store.set(113, "message1"));
        assertTrue("set failed", store.set(120, "message3"));

        ArrayList messages = new ArrayList();
        store.get(100, 115, messages);
        assertEquals("wrong # of messages", 2, messages.size());
        assertEquals("wrong message", "message2", messages.get(0));
        assertEquals("wrong message", "message1", messages.get(1));
    }

    private void initializeTableDefinitions(String sessionsTableName, String messagesTableName)
            throws ConfigError {
        try {
            Connection connection = JdbcTestSupport.getConnection();
            JdbcTestSupport.loadSQL(connection, "etc/sql/mysql/messages_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(messagesTableName));
            JdbcTestSupport.loadSQL(connection, "etc/sql/mysql/sessions_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(sessionsTableName));
        } catch (Exception e) {
            throw new ConfigError(e);
        }
    }

    public void testCreationTime() throws Exception {
        JdbcStore store = (JdbcStore) getStore();
        Date creationTime = store.getCreationTime();

        store = (JdbcStore) createStore();
        Date creationTime2 = store.getCreationTime();

        assertEquals("creation time not stored correctly", creationTime, creationTime2);
    }

    protected Class getMessageStoreClass() {
        return JdbcStore.class;
    }

}
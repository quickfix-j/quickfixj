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
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcStoreTest extends AbstractMessageStoreTest {
    private String initialContextFactory;
    private String providerUrl;

    protected void setUp() throws Exception {
        initialContextFactory = System.getProperty(Context.INITIAL_CONTEXT_FACTORY);
        initialContextFactory = System.getProperty(Context.PROVIDER_URL);
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "tyrex.naming.MemoryContextFactory");
        System.setProperty(Context.PROVIDER_URL, "TEST");
        bindDataSource();
        super.setUp();
    }

    protected void tearDown() throws Exception {
        JdbcTestSupport.assertNoActiveConnections();
        if (initialContextFactory != null) {
            System.setProperty(Context.INITIAL_CONTEXT_FACTORY, initialContextFactory);
        }
        if (providerUrl != null) {
            System.setProperty(Context.PROVIDER_URL, providerUrl);
        }
        super.tearDown();
    }

    private void bindDataSource() throws NamingException {
        new InitialContext().rebind("TestDataSource", getDataSource());
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, SQLException,
            IOException {

        SessionSettings settings = new SessionSettings();
        settings.setString(JdbcSetting.SETTING_JDBC_DS_NAME, "TestDataSource");

        initializeTableDefinitions(null, null);

        return new JdbcStoreFactory(settings);
    }

    public void testExplicitDataSource() throws Exception {
        // No JNDI data source name is set up here
        JdbcStoreFactory factory = new JdbcStoreFactory(new SessionSettings());
        factory.setDataSource(getDataSource());
        factory.create(new SessionID("FIX4.4", "SENDER", "TARGET"));
    }
    
    public void testSequenceNumbersWithCustomSessionsTableName() throws Exception {
        JdbcStore store = (JdbcStore) getStore();
        initializeTableDefinitions("xsessions", "messages");
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

        ArrayList<String> messages = new ArrayList<String>();
        store.get(100, 115, messages);
        assertEquals("wrong # of messages", 2, messages.size());
        assertEquals("wrong message", "message2", messages.get(0));
        assertEquals("wrong message", "message1", messages.get(1));
    }

    private void initializeTableDefinitions(String sessionsTableName, String messagesTableName)
            throws ConfigError, SQLException, IOException {
        Connection connection = null;
        try {
            connection = getDataSource().getConnection();
            JdbcTestSupport.loadSQL(connection,
                    "core/src/main/config/sql/mysql/messages_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(messagesTableName));
            JdbcTestSupport.loadSQL(connection,
                    "core/src/main/config/sql/mysql/sessions_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(sessionsTableName));
        } finally {
            JdbcUtil.close(null, connection);
        }
    }

    private DataSource getDataSource() {
        return JdbcUtil.getDataSource(JdbcTestSupport.HSQL_DRIVER,
                JdbcTestSupport.HSQL_CONNECTION_URL, JdbcTestSupport.HSQL_USER, "", true);
    }

    public void testCreationTime() throws Exception {
        JdbcStore store = (JdbcStore) getStore();
        Date creationTime = store.getCreationTime();

        store = (JdbcStore) createStore();
        Date creationTime2 = store.getCreationTime();

        assertEquals("creation time not stored correctly", creationTime, creationTime2);
    }

    protected Class<JdbcStore> getMessageStoreClass() {
        return JdbcStore.class;
    }

}
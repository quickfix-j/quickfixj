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

import static quickfix.JdbcSetting.SETTING_JDBC_DS_NAME;
import static quickfix.JdbcSetting.SETTING_JDBC_STORE_MESSAGES_TABLE_NAME;
import static quickfix.JdbcSetting.SETTING_JDBC_STORE_SESSIONS_TABLE_NAME;
import static quickfix.JdbcTestSupport.HSQL_CONNECTION_URL;
import static quickfix.JdbcTestSupport.HSQL_DRIVER;
import static quickfix.JdbcTestSupport.HSQL_USER;
import static quickfix.JdbcTestSupport.assertNoActiveConnections;
import static quickfix.JdbcTestSupport.dropTable;
import static quickfix.JdbcTestSupport.loadSQL;
import static quickfix.JdbcUtil.close;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcStoreTest extends AbstractMessageStoreTest {
    private String initialContextFactory;

    protected void setUp() throws Exception {
        initialContextFactory = System.getProperty(Context.INITIAL_CONTEXT_FACTORY);
        initialContextFactory = System.getProperty(Context.PROVIDER_URL);
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "tyrex.naming.MemoryContextFactory");
        System.setProperty(Context.PROVIDER_URL, "TEST");
        bindDataSource();
        super.setUp();
    }

    protected void tearDown() throws Exception {
        assertNoActiveConnections();
        if (initialContextFactory != null) {
            System.setProperty(Context.INITIAL_CONTEXT_FACTORY, initialContextFactory);
        }
        super.tearDown();
    }

    private void bindDataSource() throws NamingException {
        new InitialContext().rebind("TestDataSource", getDataSource());
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, SQLException,
            IOException {
        return getMessageStoreFactory(null, null);
    }

    private JdbcStoreFactory getMessageStoreFactory(String sessionTableName, String messageTableName)
            throws ConfigError, SQLException, IOException {
        SessionSettings settings = new SessionSettings();
        settings.setString(SETTING_JDBC_DS_NAME, "TestDataSource");

        if (sessionTableName != null) {
            settings.setString(SETTING_JDBC_STORE_SESSIONS_TABLE_NAME, sessionTableName);
        }

        if (messageTableName != null) {
            settings.setString(SETTING_JDBC_STORE_MESSAGES_TABLE_NAME, messageTableName);
        }

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
        initializeTableDefinitions("xsessions", "messages");
        JdbcStore store = (JdbcStore) getMessageStoreFactory("xsessions", "messages").create(
                getSessionID());
        store.reset();
        assertEquals("wrong value", 1, store.getNextSenderMsgSeqNum());
        assertEquals("wrong value", 1, store.getNextTargetMsgSeqNum());
    }

    public void testMessageStorageMessagesWithCustomMessagesTableName() throws Exception {
        initializeTableDefinitions("sessions", "xmessages");
        JdbcStore store = (JdbcStore) getMessageStoreFactory("sessions", "xmessages").create(
                getSessionID());

        assertTrue("set failed", store.set(111, "message2"));
        assertTrue("set failed", store.set(113, "message1"));
        assertTrue("set failed", store.set(120, "message3"));

        ArrayList<String> messages = new ArrayList<String>();
        store.get(100, 115, messages);
        assertEquals("wrong # of messages", 2, messages.size());
        assertEquals("wrong message", "message2", messages.get(0));
        assertEquals("wrong message", "message1", messages.get(1));
    }

    protected void initializeTableDefinitions(String sessionsTableName, String messagesTableName)
            throws ConfigError, SQLException, IOException {
        Connection connection = null;
        try {
            connection = getDataSource().getConnection();
            if (messagesTableName != null) {
                dropTable(connection, messagesTableName);
            }
            loadSQL(connection, "core/src/main/config/sql/mysql/messages_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(messagesTableName));
            if (sessionsTableName != null) {
                dropTable(connection, sessionsTableName);
            }
            loadSQL(connection, "core/src/main/config/sql/mysql/sessions_table.sql",
                    new JdbcTestSupport.HypersonicPreprocessor(sessionsTableName));
        } finally {
            close(null, connection);
        }
    }

    protected DataSource getDataSource() {
        return JdbcUtil.getDataSource(HSQL_DRIVER, HSQL_CONNECTION_URL, HSQL_USER, "", true);
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

    public void testMessageUpdate() throws Exception {
        JdbcStore store = (JdbcStore) getMessageStoreFactory().create(getSessionID());
        store.reset();

        assertTrue(store.set(1, "MESSAGE1"));
        assertTrue(store.set(1, "MESSAGE2"));

        List<String> messages = new ArrayList<String>();
        store.get(1, 1, messages);
        assertEquals("MESSAGE2", messages.get(0));
    }
}
package quickfix;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcStoreTest extends AbstractMessageStoreTest {
    private String HSQL_DRIVER = "org.hsqldb.jdbcDriver";
    private String HSQL_CONNECTION_URL = "jdbc:hsqldb:mem:quickfix";
    private String HSQL_USER = "sa";
    
    public JdbcStoreTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }
    
    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError {
        SessionSettings settings = new SessionSettings();

        settings.setString(JdbcSetting.SETTING_JDBC_DRIVER, HSQL_DRIVER);
        settings.setString(JdbcSetting.SETTING_JDBC_CONNECTION_URL, HSQL_CONNECTION_URL);
        settings.setString(JdbcSetting.SETTING_JDBC_USER, HSQL_USER);
        settings.setString(JdbcSetting.SETTING_JDBC_PASSWORD, "");

        initializeTableDefinitions(null, null);

        return new JdbcStoreFactory(settings);
    }

    public void testSequenceNumbersWithCustomSessionsTableName() throws Exception {
        initializeTableDefinitions("xsessions", "messages");
        JdbcStore store = (JdbcStore)getStore();
        store.setSessionTableName("xsessions");
        store.reset();
        assertEquals("wrong value", 1, store.getNextSenderMsgSeqNum());
        assertEquals("wrong value", 1, store.getNextTargetMsgSeqNum());
    }
    
    public void testMessageStorageMessagesWithCustomMessagesTableName() throws Exception {
        initializeTableDefinitions("sessions", "xmessages");
        JdbcStore store = (JdbcStore)getStore();
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

    private void initializeTableDefinitions(String sessionsTableName, String messagesTableName) throws ConfigError {
        try {
            Class.forName(HSQL_DRIVER);
            Connection connection = DriverManager.getConnection(HSQL_CONNECTION_URL, HSQL_USER, "");
            loadSQL(connection, "etc/sql/messages_table.sql", new SQLPreprocessor(messagesTableName));
            loadSQL(connection, "etc/sql/sessions_table.sql", new SQLPreprocessor(sessionsTableName));
        } catch (Exception e) {
            throw new ConfigError(e);
        }
    }

    protected Class getMessageStoreClass() {
        return JdbcStore.class;
    }

    private class SQLPreprocessor {
        private String tableName;

        public SQLPreprocessor(String tableName) {
            this.tableName = tableName;
        }

        public String preprocessSQL(String sql) {
            String preprocessedSql = sql;
            preprocessedSql = sql.replaceAll("USE quickfix;", "");
            preprocessedSql = preprocessedSql.replaceAll("BLOB", "VARCHAR(256)");
            if (tableName != null) {
                preprocessedSql = preprocessedSql.replaceAll("CREATE TABLE [a-z]+",
                        "CREATE TABLE " + tableName);
                preprocessedSql = preprocessedSql.replaceAll("DELETE FROM [a-z]+",
                        "DELETE FROM " + tableName);
            }
            return preprocessedSql;
        }
    }

    private void loadSQL(Connection connection, String resource, SQLPreprocessor sqlPreprocessor)
            throws SQLException, IOException {
        Statement stmt = connection.createStatement();
        InputStream sqlInput = new FileInputStream(resource);
        String sql = getString(sqlInput);
        if (sqlPreprocessor != null) {
            sql = sqlPreprocessor.preprocessSQL(sql);
        }
        stmt.execute(sql);
        stmt.close();
    }

    private String getString(InputStream in) throws IOException {
        int x = in.available();
        byte b[] = new byte[x];
        in.read(b);
        return new String(b);
    }
}
package quickfix.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import quickfix.FixVersions;
import quickfix.SessionID;

public class CommonsConfigSettingsTest extends TestCase {

    public void testSystemPropertyOverrides() throws Exception {
        System.setProperty("CLIENT4.FileStorePath", "abc");
        CommonsConfigSettings settings = new CommonsConfigSettings(
                "quickfix/config/test.properties", true);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT4", "TW");
        assertEquals("abc", settings.getSessionSettings().getString(sessionID, "FileStorePath"));

        CommonsConfigSettings settings2 = new CommonsConfigSettings(
                "quickfix/config/test.properties", false);
        assertEquals("xyz", settings2.getSessionSettings().getString(sessionID, "FileStorePath"));
    }

    public void testPropertyDefaults() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings(
                "quickfix/config/test.properties", false);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT4", "TW");
        assertEquals("localhost", settings.getSessionSettings().getString(sessionID,
                "SocketConnectHost"));
    }

    public void testQuickFixConfiguration() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings("quickfix/config/test.cfg",
                false);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT4", "TW");
        assertEquals("localhost", settings.getSessionSettings().getString(sessionID,
                "SocketConnectHost"));
    }

    public void testConfigurationChain() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings(new String[] {
                "quickfix/config/test.cfg", "quickfix/config/client3.properties" }, false);
        SessionID sessionID4 = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT4", "TW");
        assertEquals("test123", settings.getSessionSettings().getString(sessionID4, "test"));
        SessionID sessionID3 = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT3", "TW");
        assertEquals("test123", settings.getSessionSettings().getString(sessionID3, "test"));
        assertEquals("localhost", settings.getSessionSettings().getString(sessionID3,
                "SocketConnectHost"));
    }

    public void testSessionNameProperty() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings(
                "quickfix/config/test.properties", false);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT1", "TW");
        assertEquals("foo", settings.getSessionSettings().getString(sessionID, "FileStorePath"));
    }

    public void testIncludedProperties() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings(
                "quickfix/config/test.properties", false);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT3", "TW");
        assertEquals("store", settings.getSessionSettings().getString(sessionID, "FileStorePath"));
    }

    public void testXmlConfiguration() throws Exception {
        CommonsConfigSettings settings = new CommonsConfigSettings("quickfix/config/test.xml",
                false);
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT2", "TW");
        assertEquals("CLIENT2", settings.getSessionSettings().getString(sessionID, "SenderCompID"));
        assertEquals("store", settings.getSessionSettings().getString(sessionID, "FileStorePath"));
    }

    public void testJdbcConfiguration() throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:hsqldb:mem:quickfix", "sa", "");

            initializeTable(conn);
            loadProperties(conn, "test", "test.properties");

            CommonsConfigSettings settings = new CommonsConfigSettings("quickfix/config/test.jdbc",
                    false);
            SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX42, "CLIENT2", "TW");
            assertEquals("CLIENT2", settings.getSessionSettings().getString(sessionID,
                    "SenderCompID"));
            assertEquals("store", settings.getSessionSettings().getString(sessionID,
                    "FileStorePath"));
            assertFalse(settings.getSessionSettings().isSetting(sessionID, "BogusName"));
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    private void initializeTable(Connection conn) throws SQLException, IOException {
        Statement stmt = conn.createStatement();
        InputStream sql = CommonsConfigSettings.class.getResourceAsStream("configuration.sql");
        stmt.execute(getString(sql));
        stmt.close();
    }

    private String getString(InputStream in) throws IOException {
        int x = in.available();
        byte b[] = new byte[x];
        in.read(b);
        return new String(b);
    }

    private void loadProperties(Connection conn, String name, String filename) throws IOException,
            SQLException, ConfigurationException {
        PreparedStatement stmt = conn.prepareStatement("insert into qf_config "
                + "(qf_name,qf_key,qf_value) values (?,?,?)");
        Configuration c = new PropertiesConfiguration(getClass().getResource("test.properties"));
        Iterator keys = c.getKeys();
        while (keys.hasNext()) {
            String key = (String) keys.next();
            List values = c.getList(key);
            for (int i = 0; i < values.size(); i++) {
                stmt.clearParameters();
                stmt.setString(1, name);
                stmt.setString(2, key);
                stmt.setString(3, values.get(i).toString());
                stmt.execute();
            }
        }
        stmt.close();
    }
}

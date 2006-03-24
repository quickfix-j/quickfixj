package quickfix;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTestSupport {
    private static String HSQL_DRIVER = "org.hsqldb.jdbcDriver";
    private static String HSQL_CONNECTION_URL = "jdbc:hsqldb:mem:quickfix";
    private static String HSQL_USER = "sa";

    public static void setHypersonicSettings(SessionSettings settings) {
        settings.setString(JdbcSetting.SETTING_JDBC_DRIVER, HSQL_DRIVER);
        settings.setString(JdbcSetting.SETTING_JDBC_CONNECTION_URL, HSQL_CONNECTION_URL);
        settings.setString(JdbcSetting.SETTING_JDBC_USER, HSQL_USER);
        settings.setString(JdbcSetting.SETTING_JDBC_PASSWORD, "");
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(HSQL_DRIVER);
        Connection connection = DriverManager.getConnection(HSQL_CONNECTION_URL, HSQL_USER, "");
        return connection;
    }
    
    public static class HypersonicPreprocessor {
        private String tableName;

        public HypersonicPreprocessor(String tableName) {
            this.tableName = tableName;
        }

        public String preprocessSQL(String sql) {
            String preprocessedSql = sql;
            preprocessedSql = sql.replaceAll("USE .*;", "");
            preprocessedSql = preprocessedSql.replaceAll(" UNSIGNED", "");
            preprocessedSql = preprocessedSql.replaceAll("AUTO_INCREMENT", "IDENTITY");
            preprocessedSql = preprocessedSql.replaceAll("TEXT", "VARCHAR(256)");
            if (tableName != null) {
                preprocessedSql = preprocessedSql.replaceAll("CREATE TABLE [a-z]+",
                        "CREATE TABLE " + tableName);
                preprocessedSql = preprocessedSql.replaceAll("DELETE FROM [a-z]+",
                        "DELETE FROM " + tableName);
            }
            return preprocessedSql;
        }
    }

    public static void loadSQL(Connection connection, String resource, HypersonicPreprocessor sqlPreprocessor)
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

    private static String getString(InputStream in) throws IOException {
        int x = in.available();
        byte b[] = new byte[x];
        in.read(b);
        return new String(b);
    }

}

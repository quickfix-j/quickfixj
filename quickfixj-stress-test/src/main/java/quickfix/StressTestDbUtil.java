package quickfix;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;

import static java.util.Objects.requireNonNull;

public final class StressTestDbUtil {

    private static final int BUFFER_LENGTH = 4096;

    public static void initTables(DataSource dataSource) throws SQLException, IOException {
        try (Connection connection = dataSource.getConnection()) {
            executeSql(connection, "config/sql/hsqldb/sessions_table.sql", new HypersonicPreprocessor("sessions")::preprocessSQL);
            executeSql(connection, "config/sql/hsqldb/messages_table.sql", new HypersonicPreprocessor("messages")::preprocessSQL);
        }
    }

    private static void executeSql(Connection connection, String sqlResource, Function<String, String> preprocessor) throws IOException, SQLException {
        try (InputStream in = JdbcStoreHsqldbStressTest.class.getClassLoader().getResourceAsStream(sqlResource)) {
            String sql = readFully(requireNonNull(in));
            sql = preprocessor.apply(sql);

            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
            }
        }
    }

    private static String readFully(InputStream in) throws IOException {
        StringBuilder out = new StringBuilder(in.available());
        char[] buffer = new char[BUFFER_LENGTH];

        try (InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8)) {
            int readCharCount;

            while ((readCharCount = reader.read(buffer)) != -1) {
                out.append(buffer, 0, readCharCount);
            }
        }

        return out.toString();
    }

    // this is copied from quickfixj-core test cope - quickfix.JdbcTestSupport.HypersonicPreprocessor
    // TODO move to a common place and make visible for both modules
    private static final class HypersonicPreprocessor {

        private final String tableName;

        public HypersonicPreprocessor(String tableName) {
            this.tableName = tableName;
        }

        public String preprocessSQL(String sql) {
            sql = sql.replaceAll("USE .*;", "");
            sql = sql.replaceAll(" UNSIGNED", "");
            sql = sql.replaceAll("AUTO_INCREMENT", "IDENTITY");
            sql = sql.replaceAll("TEXT", "VARCHAR(256)");

            if (tableName != null) {
                sql = sql.replaceAll("CREATE TABLE [a-z]+", "CREATE TABLE " + tableName);
                sql = sql.replaceAll("DROP TABLE [a-z]+", "DROP TABLE " + tableName);
                sql = sql.replaceAll("DELETE FROM [a-z]+", "DELETE FROM " + tableName);
            }

            return sql;
        }
    }
}

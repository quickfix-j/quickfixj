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


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class JdbcUtil {

    static final String CONNECTION_POOL_ALIAS = "quickfixj";
    static final int DEFAULT_MAX_CONNECTION_COUNT = 32;
    static final long DEFAULT_MAX_CONNECTION_LIFETIME = TimeUnit.HOURS.toMillis(8);
    static final long DEFAULT_CONNECTION_TIMEOUT = 250L;
    static final long DEFAULT_CONNECTION_IDLE_TIMEOUT = TimeUnit.MINUTES.toMillis(10);
    static final long DEFAULT_CONNECTION_KEEPALIVE_TIME = 0;

    private static final Map<String, HikariDataSource> dataSources = new ConcurrentHashMap<>();
    private static final AtomicInteger dataSourceCounter = new AtomicInteger();

    static DataSource getDataSource(SessionSettings settings, SessionID sessionID) throws ConfigError, FieldConvertError {
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_DS_NAME)) {
            return getJNDIDataSource(settings, sessionID);
        } else {
            return getOrCreatePooledDataSource(settings, sessionID);
        }
    }

    private static DataSource getJNDIDataSource(SessionSettings settings, SessionID sessionID) throws ConfigError {
        String jndiName = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DS_NAME);
        try {
            return (DataSource) new InitialContext().lookup(jndiName);
        } catch (NamingException e) {
            throw new ConfigError(e);
        }
    }

    private static DataSource getOrCreatePooledDataSource(SessionSettings settings, SessionID sessionID) throws ConfigError, FieldConvertError {
        String jdbcDriver = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER);
        String connectionURL = settings.getString(sessionID,JdbcSetting.SETTING_JDBC_CONNECTION_URL);
        String user = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_USER);
        String password = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_PASSWORD);
        return getOrCreatePooledDataSource(settings, sessionID, jdbcDriver, connectionURL, user, password);
    }

    static DataSource getOrCreatePooledDataSource(SessionSettings settings, SessionID sessionID, String jdbcDriver, String connectionURL, String user, String password)
            throws ConfigError, FieldConvertError {
        String key = jdbcDriver + "#" + connectionURL + "#" + user + "#" + password;

        HikariDataSource dataSource = dataSources.get(key);

        if (dataSource != null) {
            return dataSource;
        }

        HikariDataSource newDataSource = createPooledDataSource(settings, sessionID, jdbcDriver, connectionURL, user, password);

        if (dataSources.putIfAbsent(key, newDataSource) == null) {
            return newDataSource;
        } else {
            return dataSources.get(key);
        }
    }

    private static HikariDataSource createPooledDataSource(SessionSettings settings, SessionID sessionID, String jdbcDriver, String connectionURL, String user, String password)
            throws ConfigError, FieldConvertError {
        HikariConfig configuration = new HikariConfig();
        configuration.setPoolName(CONNECTION_POOL_ALIAS + "-" + dataSourceCounter.incrementAndGet());
        configuration.setDriverClassName(jdbcDriver);
        configuration.setJdbcUrl(connectionURL);
        configuration.setUsername(user);
        configuration.setPassword(password);

        int maxConnectionCount = settings.getIntOrDefault(sessionID, JdbcSetting.SETTING_JDBC_MAX_ACTIVE_CONNECTION, DEFAULT_MAX_CONNECTION_COUNT);
        configuration.setMaximumPoolSize(maxConnectionCount);

        int minIdleConnectionCount = settings.getIntOrDefault(sessionID, JdbcSetting.SETTING_JDBC_MIN_IDLE_CONNECTION, maxConnectionCount);
        configuration.setMinimumIdle(minIdleConnectionCount);

        long maxConnectionLifetime = settings.getLongOrDefault(sessionID, JdbcSetting.SETTING_JDBC_MAX_CONNECTION_LIFETIME, DEFAULT_MAX_CONNECTION_LIFETIME);
        configuration.setMaxLifetime(maxConnectionLifetime);

        long connectionTimeout = settings.getLongOrDefault(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_TIMEOUT, DEFAULT_CONNECTION_TIMEOUT);
        configuration.setConnectionTimeout(connectionTimeout);

        long connectionIdleTimeout = settings.getLongOrDefault(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_IDLE_TIMEOUT, DEFAULT_CONNECTION_IDLE_TIMEOUT);
        configuration.setIdleTimeout(connectionIdleTimeout);

        long connectionKeepaliveTime = settings.getLongOrDefault(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_KEEPALIVE_TIME, DEFAULT_CONNECTION_KEEPALIVE_TIME);
        configuration.setKeepaliveTime(connectionKeepaliveTime);

        String connectionTestQuery = settings.getStringOrDefault(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_TEST_QUERY, null);
        configuration.setConnectionTestQuery(connectionTestQuery);

        return new HikariDataSource(configuration);
    }

    static void close(SessionID sessionID, Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }

    static void close(SessionID sessionID, PreparedStatement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }

    static void close(SessionID sessionID, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                LogUtil.logThrowable(sessionID, e.getMessage(), e);
            }
        }
    }

    static boolean determineSessionIdSupport(DataSource dataSource, String tableName) throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            String columnName = "sendersubid";
            return isColumn(metaData, tableName.toUpperCase(), columnName.toUpperCase())
                    || isColumn(metaData, tableName, columnName);
        }
    }

    private static boolean isColumn(DatabaseMetaData metaData, String tableName, String columnName)
            throws SQLException {
        try (ResultSet columns = metaData.getColumns(null, null, tableName, columnName)) {
            return columns.next();
        }
    }

    static String getIDWhereClause(boolean isExtendedSessionID) {
        return isExtendedSessionID
                ? ("beginstring=? and sendercompid=? and sendersubid=? and senderlocid=? and "
                + "targetcompid=? and targetsubid=? and targetlocid=? and session_qualifier=? ")
                : "beginstring=? and sendercompid=? and targetcompid=? and session_qualifier=? ";
    }

    static String getIDColumns(boolean isExtendedSessionID) {
        return isExtendedSessionID
                ? "beginstring,sendercompid,sendersubid,senderlocid,targetcompid,targetsubid,targetlocid,session_qualifier"
                : "beginstring,sendercompid,targetcompid,session_qualifier";
    }

    static String getIDPlaceholders(boolean isExtendedSessionID) {
        return isExtendedSessionID ? "?,?,?,?,?,?,?,?" : "?,?,?,?";
    }

    static int setSessionIdParameters(SessionID sessionID, PreparedStatement query, int offset, boolean isExtendedSessionID, String defaultSqlValue) throws SQLException {
        if (isExtendedSessionID) {
            query.setString(offset++, getSqlValue(sessionID.getBeginString(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderSubID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderLocationID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetSubID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetLocationID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSessionQualifier(), defaultSqlValue));
        } else {
            query.setString(offset++, getSqlValue(sessionID.getBeginString(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSenderCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getTargetCompID(), defaultSqlValue));
            query.setString(offset++, getSqlValue(sessionID.getSessionQualifier(), defaultSqlValue));
        }
        return offset;
    }

    private static String getSqlValue(String javaValue, String defaultSqlValue) {
        return !SessionID.NOT_SET.equals(javaValue) ? javaValue : defaultSqlValue;
    }
}

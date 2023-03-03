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

import javax.sql.DataSource;

/**
 * Class for storing JDBC setting constants shared by both the log and message
 * store classes.
 */
public class JdbcSetting {

    /**
     * Setting for JDBC driver. This key is used for both the message store and
     * the session log.
     */
    public static final String SETTING_JDBC_DRIVER = "JdbcDriver";

    /**
     * Setting for JDBC URL. This key is used for both the message store and the
     * session log.
     */
    public static final String SETTING_JDBC_CONNECTION_URL = "JdbcURL";

    /**
     * Setting for JDBC user. This key is used for both the message store and
     * the session log.
     */
    public static final String SETTING_JDBC_USER = "JdbcUser";

    /**
     * Setting for JDBC password. This key is used for both the message store
     * and the session log.
     */
    public static final String SETTING_JDBC_PASSWORD = "JdbcPassword";

    /**
     * Defines the table name for the messages table. Default is "messages".
     * If you use a different name, you must set up your database accordingly.
     */
    public static final String SETTING_JDBC_STORE_MESSAGES_TABLE_NAME = "JdbcStoreMessagesTableName";

    /**
     * Defines the table name for the session table. Default is "sessions".
     * If you use a different name, you must set up your database accordingly.
     */
    public static final String SETTING_JDBC_STORE_SESSIONS_TABLE_NAME = "JdbcStoreSessionsTableName";

    /**
     * The JNDI name used to lookup a DataSource for the JDBC plugins.
     */
    public static final String SETTING_JDBC_DS_NAME = "JdbcDataSourceName";

    /**
     * The class name of the JNDI initial context factory.
     */
    public static final String SETTING_JNDI_CONTEXT_FACTORY = "JndiContextFactory";

    /**
     * The JNDI provider URL.
     */
    public static final String SETTING_JNDI_PROVIDER_URL = "JndiProviderURL";

    /**
     * Flag for controlling logging of heartbeat messages.
     */
    public static final String SETTING_JDBC_LOG_HEARTBEATS = "JdbcLogHeartBeats";

    /**
     * Specifies name of table for logging outgoing messages
     */
    public static final String SETTING_LOG_OUTGOING_TABLE = "JdbcLogOutgoingTable";

    /**
     * Specifies name of table for logging incoming messages
     */
    public static final String SETTING_LOG_INCOMING_TABLE = "JdbcLogIncomingTable";

    /**
     * Specifies name of table for logging events
     */
    public static final String SETTING_LOG_EVENT_TABLE = "JdbcLogEventTable";

    /**
     * Specified the default value for session ID properties that have not been set. This
     * is primarily for Oracle which treats empty strings as SQL NULLs.
     */
    public static final String SETTING_JDBC_SESSION_ID_DEFAULT_PROPERTY_VALUE = "JdbcSessionIdDefaultPropertyValue";

    /**
     * Controls the maximum size that the pool is allowed to reach, including both idle and in-use connections.
     * Basically this value will determine the maximum number of actual connections to the database backend.
     * A reasonable value for this is best determined by your execution environment. When the pool reaches this size,
     * and no idle connections are available, calls to {@link DataSource#getConnection()} will block for up to
     * {@link JdbcSetting#SETTING_JDBC_CONNECTION_TIMEOUT} milliseconds before timing out.
     */
    public static final String SETTING_JDBC_MAX_ACTIVE_CONNECTION = "JdbcMaxActiveConnection";

    /**
     * Controls the minimum number of idle connections that HikariCP tries to maintain in the pool.
     * If the idle connections dip below this value and total connections in the pool are less than
     * {@link JdbcSetting#SETTING_JDBC_MAX_ACTIVE_CONNECTION}, HikariCP will make the best effort to add
     * additional connections quickly and efficiently. However, for maximum performance and responsiveness
     * to spike demands, we recommend not setting this value and instead allowing HikariCP to act as a fixed
     * size connection pool.
     */
    public static final String SETTING_JDBC_MIN_IDLE_CONNECTION = "JdbcMinIdleConnection";

    /**
     * Controls the maximum lifetime of a connection in the pool. An in-use connection will never be retired, only when
     * it is closed will it then be removed. On a connection-by-connection basis, minor negative attenuation is applied to
     * avoid mass-extinction in the pool. We strongly recommend setting this value, and it should be several seconds shorter
     * than any database or infrastructure imposed connection time limit. A value of 0 indicates no maximum lifetime (infinite
     * lifetime), subject of course to the {@link JdbcSetting#SETTING_JDBC_CONNECTION_IDLE_TIMEOUT} setting.
     */
    public static final String SETTING_JDBC_MAX_CONNECTION_LIFETIME = "JdbcMaxConnectionLifeTime";

    /**
     * Controls the maximum number of milliseconds that a client (that's you) will wait for a connection from the pool. If this time
     * is exceeded without a connection becoming available, an SQLException will be thrown. Lowest acceptable connection timeout is 250 ms.
     */
    public static final String SETTING_JDBC_CONNECTION_TIMEOUT = "JdbcConnectionTimeout";

    /**
     * Controls the maximum amount of time that a connection is allowed to sit idle in the pool.
     * This setting only applies when {@link JdbcSetting#SETTING_JDBC_MIN_IDLE_CONNECTION}  is defined to be less than
     * {@link JdbcSetting#SETTING_JDBC_MAX_ACTIVE_CONNECTION}. Idle connections will not be retired once the pool
     * reaches {@link JdbcSetting#SETTING_JDBC_MIN_IDLE_CONNECTION} connections.
     */
    public static final String SETTING_JDBC_CONNECTION_IDLE_TIMEOUT = "JdbcConnectionIdleTimeout";

    /**
     * Controls how frequently HikariCP will attempt to keep a connection alive, in order to prevent it from being timed out by the
     * database or network infrastructure. This value must be less than the {@link JdbcSetting#SETTING_JDBC_MAX_CONNECTION_LIFETIME} value.
     * A "keepalive" will only occur on an idle connection. When the time arrives for a "keepalive" against a given connection, that connection
     * will be removed from the pool, "pinged", and then returned to the pool. The 'ping' is one of either: invocation of the JDBC4
     * {@link java.sql.Connection#isValid(int)} method, or execution of the {@link JdbcSetting#SETTING_JDBC_CONNECTION_TEST_QUERY}. Typically, the duration
     * out-of-the-pool should be measured in single digit milliseconds or even sub-millisecond, and therefore should have little or no noticeable
     * performance impact. The minimum allowed value is 30000ms (30 seconds), but a value in the range of minutes is most desirable.
     */
    public static final String SETTING_JDBC_CONNECTION_KEEPALIVE_TIME = "JdbcConnectionKeepaliveTime";

    /**
     * If your driver supports JDBC4 we strongly recommend not setting this property. This is for "legacy" drivers that do not support the
     * JDBC4 {@link java.sql.Connection#isValid(int)} API. This is the query that will be executed just before a connection is given to you
     * from the pool to validate that the connection to the database is still alive.
     */
    public static final String SETTING_JDBC_CONNECTION_TEST_QUERY = "JdbcConnectionTestQuery";
}

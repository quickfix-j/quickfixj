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
     * Specifies the maximum number of connections to the database
     *
     * @see <a href="http://proxool.sourceforge.net/properties.html">http://proxool.sourceforge.net/properties.html</a>
     */
    public static final String SETTING_JDBC_MAX_ACTIVE_CONNECTION = "JdbcMaxActiveConnection";

    /**
     * Specifies if the housekeeper comes across a thread that has been active for longer than
     * this then it will kill it. So make sure you set this to a number bigger than your
     * slowest expected response!
     *
     * @see <a href="http://proxool.sourceforge.net/properties.html">http://proxool.sourceforge.net/properties.html</a>
     */
    public static final String SETTING_JDBC_MAX_ACTIVE_TIME = "JdbcMaxActiveTime";

    /**
     * Specifies the maximum amount of time that a connection exists for before
     * it is killed (milliseconds).
     *
     * @see <a href="http://proxool.sourceforge.net/properties.html">http://proxool.sourceforge.net/properties.html</a>
     */
    public static final String SETTING_JDBC_MAX_CONNECTION_LIFETIME = "JdbcMaxConnectionLifeTime";

    /**
     * Specifies the maximum number of connections we can be building at any one time.
     * That is, the number of new connections that have been requested but aren't yet
     * available for use. Because connections can be built using more than one thread
     * (for instance, when they are built on demand) and it takes a finite time between
     * deciding to build the connection and it becoming available we need some way of
     * ensuring that a lot of threads don't all decide to build a connection at once.
     * (We could solve this in a smarter way - and indeed we will one day)
     *
     * @see <a href="http://proxool.sourceforge.net/properties.html">http://proxool.sourceforge.net/properties.html</a>
     */
    public static final String SETTING_JDBC_SIMULTANEOUS_BUILD_THROTTLE = "JdbcSimultaneousBuildThrottle";

}

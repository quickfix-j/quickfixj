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
import java.sql.DriverManager;
import java.sql.SQLException;

class JdbcUtil {
    static Connection openConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        Class.forName(settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER));
        return DriverManager.getConnection(settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_CONNECTION_URL), settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_USER), settings.getString(sessionID,
                JdbcSetting.SETTING_JDBC_PASSWORD));
    }

    static Connection openMySQLStoreConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER, "com.mysql.jdbc.Driver");
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_URL, "jdbc:mysql://"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_STORE_HOST) + ":"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_STORE_PORT) + "/"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_STORE_DATABASE));
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_USER, settings.getString(sessionID,
                MySQLSetting.SETTING_MYSQL_STORE_USER));
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_PASSWORD, settings.getString(
                sessionID, MySQLSetting.SETTING_MYSQL_STORE_PASSWORD));
        return openConnection(settings, sessionID);
    }

    public static Connection openMySQLLogConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER, "com.mysql.jdbc.Driver");
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_CONNECTION_URL, "jdbc:mysql://"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_LOG_HOST) + ":"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_LOG_PORT) + "/"
                + settings.getString(sessionID, MySQLSetting.SETTING_MYSQL_LOG_DATABASE));
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_USER, settings.getString(sessionID,
                MySQLSetting.SETTING_MYSQL_LOG_USER));
        settings.setString(sessionID, JdbcSetting.SETTING_JDBC_PASSWORD, settings.getString(
                sessionID, MySQLSetting.SETTING_MYSQL_LOG_PASSWORD));
        return openConnection(settings, sessionID);
    }
}
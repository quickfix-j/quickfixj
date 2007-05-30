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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.logicalcobwebs.proxool.ProxoolDataSource;

import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentHashMap;

class JdbcUtil {

    static final String CONNECTION_POOL_ALIAS = "quickfixj";

    private static Map dataSources = new ConcurrentHashMap();
    private static int dataSourceCounter = 1;
    
    static DataSource getDataSource(SessionSettings settings, SessionID sessionID)
            throws ConfigError, FieldConvertError {
        if (settings.isSetting(sessionID, JdbcSetting.SETTING_JDBC_DS_NAME)) {
            String jndiName = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DS_NAME);
            try {
                return (DataSource) new InitialContext().lookup(jndiName);
            } catch (NamingException e) {
                throw new ConfigError(e);
            }
        } else {
            String jdbcDriver = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_DRIVER);
            String connectionURL = settings.getString(sessionID,
                    JdbcSetting.SETTING_JDBC_CONNECTION_URL);
            String user = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_USER);
            String password = settings.getString(sessionID, JdbcSetting.SETTING_JDBC_PASSWORD);

            return getDataSource(jdbcDriver, connectionURL, user, password, true);
        }
    }

    static DataSource getDataSource(String jdbcDriver, String connectionURL, String user, String password, boolean cache) {
        String key = jdbcDriver + "#" + connectionURL + "#" + user + "#" + password;
        ProxoolDataSource ds = cache ? (ProxoolDataSource) dataSources.get(key) : null;
        
        if (ds == null) {
            ds = new ProxoolDataSource(JdbcUtil.CONNECTION_POOL_ALIAS + "-" + dataSourceCounter++);
            ds.setDriver(jdbcDriver);
            ds.setDriverUrl(connectionURL);

            // Bug in Proxool 0.9RC2. Must set both delegate properties and individual setters. :-(
            ds.setDelegateProperties("user=" + user + ","
                    + (password != null && !"".equals(password) ? "password=" + password : ""));
            ds.setUser(user);
            ds.setPassword(password);
            
            // TODO JDBC Make these configurable
            ds.setMaximumActiveTime(5000);
            ds.setMaximumConnectionLifetime(28800000);
            ds.setMaximumConnectionCount(10);

            if (cache) {
                dataSources.put(key, ds);
            }
        }
        return ds;
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
}
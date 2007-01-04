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

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.Assert;

import org.logicalcobwebs.proxool.ProxoolException;
import org.logicalcobwebs.proxool.ProxoolFacade;
import org.logicalcobwebs.proxool.admin.SnapshotIF;

public class JdbcTestSupport {
    public static String HSQL_DRIVER = "org.hsqldb.jdbcDriver";
    public static String HSQL_CONNECTION_URL = "jdbc:hsqldb:mem:quickfixj";
    public static String HSQL_USER = "sa";

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

    static void assertNoActiveConnections() throws ProxoolException {
        String[] aliases = ProxoolFacade.getAliases();
        for (int i = 0; i < aliases.length; i++) {
            SnapshotIF snapshot = ProxoolFacade.getSnapshot(aliases[i], true);
            Assert.assertEquals("unclosed connections: "+aliases[i], 0, snapshot.getActiveConnectionCount());            
        }
    }

}

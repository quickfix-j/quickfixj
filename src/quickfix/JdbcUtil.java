/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection openConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        Class.forName(settings.getString(sessionID, SessionSettings.JDBC_STORE_DRIVER));
        return DriverManager.getConnection(settings.getString(sessionID,
                SessionSettings.JDBC_STORE_URL), settings.getString(sessionID,
                SessionSettings.JDBC_STORE_USER), settings.getString(sessionID,
                SessionSettings.JDBC_STORE_PASSWORD));
    }
    
    public static Connection openMySQLConnection(SessionSettings settings, SessionID sessionID)
            throws SQLException, ClassNotFoundException, ConfigError, FieldConvertError {
        settings.setString(sessionID, SessionSettings.JDBC_STORE_DRIVER, "com.mysql.jdbc.Driver");
        settings.setString(sessionID, SessionSettings.JDBC_STORE_URL, "jdbc:mysql://"
                + settings.getString(sessionID, SessionSettings.MYSQL_STORE_HOST) + ":"
                + settings.getString(sessionID, SessionSettings.MYSQL_STORE_PORT) + "/"
                + settings.getString(sessionID, SessionSettings.MYSQL_STORE_DATABASE));
        settings.setString(sessionID, SessionSettings.JDBC_STORE_USER, settings.getString(
                sessionID, SessionSettings.MYSQL_STORE_USER));
        settings.setString(sessionID, SessionSettings.JDBC_STORE_PASSWORD, settings.getString(
                sessionID, SessionSettings.MYSQL_STORE_PASSWORD));
        return openConnection(settings, sessionID);
    }
}
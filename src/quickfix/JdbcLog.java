/*******************************************************************************
 * Copyright (c) 2001-2004 quickfixengine.org All rights reserved.
 * 
 * This file is part of the QuickFIX FIX Engine
 * 
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file LICENSE
 * included in the packaging of this file.
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing are not
 * clear to you.
 *  
 ******************************************************************************/

package quickfix;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class JdbcLog implements Log {
    private Connection connection;
    private SessionID sessionID;

    public JdbcLog(SessionSettings settings, SessionID sessionID) throws SQLException,
            ClassNotFoundException, ConfigError {
        this.sessionID = sessionID;
        connection = connect(settings, sessionID);
    }

    protected Connection connect(SessionSettings settings, SessionID sessionID2) throws SQLException,
            ClassNotFoundException, ConfigError {
        return JdbcUtil.openConnection(settings, sessionID);
    }

    public void onEvent(String value) {
        insert("event_log", value);
    }

    public void onIncoming(String value) {
        insert("incoming_log", value);
    }

    public void onOutgoing(String value) {
        insert("outgoing_log", value);
    }

    private void insert(String tableName, String value) {
        try {
            PreparedStatement insert = connection.prepareStatement("INSERT INTO " + tableName
                    + " (time, beginstring, sendercompid, targetcompid, session_qualifier, text) "
                    + "VALUES (?,?,?,?,?,?)");
            insert.setTimestamp(1, new Timestamp(TimeUtil.getUtcCalendar().getTimeInMillis()));
            insert.setString(2, sessionID.getBeginString());
            insert.setString(3, sessionID.getSenderCompID());
            insert.setString(4, sessionID.getTargetCompID());
            insert.setString(5, sessionID.getSessionQualifier());
            insert.setString(6, value);
            insert.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
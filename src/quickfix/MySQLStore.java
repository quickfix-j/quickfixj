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

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * MySQL message store implementation. SHOULD ONLY BE CREATED USING A FACTORY.
 * 
 * @see quickfix.JdbcStoreFactory
 */
public class MySQLStore extends JdbcStore {
    MySQLStore(SessionSettings settings, SessionID sessionID) throws Exception {
        super(settings, sessionID);
    }

    protected Connection connect(SessionSettings settings, SessionID sessionID)
            throws ClassNotFoundException, ConfigError, FieldConvertError, SQLException {
        return JdbcUtil.openMySQLStoreConnection(settings, sessionID);
    }
    
    /**
     * This method is here for JNI API consistency but it's not 
     * implemented. Use get(int, int, Collection) with the same 
     * start and end sequence.
     * 
     */
    public boolean get(int sequence, String message) throws IOException {
        throw new UnsupportedOperationException("not supported");
    }
}
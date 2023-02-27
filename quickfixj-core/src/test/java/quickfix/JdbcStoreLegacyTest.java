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

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JdbcStoreLegacyTest extends JdbcStoreTest {

    /**
     * This will load the old table definitions with the limited session ID. The JdbcStore
     * should automatically adapt to the existing table definition.
     */
    protected void initializeTableDefinitions(String sessionsTableName, String messagesTableName)
            throws ConfigError, SQLException, IOException {
        Connection connection = null;
        try {
            connection = getTestDataSource().getConnection();
            JdbcTestSupport.loadSQL(connection,
                    "config/sql/hsqldb/messages_table.sql",
                    new JdbcTestSupport.HypersonicLegacyPreprocessor(messagesTableName));
            JdbcTestSupport.loadSQL(connection,
                    "config/sql/hsqldb/sessions_table.sql",
                    new JdbcTestSupport.HypersonicLegacyPreprocessor(sessionsTableName));
        } finally {
            JdbcUtil.close(null, connection);
        }
    }

}

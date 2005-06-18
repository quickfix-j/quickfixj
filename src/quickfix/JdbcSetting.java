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

/**
 * Class for storing JDBC setting constants shared by both the log and message
 * store classes.
 *  
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

}
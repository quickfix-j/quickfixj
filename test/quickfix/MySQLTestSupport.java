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

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class MySQLTestSupport {
	public static boolean isMySQLAvailable(String configurationFileName) {
		try {
			SessionSettings settings = new SessionSettings(configurationFileName);
			Socket socket = new Socket();
			if (settings.isSetting(MySQLSetting.SETTING_MYSQL_STORE_HOST)) {
				int port = settings
						.isSetting(MySQLSetting.SETTING_MYSQL_STORE_HOST) ? (int) settings
						.getLong(MySQLSetting.SETTING_MYSQL_STORE_PORT)
						: 3306;
				String host = settings
						.getString(MySQLSetting.SETTING_MYSQL_STORE_HOST);
				socket.connect(new InetSocketAddress(host, port));
			}
		} catch (ConnectException e) {
			return false;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return true;
	}

}

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

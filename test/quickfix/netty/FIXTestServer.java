package quickfix.netty;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;

public class FIXTestServer {

    public static void main(String[] args) {
        try {
            SessionID sessionID = new SessionID("FIX.4.2", "BAR", "FOO");
            SessionSettings settings = new SessionSettings();
            settings.setString(sessionID, SessionSettings.FILE_STORE_PATH, "./data/server");
            settings.setString(sessionID, SessionSettings.DATA_DICTIONARY,
                    "../quickfix_cvs/spec/FIX42.xml");
            settings.setLong(sessionID, SessionSettings.SOCKET_ACCEPT_PORT, 9876);
            ThreadedSocketAcceptor acceptor = new ThreadedSocketAcceptor(new ApplicationStub(),
                    new FileStoreFactory(settings), settings, new ScreenLogFactory(settings),
                    new DefaultMessageFactory());
            acceptor.start();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
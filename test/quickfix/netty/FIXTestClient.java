package quickfix.netty;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketInitiator;

public class FIXTestClient {

    public static void main(String[] args) {
        try {
            SessionID sessionID = new SessionID("FIX.4.2", "FOO", "BAR");
            SessionSettings settings = new SessionSettings();
            settings.setString(sessionID, SessionSettings.DATA_DICTIONARY, "../quickfix_cvs/spec/FIX42.xml");
            settings.setString(sessionID, SessionSettings.FILE_STORE_PATH, "./data/client");
            settings.setString(sessionID, SessionSettings.SOCKET_CONNECT_HOST, "localhost");
            settings.setLong(sessionID, SessionSettings.SOCKET_CONNECT_PORT, 9876);
            ThreadedSocketInitiator initiator = new ThreadedSocketInitiator(new ApplicationStub(),
                    new FileStoreFactory(settings), settings,
                    new ScreenLogFactory(settings), new DefaultMessageFactory());
            initiator.start();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
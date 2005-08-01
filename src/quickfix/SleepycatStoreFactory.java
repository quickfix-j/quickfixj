package quickfix;

import java.io.IOException;

public class SleepycatStoreFactory implements MessageStoreFactory {
    private SessionSettings settings = new SessionSettings();

    public SleepycatStoreFactory(SessionSettings settings) {
        this.settings = settings;
    }

    public MessageStore create(SessionID sessionID) {
        try {
            return new SleepycatStore(sessionID);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
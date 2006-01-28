package quickfix;

import java.io.File;
import java.io.IOException;

public class SleepycatStoreTest extends AbstractMessageStoreTest {
    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, FieldConvertError {
        SessionSettings settings = new SessionSettings(getConfigurationFileName());
        File tmpfile;
        try {
            tmpfile = File.createTempFile("test", "txt");
        } catch (IOException e) {
            throw new ConfigError(e);
        }
        File tmpdir = tmpfile.getParentFile();
        settings.setString(getSessionID(), SleepycatStoreFactory.SETTING_SLEEPYCAT_DATABASE_DIR,
                tmpdir.getPath());
        return new SleepycatStoreFactory(settings);
    }

    protected void tearDown() throws Exception {
        try {
            ((SleepycatStore) getStore()).close();
        } catch (Exception e) {
        }
    }

    protected Class getMessageStoreClass() {
        return SleepycatStore.class;
    }

    protected void closeMessageStore(MessageStore store) throws IOException {
        ((SleepycatStore) store).close();
    }

    public void testCloseAndOpen() throws Exception {
        SleepycatStore store = (SleepycatStore) getStore();
        store.setNextSenderMsgSeqNum(123);
        store.setNextTargetMsgSeqNum(321);
        store.close();
        store.open();

        assertEquals(123, store.getNextSenderMsgSeqNum());
        assertEquals(321, store.getNextTargetMsgSeqNum());
    }

}
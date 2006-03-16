package quickfix;

import java.io.IOException;
import java.util.Date;

public class FileStoreTest extends AbstractMessageStoreTest {
    public FileStoreTest(String name) {
        super(name);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        FileStore fileStore = (FileStore) getStore();
        try {
            fileStore.deleteFiles();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, FieldConvertError {
        SessionSettings settings = new SessionSettings(getConfigurationFileName());
        // Initialize the session settings from the defaults
        settings.setString(getSessionID(), FileStoreFactory.SETTING_FILE_STORE_PATH, settings
                .getString(FileStoreFactory.SETTING_FILE_STORE_PATH));
        return new FileStoreFactory(settings);
    }

    protected Class getMessageStoreClass() {
        return FileStore.class;
    }

    public void testCloseAndOpen() throws Exception {
        FileStore store = (FileStore) getStore();
        store.setNextSenderMsgSeqNum(123);
        store.setNextTargetMsgSeqNum(321);
        store.closeFiles();
        store.initialize(false);

        assertEquals(123, store.getNextSenderMsgSeqNum());
        assertEquals(321, store.getNextTargetMsgSeqNum());
    }
    
    protected void closeMessageStore(MessageStore store) throws IOException {
        ((FileStore)store).closeFiles();
    }

    public void testInitialSessionCreationTime() throws Exception {
        FileStore store = (FileStore)getStore();
        Date creationTime1 = store.getCreationTime();
        store.closeFiles();
        Thread.sleep(100);
        store.initialize(false);
        Date creationTime2 = store.getCreationTime();
        assertEquals("wrong time diff", 0, Math.abs(creationTime1.getTime() - creationTime2.getTime()));
    }
}
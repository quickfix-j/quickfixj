package quickfix;

public class TestFileStore extends AbstractMessageStoreTestCase {
    public TestFileStore(String name) {
        super(name);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        FileStore fileStore = (FileStore) getStore();
        fileStore.deleteFiles();
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError {
        SessionSettings settings = new SessionSettings("tests.cfg");
        // Initialize the session settings from the defaults
        settings.setString(getSessionID(), SessionSettings.FILE_STORE_PATH, settings
                .getDefaultSection().getProperty(SessionSettings.FILE_STORE_PATH));
        return new FileStoreFactory(settings);
    }

    protected Class getMessageStoreClass() {
        return FileStore.class;
    }

    public void testReset() throws Exception {
        FileStore store = (FileStore) getStore();
        store.setNextSenderMsgSeqNum(123);
        store.setNextTargetMsgSeqNum(321);
        store.closeFiles();
        store.initializeFiles(false);

        assertEquals(123, store.getNextSenderMsgSeqNum());
        assertEquals(321, store.getNextTargetMsgSeqNum());
    }

}
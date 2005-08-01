package quickfix;

public class SleepycatStoreTest extends AbstractMessageStoreTest {
    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError, FieldConvertError {
        SessionSettings settings = new SessionSettings(getConfigurationFileName());
        return new SleepycatStoreFactory(settings);
    }

    protected void tearDown() throws Exception {
        try {
            ((SleepycatStore)getStore()).close();
        } catch (Exception e) {
        }
    }
    
    protected Class getMessageStoreClass() {
        return SleepycatStore.class;
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
package quickfix;

public class MemoryStoreTest extends AbstractMessageStoreTest {
	public MemoryStoreTest(String name) {
		super(name);
	}

	protected MessageStoreFactory getMessageStoreFactory() {
		return new MemoryStoreFactory();
	}
	
    protected Class getMessageStoreClass() {
        return MemoryStore.class;
    }
}
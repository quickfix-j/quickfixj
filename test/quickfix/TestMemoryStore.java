package quickfix;

public class TestMemoryStore extends AbstractMessageStoreTestCase {
	public TestMemoryStore(String name) {
		super(name);
	}

	protected MessageStoreFactory getMessageStoreFactory() {
		return new MemoryStoreFactory();
	}
	
    protected Class getMessageStoreClass() {
        return MemoryStore.class;
    }
}
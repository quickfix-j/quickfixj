package quickfix;

public class TestMySQLStore extends AbstractMessageStoreTestCase {
    public TestMySQLStore(String name) {
        super(name);
    }

    protected MessageStoreFactory getMessageStoreFactory() throws ConfigError {
        SessionSettings settings = new SessionSettings("tests.cfg");
        return new MySQLStoreFactory(settings);
    }

    protected Class getMessageStoreClass() {
        return MySQLStore.class;
    }
}
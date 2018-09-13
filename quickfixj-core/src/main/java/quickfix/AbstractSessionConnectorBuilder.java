package quickfix;

public abstract class AbstractSessionConnectorBuilder<Derived, Product> {
    private final Class<Derived> derived;
    Application application;
    MessageStoreFactory messageStoreFactory;
    SessionSettings settings;
    LogFactory logFactory;
    MessageFactory messageFactory;

    int queueCapacity = -1;
    int queueLowerWatermark = -1;
    int queueUpperWatermark = -1;

    AbstractSessionConnectorBuilder(Class<Derived> derived) {
        this.derived = derived;
    }

    public Derived withApplication(Application val) throws ConfigError {
        application = val;
        return derived.cast(this);
    }

    public Derived withMessageStoreFactory(MessageStoreFactory val) throws ConfigError {
        messageStoreFactory = val;
        return derived.cast(this);
    }

    public Derived withSettings(SessionSettings val) {
        settings = val;
        return derived.cast(this);
    }

    public Derived withLogFactory(LogFactory val) throws ConfigError {
        logFactory = val;
        return derived.cast(this);
    }

    public Derived withMessageFactory(MessageFactory val) throws ConfigError {
        messageFactory = val;
        return derived.cast(this);
    }

    public Derived withQueueCapacity(int val) throws ConfigError {
        if (queueLowerWatermark >= 0) {
            throw new ConfigError("queue capacity and watermarks may not be configured together");
        } else if (val < 0) {
            throw new ConfigError("negative queue capacity");
        }
        queueCapacity = val;
        return derived.cast(this);
    }

    public Derived withQueueWatermarks(int lower, int upper) throws ConfigError {
        if (queueCapacity >= 0) {
            throw new ConfigError("queue capacity and watermarks may not be configured together");
        } else if (lower < 0 || upper <= lower) {
            throw new ConfigError("invalid queue watermarks, required: 0 <= lower watermark < upper watermark");
        }
        queueLowerWatermark = lower;
        queueUpperWatermark = upper;
        return derived.cast(this);
    }

    public final Product build() throws ConfigError {
        if (logFactory == null) {
            logFactory = new ScreenLogFactory(settings);
        }

        return doBuild();
    }

    protected abstract Product doBuild() throws ConfigError;
}

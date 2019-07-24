package quickfix.mina;

import quickfix.ConfigError;
import quickfix.RuntimeError;
import quickfix.SessionSettings;

public class SessionConnectorStub extends SessionConnector {

    public SessionConnectorStub(final SessionSettings settings) throws ConfigError {
        super(settings, null);
    }

    @Override
    public void start() throws RuntimeError {
    }

    @Override
    public void stop(final boolean force) {
    }

}

package quickfix.mina.ssl;

import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SSLContext;

public final class AcceptorSslFilter extends AbstractSslFilter {
    public AcceptorSslFilter(SSLContext sslContext, HostResolutionStrategy hostResolutionStrategy) {
        super(sslContext, true, hostResolutionStrategy);
    }
}

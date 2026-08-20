package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;
import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import java.net.InetSocketAddress;

abstract class AbstractSslFilter extends SslFilter {
    private final HostResolutionStrategy hostResolutionStrategy;

    AbstractSslFilter(SSLContext sslContext, boolean autoStart,
            HostResolutionStrategy hostResolutionStrategy) {
        super(sslContext, autoStart);
        this.hostResolutionStrategy = hostResolutionStrategy;
    }

    @Override
    protected final SSLEngine createEngine(IoSession session, InetSocketAddress addr) {
        SSLEngine sslEngine;

        if (addr != null) {
            sslEngine = sslContext.createSSLEngine(hostResolutionStrategy.getHost(addr), addr.getPort());
        } else {
            sslEngine = sslContext.createSSLEngine();
        }

        if (wantClientAuth) {
            sslEngine.setWantClientAuth(true);
        }

        if (needClientAuth) {
            sslEngine.setNeedClientAuth(true);
        }

        if (enabledCipherSuites != null) {
            sslEngine.setEnabledCipherSuites(enabledCipherSuites);
        }

        if (enabledProtocols != null) {
            sslEngine.setEnabledProtocols(enabledProtocols);
        }

        if (getEndpointIdentificationAlgorithm() != null) {
            SSLParameters sslParameters = sslEngine.getSSLParameters();
            sslParameters.setEndpointIdentificationAlgorithm(getEndpointIdentificationAlgorithm());
            sslEngine.setSSLParameters(sslParameters);
        }

        configureEngine(sslEngine);
        sslEngine.setUseClientMode(!session.isServer());

        return sslEngine;
    }

    protected void configureEngine(SSLEngine sslEngine) {
    }
}

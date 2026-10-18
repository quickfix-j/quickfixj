package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;
import org.apache.mina.filter.ssl.SslHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import java.net.InetSocketAddress;

abstract class AbstractSslFilter extends SslFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractSslFilter.class);

    private final HostResolutionStrategy hostResolutionStrategy;
    private boolean nonBlockingPipeline;

    AbstractSslFilter(SSLContext sslContext, boolean autoStart,
            HostResolutionStrategy hostResolutionStrategy) {
        super(sslContext, autoStart);
        this.hostResolutionStrategy = hostResolutionStrategy;
    }

    @Override
    protected final SSLEngine createEngine(IoSession session, InetSocketAddress addr) {
        SSLEngine sslEngine;

        if (addr != null) {
            String resolvedHost = hostResolutionStrategy.getHost(addr);

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Creating SSL engine [session={},address={},resolvedHost={}]", session, addr, resolvedHost);
            }

            sslEngine = sslContext.createSSLEngine(resolvedHost, addr.getPort());
        } else {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Creating SSL engine [session={},address={}]", session, addr);
            }

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

    synchronized protected void onConnected(NextFilter next, IoSession session) throws SSLException {
        SslHandler sslHandler = SslHandler.class.cast(session.getAttribute(SSL_HANDLER));

        if (sslHandler == null) {
            InetSocketAddress s = InetSocketAddress.class.cast(session.getRemoteAddress());
            SSLEngine sslEngine = createEngine(session, s);

            if (nonBlockingPipeline) {
                sslHandler = new QFSSLHandlerG1(sslEngine, EXECUTOR, session);
            } else {
                sslHandler = new QFSSLHandlerG0(sslEngine, EXECUTOR, session);
            }

            session.setAttribute(SSL_HANDLER, sslHandler);
        }

        sslHandler.open(next);
    }

    protected void configureEngine(SSLEngine sslEngine) {
    }

    @Override
    public final void sessionClosed(NextFilter next, IoSession session) throws Exception {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Session {} closed", session);
        }

        onClose(next, session, true);
        next.sessionClosed(session);
    }

    @Override
    public void setUseNonBlockingPipeline(boolean enable) {
        super.setUseNonBlockingPipeline(enable);
        this.nonBlockingPipeline = enable;
    }
}

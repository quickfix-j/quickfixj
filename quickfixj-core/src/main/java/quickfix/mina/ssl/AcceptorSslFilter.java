package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SSLContext;

public final class AcceptorSslFilter extends AbstractSslFilter {
    public AcceptorSslFilter(SSLContext sslContext, HostResolutionStrategy hostResolutionStrategy) {
        super(sslContext, true, hostResolutionStrategy);
    }

    @Override
    public void sessionClosed(NextFilter next, IoSession session) throws Exception {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("SERVER: Session {} closed", session);
        }

        onClose(next, session, true);
        next.sessionClosed(session);
    }
}

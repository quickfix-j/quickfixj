package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;

import javax.net.ssl.SSLContext;

public final class AcceptorSslFilter extends SslFilter {

    public AcceptorSslFilter(SSLContext sslContext) {
        super(sslContext);
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

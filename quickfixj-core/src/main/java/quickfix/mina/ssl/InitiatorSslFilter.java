package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import quickfix.mina.HostResolutionStrategy;

import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import java.util.Collections;

/**
 * This class is not part of the public API and may be removed or changed in future releases.
 */
public final class InitiatorSslFilter extends AbstractSslFilter {

    private final String sniHostName;

    public InitiatorSslFilter(SSLContext sslContext, String sniHostName, HostResolutionStrategy hostResolutionStrategy) {
        super(sslContext, false, hostResolutionStrategy);
        this.sniHostName = sniHostName;
    }

    @Override
    protected void configureEngine(SSLEngine sslEngine) {
        if (sniHostName != null) {
            SSLParameters sslParameters = sslEngine.getSSLParameters();
            sslParameters.setServerNames(Collections.singletonList(new SNIHostName(sniHostName)));
            sslEngine.setSSLParameters(sslParameters);
        }
    }

    @Override
    public void sessionClosed(NextFilter next, IoSession session) throws Exception {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("CLIENT: Session {} closed", session);
        }

        onClose(next, session, true);
        next.sessionClosed(session);
    }
}

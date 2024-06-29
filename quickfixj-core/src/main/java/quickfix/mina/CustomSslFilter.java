package quickfix.mina;

import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;

import javax.net.ssl.SSLContext;

/**
 * Temporary {@link SslFilter} wrapper that prevents auto connect for initiators.
 */
public class CustomSslFilter extends SslFilter {

    private static final boolean DEFAULT_AUTO_START = true;

    private final boolean autoStart;

    public CustomSslFilter(SSLContext sslContext) {
        this(sslContext, DEFAULT_AUTO_START);
    }

    public CustomSslFilter(SSLContext sslContext, boolean autoStart) {
        super(sslContext);
        this.autoStart = autoStart;
    }

    @Override
    public void onPostAdd(IoFilterChain parent, String name, NextFilter next) throws Exception {
        IoSession session = parent.getSession();

        if (session.isConnected() && autoStart) {
            onConnected(next, session);
        }
    }
}

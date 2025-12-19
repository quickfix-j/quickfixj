package quickfix.mina.ssl;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.ssl.SslFilter;

import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import java.net.InetSocketAddress;
import java.util.Arrays;

public final class InitiatorSslFilter extends SslFilter {

    private final String sniHostName;

    public InitiatorSslFilter(SSLContext sslContext, String sniHostName) {
        super(sslContext, false);
        this.sniHostName = sniHostName;
    }

    @Override
    protected SSLEngine createEngine(IoSession session, InetSocketAddress addr) {
        SSLEngine sslEngine;

        if (addr != null) {
            sslEngine = sslContext.createSSLEngine(addr.getHostName(), addr.getPort());
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

        if (sniHostName != null) {
            SSLParameters sslParameters = sslEngine.getSSLParameters();
            sslParameters.setServerNames(Arrays.asList(new SNIHostName(sniHostName)));
            sslEngine.setSSLParameters(sslParameters);
        }

        sslEngine.setUseClientMode(!session.isServer());

        return sslEngine;
    }
}

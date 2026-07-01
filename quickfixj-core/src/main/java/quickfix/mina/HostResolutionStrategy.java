package quickfix.mina;

import java.net.InetSocketAddress;

@FunctionalInterface
public interface HostResolutionStrategy {
    String getHost(InetSocketAddress address);

    HostResolutionStrategy WITH_REVERSE_DNS = InetSocketAddress::getHostName;

    HostResolutionStrategy WITHOUT_REVERSE_DNS = InetSocketAddress::getHostString;
}

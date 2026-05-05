package quickfix.mina;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.example.socksproxy.SocksServerInitializer;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.apache.mina.util.DaemonThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadFactory;

/**
 * Simple SOCKS proxy server based on Netty examples. Only SOCKS protocols are currently supported.
 * The implementation performs the proxy handshake, but it doesn't perform any user authentication.
 */
public class SocksProxyServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(SocksProxyServer.class);
    private static final ThreadFactory THREAD_FACTORY = new DaemonThreadFactory();

    private final ServerBootstrap bootstrap;
    private final int port;
    private Channel channel;

    public SocksProxyServer(int port) {
        this.bootstrap = new ServerBootstrap();
        this.bootstrap.group(new NioEventLoopGroup(THREAD_FACTORY), new NioEventLoopGroup(THREAD_FACTORY))
                      .channel(NioServerSocketChannel.class)
                      .handler(new LoggingHandler(LogLevel.DEBUG))
                      .childHandler(new SocksServerInitializer());
        this.port = port;
    }

    public synchronized void start() {
        if (channel != null) {
            throw new IllegalStateException("SOCKS proxy server is running already");
        }

        try {
            channel = bootstrap.bind(port)
                               .sync()
                               .channel();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

        LOGGER.info("SOCKS proxy server started at port: {}", port);
    }

    public synchronized void stop() {
        if (channel == null) {
            throw new IllegalStateException("SOCKS proxy server is not running");
        }

        try {
            channel.close().sync();
            channel = null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Failed to close SOCKS proxy server");
        }

        LOGGER.info("SOCKS proxy server stopped at port {}", port);
    }

    public int getPort() {
        return port;
    }
}

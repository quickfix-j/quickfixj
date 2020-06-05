/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.mina;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import org.apache.mina.transport.vmpipe.VmPipeAcceptor;
import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.apache.mina.transport.vmpipe.VmPipeConnector;
import org.apache.mina.proxy.ProxyConnector;
import org.apache.mina.proxy.handlers.ProxyRequest;
import org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods;
import org.apache.mina.proxy.handlers.http.HttpProxyConstants;
import org.apache.mina.proxy.handlers.http.HttpProxyRequest;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;


import quickfix.ConfigError;
import quickfix.RuntimeError;

/**
 * A utility class for creating addresses and connection-related objects
 * based on the MINA transport type.
 */
public class ProtocolFactory {

    public final static int SOCKET = 0;
    public final static int VM_PIPE = 1;
    public final static int PROXY = 2;

    public static String getTypeString(int type) {
        switch (type) {
        case SOCKET:
            return "SOCKET";
        case VM_PIPE:
            return "VM_PIPE";
        case PROXY:
            return "PROXY";
        default:
            return "unknown";
        }
    }

    public static SocketAddress createSocketAddress(int transportType, String host,
            int port) throws ConfigError {
        if (transportType == SOCKET || transportType == PROXY) {
            return host != null ? new InetSocketAddress(host, port) : new InetSocketAddress(port);
        } else if (transportType == VM_PIPE) {
            return new VmPipeAddress(port);
        } else {
            throw new ConfigError("Unknown session transport type: " + transportType);
        }
    }

    public static int getAddressTransportType(SocketAddress address) {
        if (address instanceof InetSocketAddress) {
            return SOCKET;
        } else if (address instanceof VmPipeAddress) {
            return VM_PIPE;
        } else {
            throw new RuntimeError("Unknown address type: "
                    + address.getClass().getName());
        }
    }

    public static int getTransportType(String string) {
        if (string.equalsIgnoreCase("tcp") || string.equalsIgnoreCase("SOCKET")) {
            return SOCKET;
        } else if (string.equalsIgnoreCase("VM_PIPE")) {
            return VM_PIPE;
        } else if (string.equalsIgnoreCase("PROXY")) {
            return PROXY;
        } else {
            throw new RuntimeError("Unknown Transport Type type: " + string);
        }
    }

    public static IoAcceptor createIoAcceptor(int transportType) {
        if (transportType == SOCKET) {
            NioSocketAcceptor ret = new NioSocketAcceptor();
            ret.setReuseAddress(true);
            return ret;
        } else if (transportType == VM_PIPE) {
            return new VmPipeAcceptor();
        } else {
            throw new RuntimeError("Unsupported transport type: " + transportType);
        }
    }

    public static ProxyConnector createIoProxyConnector(SocketConnector socketConnector,
                                                        InetSocketAddress address,
                                                        InetSocketAddress proxyAddress,
                                                        String proxyType,
                                                        String proxyVersion,
                                                        String proxyUser,
                                                        String proxyPassword,
                                                        String proxyDomain,
                                                        String proxyWorkstation )  throws ConfigError {

        // Create proxy connector.
        ProxyRequest req;

        ProxyConnector connector = new ProxyConnector(socketConnector);
        connector.setConnectTimeoutMillis(5000);

        if (proxyType.equalsIgnoreCase("http")) {
            req = createHttpProxyRequest(address, proxyVersion, proxyUser, proxyPassword, proxyDomain, proxyWorkstation);
        } else if (proxyType.equalsIgnoreCase("socks")) {
            req = createSocksProxyRequest(address, proxyVersion, proxyUser, proxyPassword);
        } else {
            throw new ConfigError("Proxy type must be http or socks");
        }

        ProxyIoSession proxyIoSession = new ProxyIoSession(proxyAddress, req);
        connector.setProxyIoSession(proxyIoSession);

        return connector;
    }


    private static ProxyRequest createHttpProxyRequest(InetSocketAddress address,
                                                       String proxyVersion,
                                                       String proxyUser,
                                                       String proxyPassword,
                                                       String proxyDomain,
                                                       String proxyWorkstation) {
        HashMap<String, String> props = new HashMap<>();
        props.put(HttpProxyConstants.USER_PROPERTY, proxyUser);
        props.put(HttpProxyConstants.PWD_PROPERTY, proxyPassword);
        if (proxyDomain != null && proxyWorkstation != null) {
            props.put(HttpProxyConstants.DOMAIN_PROPERTY, proxyDomain);
            props.put(HttpProxyConstants.WORKSTATION_PROPERTY, proxyWorkstation);
        }

        HttpProxyRequest req = new HttpProxyRequest(address);
        req.setProperties(props);
        if (proxyVersion != null && proxyVersion.equalsIgnoreCase("1.1")) {
            req.setHttpVersion(HttpProxyConstants.HTTP_1_1);
        } else {
            req.setHttpVersion(HttpProxyConstants.HTTP_1_0);
        }

        return req;
    }


    private static ProxyRequest createSocksProxyRequest(InetSocketAddress address,
                                                        String proxyVersion,
                                                        String proxyUser,
                                                        String proxyPassword) throws ConfigError {
        SocksProxyRequest req;
        if (proxyVersion.equalsIgnoreCase("4")) {
            req = new SocksProxyRequest(
                    SocksProxyConstants.SOCKS_VERSION_4,
                    SocksProxyConstants.ESTABLISH_TCPIP_STREAM,
                    address,
                    proxyUser);

        } else if (proxyVersion.equalsIgnoreCase("4a")) {
            req = new SocksProxyRequest(
                    SocksProxyConstants.ESTABLISH_TCPIP_STREAM,
                    address.getAddress().getHostAddress(),
                    address.getPort(),
                    proxyUser);

        } else if (proxyVersion.equalsIgnoreCase("5")) {
            req = new SocksProxyRequest(
                    SocksProxyConstants.SOCKS_VERSION_5,
                    SocksProxyConstants.ESTABLISH_TCPIP_STREAM,
                    address,
                    proxyUser);

        } else {
            throw new ConfigError("SOCKS ProxyType must be 4,4a or 5");
        }

        if (proxyPassword != null) {
            req.setPassword(proxyPassword);
        }

        return req;
    }


    public static IoConnector createIoConnector(SocketAddress address) throws ConfigError {
        if (address instanceof InetSocketAddress) {
            return new NioSocketConnector();
        } else if (address instanceof VmPipeAddress) {
            return new VmPipeConnector();
        } else {
            throw new ConfigError("Unknown session acceptor address type: "
                    + address.getClass().getName());
        }
    }
}

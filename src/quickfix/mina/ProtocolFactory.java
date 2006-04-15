/*============================================================================
 *
 * Copyright (c) 2000-2006 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package quickfix.mina;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.IoConnector;
import org.apache.mina.common.TransportType;
import org.apache.mina.transport.socket.nio.SocketAcceptor;
import org.apache.mina.transport.socket.nio.SocketConnector;
import org.apache.mina.transport.vmpipe.VmPipeAcceptor;
import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.apache.mina.transport.vmpipe.VmPipeConnector;

import quickfix.ConfigError;

/**
 * A utility class for creating addresses and connection-related objects
 * based on the MINA transport type.
 */
public class ProtocolFactory {

    public static SocketAddress createSocketAddress(TransportType transportType, String host, int port)
            throws ConfigError {
        if (transportType == TransportType.SOCKET) {
            return host != null ? new InetSocketAddress(host, port) : new InetSocketAddress(port);
        } else if (transportType == TransportType.VM_PIPE) {
            return new VmPipeAddress(port);
        } else {
            throw new ConfigError("Unknown session transport type: " + transportType);
        }
    }

    public static IoAcceptor createIoAcceptor(SocketAddress address) throws ConfigError {
        if (address instanceof InetSocketAddress) {
            return new SocketAcceptor();
        } else if (address instanceof VmPipeAddress) {
            return new VmPipeAcceptor();
        } else {
            throw new ConfigError("Unknown session acceptor address type: "
                    + address.getClass().getName());
        }
    }

    public static IoConnector createIoConnector(SocketAddress address) throws ConfigError {
        if (address instanceof InetSocketAddress) {
            return new SocketConnector();
        } else if (address instanceof VmPipeAddress) {
            return new VmPipeConnector();
        } else {
            throw new ConfigError("Unknown session acceptor address type: "
                    + address.getClass().getName());
        }
    }
}

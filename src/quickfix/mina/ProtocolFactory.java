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

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.IoConnector;
import org.apache.mina.common.TransportType;
import org.apache.mina.transport.socket.nio.SocketAcceptor;
import org.apache.mina.transport.socket.nio.SocketConnector;
import org.apache.mina.transport.vmpipe.VmPipeAcceptor;
import org.apache.mina.transport.vmpipe.VmPipeAddress;
import org.apache.mina.transport.vmpipe.VmPipeConnector;

import quickfix.ConfigError;
import quickfix.RuntimeError;

/**
 * A utility class for creating addresses and connection-related objects
 * based on the MINA transport type.
 */
public class ProtocolFactory {

    public static SocketAddress createSocketAddress(TransportType transportType, String host,
            int port) throws ConfigError {
        if (transportType == TransportType.SOCKET) {
            return host != null ? new InetSocketAddress(host, port) : new InetSocketAddress(port);
        } else if (transportType == TransportType.VM_PIPE) {
            return new VmPipeAddress(port);
        } else {
            throw new ConfigError("Unknown session transport type: " + transportType);
        }
    }

    public static TransportType getAddressTransportType(SocketAddress address) {
        if (address instanceof InetSocketAddress) {
            return TransportType.SOCKET;
        } else if (address instanceof VmPipeAddress) {
            return TransportType.VM_PIPE;
        } else {
            throw new RuntimeError("Unknown address type: "
                    + address.getClass().getName());
        }
    }

    public static IoAcceptor createIoAcceptor(TransportType transportType) {
        if (transportType == TransportType.SOCKET) {
            return new SocketAcceptor();
        } else if (transportType == TransportType.VM_PIPE) {
            return new VmPipeAcceptor();
        } else {
            throw new RuntimeError("Unsupported transport type: " + transportType);
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

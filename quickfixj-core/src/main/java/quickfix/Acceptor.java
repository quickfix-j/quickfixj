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

package quickfix;

/**
 * Accepts connections from FIX clients and manages the associated sessions.
 */
public interface Acceptor extends Connector {
    /**
     * Acceptor setting specifying the socket protocol used to accept connections.
     */
    public static final String SETTING_SOCKET_ACCEPT_PROTOCOL = "SocketAcceptProtocol";

    /**
     * Acceptor setting specifying port for accepting FIX client connections.
     */
    public static final String SETTING_SOCKET_ACCEPT_PORT = "SocketAcceptPort";
    
    /**
     * Acceptor setting specifying local IP interface address for accepting connections.
     */
    public static final String SETTING_SOCKET_ACCEPT_ADDRESS = "SocketAcceptAddress";    

    /**
     * Acceptor setting specifying local IP interface address for accepting connections.
     */
    public static final String SETTING_ACCEPTOR_TEMPLATE = "AcceptorTemplate";    
}
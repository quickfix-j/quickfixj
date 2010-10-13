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
 * Establishes sessions with FIX servers and manages the associated sessions.
 */
public interface Initiator extends Connector {
    /**
     * Initiator setting for reconnect interval in seconds. Only valid when
     * session connection type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    public static final String SETTING_RECONNECT_INTERVAL = "ReconnectInterval";
    
    /**
     * Initiator setting for connection protocol (defaults to "tcp").
     */
    public static final String SETTING_SOCKET_CONNECT_PROTOCOL = "SocketConnectProtocol";

    /**
     * Initiator setting for connection host. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    public static final String SETTING_SOCKET_CONNECT_HOST = "SocketConnectHost";

    /**
     * Initiator setting for connection port. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    public static final String SETTING_SOCKET_CONNECT_PORT = "SocketConnectPort";

    /**
     * Initiator setting for local/bind host. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    public static final String SETTING_SOCKET_LOCAL_HOST = "SocketLocalHost";

    /**
     * Initiator setting for local/bind port. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    public static final String SETTING_SOCKET_LOCAL_PORT = "SocketLocalPort";
}

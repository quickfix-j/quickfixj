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
    String SETTING_RECONNECT_INTERVAL = "ReconnectInterval";

    /**
     * Initiator setting for connection protocol (defaults to "tcp").
     */
    String SETTING_SOCKET_CONNECT_PROTOCOL = "SocketConnectProtocol";

    /**
     * Initiator setting for connection host. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    String SETTING_SOCKET_CONNECT_HOST = "SocketConnectHost";

    /**
     * Initiator setting for connection port. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    String SETTING_SOCKET_CONNECT_PORT = "SocketConnectPort";

    /**
     * Initiator setting for local/bind host. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    String SETTING_SOCKET_LOCAL_HOST = "SocketLocalHost";

    /**
     * Initiator setting for local/bind port. Only valid when session connection
     * type is "initiator".
     *
     * @see quickfix.SessionFactory#SETTING_CONNECTION_TYPE
     */
    String SETTING_SOCKET_LOCAL_PORT = "SocketLocalPort";

    /**
     * Initiator setting for proxy type. Only valid when session connection
     * type is "initiator".
     */
   String SETTING_PROXY_TYPE = "ProxyType";
    
    /**
     * Initiator setting for proxy version. Only valid when session connection
     * type is "initiator".  - http 1.0 / 1.1
     */
    String SETTING_PROXY_VERSION = "ProxyVersion";

    /**
     * Initiator setting for proxy host. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_HOST = "ProxyHost";
    
    /**
     * Initiator setting for proxy port. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_PORT = "ProxyPort";
    
    /**
     * Initiator setting for proxy port. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_USER = "ProxyUser";
    
    /**
     * Initiator setting for proxy port. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_PASSWORD = "ProxyPassword";

    /**
     * Initiator setting for proxy domain. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_DOMAIN = "ProxyDomain";

    /**
     * Initiator setting for proxy workstation. Only valid when session connection
     * type is "initiator".
     */
    String SETTING_PROXY_WORKSTATION = "ProxyWorkstation";

    /**
     * Leave the corresponding session disconnected until
     * AbstractSocketInitiator.createDynamicSession is called
     */
    String SETTING_DYNAMIC_SESSION = "DynamicSession";

}

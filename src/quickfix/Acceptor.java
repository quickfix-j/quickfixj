/****************************************************************************
 ** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
 **
 ** This file is part of the QuickFIX FIX Engine
 **
 ** This file may be distributed under the terms of the quickfixengine.org
 ** license as defined by quickfixengine.org and appearing in the file
 ** LICENSE included in the packaging of this file.
 **
 ** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 ** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 **
 ** See http://www.quickfixengine.org/LICENSE for licensing information.
 **
 ** Contact ask@quickfixengine.org if any conditions of this licensing are
 ** not clear to you.
 **
 ****************************************************************************/

package quickfix;

/**
 * Accepts connections from FIX clients and manages the associated sessions.
 */
public interface Acceptor {

    /**
     * Start accepting connections. Returns immediately. See implementations of
     * this interface potential threading issues.
     * 
     * @throws ConfigError
     *             Problem with acceptor configuration.
     * @throws RuntimeError
     *             Other unspecified error
     */
    void start() throws ConfigError, RuntimeError;

    /**
     * Logout existing sessions, close their connections, and stop accepting new
     * connections.
     *  
     */
    void stop();

    /**
     * Start accepting connections. This method blocks until stop is called from
     * another thread.
     * 
     * @throws ConfigError
     *             Problem with acceptor configuration.
     * @throws RuntimeError
     *             Other unspecified error
     */
    void block() throws ConfigError, RuntimeError;

    /**
     * Processes a single event which could either a connection attempt or a
     * received message.
     * 
     * @return false if stopped, true if still active.
     * @throws ConfigError
     *             Problem with acceptor configuration.
     * @throws RuntimeError
     *             Other unspecified error
     */
    boolean poll() throws ConfigError, RuntimeError;
}
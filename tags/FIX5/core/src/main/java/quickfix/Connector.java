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

import java.util.ArrayList;

/**
 * Common base interface for acceptors and initiators.
 */
public interface Connector {
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
     * Stops all sessions, optionally waiting for logout completion.
     * @param force don't wait for logout before disconnect.
     */
    public void stop(boolean force);

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
     * Checks the logged on status of the session.
     * @return true is any session is logged on, false otherwise.
     */
    boolean isLoggedOn();
    
    /**
     * Returns the sessions managed by this acceptor.
     * @return the sessions associated with this acceptor
     */
    ArrayList<SessionID> getSessions();
}

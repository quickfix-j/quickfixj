/*============================================================================
 *
 * Copyright (c) 2000-2006 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

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
    
    /**
     * Checks the logged on status of the session.
     * @return true is any session is logged on, false otherwise.
     */
    boolean isLoggedOn();
    
    /**
     * Returns the sessions managed by this acceptor.
     * @return the sessions associated with this acceptor
     */
    ArrayList getSessions();
}

/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX/J FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixj.org 
 * license as defined by quickfixj.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixj.org/LICENSE for licensing information. 
 * 
 ******************************************************************************/

package org.quickfixj.jmx.mbean.connector;

import java.io.IOException;

import javax.management.openmbean.TabularData;

public interface ConnectorAdminMBean {
    /**
     * The connection role.
     * @return "ACCEPTOR" if acceptor, "INITIATOR" if initiator.
     */
    String getRole() throws IOException;
    
    /**
     * Stop the connector.
     * @param force don't wait for normal logout from counterparty
     */
    void stop(boolean force) throws IOException;

    /**
     * Stop the connector after waiting for logouts.
     */
    void stop() throws IOException;

    /**
     * Get all session who may be connected through this connector.
     * @return an array of MBean object names for the sessions.
     */
    TabularData getSessions() throws IOException;
    
    /**
     * Get the host name of the connector.
     * @return the name of the connector host
     * @throws IOException
     */
    String  getHostName() throws IOException;
    
    /**
     * The size of the underlying event queue
     * 
     * @return size of the queue; if this counters grows, the application does not consume FIX message quick enough
     */
    int getQueueSize();
}

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

import javax.management.openmbean.TabularData;

public interface ConnectorAdminMBean {
    /**
     * The connection role.
     * @return "ACCEPTOR" if acceptor, "INITIATOR" if initiator.
     */
    String getRole();
    
    /**
     * Stop the connector.
     * @param force don't wait for normal logout from counterparty
     */
    void stop(boolean force);

    /**
     * Stop the connector after waiting for logouts.
     */
    void stop();

    /**
     * Get all session who may be connected through this connector.
     * @return an array of MBean object names for the sessions.
     */
    TabularData getSessions();
    
    String  getHostName();
}

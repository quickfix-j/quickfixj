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

package org.quickfixj.jmx.mbean.session;

import quickfix.SessionNotFound;

import java.io.IOException;

import javax.management.ObjectName;

/**
 * This MBean provides the ability monitor session settings and to
 * change some of them.
 */
public interface SessionAdminMBean {

    /**
     * Get the begin string (FIX version) for the session
     * 
     * @return the begin string for the session
     */
    String getBeginString();

    /**
     * Get the target company ID for the session.
     * 
     * @return the target company ID
     */
    String getTargetCompID();

    /**
     * Get the target subID for the session.
     * 
     * @return the target subID
     */
    String getTargetSubID();

    /**
     * Get the target location ID for the session.
     * 
     * @return the target location ID
     */
    String getTargetLocationID();

    /**
     * Get the sender company ID for the session.
     * 
     * @return the sender company ID
     */
    String getSenderCompID();

    /**
     * Get the sender company subID for the session.
     * 
     * @return the sender subID
     */
    String getSenderSubID();

    /**
     * Get the sender company location ID for the session.
     * 
     * @return the sender location ID
     */
    String getSenderLocationID();

    /**
     * Get the session ID.
     * @return the session ID
     */
    String getSessionID();
    
    /**
     * Get the next sender message sequence number. 
     * 
     * @return the next sender message sequence number
     * @throws IOException 
     */
    int getNextSenderMsgSeqNum() throws IOException;

    /**
     * Set the next sender message sequence number. It's dangerous
     * to use this operation on an active session.
     * 
     * @param next next sender message sequence number
     * @throws IOException 
     */
    void setNextSenderMsgSeqNum(int next) throws IOException;

    /**
     * Get the next target message sequence number. 
     * 
     * @return next target message sequence number
     */
    int getNextTargetMsgSeqNum() throws IOException;

    /**
     * Set the next target message sequence number. It's dangerous
     * to use this operation on an active session.
     * 
     * @param next the next target message sequence number
     * @throws IOException 
     */
    void setNextTargetMsgSeqNum(int next) throws IOException;

    boolean isLogonSent();

    boolean isLogonReceived();

    boolean isLogonAlreadySent();

    boolean isLogonSendNeeded();

    boolean isLogonTimedOut();

    boolean isLogoutSent();

    boolean isLogoutReceived();

    boolean isLogoutTimedOut();

    void setLogoutTimeout(int seconds);

    void setLogonTimeout(int seconds);

    int getLogoutTimeout();

    int getLogonTimeout();

    boolean isLoggedOn();

    boolean getRedundantResendRequestsAllowed();
    
    String getLogClassName();
    
    String getMessageFactoryClassName();
    
    String getMessageStoreClassName();
    
    // TODO JMX Add schedule support
    //String getSchedule();

    boolean isUsingDataDictionary();
    
    boolean getCheckCompID();

    boolean getRefreshOnLogon();

    boolean getResetOnLogout();

    boolean getResetOnDisconnect();

    /**
     * Reset the session's sequence numbers and clear it's resend log.
     * @throws IOException 
     */
    void reset() throws IOException;

    /**
     * Tell the session to logoff.
     */
    void logoff();

    /**
     * Tell the session to logon.
     */
    void logon();

    /** Reset current sequence number */
    void resetSequence(int nextSeqNum) throws SessionNotFound;

    /**
     * Tell the session to disconnect (implies logoff)
     * @throws IOException
     */
    void disconnect() throws IOException;
    
    boolean getEnabled();
    
    String getStartTime();
    
    String getConnectionRole();
    
    ObjectName getConnectorName();
}

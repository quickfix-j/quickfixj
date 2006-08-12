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
 * This exception causes a logon to be rejected with a forced logout and immediate disconnect.
 */
public class RejectLogon extends Exception {

    private final boolean logoutBeforeDisconnect;

    public RejectLogon() {
        this(null, true);
    }

    /**
     * @param msg text to print to session event log
     */
    public RejectLogon(String msg) {
        this(msg, true);
    }

    /**
     * @param msg text to print to session event log
     * @param logoutBeforeDisconnect controls whether a logout is sent 
     * before the disconnect, defaults to true.
     */
    public RejectLogon(String msg, boolean logoutBeforeDisconnect) {
        super(msg);
        this.logoutBeforeDisconnect = logoutBeforeDisconnect;
    }
    
    public boolean isLogoutBeforeDisconnect() {
        return logoutBeforeDisconnect ;
    }
}
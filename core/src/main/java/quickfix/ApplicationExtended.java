/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
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
 * Contact ask@quickfixj.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix;

/**
 * Extended Application features
 * 
 * @author phgiraud 6 janv. 2009
 */
public interface ApplicationExtended extends Application {

    /**
     * If returns false, the session logon is aborted, without sending any logon.
     * 
     * @param sessionID
     *            the session
     * @return true if the session can be logged on normally
     */
    boolean canLogon(SessionID sessionID);


    /**
     * This method is called before reset a session to allow business application to do some
     * actions(typically sending notification message to client before end of day)
     *
     * @param sessionID
     */
    void onBeforeSessionReset(SessionID sessionID);
}

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
     * @param sessionID the session
     * @return true if the session can be logged on normally
     */
    boolean canLogon(SessionID sessionID);

    /**
     * Called by {@link Session#reset()} before resetting the session, including when the
     * session is not logged on. The message store has not yet been reset, allowing the
     * application to inspect its contents. If logged on, this callback runs before the
     * Logout request is sent.
     *
     * @param sessionID the session being reset
     */
    void onBeforeSessionReset(SessionID sessionID);
}

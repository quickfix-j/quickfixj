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

package quickfix.mina.acceptor;

import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.SessionConnector;

/**
 * Provides sessions to be served on an acceptor. This supports the
 * ability to create dynamic acceptor sessions.
 */
public interface AcceptorSessionProvider {
    /**
     * Return a session for this sessionID. The session might be
     * created dynamically.
     * 
     * @param sessionID
     * @return the associated session or null if no session can be
     * associated with the given ID.
     */
    Session getSession(SessionID sessionID, SessionConnector connector);
}

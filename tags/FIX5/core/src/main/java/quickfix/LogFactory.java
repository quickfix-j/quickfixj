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
 * Used by a session to create a log implementation.
 */
public interface LogFactory {
    /**
     * Create a log using default/global settings.
     * @deprecated This method is not needed by QFJ and is generally not implemented.
     * @return the log implementation
     */
    Log create();

    /**
     * Create a log implementation.
     * 
     * @param sessionID
     *            session ID usually used for configuration access
     * @return the log implementation
     */
    Log create(SessionID sessionID);

}
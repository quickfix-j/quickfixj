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
 * Session log for messages and events.
 */
public interface Log {
    /**
     * Clears the log and removes any persistent log data.
     *
     */
    void clear();
    
    /**
     * Logs an incoming message
     * 
     * @param message
     *            the raw FIX message string
     */
    void onIncoming(String message);

    /**
     * Logs an outgoing message
     * 
     * @param message
     *            the raw FIX message string
     */
    void onOutgoing(String message);

    /**
     * Logs a session event.
     * 
     * @param text
     *            the event description
     */
    void onEvent(String text);    

    /**
     * Logs an session error event.
     * 
     * @param text
     *            the event description
     */
    void onErrorEvent(String text);

}
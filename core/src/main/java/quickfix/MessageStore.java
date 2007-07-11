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

import java.util.Collection;
import java.util.Date;
import java.io.IOException;

/**
 * Used by a Session to store and retrieve messages for resend purposes.
 * 
 * @see quickfix.Session
 */
public interface MessageStore {
    /**
     * Adds a raw fix messages to the store with the given sequence number.
     * (Most implementations just append the message data to the store so be
     * careful about assuming random access behavior.)
     * 
     * @param sequence
     *            the sequence number
     * @param message
     *            the raw FIX message string
     * @return true is successful, false otherwise
     * @throws IOException
     *             IO error
     */
    boolean set(int sequence, String message) throws IOException;

    /**
     * Get messages within sequence number range (inclusive). Used for message
     * resend requests.
     * 
     * @param startSequence
     *            the starting message sequence number.
     * @param endSequence
     *            the ending message sequence number.
     * @param messages
     *            the retrieved messages (out parameter)
     * @throws IOException
     *             IO error
     */
    void get(int startSequence, int endSequence, Collection<String> messages) throws IOException;

    int getNextSenderMsgSeqNum() throws IOException;

    int getNextTargetMsgSeqNum() throws IOException;

    void setNextSenderMsgSeqNum(int next) throws IOException;

    void setNextTargetMsgSeqNum(int next) throws IOException;

    void incrNextSenderMsgSeqNum() throws IOException;

    void incrNextTargetMsgSeqNum() throws IOException;

    /**
     * Get the session creation time.
     * 
     * @return the session creation time.
     * @throws IOException
     *             IO error
     */
    Date getCreationTime() throws IOException;

    /**
     * Reset the message store. Sequence numbers are set back to 1 and stored
     * messages are erased. The session creation time is also set to the time of
     * the reset.
     * 
     * @throws IOException
     *             IO error
     */
    void reset() throws IOException;
    
    /**
     * Refresh session state from a <em>shared</em> state storage (e.g. database,
     * file, ...). Refresh will not work for message stores without shared state 
     * (e.g., MemoryStore). These stores should log an session error, at a minimum,
     * or throw an exception.
     */
    void refresh() throws IOException;
}
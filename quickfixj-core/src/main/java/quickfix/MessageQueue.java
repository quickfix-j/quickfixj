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
 * Used by a Session to store and retrieve messages with a sequence number higher than expected.
 *
 * @see quickfix.Session
 */
interface MessageQueue {

    /**
     * Enqueue a message.
     *
     * @param sequence the sequence number
     * @param message  the FIX message
     */
    void enqueue(int sequence, Message message);

    /**
     * Dequeue a message with given sequence number.
     *
     * @param sequence the sequence number
     * @return message the FIX message
     */
    Message dequeue(int sequence);

    /**
     * Remove messages from queue up to a given sequence number.
     *
     * @param seqnum up to which sequence number messages should be deleted
     */
    default void dequeueMessagesUpTo(int seqnum) {
        for (int i = 1; i < seqnum; i++) {
            dequeue(i);
        }
    }

    /**
     * Clear the queue.
     */
    void clear();
}

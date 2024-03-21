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

import org.apache.mina.core.write.WriteRequestQueue;

import java.util.List;

/**
 * Used by a Session to send raw FIX message data and to disconnect a
 * connection. This interface is used by Acceptor or Initiator implementations.
 *
 * @see quickfix.Session
 * @see quickfix.Acceptor
 * @see quickfix.Initiator
 */
public interface Responder {

    /**
     * Send a raw FIX message
     *
     * @param data the raw FIX message data
     * @return true is successful, false if send operation failed
     */
    boolean send(String data);

   /**
    * Override to prioritize raw FIX {@code messages} over pending messages in the {@link WriteRequestQueue}.
    * Typical use case is when sending response for resend request to ensure that the counterparty
    * first catches up before receiving(or being overwhelmed by) latter messages.
    *
    * @param messages List of raw FIX messages to be prioritized in that order over all pending sends
    * @return count of entries in {@code messages} list that were successfully scheduled
    */
    default int prioritySend(List<String> messages){
        throw new UnsupportedOperationException("Priority send not supported");
    }

    /**
     * Disconnect the underlying connection.
     */
    void disconnect();

    /**
     * Provides remote address of the session connection, if any.
     *
     * @return remote address (host:port) if connected, null if not.
     */
    String getRemoteAddress();
}

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

package quickfix.mina;

import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;

/**
 * An interface implemented by various FIX event handling strategies. Currently,
 * it only handles message reception events.
 */
public interface EventHandlingStrategy {

    /**
     * Constant indicating how long we wait for an incoming message. After
     * thread has been asked to stop, it can take up to this long to terminate.
     */
    static final long THREAD_WAIT_FOR_MESSAGE_MS = 250;

    // will be put to the eventQueue to signal a disconnection
    public static final Message END_OF_STREAM = new Message();

    void onMessage(Session quickfixSession, Message message);

    /**
     * @return the SessionConnector associated with this strategy
     */
    SessionConnector getSessionConnector();

    int getQueueSize();

    int getQueueSize(SessionID sessionID);
}

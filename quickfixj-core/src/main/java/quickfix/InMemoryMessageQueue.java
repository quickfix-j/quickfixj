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

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An in-memory implementation of MessageQueue.
 * It uses a linked hash map as a backing map.
 *
 * @see MessageQueue
 */
public class InMemoryMessageQueue implements MessageQueue {

    // The map should be accessed from a single thread
    private final Map<Integer, Message> backingMap = new LinkedHashMap<>();

    @Override
    public void enqueue(int sequence, Message message) {
        backingMap.put(sequence, message);
    }

    @Override
    public Message dequeue(int sequence) {
        return backingMap.remove(sequence);
    }

    @Override
    public void clear() {
        backingMap.clear();
    }

    // used in tests
    Map<Integer, Message> getBackingMap() {
        return backingMap;
    }
}

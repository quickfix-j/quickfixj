/*
 ******************************************************************************
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

/**
 * No-op message store implementation.
 *
 * @see quickfix.MemoryStoreFactory
 */
public class NoopStore implements MessageStore {

    private Date creationTime = new Date();
    private int nextSenderMsgSeqNum = 1;
    private int nextTargetMsgSeqNum = 1;

    public void get(int startSequence, int endSequence, Collection<String> messages) {
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public int getNextSenderMsgSeqNum() {
        return nextSenderMsgSeqNum;
    }

    public int getNextTargetMsgSeqNum() {
        return nextTargetMsgSeqNum;
    }

    public void incrNextSenderMsgSeqNum() {
        nextSenderMsgSeqNum++;
    }

    public void incrNextTargetMsgSeqNum() {
        nextTargetMsgSeqNum++;
    }

    public void reset() {
        creationTime = new Date();
        nextSenderMsgSeqNum = 1;
        nextTargetMsgSeqNum = 1;
    }

    public boolean set(int sequence, String message) {
        return true;
    }

    public void setNextSenderMsgSeqNum(int next) {
        nextSenderMsgSeqNum = next;
    }

    public void setNextTargetMsgSeqNum(int next) {
        nextTargetMsgSeqNum = next;
    }

    public void refresh() {
    }
}

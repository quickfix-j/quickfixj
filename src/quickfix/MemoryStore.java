/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public class MemoryStore implements MessageStore {
	private HashMap messages = new HashMap();
	private int nextSenderMsgSeqNum;
	private int nextTargetMsgSeqNum;
	private Calendar creationTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

	public MemoryStore() {
	    reset();
	}
	
	public void get(int startSequence, int endSequence, Collection messages)
			throws IOException {
		for (int i = startSequence; i <= endSequence; i++) {
			String message = (String)this.messages.get(new Integer(i));
			if (message != null) {
				messages.add(message);
			}
		}
	}

	public Date getCreationTime() {
		return creationTime.getTime();
	}

    public void setCreationTime(Calendar creationTime) {
        this.creationTime = creationTime;
    }
    
	public int getNextSenderMsgSeqNum() {
		return nextSenderMsgSeqNum;
	}

	public int getNextTargetMsgSeqNum() {
		return nextTargetMsgSeqNum;
	}

	public void incrNextSenderMsgSeqNum() {
		setNextSenderMsgSeqNum(getNextSenderMsgSeqNum()+1);
	}

	public void incrNextTargetMsgSeqNum() {
		setNextTargetMsgSeqNum(getNextTargetMsgSeqNum()+1);
	}

	public void reset() {
		setNextSenderMsgSeqNum(1);
		setNextTargetMsgSeqNum(1);
		messages.clear();
		creationTime = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	}

	public boolean set(int sequence, String message) {
		return messages.put(new Integer(sequence), message) == null;
	}

	public void setNextSenderMsgSeqNum(int next) {
		nextSenderMsgSeqNum = next;
	}

	public void setNextTargetMsgSeqNum(int next) {
		nextTargetMsgSeqNum = next;
	}
}
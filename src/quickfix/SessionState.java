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

import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

/**
 * Used by the session communications code. Not intended to be used by
 * applications.
 */
public class SessionState {
    private Log log;
    private boolean connected;
    private boolean logonReceived;
    private boolean logoutSent;
    private boolean logonSent;
    private boolean initiator;
    private int logonTimeout;
    private int testRequestCounter;
    private MessageStore messageStore;
    private long lastSentTime;
    private long lastReceivedTime;
    private boolean logonAlreadySent;
    private boolean logonTimedOut;
    private boolean logoutTimedOut;
    private boolean withinHeartBeat;
    private long heartbeatMillis = Long.MAX_VALUE;
    private int heartBeatInterval;
    private HashMap messageQueue = new HashMap();
    private int[] resendRange = new int[]{ 0, 0 };
    private boolean resetSent;
    private boolean resetReceived;
    private String logoutReason;
    
    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public int getHeartBeatInterval() {
        return heartBeatInterval;
    }

    public void setHeartBeatInterval(int heartBeatInterval) {
        this.heartBeatInterval = heartBeatInterval;
        heartbeatMillis = heartBeatInterval * 1000L;
    }

    public boolean isHeartBeatNeeded() {
        long millisSinceLastSentTime = SystemTime.currentTimeMillis() - getLastSentTime();
        return millisSinceLastSentTime >= heartbeatMillis && getTestRequestCounter() == 0;
    }

    public boolean isInitiator() {
        return initiator;
    }

    public void setInitiator(boolean initiator) {
        this.initiator = initiator;
    }

    public long getLastReceivedTime() {
        return lastReceivedTime;
    }

    public void setLastReceivedTime(long lastReceivedTime) {
        this.lastReceivedTime = lastReceivedTime;
    }

    public long getLastSentTime() {
        return lastSentTime;
    }

    public void setLastSentTime(long lastSentTime) {
        this.lastSentTime = lastSentTime;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public boolean isLogonAlreadySent() {
        return logonAlreadySent;
    }

    public void setLogonAlreadySent(boolean logonAlreadySent) {
        this.logonAlreadySent = logonAlreadySent;
    }

    public boolean isLogonReceived() {
        return logonReceived;
    }

    public void setLogonReceived(boolean logonReceived) {
        this.logonReceived = logonReceived;
    }

    public boolean isLogonSendNeeded() {
        return isInitiator() && !isLogonSent();
    }

    public boolean isLogonSent() {
        return logonSent;
    }

    public void setLogonSent(boolean logonSent) {
        this.logonSent = logonSent;
    }

    public boolean isLogonTimedOut() {
        return logonTimedOut;
    }

    public void setLogonTimedOut(boolean logonTimedOut) {
        this.logonTimedOut = logonTimedOut;
    }

    public int getLogonTimeout() {
        return logonTimeout;
    }

    public void setLogonTimeout(int logonTimeout) {
        this.logonTimeout = logonTimeout;
    }

    public boolean isLogoutSent() {
        return logoutSent;
    }

    public void setLogoutSent(boolean logoutSent) {
        this.logoutSent = logoutSent;
    }

    public boolean isLogoutTimedOut() {
        return logoutTimedOut;
    }

    public void setLogoutTimedOut(boolean logoutTimedOut) {
        this.logoutTimedOut = logoutTimedOut;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public int getTestRequestCounter() {
        return testRequestCounter;
    }

    public void clearTestRequestCounter() {
        testRequestCounter = 0;
    }

    public void incrementTestRequestCounter() {
        testRequestCounter++;
    }

    public boolean isTestRequestNeeded() {
        long millisSinceLastReceivedTime = timeSinceLastReceivedMessage();
        return millisSinceLastReceivedTime >= (1.5 * (getTestRequestCounter() + 1))
                * heartbeatMillis;
    }

    private long timeSinceLastReceivedMessage() {
        return SystemTime.currentTimeMillis() - getLastReceivedTime();
    }

    public boolean isTimedOut() {
        long millisSinceLastReceivedTime = timeSinceLastReceivedMessage();
        return millisSinceLastReceivedTime >= 2.4 * heartbeatMillis;
    }

    public boolean isWithinHeartBeat() {
        return withinHeartBeat;
    }

    public void setWithinHeartBeat(boolean withinHeartBeat) {
        this.withinHeartBeat = withinHeartBeat;
    }

    public boolean set(int sequence, String message) throws IOException {
        return messageStore.set(sequence, message);
    }

    public void get(int first, int last, Collection messages) throws IOException {
        messageStore.get(first, last, messages);
    }

    public void enqueue(int sequence, Message message) {
        messageQueue.put(new Integer(sequence), message);
    }

    public Message dequeue(int sequence) {
        return (Message) messageQueue.get(new Integer(sequence));
    }

    public void clearQueue() {
        messageQueue.clear();
    }

    public int getNextSenderMsgSeqNum() throws IOException {
        return messageStore.getNextSenderMsgSeqNum();
    }

    public void setNextSenderMsgSeqNum(int sequence) throws IOException {
        messageStore.setNextSenderMsgSeqNum(sequence);
    }

    public int getNextTargetMsgSeqNum() throws IOException {
        return messageStore.getNextTargetMsgSeqNum();
    }

    public void setNextTargetMsgSeqNum(int sequence) throws IOException {
        messageStore.setNextTargetMsgSeqNum(sequence);
    }

    public void incrNextSenderMsgSeqNum() throws IOException {
        messageStore.incrNextSenderMsgSeqNum();
    }

    public void incrNextTargetMsgSeqNum() throws IOException {
        messageStore.incrNextTargetMsgSeqNum();
    }

    public Date getCreationTime() throws IOException {
        return messageStore.getCreationTime();
    }

    public void resetMessageStore() throws IOException {
        messageStore.reset();
    }

    public void logIncoming(String s) {
        log.onIncoming(s);
    }

    public void logOutgoing(String s) {
        log.onOutgoing(s);
    }

    public void logEvent(String s) {
        log.onEvent(s);
    }

    public void reset() {
        try {
            messageStore.reset();
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    public void setResendRange(int low, int high) {
        resendRange[0] = low;
        resendRange[1] = high;
    }
    
    public boolean isResendRequested() {
        return !(resendRange[0] == 0 && resendRange[1] == 0);
    }

    public int[] getResendRange() {
        return resendRange;
    }

    public boolean isResetReceived() {
        return resetReceived;
    }

    public void setResetReceived(boolean resetReceived) {
        this.resetReceived = resetReceived;
    }

    public boolean isResetSent() {
        return resetSent;
    }

    public void setResetSent(boolean resetSent) {
        this.resetSent = resetSent;
    }

    public void setLogoutReason(String reason) {
        logoutReason = reason;
    }
    
    public String getLogoutReason() {
        return logoutReason;
    }

    public void clearLogoutReason() {
        logoutReason = "";
    }
}
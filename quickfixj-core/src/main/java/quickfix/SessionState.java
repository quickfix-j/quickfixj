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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Used by the session communications code. Not intended to be used by applications. All dynamic data is protected by
 * the session's intrinsic lock. The log and message store implementation must be thread safe.
 */
public final class SessionState {
    private final Object lock;
    private final Log log;

    // MessageStore implementation must be thread safe
    private final MessageStore messageStore;

    private final Lock senderMsgSeqNumLock = new ReentrantLock();
    private final Lock targetMsgSeqNumLock = new ReentrantLock();

    private final boolean initiator;

    private long logonTimeoutMs = 10000L;
    private long logoutTimeoutMs = 2000L;

    private boolean logonSent;
    private boolean logonReceived;
    private boolean logoutSent;
    private boolean logoutReceived = false;
    private int testRequestCounter;
    private long lastSentTime;
    private long lastReceivedTime;
    private double testRequestDelayMultiplier;
    private long heartBeatMillis = Long.MAX_VALUE;
    private int heartBeatInterval;

    private final ResendRange resendRange = new ResendRange();
    private boolean resetSent;
    private boolean resetReceived;
    private String logoutReason;

    /*
     * If this is anything other than zero it's the value of the 789/NextExpectedMsgSeqNum tag in the last Logon message sent.
     * It is used to determine if the recipient has enough information (assuming they support 789) to avoid the need
     * for a resend request i.e. they should be resending any necessary missing messages already. This value is used
     * to populate the resendRange if necessary.
     */
    private final AtomicInteger nextExpectedMsgSeqNum = new AtomicInteger(0);

    // The messageQueue should be accessed from a single thread
    private final Map<Integer, Message> messageQueue = new LinkedHashMap<Integer, Message>();

    public SessionState(Object lock, Log log, int heartBeatInterval, boolean initiator, MessageStore messageStore,
            double testRequestDelayMultiplier) {
        this.lock = lock;
        this.initiator = initiator;
        this.messageStore = messageStore;
        setHeartBeatInterval(heartBeatInterval);
        this.log = log == null ? new NullLog() : log;
        this.testRequestDelayMultiplier = testRequestDelayMultiplier;
    }

    public int getHeartBeatInterval() {
        synchronized (lock) {
            return heartBeatInterval;
        }
    }

    public void setHeartBeatInterval(int heartBeatInterval) {
        synchronized (lock) {
            this.heartBeatInterval = heartBeatInterval;
        }
        setHeartBeatMillis(heartBeatInterval * 1000L);
    }

    private void setHeartBeatMillis(long heartBeatMillis) {
        synchronized (lock) {
            this.heartBeatMillis = heartBeatMillis;
        }
    }

    long getHeartBeatMillis() {
        synchronized (lock) {
            return heartBeatMillis;
        }
    }

    public boolean isHeartBeatNeeded() {
        long millisSinceLastSentTime = SystemTime.currentTimeMillis() - getLastSentTime();
        // QFJ-448: allow 10 ms leeway since exact comparison causes skipped heartbeats occasionally
        return millisSinceLastSentTime + 10 > getHeartBeatMillis() && getTestRequestCounter() == 0;
    }

    public boolean isInitiator() {
        return initiator;
    }

    public long getLastReceivedTime() {
        synchronized (lock) {
            return lastReceivedTime;
        }
    }

    public void setLastReceivedTime(long lastReceivedTime) {
        synchronized (lock) {
            this.lastReceivedTime = lastReceivedTime;
        }
    }

    public long getLastSentTime() {
        synchronized (lock) {
            return lastSentTime;
        }
    }

    public void setLastSentTime(long lastSentTime) {
        synchronized (lock) {
            this.lastSentTime = lastSentTime;
        }
    }

    public Log getLog() {
        return log;
    }

    public boolean isLogonAlreadySent() {
        return isInitiator() && isLogonSent();
    }

    public boolean isLogonReceived() {
        synchronized (lock) {
            return logonReceived;
        }
    }

    public void setLogonReceived(boolean logonReceived) {
        synchronized (lock) {
            this.logonReceived = logonReceived;
        }
    }

    public boolean isLogonSendNeeded() {
        return isInitiator() && !isLogonSent();
    }

    public boolean isLogonSent() {
        synchronized (lock) {
            return logonSent;
        }
    }

    public void setLogonSent(boolean logonSent) {
        synchronized (lock) {
            this.logonSent = logonSent;
        }
    }

    public boolean isLogonTimedOut() {
        synchronized (lock) {
            return isLogonSent() && SystemTime.currentTimeMillis() - getLastReceivedTime() >= getLogonTimeoutMs();
        }
    }

    public void setLogonTimeout(int logonTimeout) {
        setLogonTimeoutMs(logonTimeout * 1000L);
    }

    public int getLogonTimeout() {
        return (int) (getLogonTimeoutMs() / 1000L);
    }

    public void setLogoutTimeout(int logoutTimeout) {
        setLogoutTimeoutMs(logoutTimeout * 1000L);
    }

    public int getLogoutTimeout() {
        return (int) (getLogoutTimeoutMs() / 1000L);
    }

    private void setLogoutTimeoutMs(long logoutTimeoutMs) {
        synchronized (lock) {
            this.logoutTimeoutMs = logoutTimeoutMs;
        }
    }

    private long getLogoutTimeoutMs() {
        synchronized (lock) {
            return logoutTimeoutMs;
        }
    }

    private void setLogonTimeoutMs(long logonTimeoutMs) {
        synchronized (lock) {
            this.logonTimeoutMs = logonTimeoutMs;
        }
    }

    private long getLogonTimeoutMs() {
        synchronized (lock) {
            return logonTimeoutMs;
        }
    }

    public boolean isLogoutSent() {
        synchronized (lock) {
            return logoutSent;
        }
    }

    public void setLogoutSent(boolean logoutSent) {
        synchronized (lock) {
            this.logoutSent = logoutSent;
        }
    }

    public boolean isLogoutReceived() {
        synchronized (lock) {
            return logoutReceived;
        }
    }

    public void setLogoutReceived(boolean logoutReceived) {
        synchronized (lock) {
            this.logoutReceived = logoutReceived;
        }
    }

    public boolean isLogoutTimedOut() {
        return isLogoutSent() && ((SystemTime.currentTimeMillis() - getLastSentTime()) >= getLogoutTimeoutMs());
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    private int getTestRequestCounter() {
        synchronized (lock) {
            return testRequestCounter;
        }
    }

    public double getTestRequestDelayMultiplier() {
        return testRequestDelayMultiplier;
    }

    public void clearTestRequestCounter() {
        synchronized (lock) {
            testRequestCounter = 0;
        }
    }

    public void incrementTestRequestCounter() {
        synchronized (lock) {
            testRequestCounter++;
        }
    }

    public boolean isTestRequestNeeded() {
        long millisSinceLastReceivedTime = timeSinceLastReceivedMessage();
        return millisSinceLastReceivedTime >= ((1 + testRequestDelayMultiplier) * (getTestRequestCounter() + 1))
                * getHeartBeatMillis();
    }

    private long timeSinceLastReceivedMessage() {
        return SystemTime.currentTimeMillis() - getLastReceivedTime();
    }

    public boolean isTimedOut() {
        long millisSinceLastReceivedTime = timeSinceLastReceivedMessage();
        return millisSinceLastReceivedTime >= 2.4 * getHeartBeatMillis();
    }

    public boolean set(int sequence, String message) throws IOException {
        return messageStore.set(sequence, message);
    }

    public void get(int first, int last, Collection<String> messages) throws IOException {
        messageStore.get(first, last, messages);
    }

    public void enqueue(int sequence, Message message) {
        messageQueue.put(sequence, message);
    }

    public Message dequeue(int sequence) {
        return messageQueue.remove(sequence);
    }

    /**
     * Remove messages from messageQueue up to a given sequence number.
     * @param seqnum up to which sequence number messages should be deleted
     */
    public void dequeueMessagesUpTo(int seqnum) {
        for (int i = 1; i < seqnum; i++) {
            dequeue(i);
        }
    }

    public Message getNextQueuedMessage() {
        return messageQueue.size() > 0 ? messageQueue.values().iterator().next() : null;
    }

    public Collection<Integer> getQueuedSeqNums() {
        return messageQueue.keySet();
    }

    public void clearQueue() {
        messageQueue.clear();
    }

    public void lockSenderMsgSeqNum() {
        senderMsgSeqNumLock.lock();
    }

    public void unlockSenderMsgSeqNum() {
        senderMsgSeqNumLock.unlock();
    }

    public void lockTargetMsgSeqNum() {
        targetMsgSeqNumLock.lock();
    }

    public void unlockTargetMsgSeqNum() {
        targetMsgSeqNumLock.unlock();
    }

    public int getNextSenderMsgSeqNum() throws IOException {
        return messageStore.getNextSenderMsgSeqNum();
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

    public boolean isResetNeeded() throws IOException {
        return getNextSenderMsgSeqNum() != 1 || getNextTargetMsgSeqNum() != 1;
    }

    public void reset() {
        try {
            messageStore.reset();
        } catch (IOException e) {
            throw new RuntimeError(e);
        }
    }

    public void setResendRange(int low, int high) {
        synchronized (lock) {
            resendRange.setBeginSeqNo(low);
            resendRange.setEndSeqNo(high);
        }
    }

    public void setResendRange(int low, int high, int currentResend) {
        synchronized (lock) {
            resendRange.setBeginSeqNo(low);
            resendRange.setEndSeqNo(high);
            resendRange.setCurrentEndSeqNo(currentResend);
        }
    }

    public boolean isResendRequested() {
        synchronized (lock) {
            return !(resendRange.getBeginSeqNo() == 0 && resendRange.getEndSeqNo() == 0);
        }
    }

    public ResendRange getResendRange() {
        synchronized (lock) {
            return resendRange;
        }
    }

    public boolean isResetReceived() {
        synchronized (lock) {
            return resetReceived;
        }
    }

    public void setResetReceived(boolean resetReceived) {
        synchronized (lock) {
            this.resetReceived = resetReceived;
        }
    }

    public boolean isResetSent() {
        synchronized (lock) {
            return resetSent;
        }
    }

    public void setResetSent(boolean resetSent) {
        synchronized (lock) {
            this.resetSent = resetSent;
        }
    }

    /**
     * No actual resend request has occurred but at logon we populated tag 789 so that the other side knows we
     * are missing messages without an explicit resend request and should immediately reply with the missing
     * messages.
     *
     * This is expected to be called only in the scenario where target is too high on logon and tag 789 is supported.
     */
    public void setResetRangeFromLastExpectedLogonNextSeqNumLogon() {
        synchronized (lock) {
            // we have already requested all msgs from nextExpectedMsgSeqNum to infinity
            setResendRange(getLastExpectedLogonNextSeqNum(), 0);
            // clean up the variable (not really needed)
            setLastExpectedLogonNextSeqNum(0);
        }
    }

    /**
     * @param lastExpectedLogonNextSeqNum
     *
     * This method is thread safe (atomic set).
     */
    public void setLastExpectedLogonNextSeqNum(int lastExpectedLogonNextSeqNum) {
        this.nextExpectedMsgSeqNum.set(lastExpectedLogonNextSeqNum);
    }

    /**
     * @return nextExpectedMsgSeqNum
     *
     * This method is thread safe (atomic get).
     */
    public int getLastExpectedLogonNextSeqNum() {
        return this.nextExpectedMsgSeqNum.get();
    }

    /**
     * @return true if we populated tag 789 at logon and our sequence
     * numbers don't line up we are in an implicit resend mode.
     *
     * This method is thread safe (atomic get).
     */
    public boolean isExpectedLogonNextSeqNumSent() {
        return this.nextExpectedMsgSeqNum.get() != 0;
    }

    public void setLogoutReason(String reason) {
        synchronized (lock) {
            logoutReason = reason;
        }
    }

    public String getLogoutReason() {
        synchronized (lock) {
            return logoutReason;
        }
    }

    public void clearLogoutReason() {
        synchronized (lock) {
            logoutReason = "";
        }
    }

    public Object getLock() {
        return lock;
    }

    private final static class NullLog implements Log {
        public void onOutgoing(String message) {
        }

        public void onIncoming(String message) {
        }

        public void onEvent(String text) {
        }

        public void onErrorEvent(String text) {
        }

        public void clear() {
        }
    }

    /**
     * The resend range when sending a resend request.
     * If a gap is detected and messages from x to y are needed, the received messages are checked against the values x and y that are stored in the resendRange.
     * Some FIX engines do not support resendRequest range greater than a given value. There, in this case, the ResendRequests have to be splitted.
     * E.g.: CME will reject any resend request for more than 2500 messages.
     * The solution is to send resend requests with smaller range until the global range has been requested.
     *
     * The resendRange contains 3 values:
     * <ol>
     * <li>the begin index of the global resend request</li>
     * <li>the last index of the global resend request</li>
     * <li>the current last index of the splitted sub resend request</li>
     * </ol>
     */
    public static class ResendRange {

        int beginSeqNo = 0;
        int endSeqNo = 0;
        int currentEndSeqNo = 0;

        public int getBeginSeqNo() {
            return beginSeqNo;
        }

        public void setBeginSeqNo(int beginSeqNo) {
            this.beginSeqNo = beginSeqNo;
        }

        public int getEndSeqNo() {
            return endSeqNo;
        }

        public void setEndSeqNo(int endSeqNo) {
            this.endSeqNo = endSeqNo;
        }

        public int getCurrentEndSeqNo() {
            return currentEndSeqNo;
        }

        public void setCurrentEndSeqNo(int currentEndSeqNo) {
            this.currentEndSeqNo = currentEndSeqNo;
        }

        public boolean isChunkedResendRequest() {
            return getCurrentEndSeqNo() > 0;
        }
    }
}

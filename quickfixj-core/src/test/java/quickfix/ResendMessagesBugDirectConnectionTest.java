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

import org.apache.mina.util.AvailablePortFinder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.field.BeginSeqNo;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.EndSeqNo;
import quickfix.field.GapFillFlag;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NewSeqNo;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.mina.ProtocolFactory;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Integration test demonstrating bug #344 in {@link Session#resendMessages}.
 *
 * <p>The bug: when the last retrieved persisted message is an <em>admin</em> message,
 * the {@code newBegin} variable is not updated before
 * {@code generateSequenceResetIfNeeded} is called. As a result the method emits a
 * SequenceReset-GapFill whose {@code MsgSeqNum} equals {@code beginSeqNo} (= 1) instead
 * of the correct value (= first seqno of the trailing admin block = 6). The counterparty
 * therefore receives a SequenceReset with a "too low" {@code MsgSeqNum} and silently drops
 * it, leaving the session in a stuck state.
 *
 * <p>Scenario set up on the acceptor side (pre-populated message store):
 * <pre>
 *   seqno 1  – Logon        (admin)
 *   seqno 2  – ResendRequest (admin)
 *   seqno 3  – ExecutionReport (app)   ← triggers SequenceReset(1→3) gap-fill
 *   seqno 4  – ExecutionReport (app)   ← resent
 *   seqno 5  – Heartbeat    (admin)    ← last retrieved = admin → triggers the bug
 *   seqnos 6-10 – NOT in store
 *   NextSenderMsgSeqNum = 11
 * </pre>
 *
 * <p>When the initiator (fresh store, NextTargetSeqNum = 1) connects:
 * <ol>
 *   <li>Acceptor sends Logon(11).</li>
 *   <li>Initiator detects "too high" and sends ResendRequest(1, 0).</li>
 *   <li>Acceptor calls {@code resendMessages(1, 11)}:
 *       sends SequenceReset(1→3), ExecutionReport(3), ExecutionReport(4),
 *       SequenceReset(5→6), and — due to the bug — SequenceReset(<b>MsgSeqNum=1</b>, NewSeqNo=12).</li>
 *   <li>The correct trailing SequenceReset should have <b>MsgSeqNum=6</b>.</li>
 * </ol>
 *
 * <p>The test assertion {@code assertEquals(6, actualMsgSeqNum)} <b>fails on current code</b>
 * (gets 1) and passes once the bug is fixed.
 */
public class ResendMessagesBugDirectConnectionTest {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final SessionID acceptorSessionID = new SessionID(
            FixVersions.BEGINSTRING_FIX42, "ACCEPTOR", "INITIATOR");
    private final SessionID initiatorSessionID = new SessionID(
            FixVersions.BEGINSTRING_FIX42, "INITIATOR", "ACCEPTOR");

    // -----------------------------------------------------------------------
    // Test
    // -----------------------------------------------------------------------

    @Test
    public void testResendMessagesBugCausesTooLowMsgSeqNumInTrailingSequenceReset()
            throws Exception {

        AcceptorApplication acceptorApp = new AcceptorApplication();
        TestConnectorApplication initiatorApp = new TestConnectorApplication();

        Acceptor acceptor = null;
        Initiator initiator = null;
        try {
            final int port = AvailablePortFinder.getNextAvailable();

            acceptor = createAcceptor(acceptorApp, port);
            acceptor.start();

            initiator = createInitiator(initiatorApp, port);
            initiator.start();

            // Both sessions reach onLogon quickly because the acceptor's Logon(11)
            // is "too high" for the initiator, which still calls onLogon after
            // sending the ResendRequest.
            acceptorApp.waitForLogon();
            initiatorApp.waitForLogon();

            // Now wait for the acceptor to finish the resend triggered by the
            // initiator's ResendRequest.  The last thing it sends is the
            // trailing-gap SequenceReset that exhibits the bug.
            assertTrue("Timed out waiting for the trailing-gap SequenceReset from acceptor",
                    acceptorApp.waitForTrailingGapSeqReset(10, TimeUnit.SECONDS));

            Message trailingSeqReset = acceptorApp.getTrailingGapSeqReset();
            assertNotNull("Trailing-gap SequenceReset should have been captured", trailingSeqReset);

            final int actualMsgSeqNum = trailingSeqReset.getHeader().getInt(MsgSeqNum.FIELD);
            final int newSeqNo = trailingSeqReset.getInt(NewSeqNo.FIELD);

            log.info("Trailing SequenceReset: MsgSeqNum={}, NewSeqNo={}", actualMsgSeqNum, newSeqNo);

            // Sanity-check: this IS the trailing-gap SequenceReset (NewSeqNo > 10)
            assertTrue("Trailing SequenceReset should advance past the gap (NewSeqNo > 10), got "
                    + newSeqNo, newSeqNo > 10);

            // THE KEY ASSERTION:
            // MsgSeqNum must equal 6 (the first seqno of the trailing admin block,
            // i.e. msgSeqNum of last app message + 1 = 4 + 1 = 5, then next is 6
            // because seqno 5 is the Heartbeat gap-filled by the previous reset).
            //
            // Due to bug #344 the actual value is 1 (beginSeqNo), which is "too low"
            // for the initiator (it has already advanced to seqno 6).
            // This assertion FAILS on the current code and PASSES once the bug is fixed.
            assertEquals(
                    "Bug #344: trailing SequenceReset has MsgSeqNum=" + actualMsgSeqNum
                            + " but should be 6 (first seqno after the last resent app message). "
                            + "MsgSeqNum=1 is 'too low' for the initiator (already at seqno 6) "
                            + "causing the SequenceReset to be silently dropped.",
                    6, actualMsgSeqNum);

        } finally {
            if (initiator != null) {
                try { initiator.stop(); } catch (RuntimeException e) { log.error(e.getMessage(), e); }
            }
            if (acceptor != null) {
                try { acceptor.stop(); } catch (RuntimeException e) { log.error(e.getMessage(), e); }
            }
        }
    }

    // -----------------------------------------------------------------------
    // Connector factories
    // -----------------------------------------------------------------------

    private Acceptor createAcceptor(Application app, int port) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("BeginString", FixVersions.BEGINSTRING_FIX42);
        defaults.put("NonStopSession", "Y");
        // Disable data-dictionary validation so the pre-built stored messages
        // do not need to satisfy required-field checks.
        defaults.put(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(acceptorSessionID, "SocketAcceptProtocol",
                ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        settings.setString(acceptorSessionID, "SocketAcceptPort", String.valueOf(port));
        settings.set(defaults);

        MessageStoreFactory storeFactory = new BugScenarioStoreFactory(acceptorSessionID);
        LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketAcceptor(app, storeFactory, settings, logFactory,
                new DefaultMessageFactory());
    }

    private Initiator createInitiator(Application app, int port) throws ConfigError {
        SessionSettings settings = new SessionSettings();
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");
        defaults.put("NonStopSession", "Y");
        // Disable data-dictionary so the minimally-populated ExecutionReports
        // resent by the acceptor are accepted without required-field validation.
        defaults.put(Session.SETTING_USE_DATA_DICTIONARY, "N");
        settings.setString(initiatorSessionID, "SocketConnectProtocol",
                ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        settings.setString(initiatorSessionID, "SocketConnectHost", "127.0.0.1");
        settings.setString(initiatorSessionID, "SocketConnectPort", String.valueOf(port));
        settings.set(defaults);

        MessageStoreFactory factory = new MemoryStoreFactory();
        LogFactory logFactory = new SLF4JLogFactory(new SessionSettings());
        return new SocketInitiator(app, factory, settings, logFactory,
                new DefaultMessageFactory());
    }

    // -----------------------------------------------------------------------
    // Pre-populated message store
    // -----------------------------------------------------------------------

    /**
     * {@link MessageStoreFactory} that returns a {@link BugScenarioStore} for the
     * target acceptor session and a plain {@link MemoryStore} for all others.
     */
    private static class BugScenarioStoreFactory implements MessageStoreFactory {

        private final SessionID targetSessionID;

        BugScenarioStoreFactory(SessionID sessionID) {
            this.targetSessionID = sessionID;
        }

        @Override
        public MessageStore create(SessionID sessionID) {
            try {
                if (targetSessionID.equals(sessionID)) {
                    return new BugScenarioStore();
                }
                return new MemoryStore();
            } catch (IOException e) {
                throw new RuntimeException("Failed to create BugScenarioStore", e);
            }
        }
    }

    /**
     * A {@link MemoryStore} pre-populated with the sequence-number scenario that
     * triggers the resendMessages bug:
     * <ul>
     *   <li>seqno 1 – Logon (admin)</li>
     *   <li>seqno 2 – ResendRequest (admin)</li>
     *   <li>seqno 3 – ExecutionReport (app)</li>
     *   <li>seqno 4 – ExecutionReport (app)</li>
     *   <li>seqno 5 – Heartbeat (admin) ← last retrieved = admin → triggers bug</li>
     *   <li>seqnos 6–10 – absent from store</li>
     *   <li>NextSenderMsgSeqNum = 11</li>
     * </ul>
     *
     * <p>Writes for sequence numbers greater than 5 are silently discarded so that
     * the Logon sent during session start-up does not fill the artificial gap.
     */
    private static class BugScenarioStore extends MemoryStore {

        private static final int LAST_PREPOPULATED_SEQNO = 5;

        BugScenarioStore() throws IOException {
            super();
            populateBugScenario();
        }

        private void populateBugScenario() throws IOException {
            final DefaultMessageFactory factory = new DefaultMessageFactory();
            final String beginString = FixVersions.BEGINSTRING_FIX42;
            final String sender = "ACCEPTOR";
            final String target = "INITIATOR";
            // Use a fixed timestamp so stored messages have a valid SendingTime
            // (required by initializeResendFields when the message is re-sent).
            final LocalDateTime ts = LocalDateTime.of(2020, 1, 1, 12, 0, 0);

            // seqno 1: Logon (admin)
            Message logon = factory.create(beginString, MsgType.LOGON);
            logon.setInt(EncryptMethod.FIELD, 0);
            logon.setInt(HeartBtInt.FIELD, 30);
            setHeader(logon, beginString, sender, target, 1, ts);
            super.set(1, logon.toString());

            // seqno 2: ResendRequest (admin)
            Message resendReq = factory.create(beginString, MsgType.RESEND_REQUEST);
            resendReq.setInt(BeginSeqNo.FIELD, 1);
            resendReq.setInt(EndSeqNo.FIELD, 0);
            setHeader(resendReq, beginString, sender, target, 2, ts);
            super.set(2, resendReq.toString());

            // seqnos 3–4: ExecutionReport (app) — minimal fields, no data-dictionary
            for (int seqno = 3; seqno <= 4; seqno++) {
                Message execReport = factory.create(beginString, MsgType.EXECUTION_REPORT);
                setHeader(execReport, beginString, sender, target, seqno, ts);
                // Body can be minimal because UseDataDictionary=N is set on both sides
                execReport.setString(37, "ORD-" + seqno);  // OrderID
                execReport.setString(17, "EXEC-" + seqno); // ExecID
                super.set(seqno, execReport.toString());
            }

            // seqno 5: Heartbeat (admin) — the last stored message is admin:
            // this is what triggers the bug when resendMessages processes the list.
            Message heartbeat = factory.create(beginString, MsgType.HEARTBEAT);
            setHeader(heartbeat, beginString, sender, target, 5, ts);
            super.set(5, heartbeat.toString());

            // seqnos 6–10 intentionally absent (simulating messages that were sent
            // but are no longer available in the store).

            // NextSenderMsgSeqNum = 11 creates the gap that will be covered by the
            // trailing SequenceReset in resendMessages.
            setNextSenderMsgSeqNum(11);
            setNextTargetMsgSeqNum(1);
        }

        private static void setHeader(Message msg, String beginString, String sender,
                String target, int seqno, LocalDateTime sendingTime) {
            msg.getHeader().setString(BeginString.FIELD, beginString);
            msg.getHeader().setString(SenderCompID.FIELD, sender);
            msg.getHeader().setString(TargetCompID.FIELD, target);
            msg.getHeader().setInt(MsgSeqNum.FIELD, seqno);
            msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, sendingTime);
        }

        /**
         * Discard any write for sequence numbers beyond the pre-populated range.
         * This prevents the Logon sent at start-up (seqno 11) from appearing in
         * the store and thereby hiding the gap that triggers the bug.
         */
        @Override
        public boolean set(int sequence, String message) throws IOException {
            if (sequence > LAST_PREPOPULATED_SEQNO) {
                return true; // discard – preserve the artificial gap
            }
            return super.set(sequence, message);
        }
    }

    // -----------------------------------------------------------------------
    // Applications
    // -----------------------------------------------------------------------

    /**
     * Acceptor application that:
     * <ul>
     *   <li>counts down a logon latch when {@code onLogon} fires, and</li>
     *   <li>captures the <em>last</em> gap-fill SequenceReset sent whose
     *       {@code NewSeqNo} is greater than 10 (i.e. the trailing-gap reset
     *       that exhibits the bug) via the {@code toAdmin} callback.</li>
     * </ul>
     */
    private static class AcceptorApplication extends ApplicationAdapter {

        private final CountDownLatch logonLatch = new CountDownLatch(1);
        private final CountDownLatch trailingSeqResetLatch = new CountDownLatch(1);
        private final AtomicReference<Message> trailingGapSeqReset = new AtomicReference<>();

        @Override
        public void onLogon(SessionID sessionId) {
            logonLatch.countDown();
        }

        @Override
        public void toAdmin(Message message, SessionID sessionId) {
            try {
                if (!MsgType.SEQUENCE_RESET.equals(message.getHeader().getString(MsgType.FIELD))) {
                    return;
                }
                if (!message.isSetField(GapFillFlag.FIELD) || !message.getBoolean(GapFillFlag.FIELD)) {
                    return;
                }
                // The trailing-gap SequenceReset advances well past the original
                // NextSenderMsgSeqNum (11); its NewSeqNo will be 12 in this scenario.
                if (message.isSetField(NewSeqNo.FIELD) && message.getInt(NewSeqNo.FIELD) > 10) {
                    trailingGapSeqReset.set(message);
                    trailingSeqResetLatch.countDown();
                }
            } catch (FieldNotFound e) {
                // ignore
            }
        }

        void waitForLogon() {
            try {
                assertTrue("Acceptor logon timed out", logonLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail("Interrupted while waiting for acceptor logon");
            }
        }

        boolean waitForTrailingGapSeqReset(long timeout, TimeUnit unit) {
            try {
                return trailingSeqResetLatch.await(timeout, unit);
            } catch (InterruptedException e) {
                return false;
            }
        }

        Message getTrailingGapSeqReset() {
            return trailingGapSeqReset.get();
        }
    }

    /** Plain application adapter used for the initiator side. */
    private static class TestConnectorApplication extends ApplicationAdapter {

        private final CountDownLatch logonLatch = new CountDownLatch(1);

        @Override
        public void onLogon(SessionID sessionId) {
            logonLatch.countDown();
        }

        void waitForLogon() {
            try {
                assertTrue("Initiator logon timed out", logonLatch.await(10, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                fail("Interrupted while waiting for initiator logon");
            }
        }
    }
}

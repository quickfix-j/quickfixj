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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.ResetSeqNumFlag;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Regression test for GitHub issue #902.
 *
 * <p><b>Bug description:</b> A QuickFIX/J acceptor responds to a client Logon
 * with {@code ResetSeqNumFlag=Y} and {@code MsgSeqNum(34)=1} with a Logon
 * response carrying {@code MsgSeqNum=2} instead of 1.
 *
 * <p><b>Root cause:</b> Inside {@code Session.sendRaw()}, every outbound
 * message goes through {@code persist()}, which increments the
 * next-sender-sequence-number <em>before</em> the {@code send()} call. The
 * condition that gates the actual {@code send()} call is:
 * <pre>
 *   if (MsgType.LOGON.equals(msgType) || MsgType.LOGOUT.equals(msgType)
 *           || MsgType.RESEND_REQUEST.equals(msgType)
 *           || MsgType.SEQUENCE_RESET.equals(msgType) || isLoggedOn()) {
 *       result = send(messageString);
 *   }
 * </pre>
 * A Heartbeat message does NOT match any of those types, and at the moment
 * it is triggered the session is not yet fully logged on ({@code isLogonSent()}
 * is still {@code false}). Therefore the heartbeat's call to {@code persist()}
 * bumps the sequence counter from 1 to 2, but the heartbeat is silently
 * dropped. When the acceptor's own Logon response is subsequently serialised
 * and sent, it picks up sequence number 2.
 *
 * <p><b>How the race arises in production:</b> In {@code nextLogon()},
 * {@code state.setLogonReceived(true)} is called <em>before</em>
 * {@code generateLogon()} is called. Between those two operations, a
 * timer/heartbeat thread calling {@code next()} sees
 * {@code state.isLogonReceived()==true} and {@code isHeartBeatNeeded()==true}
 * (because {@code lastSentTime} is stale from the previous session), so it
 * invokes {@code generateHeartbeat()}, consuming seq=1 without sending the
 * heartbeat. The subsequent {@code generateLogon()} then uses seq=2.
 *
 * <p><b>Test strategy:</b> We inject the race deterministically using a
 * custom {@link Log} implementation that intercepts the {@code "Received logon"}
 * event (which fires between {@code setLogonReceived(true)} and
 * {@code generateLogon()} inside {@code nextLogon()}) and calls
 * {@link Session#next()} from within that event handler. We use
 * {@link MockSystemTimeSource} to ensure {@code isHeartBeatNeeded()} returns
 * {@code true} at exactly that moment.
 */
public class SessionLogonSeqNumIssue902Test {

    private static final String RECEIVED_LOGON_EVENT = "Received logon";

    private MockSystemTimeSource timeSource;
    private Session acceptorSession;
    private RecordingResponder responder;

    /** Holds the session so the log hook can reach it after construction. */
    private final AtomicReference<Session> sessionRef = new AtomicReference<>();

    /**
     * Guard that prevents re-entrant injection: the hook must fire at most
     * once per test run so that the simulated timer-thread interleaving is
     * applied exactly once.
     */
    private final AtomicBoolean heartbeatInjected = new AtomicBoolean(false);

    @Before
    public void setUp() {
        timeSource = new MockSystemTimeSource(1_000_000L);
        SystemTime.setTimeSource(timeSource);
    }

    @After
    public void tearDown() throws Exception {
        SystemTime.setTimeSource(null);
        if (acceptorSession != null) {
            acceptorSession.close();
        }
    }

    /**
     * Verifies that the acceptor's Logon response carries {@code MsgSeqNum=1}
     * when it receives a Logon with {@code ResetSeqNumFlag=Y} and
     * {@code MsgSeqNum=1}.
     *
     * <p>The test deliberately injects a simulated timer-thread interleaving
     * (via the session log hook described in the class Javadoc) so that
     * {@code generateHeartbeat()} runs between {@code setLogonReceived(true)}
     * and {@code generateLogon()} inside {@code nextLogon()}. This reproduces
     * the race condition described in issue #902.
     *
     * <p>With the current (buggy) code the heartbeat's {@code persist()} call
     * bumps the sequence counter from 1 to 2 without sending the heartbeat,
     * so the Logon response ends up with {@code MsgSeqNum=2}. The assertion
     * at the end therefore <b>fails</b>, proving that the bug exists.
     */
    @Test
    public void testAcceptorLogonResponseSeqNumIsOneWhenResetSeqNumFlagReceived()
            throws Exception {

        // -----------------------------------------------------------------
        // 1. Build the acceptor session.
        //
        //    The custom LogFactory creates a Log whose onEvent() method
        //    fires session.next() when "Received logon" is logged.  That
        //    log event is emitted by nextLogon() AFTER setLogonReceived(true)
        //    but BEFORE generateLogon(), which is exactly the window where
        //    the production race condition occurs.
        // -----------------------------------------------------------------
        SessionID sessionID = new SessionID(
                FixVersions.BEGINSTRING_FIX44, "ACCEPTOR", "CLIENT");

        LogFactory injectingLogFactory = id -> new Log() {
            @Override public void clear() {}
            @Override public void onIncoming(String message) {}
            @Override public void onOutgoing(String message) {}
            @Override public void onErrorEvent(String text) {}

            @Override
            public void onEvent(String text) {
                /*
                 * "Received logon" is the log event emitted at line ~2262
                 * of Session.java, between:
                 *   state.setLogonReceived(true)   [line ~2229]
                 *   generateLogon(...)             [line ~2275]
                 *
                 * Calling session.next() here models a timer thread that
                 * woke up at exactly this critical moment.
                 *
                 * The AtomicBoolean guard ensures we inject at most once,
                 * even if re-entrant log calls occur.
                 */
                if (RECEIVED_LOGON_EVENT.equals(text)
                        && heartbeatInjected.compareAndSet(false, true)) {
                    Session s = sessionRef.get();
                    if (s != null) {
                        try {
                            // This triggers generateHeartbeat() which calls
                            // persist() and bumps the seq counter 1 → 2
                            // without sending the heartbeat (isLogonSent()
                            // is still false at this point).
                            s.next();
                        } catch (IOException e) {
                            throw new RuntimeException(
                                    "Unexpected IOException in injected next() call", e);
                        }
                    }
                }
            }
        };

        /*
         * Build the acceptor session with heartbeatInterval=0 (the default for
         * acceptors).  This ensures that SessionState.isInitiator() == false,
         * which is required for nextLogon() to call generateLogon() and thus
         * produce the Logon response.
         *
         * NOTE: heartbeatInterval=0 causes the Session constructor to set
         *       state.initiator = (0 != 0) = false.  If we passed 30 here,
         *       state.initiator would be true and generateLogon() would be
         *       skipped entirely, making the test scenario impossible to set up.
         */
        acceptorSession = new SessionFactoryTestSupport.Builder()
                .setSessionId(sessionID)
                .setApplication(new UnitTestApplication())
                .setIsInitiator(false)
                .setCheckLatency(false)
                .setCheckCompID(true)
                .setPersistMessages(true)
                .setLogFactory(injectingLogFactory)
                .build();

        /*
         * Now update the heartbeat interval to 30 s WITHOUT changing
         * state.isInitiator() (which is final and was set to false above).
         * This makes next() reach the isHeartBeatNeeded() check instead of
         * returning early at the "getHeartBeatInterval() == 0" guard, which
         * is the prerequisite for the bug to manifest.
         */
        acceptorSession.setHeartBeatInterval(30);

        sessionRef.set(acceptorSession);

        responder = new RecordingResponder();
        acceptorSession.setResponder(responder);

        // -----------------------------------------------------------------
        // 2. Simulate a previous session by setting seq numbers to 5
        //    and recording lastSentTime at the INITIAL clock value (t=1 000 000).
        //    This makes lastSentTime "stale" once we advance the clock.
        // -----------------------------------------------------------------
        SessionState state = getSessionState(acceptorSession);
        state.getMessageStore().setNextSenderMsgSeqNum(5);
        state.getMessageStore().setNextTargetMsgSeqNum(5);
        state.setLastSentTime(SystemTime.currentTimeMillis()); // = 1_000_000

        // -----------------------------------------------------------------
        // 3. Advance the mock clock by 31 s (> the 30 s heartbeat interval)
        //    so that isHeartBeatNeeded() returns true when next() is called
        //    from inside the log hook.
        // -----------------------------------------------------------------
        timeSource.increment(31_000L); // clock = 1_031_000

        // -----------------------------------------------------------------
        // 4. Deliver the incoming Logon with ResetSeqNumFlag=Y, MsgSeqNum=1.
        //
        //    Execution path (with the injected interleaving):
        //      nextLogon()
        //        → resetState()           : seq counter reset to 1
        //        → setLogonReceived(true) : session now appears "logon received"
        //        → log("Received logon")  : our hook fires session.next()
        //            → isHeartBeatNeeded() = true  (31 s > 30 s, stale time)
        //            → generateHeartbeat()
        //                → sendRaw(heartbeat):
        //                    persist() bumps seq 1 → 2
        //                    send() NOT called (isLogonSent() still false)
        //            → next() returns
        //        → generateLogon()        : initializeHeader sets MsgSeqNum=2  ← BUG
        //            → sendRaw(logon):    sends the Logon response with "34=2"
        // -----------------------------------------------------------------
        acceptorSession.next(buildIncomingLogon(sessionID));

        // -----------------------------------------------------------------
        // 5. Sanity-check: the log hook must have fired to confirm the test
        //    scenario was actually triggered.
        // -----------------------------------------------------------------
        assertTrue("Log hook for 'Received logon' must have fired during test",
                heartbeatInjected.get());

        // -----------------------------------------------------------------
        // 6. Assert: the Logon response MUST carry MsgSeqNum=1.
        //
        //    With the current buggy code this assertion FAILS because the
        //    heartbeat consumed seq=1 and the Logon response was sent with
        //    MsgSeqNum=2.
        // -----------------------------------------------------------------
        String logonResponse = findLogonResponse(responder.sentMessages);
        int seqNum = extractMsgSeqNum(logonResponse);

        assertEquals(
                "Acceptor Logon response must carry MsgSeqNum=1 when responding to "
                + "a Logon with ResetSeqNumFlag=Y and MsgSeqNum=1, but got MsgSeqNum="
                + seqNum,
                1,
                seqNum);
    }

    // -------------------------------------------------------------------------
    // Helpers
    // -------------------------------------------------------------------------

    /**
     * Builds an incoming FIX 4.4 Logon message addressed to {@code sessionID}'s
     * acceptor side, carrying {@code ResetSeqNumFlag=Y} and {@code MsgSeqNum=1}.
     */
    private static quickfix.fix44.Logon buildIncomingLogon(SessionID sessionID)
            throws FieldNotFound {
        quickfix.fix44.Logon logon = new quickfix.fix44.Logon();
        logon.getHeader().setString(BeginString.FIELD,
                sessionID.getBeginString());
        logon.getHeader().setString(SenderCompID.FIELD,
                sessionID.getTargetCompID()); // from the remote peer's perspective
        logon.getHeader().setString(TargetCompID.FIELD,
                sessionID.getSenderCompID());
        logon.getHeader().setInt(MsgSeqNum.FIELD, 1);
        logon.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
        logon.setInt(HeartBtInt.FIELD, 30);
        logon.setBoolean(ResetSeqNumFlag.FIELD, true);
        return logon;
    }

    /**
     * Returns the last outbound Logon message (35=A) recorded by the responder.
     *
     * @throws AssertionError if no Logon response was sent
     */
    private static String findLogonResponse(List<String> sent) {
        for (int i = sent.size() - 1; i >= 0; i--) {
            if (sent.get(i).contains("\00135=A\001")) {
                return sent.get(i);
            }
        }
        throw new AssertionError(
                "No Logon response (35=A) found in sent messages: " + sent);
    }

    /**
     * Parses a raw FIX message string and returns the integer value of tag 34
     * (MsgSeqNum).
     */
    private static int extractMsgSeqNum(String fixMessage) {
        for (String field : fixMessage.split("\001")) {
            if (field.startsWith("34=")) {
                return Integer.parseInt(field.substring(3));
            }
        }
        throw new AssertionError("Tag 34 (MsgSeqNum) not found in message: " + fixMessage);
    }

    /**
     * Obtains the private {@code SessionState} from a {@link Session} via
     * reflection.
     */
    private static SessionState getSessionState(Session session) throws Exception {
        Field stateField = Session.class.getDeclaredField("state");
        stateField.setAccessible(true);
        return (SessionState) stateField.get(session);
    }

    // -------------------------------------------------------------------------
    // Inner types
    // -------------------------------------------------------------------------

    /**
     * A minimal {@link Responder} that records every raw FIX string passed to
     * {@link #send(String)}.
     */
    private static final class RecordingResponder implements Responder {

        final List<String> sentMessages = new CopyOnWriteArrayList<>();

        @Override
        public boolean send(String data) {
            sentMessages.add(data);
            return true;
        }

        @Override
        public void disconnect() {
        }

        @Override
        public String getRemoteAddress() {
            return "127.0.0.1:54321";
        }
    }
}

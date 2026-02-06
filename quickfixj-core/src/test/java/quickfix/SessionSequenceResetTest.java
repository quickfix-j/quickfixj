package quickfix;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import quickfix.field.*;
import quickfix.fix44.Logon;
import quickfix.fix44.NewOrderSingle;
import quickfix.fix44.SequenceReset;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SessionSequenceResetTest {

    private Session session;
    private Application application;
    private MessageStoreFactory messageStoreFactory;
    private MessageStore messageStore;
    private Responder responder;
    private SessionID sessionID;
    private DataDictionaryProvider dataDictionaryProvider;
    private List<String> sentMessages;

    @Before
    public void setUp() throws Exception {
        // Initialize session ID
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        // Mock application
        application = mock(Application.class);

        // Mock message store
        messageStore = mock(MessageStore.class);
        when(messageStore.getNextSenderMsgSeqNum()).thenReturn(1);
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1);
        when(messageStore.getCreationTime()).thenReturn(new java.util.Date());

        messageStoreFactory = mock(MessageStoreFactory.class);
        when(messageStoreFactory.create(any(SessionID.class))).thenReturn(messageStore);

        // Mock data dictionary provider
        dataDictionaryProvider = mock(DataDictionaryProvider.class);
        DataDictionary dataDictionary = new DataDictionary("FIX44.xml");
        when(dataDictionaryProvider.getSessionDataDictionary(anyString())).thenReturn(dataDictionary);
        when(dataDictionaryProvider.getApplicationDataDictionary(any(ApplVerID.class))).thenReturn(dataDictionary);

        // Mock responder
        responder = mock(Responder.class);
        sentMessages = new ArrayList<>();
        doAnswer(invocation -> {
            String message = invocation.getArgument(0);
            sentMessages.add(message);
            return true;
        }).when(responder).send(anyString());

        // Create session using SessionFactoryTestSupport Builder
        session = new SessionFactoryTestSupport.Builder()
                .setSessionId(sessionID)
                .setApplication(application)
                .setMessageStoreFactory(messageStoreFactory)
                .setDataDictionaryProvider(dataDictionaryProvider)
                .setIsInitiator(false)
                .setValidateSequenceNumbers(true)
                .setPersistMessages(true)
                .build();

        session.setResponder(responder);
    }

    @Test
    public void testReceiveSequenceResetWithGapFill() throws Exception {
        // Step 1: Establish a logged-on session
        // Receive initial Logon with sequence number 1
        Logon logon = new Logon();
        logon.set(new EncryptMethod(EncryptMethod.NONE_OTHER));
        logon.set(new HeartBtInt(30));
        logon.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        logon.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logon.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logon.getHeader().setInt(MsgSeqNum.FIELD, 1);
        logon.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        logon.toString(); // calculate length and checksum

        // Configure message store
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1);
        when(messageStore.getNextSenderMsgSeqNum()).thenReturn(1);

        // Process the Logon message to establish session
        session.next(logon);

        // Verify session is logged on
        assertTrue("Session should be logged on", session.isLoggedOn());

        // Update message store for next message (expecting seqnum 2)
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(2);

        // Step 2: Receive an application message with seqnum 2
        NewOrderSingle nos1 = new NewOrderSingle();
        nos1.set(new ClOrdID("ORDER1"));
        nos1.set(new Symbol("TEST"));
        nos1.set(new Side(Side.BUY));
        nos1.set(new TransactTime(LocalDateTime.now()));
        nos1.set(new OrdType(OrdType.MARKET));
        nos1.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        nos1.getHeader().setString(SenderCompID.FIELD, "TARGET");
        nos1.getHeader().setString(TargetCompID.FIELD, "SENDER");
        nos1.getHeader().setInt(MsgSeqNum.FIELD, 2);
        nos1.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        nos1.toString(); // calculate length and checksum

        session.next(nos1);

        // Update for next expected message (now expecting 3)
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(3);

        // Step 3: Receive a message with sequence number 50 (gap from 3 to 49)
        // This should trigger a ResendRequest
        sentMessages.clear();
        NewOrderSingle nos2 = new NewOrderSingle();
        nos2.set(new ClOrdID("ORDER50"));
        nos2.set(new Symbol("TEST"));
        nos2.set(new Side(Side.BUY));
        nos2.set(new TransactTime(LocalDateTime.now()));
        nos2.set(new OrdType(OrdType.MARKET));
        nos2.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        nos2.getHeader().setString(SenderCompID.FIELD, "TARGET");
        nos2.getHeader().setString(TargetCompID.FIELD, "SENDER");
        nos2.getHeader().setInt(MsgSeqNum.FIELD, 50);
        nos2.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        nos2.toString(); // calculate length and checksum

        session.next(nos2);

        // Step 4: Verify that a ResendRequest was sent
        boolean resendRequestFound = false;
        String resendRequestMsg = null;
        for (String msg : sentMessages) {
            if (msg.contains("35=2")) { // MsgType=ResendRequest
                resendRequestFound = true;
                resendRequestMsg = msg;
                break;
            }
        }

        assertTrue("ResendRequest should be sent", resendRequestFound);
        assertNotNull("ResendRequest message should not be null", resendRequestMsg);

        // Parse the ResendRequest to verify the range
        Message parsedResendRequest = new Message(resendRequestMsg, dataDictionaryProvider.getSessionDataDictionary(FixVersions.BEGINSTRING_FIX44), new ValidationSettings(), false);
        assertEquals("ResendRequest BeginSeqNo should be 3", 3, parsedResendRequest.getInt(BeginSeqNo.FIELD));
        // EndSeqNo should be 0 (infinity) or 49 depending on settings
        int endSeqNo = parsedResendRequest.getInt(EndSeqNo.FIELD);
        assertTrue("ResendRequest EndSeqNo should be 0 or 49", endSeqNo == 0 || endSeqNo == 49);

        // Step 5: Respond with a SequenceReset-GapFill from 3 to 50
        sentMessages.clear();
        SequenceReset sequenceReset = new SequenceReset();
        sequenceReset.set(new GapFillFlag(true));
        sequenceReset.set(new NewSeqNo(50));
        sequenceReset.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        sequenceReset.getHeader().setString(SenderCompID.FIELD, "TARGET");
        sequenceReset.getHeader().setString(TargetCompID.FIELD, "SENDER");
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, 3);
        sequenceReset.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        sequenceReset.toString(); // calculate length and checksum

        // Process the SequenceReset
        session.next(sequenceReset);

        // Step 6: Verify the next expected target sequence number is now 50
        verify(messageStore).setNextTargetMsgSeqNum(50);

        // Step 7: Verify that the queued message (seqnum 50) is now processed
        // This should have been automatically processed after the gap was filled
        verify(application, atLeastOnce()).fromApp(any(Message.class), eq(sessionID));

        // Verify no reject was sent
        for (String msg : sentMessages) {
            assertFalse("No reject should be sent", msg.contains("35=3")); // MsgType=Reject
        }
    }

    @Test
    public void testSequenceResetWithoutGapFillShouldResetSequence() throws Exception {
        // Set up session as logged on
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1);
        when(messageStore.getNextSenderMsgSeqNum()).thenReturn(1);

        // Send and receive logon to establish session
        Logon logon = new Logon();
        logon.set(new EncryptMethod(EncryptMethod.NONE_OTHER));
        logon.set(new HeartBtInt(30));
        logon.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        logon.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logon.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logon.getHeader().setInt(MsgSeqNum.FIELD, 1);
        logon.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        logon.toString(); // calculate length and checksum

        session.next(logon);

        // Update sequence numbers
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(2);

        // Send SequenceReset WITHOUT GapFill (hard reset)
        SequenceReset sequenceReset = new SequenceReset();
        sequenceReset.set(new NewSeqNo(50));
        // GapFillFlag is not set or set to false

        sequenceReset.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        sequenceReset.getHeader().setString(SenderCompID.FIELD, "TARGET");
        sequenceReset.getHeader().setString(TargetCompID.FIELD, "SENDER");
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, 2);
        sequenceReset.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        sequenceReset.toString(); // calculate length and checksum

        session.next(sequenceReset);

        // Verify the sequence number was reset to 50
        verify(messageStore).setNextTargetMsgSeqNum(50);
    }

    @Test
    public void testSequenceResetWithInvalidNewSeqNoShouldGenerateReject() throws Exception {
        // Set up session as logged on
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1);
        when(messageStore.getNextSenderMsgSeqNum()).thenReturn(1);

        // Establish session first
        Logon logon = new Logon();
        logon.set(new EncryptMethod(EncryptMethod.NONE_OTHER));
        logon.set(new HeartBtInt(30));
        logon.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        logon.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logon.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logon.getHeader().setInt(MsgSeqNum.FIELD, 1);
        logon.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        logon.toString(); // calculate length and checksum

        session.next(logon);

        // Send several messages to advance sequence numbers
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(2);
        for (int i = 2; i <= 10; i++) {
            NewOrderSingle nos = new NewOrderSingle();
            nos.set(new ClOrdID("ORDER" + i));
            nos.set(new Symbol("TEST"));
            nos.set(new Side(Side.BUY));
            nos.set(new TransactTime(LocalDateTime.now()));
            nos.set(new OrdType(OrdType.MARKET));
            nos.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
            nos.getHeader().setString(SenderCompID.FIELD, "TARGET");
            nos.getHeader().setString(TargetCompID.FIELD, "SENDER");
            nos.getHeader().setInt(MsgSeqNum.FIELD, i);
            nos.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
            nos.toString(); // calculate length and checksum

            when(messageStore.getNextTargetMsgSeqNum()).thenReturn(i);
            session.next(nos);
            when(messageStore.getNextTargetMsgSeqNum()).thenReturn(i + 1);
        }

        // Now expecting seqnum 11
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(11);
        sentMessages.clear();

        // Send SequenceReset with NewSeqNo LOWER than expected (invalid)
        // Sending seqnum 11 with NewSeqNo=5 (which is less than expected 11)
        SequenceReset sequenceReset = new SequenceReset();
        sequenceReset.set(new GapFillFlag(true));
        sequenceReset.set(new NewSeqNo(5)); // Lower than current expected (11)

        sequenceReset.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        sequenceReset.getHeader().setString(SenderCompID.FIELD, "TARGET");
        sequenceReset.getHeader().setString(TargetCompID.FIELD, "SENDER");
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, 11);
        sequenceReset.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        sequenceReset.toString(); // calculate length and checksum

        session.next(sequenceReset);

        // Verify a Reject was sent
        boolean rejectFound = false;
        for (String msg : sentMessages) {
            if (msg.contains("35=3")) { // MsgType=Reject
                rejectFound = true;
                break;
            }
        }

        assertTrue("Reject should be sent for invalid NewSeqNo", rejectFound);
    }
}

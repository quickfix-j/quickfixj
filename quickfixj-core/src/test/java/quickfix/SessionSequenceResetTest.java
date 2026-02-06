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
        // Step 1: Receive Logon with sequence number 100 (expected is 1)
        Logon logon = new Logon();
        logon.set(new EncryptMethod(EncryptMethod.NONE_OTHER));
        logon.set(new HeartBtInt(30));
        logon.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        logon.getHeader().setString(SenderCompID.FIELD, "TARGET");
        logon.getHeader().setString(TargetCompID.FIELD, "SENDER");
        logon.getHeader().setInt(MsgSeqNum.FIELD, 100);
        logon.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        logon.toString(); // calculate length and checksum

        // Configure message store for the test
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1);
        when(messageStore.getNextSenderMsgSeqNum()).thenReturn(1);

        // Clear sent messages before processing
        sentMessages.clear();

        // Process the Logon message
        session.next(logon);

        // Step 2: Verify that a ResendRequest was sent
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
        assertEquals("ResendRequest BeginSeqNo should be 1", 1, parsedResendRequest.getInt(BeginSeqNo.FIELD));
        // EndSeqNo should be 0 (infinity) or 99 depending on settings
        int endSeqNo = parsedResendRequest.getInt(EndSeqNo.FIELD);
        assertTrue("ResendRequest EndSeqNo should be 0 or 99", endSeqNo == 0 || endSeqNo == 99);

        // Update message store to reflect queued message
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(1); // Still expecting 1

        // Step 3: Resend messages from seqnum 1 to 50
        sentMessages.clear();
        for (int i = 1; i <= 50; i++) {
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
            nos.getHeader().setBoolean(PossDupFlag.FIELD, true);
            nos.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
            nos.getHeader().setUtcTimeStamp(OrigSendingTime.FIELD, LocalDateTime.now().minusMinutes(10));
            nos.toString(); // calculate length and checksum

            // Update expected target sequence number
            when(messageStore.getNextTargetMsgSeqNum()).thenReturn(i);

            session.next(nos);

            // Update for next iteration
            when(messageStore.getNextTargetMsgSeqNum()).thenReturn(i + 1);
        }

        // Verify we received and processed 50 messages
        verify(application, times(50)).fromApp(any(Message.class), eq(sessionID));

        // Step 4: Send SequenceReset with GapFill and NewSeqNo=110
        sentMessages.clear();
        SequenceReset sequenceReset = new SequenceReset();
        sequenceReset.set(new GapFillFlag(true));
        sequenceReset.set(new NewSeqNo(110));

        sequenceReset.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        sequenceReset.getHeader().setString(SenderCompID.FIELD, "TARGET");
        sequenceReset.getHeader().setString(TargetCompID.FIELD, "SENDER");
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, 51);
        sequenceReset.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        sequenceReset.toString(); // calculate length and checksum

        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(51);

        // Process the SequenceReset
        session.next(sequenceReset);

        // Step 5: Verify the next expected target sequence number is now 110
        verify(messageStore).setNextTargetMsgSeqNum(110);

        // Step 6: Send the original Logon message (seqnum 100) from the queue
        // The session should now accept a message with sequence number 110
        NewOrderSingle finalOrder = new NewOrderSingle();
        finalOrder.set(new ClOrdID("FINAL_ORDER"));
        finalOrder.set(new Symbol("TEST"));
        finalOrder.set(new Side(Side.BUY));
        finalOrder.set(new TransactTime(LocalDateTime.now()));
        finalOrder.set(new OrdType(OrdType.MARKET));

        finalOrder.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        finalOrder.getHeader().setString(SenderCompID.FIELD, "TARGET");
        finalOrder.getHeader().setString(TargetCompID.FIELD, "SENDER");
        finalOrder.getHeader().setInt(MsgSeqNum.FIELD, 110);
        finalOrder.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        finalOrder.toString(); // calculate length and checksum

        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(110);

        sentMessages.clear();
        session.next(finalOrder);

        // Verify final message was processed
        verify(messageStore).setNextTargetMsgSeqNum(111);

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
        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(10);
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

        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(2);
        sentMessages.clear();

        // Send SequenceReset with NewSeqNo LOWER than expected (invalid)
        SequenceReset sequenceReset = new SequenceReset();
        sequenceReset.set(new GapFillFlag(true));
        sequenceReset.set(new NewSeqNo(5)); // Lower than current expected (10)

        sequenceReset.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        sequenceReset.getHeader().setString(SenderCompID.FIELD, "TARGET");
        sequenceReset.getHeader().setString(TargetCompID.FIELD, "SENDER");
        sequenceReset.getHeader().setInt(MsgSeqNum.FIELD, 10);
        sequenceReset.getHeader().setUtcTimeStamp(SendingTime.FIELD, LocalDateTime.now());
        sequenceReset.toString(); // calculate length and checksum

        when(messageStore.getNextTargetMsgSeqNum()).thenReturn(10);

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

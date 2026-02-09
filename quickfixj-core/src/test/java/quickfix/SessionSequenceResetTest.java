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
    private Responder responder;
    private SessionID sessionID;
    private DataDictionaryProvider dataDictionaryProvider;
    private List<String> sentMessages;
    private List<Message> receivedAppMessages;

    @Before
    public void setUp() throws Exception {
        // Initialize session ID
        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");

        // Mock application to capture received messages
        application = mock(Application.class);
        receivedAppMessages = new ArrayList<>();
        doAnswer(invocation -> {
            Message message = invocation.getArgument(0);
            receivedAppMessages.add(message);
            return null;
        }).when(application).fromApp(any(Message.class), any(SessionID.class));

        // Mock data dictionary provider
        dataDictionaryProvider = mock(DataDictionaryProvider.class);
        DataDictionary dataDictionary = new DataDictionary("FIX44.xml");
        when(dataDictionaryProvider.getSessionDataDictionary(anyString())).thenReturn(dataDictionary);
        when(dataDictionaryProvider.getApplicationDataDictionary(any(ApplVerID.class))).thenReturn(dataDictionary);

        // Mock responder to capture sent messages
        responder = mock(Responder.class);
        sentMessages = new ArrayList<>();
        doAnswer(invocation -> {
            String message = invocation.getArgument(0);
            sentMessages.add(message);
            return true;
        }).when(responder).send(anyString());

        // Create session using SessionFactoryTestSupport Builder with MemoryStore (default)
        session = new SessionFactoryTestSupport.Builder()
                .setSessionId(sessionID)
                .setApplication(application)
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

        // Process the Logon message to establish session
        session.next(logon);

        // Verify session is logged on
        assertTrue("Session should be logged on", session.isLoggedOn());

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

        // Verify the first message was processed
        assertEquals("Should have received 1 application message", 1, receivedAppMessages.size());
        assertEquals("First message should be ORDER1", "ORDER1", 
                     receivedAppMessages.get(0).getString(ClOrdID.FIELD));

        // Step 3: Receive a message with sequence number 50 (gap from 3 to 49)
        // This should trigger a ResendRequest and queue the message
        sentMessages.clear();
        receivedAppMessages.clear();
        
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

        // The message with seqnum 50 should NOT have been processed yet (it's queued)
        assertEquals("Queued message should not be processed yet", 0, receivedAppMessages.size());

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

        // Step 6: Verify that the queued message (seqnum 50) was processed after the gap was filled
        // The SequenceReset-GapFill causes the queued message to be processed immediately
        assertEquals("Queued message should now be processed", 1, receivedAppMessages.size());
        assertEquals("Processed message should be ORDER50", "ORDER50", 
                     receivedAppMessages.get(0).getString(ClOrdID.FIELD));
        assertEquals("Processed message should have seqnum 50", 50, 
                     receivedAppMessages.get(0).getHeader().getInt(MsgSeqNum.FIELD));

        // Verify the sequence number advanced to 51 after processing the queued message
        assertEquals("Expected target sequence number should be 51 after processing queued message", 51, 
                     session.getStore().getNextTargetMsgSeqNum());

        // Verify no reject was sent
        for (String msg : sentMessages) {
            assertFalse("No reject should be sent", msg.contains("35=3")); // MsgType=Reject
        }
    }

    @Test
    public void testSequenceResetWithoutGapFillShouldResetSequence() throws Exception {
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
        assertEquals("Expected target sequence number should be 50", 50, 
                     session.getStore().getNextTargetMsgSeqNum());
    }

    @Test
    public void testSequenceResetWithInvalidNewSeqNoShouldGenerateReject() throws Exception {
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

            session.next(nos);
        }

        // Now expecting seqnum 11
        assertEquals("Expected target sequence number should be 11", 11, 
                     session.getStore().getNextTargetMsgSeqNum());
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

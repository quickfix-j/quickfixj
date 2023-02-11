package quickfix;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import quickfix.field.ApplExtID;
import quickfix.field.ApplVerID;
import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.CstmApplVerID;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SecureData;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.TargetCompID;
import quickfix.field.TargetSubID;

public class MessageTest {
	
    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void testRepeatingField() throws Exception {
        final Message m = new Message(
                "8=FIX.4.0\0019=100\00135=D\00134=2\00149=TW\00156=ISLD\00111=ID\00121=1\001"
                        + "40=1\00154=1\00140=2\00138=200\00155=INTC\00110=160\001");
        assertFalse("message should be invalid", m.hasValidStructure());
        assertEquals("wrong invalid tag", 40, m.getInvalidTag());
    }
    
    @Test
    public void testHeaderCustomFieldOrdering() throws Exception {

        class MyMessage extends Message {

            final int[] headerFieldOrder = {
                    BeginString.FIELD,
                    BodyLength.FIELD,
                    MsgType.FIELD,
                    TargetSubID.FIELD,
                    SendingTime.FIELD,
                    MsgSeqNum.FIELD,
                    SenderCompID.FIELD,
                    TargetCompID.FIELD
            };

            public MyMessage() {
                super();
                header = new Header(headerFieldOrder);
            }
        }

        final MyMessage myMessage = new MyMessage();

        myMessage.getHeader().setField(new SenderCompID("foo"));
        myMessage.getHeader().setField(new MsgSeqNum(22));
        myMessage.getHeader().setString(SendingTime.FIELD, "20120922-11:00:00");
        myMessage.getHeader().setField(new TargetCompID("bar"));

        assertTrue(myMessage.toString().contains("52=20120922-11:00:00\00134=22\00149=foo\00156=bar"));
    }

    @Test
    public void testHeaderFieldWithCustomTransportDictionaryConstructorReadsHeaderField() throws Exception {

        final DataDictionary customSessionDictionary = new DataDictionary("FIXT11_Custom_Test.xml");
        customSessionDictionary.setAllowUnknownMessageFields(false);

        final DataDictionary standardSessionDictionary = new DataDictionary("FIXT11.xml");
        standardSessionDictionary.setAllowUnknownMessageFields(false);

        final DataDictionary applicationDictionary = new DataDictionary("FIX50.xml");
        applicationDictionary.setAllowUnknownMessageFields(false);

        final String sep = "\001";
        final StringBuilder sb = new StringBuilder();
        sb.append("8=FIXT1.1");
        sb.append(sep);
        sb.append("9=112");
        sb.append(sep);
        sb.append("35=6");
        sb.append(sep);
        sb.append("49=SENDER_COMP_ID");
        sb.append(sep);
        sb.append("56=TARGET_COMP_ID");
        sb.append(sep);
        sb.append("34=20");
        sb.append(sep);
        sb.append("52=20120922-11:00:00");
        sb.append(sep);
        sb.append("12312=foo");
        sb.append(sep);
        sb.append("23=123456");
        sb.append(sep);
        sb.append("28=N");
        sb.append(sep);
        sb.append("55=[N/A]");
        sb.append(sep);
        sb.append("54=1");
        sb.append(sep);
        sb.append("27=U");
        sb.append(sep);
        sb.append("10=52");
        sb.append(sep);
        final String messageData = sb.toString();

        final Message standardMessage = new Message(messageData, standardSessionDictionary, applicationDictionary, true);

        // Test that field is in body not the header
        assertTrue(standardMessage.toString().contains("12312=foo"));
        assertFalse(standardMessage.getHeader().isSetField(12312));
        assertTrue(standardMessage.isSetField(12312));
        assertEquals("foo", standardMessage.getString(12312));

        // Test that field is correctly classified in header with customSessionDictionary
        final Message customMessage = new Message(messageData, customSessionDictionary, applicationDictionary, true);
        assertTrue(customMessage.toString().contains("12312=foo"));
        assertTrue(customMessage.getHeader().isSetField(12312));
        assertEquals("foo", customMessage.getHeader().getString(12312));
        assertFalse(customMessage.isSetField(12312));
    }

    @Test
    public void testTrailerCustomFieldOrdering() throws Exception {

        class MyMessage extends Message {

            final int[] trailerFieldOrder = {Signature.FIELD, SignatureLength.FIELD, CheckSum.FIELD};

            public MyMessage() {
                super();
                trailer = new Trailer(trailerFieldOrder);
            }
        }

        final MyMessage myMessage = new MyMessage();

        myMessage.getTrailer().setField(new Signature("FOO"));
        myMessage.getTrailer().setField(new SignatureLength(3));
        assertTrue(myMessage.toString().contains("89=FOO\00193=3\001"));
    }

    @Test
    public void testFix5HeaderFields() {
        assertTrue(Message.isHeaderField(ApplVerID.FIELD));
        assertTrue(Message.isHeaderField(CstmApplVerID.FIELD));
    }

    @Test
    public void testApplExtIDIsHeaderField() {
        assertTrue(Message.isHeaderField(ApplExtID.FIELD));
    }

    @Test
    public void testHeaderFieldsMissing() throws Exception {
        try {
            new Message("1=FIX.4.2");
        } catch (final InvalidMessage e) {
            // expected
        }
    }
    
    @Test
    public void testMessageFromString() {
        Message message = null;

        boolean badMessage = false;
        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=036\001");
        } catch (final InvalidMessage e) {
            badMessage = true;
        }
        assertTrue("Message should be invalid", badMessage);

        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001");
        } catch (final InvalidMessage e) {
            fail("Message should be valid (" + e.getMessage() + ")");
        }
        assertEquals("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001", message.toString());
    }
    
    @Test
    public void testIsEmpty() {
        final Message message = new Message();
        assertTrue("Message should be empty on construction", message.isEmpty());
        message.getHeader().setField(new BeginString("FIX.4.2"));
        assertFalse("Header should contain a field", message.isEmpty());
        message.clear();
        assertTrue("Message should be empty after clear", message.isEmpty());
        message.setField(0, new Field<String>(20000, "MSFT"));
        assertFalse("Body should contain a field", message.isEmpty());
        message.clear();
        assertTrue("Message should be empty after clear", message.isEmpty());
        message.getTrailer().setField(new CheckSum("10"));
        assertFalse("Trailer should contain a field", message.isEmpty());
        message.clear();
        assertTrue("Message should be empty after clear", message.isEmpty());
    }

    @Test
    public void testMessageSetGetString() {
        final Message message = new Message();

        try {
            message.getString(5);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setString(5, "string5");

        try {
            assertEquals("string5", message.getString(5));
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }

        expectedException.expect(FieldException.class);
        message.setString(100, null);
    }

    @Test
    public void testMessageSetGetBoolean() {
        final Message message = new Message();

        try {
            message.getBoolean(7);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setBoolean(7, true);

        try {
            assertTrue(message.getBoolean(7));
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testMessageSetGetChar() {
        final Message message = new Message();

        try {
            message.getChar(12);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setChar(12, 'a');

        try {
            assertEquals('a', message.getChar(12));
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testMessageSetGetChars() throws FieldNotFound {
        final Message message = new Message();

        try {
            message.getChars(18);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setChars(18, 'a', 'b', '4');
        assertArrayEquals(new char[]{'a', 'b', '4'}, message.getChars(18));
    }

    @Test
    public void testMessageSetGetCharsInvalidFormatException() throws FieldNotFound {
        expectedException.expect(FieldException.class);
        expectedException.expectMessage("invalid char array: [65, 32, 98, 32, 48, 53]");

        final Message message = new Message();
        message.setString(123, "A b 05");
        message.getChars(123);
    }

    @Test
    public void testMessageSetGetInt() {
        final Message message = new Message();

        try {
            message.getInt(56);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setInt(56, 23);

        try {
            assertEquals(23, message.getInt(56));
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testMessageSetGetDouble() {
        final Message message = new Message();

        try {
            message.getDouble(9812);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        message.setDouble(9812, 12.3443);

        try {
            assertEquals(12.3443, message.getDouble(9812), 1e-10);
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testMessageSetGetUtcTimeStamp() {
        final Message message = new Message();

        try {
            message.getUtcTimeStamp(8);
            fail("exception not thrown");
        } catch (final FieldNotFound e) {
        }

        final TimeZone timezone = TimeZone.getTimeZone("GMT+0");
        final Calendar calendar = Calendar.getInstance(timezone);
        calendar.set(2002, 8, 6, 12, 34, 56);
        calendar.set(Calendar.MILLISECOND, 0);

        final LocalDateTime time = LocalDateTime.ofInstant(Instant.ofEpochMilli(calendar.getTimeInMillis()), ZoneOffset.UTC);
        message.setUtcTimeStamp(8, time);

        try {
            assertEquals(message.getUtcTimeStamp(8), time);
        } catch (final FieldNotFound e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testRemoveField() {
        final Message message = new Message();
        message.setField(new StringField(12, "value"));
        assertTrue(message.isSetField(12));
        message.removeField(12);
        assertTrue(!message.isSetField(12));
    }

    @Test
    public void testMessageIterator() {
        Message message = new Message();
        java.util.Iterator<Field<?>> i = message.iterator();
        assertFalse(i.hasNext());
        try {
            assertNull(i.next());
            fail("exception not thrown");
        } catch (final java.util.NoSuchElementException e) {
        }

        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001");
            i = message.iterator();
            assertTrue(i.hasNext());
            StringField field = (StringField) i.next();
            assertEquals(108, field.getField());
            assertEquals("30", field.getValue());

            assertFalse(i.hasNext());
            try {
                assertNull(i.next());
                fail("exception not thrown");
            } catch (final java.util.NoSuchElementException e) {
            }

            final java.util.Iterator<Field<?>> j = message.getHeader().iterator();
            assertTrue(j.hasNext());
            field = (StringField) j.next();
            assertEquals(8, field.getField());
            assertEquals("FIX.4.2", field.getValue());
            field = (StringField) j.next();
            assertEquals(9, field.getField());
            assertEquals("12", field.getValue());
            field = (StringField) j.next();
            assertEquals(35, field.getField());
            assertEquals("A", field.getValue());

            assertFalse(j.hasNext());
            try {
                assertNull(j.next());
                fail("exception not thrown");
            } catch (final java.util.NoSuchElementException e) {
            }
        } catch (final InvalidMessage e) {
            fail("exception thrown");
        }
    }

    @Test
    public void testIsAdmin() {
        final Message message = new Message();

        message.getHeader().setString(MsgType.FIELD, MsgType.HEARTBEAT);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.LOGON);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.LOGOUT);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.SEQUENCE_RESET);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.RESEND_REQUEST);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.TEST_REQUEST);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.REJECT);
        assertTrue(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.NEW_ORDER_SINGLE);
        assertFalse(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.QUOTE_RESPONSE);
        assertFalse(message.isAdmin());
    }


    /**
     * Verify that an empty message can still be "printed" and doesn't result in any exceptions
     */
    @Test
    public void testEmptyMessageToString() throws Exception {
        final Message msg = new quickfix.Message();
        assertNotNull(msg.toString());
        assertTrue("empty message contains no checksum", msg.toString().length() > 0);
    }
    
    @Test
    public void testParseEmptyString() throws Exception {
        final String data = "";

        // with validation
        try {
            new Message(data, DataDictionaryTest.getDictionary());
        } catch (final InvalidMessage im) {
        } catch (final Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
        }

        // without validation
        try {
            new Message(data, DataDictionaryTest.getDictionary(), false);
        } catch (final InvalidMessage im) {
        } catch (final Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
        }
    }

    /**
     * Test for data fields with SOH. This test is based on report from a user on
     * the QuickFIX mailing list. The problem was the user's configuration but this
     * seems like a good unit test to keep in the suite.
     */
    @Test
    public void testDataFieldParsing() throws Exception {
        final String data = "10001=Canonical.1.00\00110002=001058\00125001=01\00110003=SAPI_ADMRESP\00110004=SUBSCRIBE_RESP\001"
                + "10009=705\00110012=01\00110005=SPGW\00110006=SAPI\00110007=0\00110010=16:25:11.537\001"
                + "10045=SDQADL:01:/SDB/ENT/@/@/STKSDLL:7\00110955=Y\00110963=043\00110961=03\00111285=N\001"
                + "11339=823,980\00110919=N\00111111=86795696\00110898=043\00110920=~\00110938=N\00111340=5-  9.99\001"
                + "11343=0.20\00111344=~\00111341=~\00111342=0.15\00111345=10- 14.99\00111348=0.25\00111349=~\00111346=~\001"
                + "11347=0.15\00111350=15- 19.99\00111353=0.30\00111354=~\00111351=~\00111352=0.20\00111338=23SEP05\001"
                + "10981=0\00110485=N\00110761=0\00111220=~\00111224=N\00110808=N\00110921=~\00110960=N\00110957=N\00111329=N\001"
                + "11286=0\00111214=USA\00110917=Y\00111288=0\00110906=N\00110737=0.01\00110956=~\00110967=~\00110965=~\00110809=0\001"
                + "10762=N\00110763=N\00110712=1\00110905=09:30:00\00110918=YA0101\00110951=Y\00110469=1\00110949=1\00110487=Q\00110950=Y\001"
                + "10899=N\00110380=N\00110696=03\00111082=18.41\00110217=12\00110954=N\00110708=E\00110958=N\00111213=US \00111334=N\001"
                + "11332=N\00111331=N\00111330=N\00111335=N\00111333=N\00110767=3\00110974=~\00110980=AIRTRAN HOLDINGS                \00111289=N\001"
                + "10912=4\00110915=0501\00110914=0501\00110975=N\00110913=SLK\00110698=055\00110666=AAI\00110903=S\00111328=N\001"
                + "10624=L\00111287=0\00110699=0\00110962=L\00111227=SUB1\00111229=5\00111228=1\00111236=16:24:41.521\00111277=16:25:11.630\001";

        try {
            final DataDictionary dictionary = DataDictionaryTest.getDictionary();
            final Message m = new Message(("8=FIX.4.4\0019=1144\00135=A\001"
                    + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00195=1092\001" + "96="
                    + data + "\00110=5\001"), dictionary);
            assertEquals(1144, m.bodyLength());
            final Message m2 = new Message(m.toString(), dictionary);
            assertEquals(1144, m2.bodyLength());
        } catch (final InvalidMessage e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testHeaderFieldInBody() throws Exception {
        final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001212=4\001384=2\001372=D\001385=R\001372=8\001385=S\00110=103\001",
                DataDictionaryTest.getDictionary());

        assertFalse(message.hasValidStructure());

        assertTrue(message.getHeader().isSetField(212));

        assertEquals(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER, message
                .getException().getSessionRejectReason());
        assertEquals(212, message.getException().getField());
    }

    @Test
    public void testTrailerFieldInBody() throws Exception {
        final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\00193=5\001384=2\001372=D\001385=R\001372=8\001385=S\00110=63\001",
                DataDictionaryTest.getDictionary());

        assertFalse(message.hasValidStructure());

        final SignatureLength signatureLength = new SignatureLength();
        message.getTrailer().getField(signatureLength);
        assertEquals(5, signatureLength.getValue());
    }
    
    // Includes test for QFJ-413. Repeating group check for size = 0
    @Test
    public void testMessageGroupCountValidation() throws Exception {
        final String data = "8=FIX.4.4\0019=222\00135=D\00149=SenderCompId\00156=TargetCompId\00134=37\001" +
                "52=20070223-22:28:33\00111=183339\00122=8\00138=1\00140=2\00144=12\00148=BHP\00154=2\001" +
                "55=BHP\00159=1\00160=20060223-22:38:33\001526=3620\00178=0\00179=AllocACC1\00180=1010.1\001" +
                "79=AllocACC2\00180=2020.2\001453=2\001448=8\001447=D\001452=4\001448=AAA35354\001447=D\001452=3\00110=079\001";
        final Message message = new Message();
        final DataDictionary dd = DataDictionaryTest.getDictionary();
        message.fromString(data, dd, true);
        try {
            dd.validate(message);
            fail("No exception thrown");
        } catch (final FieldException e) {
            final String emsg = e.getMessage();
            assertNotNull("No exception message", emsg);
            assertTrue(emsg.startsWith("Incorrect NumInGroup"));
        }
    }

    /**
     * QFJ-760
     */
    @Test
    public void testMessageWithMissingChecksumField() throws Exception {
        // checksum is "merged" into field 452, i.e. SOH is missing between field 452 and 10
        String badMessage = "8=FIX.4.4\0019=275\00135=D\00134=3\00149=441000-XXXXX-X-XXXX-001\001" +
                "52=20131113-10:22:31.567\00156=XXXXX\0011=A1\00111=9fef3663330e209e1bce\00118=H\001" +
                "22=4\00138=200\00140=M\00148=XX0005519XXXX\00154=1\00155=[N/A]\00158=MassTest\00159=0\001" +
                "60=20131113-10:22:31.567\001100=XXXX\001526=9fef3663330e209e1bce\001453=1\001" +
                "448=XXXXXXXX030\001447=D\001452=3610=016\001";

        Message msg = new Message();
        try {
            msg.fromString(badMessage, DataDictionaryTest.getDictionary(), true);
            fail();
        } catch (final InvalidMessage e) {
            final String emsg = e.getMessage();
            assertNotNull("No exception message", emsg);
            assertTrue(emsg.startsWith("Field not found"));
        }
    }

    @Test
    public void testFalseMessageStructureException() {
        try {
            final DataDictionary dd = DataDictionaryTest.getDictionary();
            // duplicated tag 98
            // QFJ-65
            new Message("8=FIX.4.4\0019=22\00135=A\00198=0\00198=0\001108=30\00110=223\001", dd,
                    true);
            // For now, this will not cause an exception if the length and checksum are correct
        } catch (final Exception e) {
            final String text = e.getMessage();
            assertTrue("Wrong exception message: " + text, !text.contains("Actual body length"));
        }
    }
    
    @Test
    public void testComponentInGroup() {
        try {
            final DataDictionary dd = DataDictionaryTest.getDictionary();
            // duplicated tag 98
            // QFJ-65
            // 8=FIX.4.4\0019=941\00135=AE\00149=ICE\00134=63\00152=20091117-18:59:04.780\00156=XXXX\001
            // 57=X\001571=219449\001487=0\001856=0\001828=0\001150=F\00117=44750544433\00139=2\001
            // 570=N\00155=480120\00148=WBS FMG0010-BRN FMG0010\00122=8\001461=FXXXXX\001916=20100201\001
            // 917=20100228\00132=1.0\00131=0.69\0019018=1\0019022=1\00175=20091117\00160=20091117-18:59:04.775\001
            // 552=1\00154=2\00137=41296064\00111=557859232\001453=7\001448=trader\001447=D\001452=11\001
            // 448=Trading Corp\001447=D\001452=13\001448=2757\001447=D\001452=56\001448=805\001447=D\001
            // 452=4\001448=11122556\001447=D\001452=51\001448=FCM\001447=D\001452=60\001448=U\001447=D\001
            // 452=5 4\00158=41293051\001555=2\001600=460130\001602=WBS FMG0010!\001603=8\001608=FXXXXX\001
            // 624=2\001637=80.78\001687=1.0\001654=41296074\0019019=1\0019023=1\0019020=20100201\001
            // 9021=20100228\001539=4\001524=805\001525=D\001538=4\001524=11122556\001525=D\001538=51\001
            // 524=FCM\001525=D\001538=60 524=U\001525=D\001538=54\001600=217927\001
            // 602=BRN FMG0010! 63=8 608-FXXXXX 624=1 637=80.09 687=1.0 654=41296073 9019=1 9023=1 9020=20100201 9021=20100228 539=4 524=805\001
            // 525=D\001538=4\001524=11122556 525=D\001538=51 524=Newedge 525=D 538=60 524=U 525=D 538=54 10=112
            new Message(
                    "8=FIX.4.4\0019=941\00135=AE\00149=ICE\00134=63\00152=20091117-18:59:04.780\00156=XXXX\001" +
                            "57=X\001571=219449\001487=0\001856=0\001828=0\001150=F\00117=44750544433\00139=2\001" +
                            "570=N\00155=480120\00148=WBS FMG0010-BRN FMG0010\00122=8\001461=FXXXXX\001916=20100201\001" +
                            "917=20100228\00132=1.0\00131=0.69\0019018=1\0019022=1\00175=20091117\00160=20091117-18:59:04.775\001" +
                            "552=1\00154=2\00137=41296064\00111=557859232\001453=7\001448=trader\001447=D\001452=11\001" +
                            "448=Trading Corp\001447=D\001452=13\001448=2757\001447=D\001452=56\001448=805\001447=D\001" +
                            "452=4\001448=11122556\001447=D\001452=51\001448=FCM\001447=D\001452=60\001448=U\001447=D\001" +
                            "452=5 4\00158=41293051\001555=2\001600=460130\001602=WBS FMG0010!\001603=8\001608=FXXXXX\001" +
                            "624=2\001637=80.78\001687=1.0\001654=41296074\0019019=1\0019023=1\0019020=20100201\001" +
                            "9021=20100228\001539=4\001524=805\001525=D\001538=4\001524=11122556\001525=D\001538=51\001" +
                            "524=FCM\001525=D\001538=60 524=U\001525=D\001538=54\001600=217927\001602=BRN FMG0010!\001" +
                            "63=8 608-FXXXXX\001624=1\001637=80.09\001687=1.0\001654=41296073\0019019=1\0019023=1\001" +
                            "9020=20100201\001021=20100228\001539=4\001524=805\001525=D\001538=4\001524=11122556\001" +
                            "525=D\001538=51\001524=FCM\001525=D\001538=60 524=U\001525=D\001538=54\001600=217927\001" +
                            "602=BRN FMG0010!\00163=8 608-FXXXXX\001624=1\001637=80.09\001687=1.0\001654=41296073\001" +
                            "9019=1\0019023=1\0019020=20100201\001021=20100228\001",
                    dd, true);
            // For now, this will not cause an exception if the length and checksum are correct
        } catch (final Exception e) {
            final String text = e.getMessage();
            assertTrue("Wrong exception message: " + text, !text.contains("Actual body length"));
        }
    }

    @Test
    public void testFalseMessageStructureException2() {
        try {
            final DataDictionary dd = DataDictionaryTest.getDictionary();
            // duplicated raw data length
            // QFJ-121
            new Message("8=FIX.4.4\0019=22\00135=A\00196=X\001108=30\00110=223\001", dd, true);
        } catch (final Exception e) {
            final String text = e.getMessage();
            assertTrue("Wrong exception message: " + text,
                    text != null && !text.contains("Actual body length"));
        }
    }
    
    // QFJ-770/QFJ-792
    @Test
    public void testRepeatingGroupCountWithUnknownFields() throws Exception {
        String test = "8=FIX.4.4|9=431|35=d|49=1|34=2|52=20140117-18:20:26.629|56=3|57=21|322=388721|"
                + "323=4|320=1|393=42|82=1|67=1|711=1|311=780508|309=text|305=8|463=FXXXXX|307=text|542=20140716|"
                + "436=10.0|9013=1.0|9014=1.0|9017=10|9022=1|9024=1.0|9025=Y|916=20140701|917=20150731|9201=23974|"
                + "9200=17|9202=text|9300=727|9301=text|9302=text|9303=text|998=text|9100=text|9101=text|9085=text|"
                + "9083=0|9084=0|9061=579|9062=text|9063=text|9032=10.0|9002=F|9004=780415|9005=780503|10=223|";

        DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        Message message = new Message();
        message.fromString(test.replaceAll("\\|", "\001"), dictionary, true);
        Group group = message.getGroup(1, 711);
        String underlyingSymbol = group.getString(311);
        assertEquals("780508", underlyingSymbol);
    }
    
    @Test
    // QFJ-940
    public void testRawString() throws Exception {

        String test = "8=FIX.4.4|9=431|35=d|49=1|34=2|52=20140117-18:20:26.629|56=3|57=21|322=388721|"
                + "323=4|320=1|393=42|82=1|67=1|711=1|311=780508|309=text|305=8|463=FXXXXX|307=text|542=20140716|"
                + "436=10.0|9013=1.0|9014=1.0|9017=10|9022=1|9024=1.0|9025=Y|916=20140701|917=20150731|9201=23974|"
                + "9200=17|9202=text|9300=727|9301=text|9302=text|9303=text|998=text|9100=text|9101=text|9085=text|"
                + "9083=0|9084=0|9061=579|9062=text|9063=text|9032=10.0|9002=F|9004=780415|9005=780503|10=223|";

        DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        Message message = new Message();
        message.fromString(test.replaceAll("\\|", "\001"), dictionary, true);
        assertEquals(test, message.toRawString().replaceAll("\001", "\\|"));
    }
    
    // QFJ-722
    @Test
    public void testIfMessageHeaderIsCreatedWithEveryConstructor() throws Exception {
        final String rawMessage = "8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001";
        final DataDictionary dataDictionary = new DataDictionary(DataDictionaryTest.getDictionary());

        final Message emptyConstructor = new Message();
        assertNotNull(emptyConstructor.getHeader());

        final Message secondConstructor = new Message(new int[]{});
        assertNotNull(secondConstructor.getHeader());

        final Message thirdConstructor = new Message(rawMessage);
        assertNotNull(thirdConstructor.getHeader());

        final Message fourthConstructor = new Message(rawMessage, false);
        assertNotNull(fourthConstructor.getHeader());

        final Message fifthConstructor = new Message(rawMessage, dataDictionary);
        assertNotNull(fifthConstructor.getHeader());

        final Message sixthConstructor = new Message(rawMessage, dataDictionary, false);
        assertNotNull(sixthConstructor.getHeader());

        final Message seventhConstructor = new Message(rawMessage, dataDictionary, dataDictionary, false);
        assertNotNull(seventhConstructor.getHeader());
    }

    // QFJ-66 Should not throw exception when parsing data field in header
    @Test
    public void testHeaderDataField() throws Exception {
        final Message m = new Message("8=FIX.4.2\0019=53\00135=A\00190=4\00191=ABCD\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=241\001",
                DataDictionaryTest.getDictionary());
        assertEquals("ABCD", m.getHeader().getString(SecureData.FIELD));
    }
}

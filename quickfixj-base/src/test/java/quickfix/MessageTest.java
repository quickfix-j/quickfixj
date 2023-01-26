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
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
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
    
}

package quickfix;

import junit.framework.TestCase;
import quickfix.field.BeginString;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.EncryptMethod;
import quickfix.field.IOIid;
import quickfix.field.MsgDirection;
import quickfix.field.MsgType;
import quickfix.field.RefMsgType;
import quickfix.field.UnderlyingCurrency;
import quickfix.field.UnderlyingSymbol;
import quickfix.fix44.IndicationOfInterest;
import quickfix.fix44.Logon;
import quickfix.fix44.Logon.NoMsgTypes;

public class TestMessage extends TestCase {

    public void testParsing() throws Exception {
        // checksum is not verified in these tests
        // TODO parse repeating groups
        // TODO parse nested repeating groups
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
                TestDataDictionary.getDictionary());

        assertHeaderField(message, "FIX.4.2", BeginString.FIELD);
        assertHeaderField(message, "40", BodyLength.FIELD);
        assertEquals("wrong field value", 40, message.getHeader().getInt(BodyLength.FIELD));
        assertHeaderField(message, "A", MsgType.FIELD);
        assertBodyField(message, "0", EncryptMethod.FIELD);
        assertTrailerField(message, "96", CheckSum.FIELD);
        NoMsgTypes valueMessageType = new Logon.NoMsgTypes();
        message.getGroup(1, valueMessageType);
        assertEquals("wrong value", "D", valueMessageType.getString(RefMsgType.FIELD));
        assertEquals("wrong value", "R", valueMessageType.getString(MsgDirection.FIELD));
        message.getGroup(2, valueMessageType);
        assertEquals("wrong value", "8", valueMessageType.getString(RefMsgType.FIELD));
        assertEquals("wrong value", "S", valueMessageType.getString(MsgDirection.FIELD));
    }

    public void testParsing2() throws Exception {
        // checksum is not verified in these tests
        // TODO parse repeating groups
        // TODO parse nested repeating groups
        String data = "8=FIX.4.2\0019=76\001";
        data += "35=6\001";
        data += "23=IDENTIFIER\001";
        data += "28=N\001";
        data += "55=MSFT\001";
        data += "54=1\001";
        data += "711=2\001";
        data += "311=DELL\001";
        data += "318=USD\001";
        data += "311=IBM\001";
        data += "318=CAD\001";
        data += "10=037\001";
        Message message = new Message(data, TestDataDictionary.getDictionary());

        assertHeaderField(message, "FIX.4.2", BeginString.FIELD);
        assertHeaderField(message, "76", BodyLength.FIELD);
        assertHeaderField(message, MsgType.INDICATION_OF_INTEREST, MsgType.FIELD);
        assertBodyField(message, "IDENTIFIER", IOIid.FIELD);
        assertTrailerField(message, "037", CheckSum.FIELD);
        IndicationOfInterest.NoUnderlyings valueMessageType = new IndicationOfInterest.NoUnderlyings();
        message.getGroup(1, valueMessageType);
        assertEquals("wrong value", "DELL", valueMessageType.getString(UnderlyingSymbol.FIELD));
        assertEquals("wrong value", "USD", valueMessageType.getString(UnderlyingCurrency.FIELD));
        message.getGroup(2, valueMessageType);
        assertEquals("wrong value", "IBM", valueMessageType.getString(UnderlyingSymbol.FIELD));
        assertEquals("wrong value", "CAD", valueMessageType.getString(UnderlyingCurrency.FIELD));
    }

    private void assertHeaderField(Message message, String expectedValue, int field)
            throws FieldNotFound {
        assertEquals(expectedValue, message.getHeader().getString(field));
        assertFieldNotFound(message, field);
        assertFieldNotFound(message.getTrailer(), field);
    }

    private void assertFieldNotFound(FieldMap message, int field) {
        try {
            message.getString(field);
            fail("expected field to not be found: " + field);
        } catch (FieldNotFound e) {
            // expected
        }
    }

    private void assertBodyField(Message message, String expectedValue, int field)
            throws FieldNotFound {
        assertEquals(expectedValue, message.getString(field));
        assertFieldNotFound(message.getHeader(), field);
        assertFieldNotFound(message.getTrailer(), field);
    }

    private void assertTrailerField(Message message, String expectedValue, int field)
            throws FieldNotFound {
        assertEquals(expectedValue, message.getTrailer().getString(field));
        assertFieldNotFound(message, field);
        assertFieldNotFound(message.getHeader(), field);
    }

    public void testHeaderOutOfOrder() throws Exception {
        try {
            new Message("1=FIX.4.2");
            fail("no exception thrown");
        } catch (InvalidMessage e) {
            // expected
        }
    }
}
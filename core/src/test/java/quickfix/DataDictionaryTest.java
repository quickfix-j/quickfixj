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

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.net.URLClassLoader;

import junit.framework.TestCase;
import quickfix.field.Account;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.LastMkt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NoHops;
import quickfix.field.OrdType;
import quickfix.field.OrderQty;
import quickfix.field.Price;
import quickfix.field.SenderCompID;
import quickfix.field.SenderSubID;
import quickfix.field.SendingTime;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TargetCompID;
import quickfix.field.TimeInForce;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;
import quickfix.test.util.ExpectedTestFailure;

public class DataDictionaryTest extends TestCase {

    public DataDictionaryTest(String arg0) {
        super(arg0);
    }

    public void testDictionary() throws Exception {
        DataDictionary dd = getDictionary();

        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        assertEquals("wrong value description", "BUY", dd.getValueName(4, "B"));
        assertEquals("wrong value type", FieldType.String, dd.getFieldTypeEnum(1));
        assertEquals("wrong version", FixVersions.BEGINSTRING_FIX44, dd.getVersion());
        assertFalse("unexpected field values existence", dd.hasFieldValue(1));
        assertTrue("unexpected field values nonexistence", dd.hasFieldValue(4));
        assertFalse("unexpected field existence", dd.isField(9999));
        assertTrue("unexpected field nonexistence", dd.isField(4));
        assertTrue("unexpected field value existence", !dd.isFieldValue(4, "C"));
        assertTrue("unexpected field value nonexistence", dd.isFieldValue(4, "B"));
        assertTrue("wrong group info", dd.isGroup("A", 384));
        assertFalse("wrong group info", dd.isGroup("A", 1));
        assertNotNull("wrong group info", dd.getGroup("6", 232));
        assertTrue("incorrect header field", dd.isHeaderField(8));
        assertFalse("incorrect header field", dd.isHeaderField(1));
        assertTrue("incorrect trailer field", dd.isTrailerField(89));
        assertFalse("incorrect trailer field", dd.isTrailerField(1));
        assertTrue("incorrect message field", dd.isMsgField("A", 98));
        assertFalse("incorrect message field", dd.isMsgField("A", 1));
        // component field
        assertTrue("incorrect message field", dd.isMsgField("6", 235));
        // group->component field
        //assertTrue("incorrect message field", dd.isMsgField("6", 311));
        assertTrue("incorrect message type", dd.isMsgType("A"));
        assertFalse("incorrect message type", dd.isMsgType("%"));
        assertTrue("incorrect field requirement", dd.isRequiredField("A", 98));
        assertFalse("incorrect field requirement", dd.isRequiredField("A", 95));
        assertEquals("incorrect field name", "Account", dd.getFieldName(1));
        assertEquals("incorrect msg type", "0", dd.getMsgType("Heartbeat"));
        assertEquals("incorrect msg type", "B", dd.getMsgType("News"));
        assertFalse(dd.isMsgField("UNKNOWN_TYPE", 1));
    }

    public void testMissingFieldAttributeForRequired() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "    <field number=\"112\" name=\"TestReqID\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"Heartbeat\" msgtype=\"0\" msgcat=\"admin\">";
        data += "      <field name=\"TestReqID\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        assertConfigErrorForMissingAttributeRequired(data);
    }

    private void assertConfigErrorForMissingAttributeRequired(String data) {
        try {
            new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        } catch (ConfigError e) {
            // Expected
            assertTrue(e.getMessage().indexOf("does not have a 'required'") != -1);
        }
    }

    public void testMissingComponentAttributeForRequired() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "    <field number=\"112\" name=\"TestReqID\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"Heartbeat\" msgtype=\"0\" msgcat=\"admin\">";
        data += "      <component name=\"Instrument\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        assertConfigErrorForMissingAttributeRequired(data);
    }

    public void testMissingGroupAttributeForRequired() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "    <field number=\"112\" name=\"TestReqID\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"Heartbeat\" msgtype=\"0\" msgcat=\"admin\">";
        data += "      <group name=\"TestReqID\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        assertConfigErrorForMissingAttributeRequired(data);
    }

    public void testHeaderTrailerRequired() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "    <field name=\"OnBehalfOfCompID\" required=\"N\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "    <field name=\"Signature\" required=\"N\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"115\" name=\"OnBehalfOfCompID\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "    <field number=\"89\" name=\"Signature\" type=\"STRING\"/>";
        data += "    <field number=\"37\" name=\"TestReqID\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"Heartbeat\" msgtype=\"0\" msgcat=\"admin\">";
        data += "      <group name=\"TestReqID\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        DataDictionary dd = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertTrue("BeginString should be required", dd.isRequiredHeaderField(8));
        assertFalse("OnBehalfOfCompID should not be required", dd.isRequiredHeaderField(115));
        assertTrue("Checksum should be required", dd.isRequiredTrailerField(10));
        assertFalse("Signature should not be required", dd.isRequiredTrailerField(89));

        // now tests for fields that aren't actually in the dictionary - should come back false
        assertFalse("Unknown header field shows up as required", dd.isRequiredHeaderField(666));
        assertFalse("Unknown trailer field shows up as required", dd.isRequiredTrailerField(666));
    }

    public void testHeaderGroupField() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isHeaderGroup(NoHops.FIELD));
    }

    public void testMessageValidateBodyOnly() throws Exception {
        final quickfix.fix44.NewOrderSingle newSingle = new quickfix.fix44.NewOrderSingle(
                new ClOrdID("123"), new Side(Side.BUY), new TransactTime(), new OrdType(
                        OrdType.LIMIT));
        newSingle.setField(new OrderQty(42));
        newSingle.setField(new Price(42.37));
        newSingle.setField(new HandlInst());
        newSingle.setField(new Symbol("QFJ"));
        newSingle.setField(new HandlInst(HandlInst.MANUAL_ORDER));
        newSingle.setField(new TimeInForce(TimeInForce.DAY));
        newSingle.setField(new Account("testAccount"));

        final DataDictionary dd = getDictionary();
        new ExpectedTestFailure(FieldException.class, "field=") {
            protected void execute() throws Throwable {
                dd.validate(newSingle);
            }
        }.run();

        dd.validate(newSingle, true);

    }

    // QF C++ treats the string argument as a filename although it's
    // named 'url'. QFJ string argument can be either but this test
    // ensures the DD works correctly with a regular file path.
    public void testDictionaryWithFilename() throws Exception {
        DataDictionary dd = new DataDictionary("FIX40.xml");
        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        // It worked!
    }

    // Support finding DD in classpath
    public void testDictionaryInClassPath() throws Exception {
        URLClassLoader customClassLoader = new URLClassLoader(new URL[] { new URL("file:etc") },
                getClass().getClassLoader());
        Thread currentThread = Thread.currentThread();
        ClassLoader previousContextClassLoader = currentThread.getContextClassLoader();
        currentThread.setContextClassLoader(customClassLoader);
        try {
            DataDictionary dd = new DataDictionary("FIX40.xml");
            assertEquals("wrong field name", "Currency", dd.getFieldName(15));
            // It worked!
        } finally {
            currentThread.setContextClassLoader(previousContextClassLoader);
        }
    }

    // QFJ-235
    public void testWildcardEnumValue() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isFieldValue(65, "FOO"));
    }
    
    public void testMessageCategory() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isAdminMessage(MsgType.LOGON));
        assertFalse(dd.isAppMessage(MsgType.LOGON));
        assertFalse(dd.isAdminMessage(MsgType.ORDER_SINGLE));
        assertTrue(dd.isAppMessage(MsgType.ORDER_SINGLE));
    }

    public void testAllowUnknownFields() throws Exception {
        final quickfix.fix44.NewOrderSingle newSingle = new quickfix.fix44.NewOrderSingle(
                new ClOrdID("123"), new Side(Side.BUY), new TransactTime(), new OrdType(
                        OrdType.LIMIT));
        newSingle.getHeader().setField(new SenderCompID("SENDER"));
        newSingle.getHeader().setField(new TargetCompID("TARGET"));
        newSingle.getHeader().setField(new BodyLength(100));
        newSingle.getHeader().setField(new MsgSeqNum(25));
        newSingle.getHeader().setField(new SendingTime());
        newSingle.getTrailer().setField(new CheckSum("100"));
        newSingle.setField(new OrderQty(42));
        newSingle.setField(new Price(42.37));
        newSingle.setField(new HandlInst());
        newSingle.setField(new Symbol("QFJ"));
        newSingle.setField(new HandlInst(HandlInst.MANUAL_ORDER));
        newSingle.setField(new TimeInForce(TimeInForce.DAY));
        newSingle.setField(new Account("testAccount"));
        
        // Invalid field for this message
        newSingle.setField(new LastMkt("FOO"));

        final DataDictionary dictionary = new DataDictionary(getDictionary());

        new ExpectedTestFailure(FieldException.class, "field=") {
            protected void execute() throws Throwable {
                dictionary.validate(newSingle);
            }
        }.run();

        dictionary.setAllowUnknownMessageFields(true);
        dictionary.validate(newSingle);
    }
    
    //QFJ-535
    public void testValidateFieldsOutOfOrderForGroups() throws Exception {
        final DataDictionary dictionary = new DataDictionary(getDictionary());
        dictionary.setCheckUnorderedGroupFields(false);
        Message messageWithGroupLevel1 = new Message(
                "8=FIX.4.49=18535=D34=2549=SENDER56=TARGET52=20110412-13:43:0060=20110412-13:43:001=testAccount11=12321=338=4240=244=42.3754=155=QFJ59=078=179=allocAccount736=currency661=110=130",
                dictionary);
        dictionary.validate(messageWithGroupLevel1);
        
        Message messageWithGroupLevel2 = new Message(
                "8=FIX.4.49=18535=D34=2549=SENDER56=TARGET52=20110412-13:43:0060=20110412-13:43:001=testAccount11=12321=338=4240=244=42.3754=155=QFJ59=078=179=allocAccount539=1524=1538=1525=a10=145",
                dictionary);
        dictionary.validate(messageWithGroupLevel2);
    }
    
    //QFJ-535
    public void testNewOrderSingleWithCorrectTag50() throws Exception {

        final DataDictionary dataDictionary = getDictionary();
        dataDictionary.setCheckFieldsOutOfOrder(true);
        
        String correctFixMessage = new String("8=FIX.4.4|9=218|35=D|49=cust|50=trader|56=FixGateway|34=449|52=20110420-09:17:40|11=clordid|54=1|38=50|59=6|40=2|44=77.1|"
                + "432=20110531|15=CHF|22=8|55=symbol|48=CH1234.CHF|21=1|60=20110420-11:17:39.000|63=0|207=VX|10=009|").replace('|', '\001');

        //in any case, it must be validated as the message is correct
        //doValidation and checkFieldsOutOfOrder
        final NewOrderSingle nos1 = new NewOrderSingle();
        nos1.fromString(correctFixMessage, dataDictionary, true);
        dataDictionary.validate(nos1);
        assertTrue(nos1.getHeader().isSetField(new SenderSubID()));

        //doNotValidation and checkFieldsOutOfOrder
        final NewOrderSingle nos2 = new NewOrderSingle();
        nos2.fromString(correctFixMessage, dataDictionary, false);
        dataDictionary.validate(nos2);
        assertTrue(nos2.getHeader().isSetField(new SenderSubID()));
        
        dataDictionary.setCheckFieldsOutOfOrder(false);
        
        //doValidation and no checkFieldsOutOfOrder
        final NewOrderSingle nos3 = new NewOrderSingle();
        nos3.fromString(correctFixMessage, dataDictionary, true);
        dataDictionary.validate(nos3);
        assertTrue(nos3.getHeader().isSetField(new SenderSubID()));

        //doNotValidation and no checkFieldsOutOfOrder
        final NewOrderSingle nos4 = new NewOrderSingle();
        nos4.fromString(correctFixMessage, dataDictionary, false);
        dataDictionary.validate(nos4);
        assertTrue(nos4.getHeader().isSetField(new SenderSubID()));
        
        
        
    }
    public void testNewOrderSingleWithMisplacedTag50() throws Exception {
        
        final DataDictionary dataDictionary = getDictionary();
        dataDictionary.setCheckFieldsOutOfOrder(true);
        
        String incorrectFixMessage = new String("8=FIX.4.4|9=218|35=D|49=cust|56=FixGateway|34=449|52=20110420-09:17:40|11=clordid|54=1|38=50|59=6|40=2|44=77.1|"
            + "432=20110531|15=CHF|22=8|55=symbol|48=CH1234.CHF|21=1|60=20110420-11:17:39.000|63=0|207=VX|50=trader|10=009|").replace('|', '\001');
        
        //doValidation and checkFieldsOutOfOrder -> should fail
        final NewOrderSingle nos1 = new NewOrderSingle();
        try  {
            nos1.fromString(incorrectFixMessage, dataDictionary, true);
        } catch (FieldException fe) {
            //expected exception
        }
        
        //doNotValidation and checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos2 = new NewOrderSingle();
        nos2.fromString(incorrectFixMessage, dataDictionary, false);
        dataDictionary.validate(nos2);
        assertTrue(nos2.getHeader().isSetField(new SenderSubID()));
        
        dataDictionary.setCheckFieldsOutOfOrder(false);
        
        //doValidation and no checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos3 = new NewOrderSingle();
        nos3.fromString(incorrectFixMessage, dataDictionary, true);
        dataDictionary.validate(nos3);
        assertTrue(nos3.getHeader().isSetField(new SenderSubID()));
        
      //doNotValidation and no checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos4 = new NewOrderSingle();
        nos4.fromString(incorrectFixMessage, dataDictionary, false);
        dataDictionary.validate(nos4);
        assertTrue(nos4.getHeader().isSetField(new SenderSubID()));
        
        
        
    }

    
    
    //
    // Group Validation Tests in RepeatingGroupTest
    //
    
    private static DataDictionary testDataDictionary;

    public static DataDictionary getDictionary() throws Exception {
        if (testDataDictionary == null) {
            testDataDictionary = new DataDictionary(DataDictionaryTest.class.getClassLoader()
                    .getResourceAsStream("FIX44.xml"));
        }
        return testDataDictionary;
    }
    
    public static DataDictionary getDictionary(String fileName) throws Exception {
        return new DataDictionary(DataDictionaryTest.class.getClassLoader()
                .getResourceAsStream(fileName));
    }
}

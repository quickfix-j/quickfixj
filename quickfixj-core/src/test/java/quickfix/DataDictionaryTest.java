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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import quickfix.field.Account;
import quickfix.field.AvgPx;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.ClOrdID;
import quickfix.field.EffectiveTime;
import quickfix.field.HandlInst;
import quickfix.field.LastMkt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NoPartyIDs;
import quickfix.field.NoPartySubIDs;
import quickfix.field.NoRelatedSym;
import quickfix.field.OrdType;
import quickfix.field.OrderQty;
import quickfix.field.PartyID;
import quickfix.field.PartyIDSource;
import quickfix.field.PartyRole;
import quickfix.field.PartySubID;
import quickfix.field.PartySubIDType;
import quickfix.field.Price;
import quickfix.field.QuoteReqID;
import quickfix.field.SenderCompID;
import quickfix.field.SenderSubID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TargetCompID;
import quickfix.field.TimeInForce;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;
import quickfix.fix44.Quote;
import quickfix.fix44.QuoteRequest;
import quickfix.test.util.ExpectedTestFailure;

/**
 * NOTE: There are two DataDictionaryTests. One in quickfixj-base, one in
 * quickfixj-core, which each test some functionality. This test covers some
 * test cases that cannot be tested in the quickfixj-base module due to usage of
 * message classes that are generated later in the compile process.
 */
public class DataDictionaryTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testDictionary() throws Exception {
        DataDictionary dd = getDictionary();

        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        assertEquals("wrong field tag", 15, dd.getFieldTag("Currency"));
        assertEquals("wrong value description", "BUY", dd.getValueName(4, "B"));
        assertEquals("wrong value type", FieldType.STRING, dd.getFieldType(1));
        assertEquals("wrong version", FixVersions.BEGINSTRING_FIX44, dd.getVersion());
        assertEquals("incorrectly validates values", false, dd.isFieldValue(15, "10"));
        assertEquals("incorrectly validates valid value", true, dd.isFieldValue(4, "B"));
        assertEquals("incorrectly validates invalid value", false, dd.isFieldValue(4, "C"));
        assertEquals("incorrectly validates multiple values", true, dd.isFieldValue(277, "A K"));
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



    @Test
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
            @Override
            protected void execute() throws Throwable {
                dd.validate(newSingle, new ValidationSettings());
            }
        }.run();

        dd.validate(newSingle, true, new ValidationSettings());
    }

    @Test
    public void testMessageDataDictionaryMismatch() throws Exception {
        final quickfix.fix43.NewOrderSingle newSingle = new quickfix.fix43.NewOrderSingle(
                new ClOrdID("123"), new HandlInst(HandlInst.MANUAL_ORDER), new Side(Side.BUY), new TransactTime(), new OrdType(
                        OrdType.LIMIT));
        newSingle.setField(new OrderQty(42));
        newSingle.setField(new Price(42.37));
        newSingle.setField(new Symbol("QFJ"));
        newSingle.setField(new TimeInForce(TimeInForce.DAY));
        newSingle.setField(new Account("testAccount"));

        final DataDictionary dd = getDictionary();
        new ExpectedTestFailure(UnsupportedVersion.class,
                "Message version 'FIX.4.3' does not match the data dictionary version 'FIX.4.4'") {
            @Override
            protected void execute() throws Throwable {
                dd.validate(newSingle, new ValidationSettings());
            }
        }.run();

        // TODO: This is unexpected for pre-FIX 5.0 messages:
        //   If bodyOnly is true, the correct data dictionary is not checked.
        dd.validate(newSingle, true, new ValidationSettings());
    }
    
    @Test
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
        final ValidationSettings validationSettings = new ValidationSettings();

        new ExpectedTestFailure(FieldException.class, "field=") {
            @Override
            protected void execute() throws Throwable {
                dictionary.validate(newSingle, validationSettings);
            }
        }.run();

        validationSettings.setAllowUnknownMessageFields(true);
        dictionary.validate(newSingle, validationSettings);
    }

    // QFJ-535
    @Test
    public void testNewOrderSingleWithCorrectTag50() throws Exception {

        final DataDictionary dataDictionary = new DataDictionary(getDictionary());
        final ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckFieldsOutOfOrder(true);

        String correctFixMessage = "8=FIX.4.4\0019=218\00135=D\00149=cust\00150=trader\001" +
            "56=FixGateway\00134=449\00152=20110420-09:17:40\00111=clordid\00154=1\00138=50\001" +
            "59=6\00140=2\00144=77.1\001432=20110531\00115=CHF\00122=8\00155=symbol\001" +
            "48=CH1234.CHF\00121=1\00160=20110420-11:17:39.000\00163=0\001207=VX\00110=009\001";

        // in any case, it must be validated as the message is correct
        //doValidation and checkFieldsOutOfOrder
        final NewOrderSingle nos1 = new NewOrderSingle();
        nos1.fromString(correctFixMessage, dataDictionary, validationSettings, true);
        dataDictionary.validate(nos1, validationSettings);
        assertTrue(nos1.getHeader().isSetField(new SenderSubID()));

        //doNotValidation and checkFieldsOutOfOrder
        final NewOrderSingle nos2 = new NewOrderSingle();
        nos2.fromString(correctFixMessage, dataDictionary, validationSettings, false);
        dataDictionary.validate(nos2, validationSettings);
        assertTrue(nos2.getHeader().isSetField(new SenderSubID()));

        validationSettings.setCheckFieldsOutOfOrder(false);

        //doValidation and no checkFieldsOutOfOrder
        final NewOrderSingle nos3 = new NewOrderSingle();
        nos3.fromString(correctFixMessage, dataDictionary, validationSettings, true);
        dataDictionary.validate(nos3, validationSettings);
        assertTrue(nos3.getHeader().isSetField(new SenderSubID()));

        //doNotValidation and no checkFieldsOutOfOrder
        final NewOrderSingle nos4 = new NewOrderSingle();
        nos4.fromString(correctFixMessage, dataDictionary, validationSettings, false);
        dataDictionary.validate(nos4, validationSettings);
        assertTrue(nos4.getHeader().isSetField(new SenderSubID()));
    }

    @Test
    public void testNewOrderSingleWithMisplacedTag50() throws Exception {

        final DataDictionary dataDictionary = new DataDictionary(getDictionary());
        final ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckFieldsOutOfOrder(true);

        String incorrectFixMessage = "8=FIX.4.4\0019=218\00135=D\00149=cust\00156=FixGateway\001" +
            "34=449\00152=20110420-09:17:40\00111=clordid\00154=1\00138=50\00159=6\00140=2\001" +
            "44=77.1\001432=20110531\00115=CHF\00122=8\00155=symbol\00148=CH1234.CHF\00121=1\001" +
            "60=20110420-11:17:39.000\00163=0\001207=VX\00150=trader\00110=009\001";

        //doValidation and checkFieldsOutOfOrder -> should fail
        final NewOrderSingle nos1 = new NewOrderSingle();
        try {
            nos1.fromString(incorrectFixMessage, dataDictionary, validationSettings, true);
        } catch (FieldException fe) {
            // expected exception
        }

        //doNotValidation and checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos2 = new NewOrderSingle();
        nos2.fromString(incorrectFixMessage, dataDictionary, validationSettings, false);
        dataDictionary.validate(nos2, validationSettings);
        assertTrue(nos2.getHeader().isSetField(new SenderSubID()));

        validationSettings.setCheckFieldsOutOfOrder(false);

        //doValidation and no checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos3 = new NewOrderSingle();
        nos3.fromString(incorrectFixMessage, dataDictionary, validationSettings, true);
        dataDictionary.validate(nos3, validationSettings);
        assertTrue(nos3.getHeader().isSetField(new SenderSubID()));

        //doNotValidation and no checkFieldsOutOfOrder -> should NOT fail
        final NewOrderSingle nos4 = new NewOrderSingle();
        nos4.fromString(incorrectFixMessage, dataDictionary, validationSettings, false);
        dataDictionary.validate(nos4, validationSettings);
        assertTrue(nos4.getHeader().isSetField(new SenderSubID()));
    }

    @Test
    public void testCopy() throws Exception {
        final DataDictionary dataDictionary = new DataDictionary(getDictionary());

        DataDictionary ddCopy = new DataDictionary(dataDictionary);

        assertArrayEquals(getDictionary().getOrderedFields(),ddCopy.getOrderedFields());
        assertArrayEquals(getDictionary().getOrderedFields(),dataDictionary.getOrderedFields());

        DataDictionary.GroupInfo groupFromDDCopy = ddCopy.getGroup(NewOrderSingle.MSGTYPE, NoPartyIDs.FIELD);

        DataDictionary originalGroupDictionary = getDictionary().getGroup(NewOrderSingle.MSGTYPE, NoPartyIDs.FIELD).getDataDictionary();
        DataDictionary groupDictionary = dataDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartyIDs.FIELD).getDataDictionary();
        DataDictionary copyGroupDictionary = ddCopy.getGroup(NewOrderSingle.MSGTYPE, NoPartyIDs.FIELD).getDataDictionary();
        assertArrayEquals(originalGroupDictionary.getOrderedFields(), groupDictionary.getOrderedFields());
        assertArrayEquals(originalGroupDictionary.getOrderedFields(), copyGroupDictionary.getOrderedFields());

        DataDictionary originalNestedGroupDictionary = originalGroupDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartySubIDs.FIELD).getDataDictionary();
        DataDictionary nestedGroupDictionary = groupDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartySubIDs.FIELD).getDataDictionary();
        DataDictionary copyNestedGroupDictionary = copyGroupDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartySubIDs.FIELD).getDataDictionary();
        assertArrayEquals(originalNestedGroupDictionary.getOrderedFields(), nestedGroupDictionary.getOrderedFields());
        assertArrayEquals(originalNestedGroupDictionary.getOrderedFields(), copyNestedGroupDictionary.getOrderedFields());
    }

    @Test
    public void testOrderedFields() throws Exception {
        final DataDictionary dataDictionary = getDictionary();

        final DataDictionary partyIDsDictionary = dataDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartyIDs.FIELD).getDataDictionary();
        int[] expectedPartyIDsFieldOrder = new int[] {PartyID.FIELD, PartyIDSource.FIELD, PartyRole.FIELD, NoPartySubIDs.FIELD};
        assertArrayEquals(expectedPartyIDsFieldOrder, partyIDsDictionary.getOrderedFields());

        final DataDictionary partySubIDsDictionary = partyIDsDictionary.getGroup(NewOrderSingle.MSGTYPE, NoPartySubIDs.FIELD).getDataDictionary();
        int[] expectedPartySubIDsFieldOrder = new int[] {PartySubID.FIELD, PartySubIDType.FIELD};
        assertArrayEquals(expectedPartySubIDsFieldOrder, partySubIDsDictionary.getOrderedFields());
    }

    /**
     * <pre>
     * +---------------------------+------------------------+-------+------------+
     * | AllowUnknownMessageFields | CheckUserDefinedFields | Field | Validation |
     * +---------------------------+------------------------+-------+------------+
     * |                     false |                  false |     6 |    FAILURE |
     * |                     false |                   true |     6 |    FAILURE |
     * |                      true |                  false |     6 |    SUCCESS |
     * |                      true |                   true |     6 |    SUCCESS |
     * +---------------------------+------------------------+-------+------------+
     * </pre>
     */
    @Test
    public void testNonUDFDefinedInFieldsSectionDontAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setDecimal(AvgPx.FIELD, new BigDecimal(1.2345));

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(false);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Tag not defined for this message type, field=6");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFDefinedInFieldsSectionDontAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setDecimal(AvgPx.FIELD, new BigDecimal(1.2345));

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Tag not defined for this message type, field=6");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFDefinedInFieldsSectionAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setDecimal(AvgPx.FIELD, new BigDecimal(1.2345));

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFDefinedInFieldsSectionAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setDecimal(AvgPx.FIELD, new BigDecimal(1.2345));

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(true);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    /**
     * <pre>
     * +---------------------------+------------------------+-------+------------+
     * | AllowUnknownMessageFields | CheckUserDefinedFields | Field | Validation |
     * +---------------------------+------------------------+-------+------------+
     * |                     false |                  false |  5000 |    SUCCESS |
     * |                     false |                   true |  5000 |    FAILURE |
     * |                      true |                  false |  5000 |    SUCCESS |
     * |                      true |                   true |  5000 |    FAILURE |
     * +---------------------------+------------------------+-------+------------+
     * </pre>
     */
    @Test
    public void testUDFDefinedInFieldsSectionDontAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(5000, 555);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFDefinedInFieldsSectionDontAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(5000, 555);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Tag not defined for this message type, field=5000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFDefinedInFieldsSectionAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(5000, 555);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFDefinedInFieldsSectionAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(5000, 555);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Tag not defined for this message type, field=5000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    /**
     * <pre>
     * +---------------------------+------------------------+-------+------------+
     * | AllowUnknownMessageFields | CheckUserDefinedFields | Field | Validation |
     * +---------------------------+------------------------+-------+------------+
     * |                     false |                  false |  1000 |    FAILURE |
     * |                     false |                   true |  1000 |    FAILURE |
     * |                      true |                  false |  1000 |    SUCCESS |
     * |                      true |                   true |  1000 |    SUCCESS |
     * +---------------------------+------------------------+-------+------------+
     * </pre>
     */
    @Test
    public void testNonUDFNotDefinedInFieldsSectionDontAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(1000, 111);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(false);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Invalid tag number, field=1000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFNotDefinedInFieldsSectionDontAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(1000, 111);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Invalid tag number, field=1000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFNotDefinedInFieldsSectionAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(1000, 111);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testNonUDFNotDefinedInFieldsSectionAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(1000, 111);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(true);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    /**
     * <pre>
     * +---------------------------+------------------------+-------+------------+
     * | AllowUnknownMessageFields | CheckUserDefinedFields | Field | Validation |
     * +---------------------------+------------------------+-------+------------+
     * |                     false |                  false |  6000 |    SUCCESS |
     * |                     false |                   true |  6000 |    FAILURE |
     * |                      true |                  false |  6000 |    SUCCESS |
     * |                      true |                   true |  6000 |    FAILURE |
     * +---------------------------+------------------------+-------+------------+
     * </pre>
     */
    @Test
    public void testUDFNotDefinedInFieldsSectionDontAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(6000, 666);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFNotDefinedInFieldsSectionDontAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(6000, 666);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(false);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Invalid tag number, field=6000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFNotDefinedInFieldsSectionAllowUMFDontCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(6000, 666);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(false);

        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testUDFNotDefinedInFieldsSectionAllowUMFCheckUDF() throws Exception {
        Message quoteRequest = createQuoteRequest();
        quoteRequest.setInt(6000, 666);

        DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setAllowUnknownMessageFields(true);
        validationSettings.setCheckUserDefinedFields(true);

        expectedException.expect(FieldException.class);
        expectedException.expectMessage("Invalid tag number, field=6000");
        dataDictionary.validate(quoteRequest, true, validationSettings);
    }

    private Message createQuoteRequest() {
        Message quoteRequest = new Message();
        quoteRequest.getHeader().setString(MsgType.FIELD, MsgType.QUOTE_REQUEST);
        quoteRequest.setString(QuoteReqID.FIELD, "QR-12345");
        final Group noRelatedSymGroup = new Group(NoRelatedSym.FIELD, Symbol.FIELD);
        noRelatedSymGroup.setString(Symbol.FIELD, "AAPL");
        quoteRequest.addGroup(noRelatedSymGroup);
        return quoteRequest;
    }

    /**
     * Dictionary "FIX44.xml":<br/>
     * <pre>
     * message name=QuoteRequest msgtype=R msgcat=app
     *   group name=NoRelatedSym required=Y
     *     component name=Instrument required=Y
     *       field name=Symbol required=Y
     * </pre>
     * Field Symbol(55) is required, so validation must fail.
     * @throws Exception
     */
    @Test
    public void testGroupWithReqdComponentWithReqdFieldValidation() throws Exception {
        final Message quoteRequest = createQuoteRequest();
        quoteRequest.getGroup(1, NoRelatedSym.FIELD).removeField(Symbol.FIELD);
        final DataDictionary dictionary = getDictionary();
        final ValidationSettings validationSettings = new ValidationSettings();

        expectedException.expect(FieldException.class);
        expectedException.expect(hasProperty("sessionRejectReason", is(SessionRejectReason.REQUIRED_TAG_MISSING)));
        expectedException.expect(hasProperty("field", is(Symbol.FIELD)));

        dictionary.validate(quoteRequest, true, validationSettings);
    }

    @Test
    public void testRequiredFieldInsideComponentWithinRepeatingGroup() throws Exception {
        DataDictionary dictionary = getDictionary();

        assertTrue(dictionary.isRequiredField(Quote.MSGTYPE, Symbol.FIELD));
        assertFalse(dictionary.isRequiredField(QuoteRequest.MSGTYPE, Symbol.FIELD));

        DataDictionary.GroupInfo quoteRequestGroupInfo = dictionary.getGroup(QuoteRequest.MSGTYPE, NoRelatedSym.FIELD);
        assertTrue(quoteRequestGroupInfo.getDataDictionary().isRequiredField(QuoteRequest.MSGTYPE, Symbol.FIELD));
    }

    /**
     * Field EffectiveTime(168) is defined as UTCTIMESTAMP so an empty string value is invalid but if we allow blank values that should not fail
     * validation
     * @throws Exception
     */
    @Test
    public void testAllowingBlankValuesDisablesFieldValidation() throws Exception {
        final DataDictionary dictionary = getDictionary();
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckFieldsHaveValues(false);
        final quickfix.fix44.NewOrderSingle newSingle = new quickfix.fix44.NewOrderSingle(
                new ClOrdID("123"), new Side(Side.BUY), new TransactTime(), new OrdType(OrdType.LIMIT)
        );
        newSingle.setField(new OrderQty(42));
        newSingle.setField(new Price(42.37));
        newSingle.setField(new HandlInst());
        newSingle.setField(new Symbol("QFJ"));
        newSingle.setField(new HandlInst(HandlInst.MANUAL_ORDER));
        newSingle.setField(new TimeInForce(TimeInForce.DAY));
        newSingle.setField(new Account("testAccount"));
        newSingle.setField(new StringField(EffectiveTime.FIELD));
        dictionary.validate(newSingle, true, validationSettings);
    }


    // QFJ-971
    @Test
    public void testConcurrentValidationFailure() throws Exception {
        final String data = "8=FIX.4.4|9=284|35=F|49=TEST_49|56=TEST_56|34=420|52=20190302-07:31:57.079|"
                + "115=TEST3|116=TEST_116|11=TEST_11|41=TEST_41|55=TEST_55|48=TEST_48|22=4|54=2|"
                + "60=20190302-07:31:56.933|38=100|207=TEST_207|453=1|448=TEST_448|447=D|452=3|10=204|";
        final String msgString = data.replace('|', (char) 1);

        // use some more threads to make it more likely that the problem will occur
        final int noOfThreads = 8;
        final int noOfIterations = 500;

        for (int i = 0; i < noOfIterations; i++) {
            final DataDictionary dd = new DataDictionary("FIX44.xml");
            final MessageFactory messageFactory = new quickfix.fix44.MessageFactory();
            PausableThreadPoolExecutor ptpe = new PausableThreadPoolExecutor(noOfThreads);
            // submit threads to pausable executor and try to let them start at the same time
            ptpe.pause();
            List<Future> resultList = new ArrayList<>();
            for (int j = 0; j < noOfThreads; j++) {
                final Callable messageParser = (Callable) () -> {
                    Message msg = MessageUtils.parse(messageFactory, dd, new ValidationSettings(), msgString);
                    Group partyGroup = msg.getGroups(quickfix.field.NoPartyIDs.FIELD).get(0);
                    char partyIdSource = partyGroup.getChar(PartyIDSource.FIELD);
                    assertEquals(PartyIDSource.PROPRIETARY, partyIdSource);
                    return msg;
                };
                resultList.add(ptpe.submit(messageParser));
            }

            // start all threads
            ptpe.resume();
            ptpe.shutdown();
            ptpe.awaitTermination(10, TimeUnit.MILLISECONDS);

            // validate results
            for (Future future : resultList) {
                // if unsuccessful, this will throw an ExecutionException
                future.get();
            }
        }
    }

    //
    // Group Validation Tests in RepeatingGroupTest
    //

    private static DataDictionary testDataDictionary;

    /**
     * Returns a singleton FIX 4.4 data dictionary.
     * NOTE: the returned dictionary must not be modified in any way
     * (e.g. by calling any of its setter methods). If it needs to
     * be modified, it can be cloned by using the
     * {@link DataDictionary#DataDictionary(DataDictionary)
     * DataDictionary copy constructor}.
     *
     * @return a singleton FIX 4.4 data dictionary
     * @throws Exception if the data dictionary cannot be loaded
     */
    public static DataDictionary getDictionary() throws Exception {
        if (testDataDictionary == null) {
            testDataDictionary = getDictionary("FIX44.xml");
        }
        return testDataDictionary;
    }

    /**
     * Loads and returns the named data dictionary.
     *
     * @param fileName the data dictionary file name (e.g. "FIX44.xml")
     * @return a new data dictionary instance
     * @throws Exception if the named data dictionary cannot be loaded
     */
    public static DataDictionary getDictionary(String fileName) throws Exception {
        return new DataDictionary(DataDictionaryTest.class.getClassLoader()
                .getResourceAsStream(fileName));
    }

}

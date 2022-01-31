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

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.quickfixj.CharsetSupport;
import quickfix.field.Account;
import quickfix.field.AllocAccount;
import quickfix.field.AllocShares;
import quickfix.field.ApplExtID;
import quickfix.field.ApplVerID;
import quickfix.field.AvgPx;
import quickfix.field.BeginString;
import quickfix.field.BidType;
import quickfix.field.BodyLength;
import quickfix.field.CheckSum;
import quickfix.field.ClOrdID;
import quickfix.field.CountryOfIssue;
import quickfix.field.CrossID;
import quickfix.field.CrossPrioritization;
import quickfix.field.CrossType;
import quickfix.field.CstmApplVerID;
import quickfix.field.CumQty;
import quickfix.field.EncodedText;
import quickfix.field.EncodedTextLen;
import quickfix.field.EncryptMethod;
import quickfix.field.ExecID;
import quickfix.field.ExecType;
import quickfix.field.HandlInst;
import quickfix.field.Headline;
import quickfix.field.HopCompID;
import quickfix.field.IOIID;
import quickfix.field.LastPx;
import quickfix.field.LastQty;
import quickfix.field.LeavesQty;
import quickfix.field.LegPrice;
import quickfix.field.LegQty;
import quickfix.field.LegRefID;
import quickfix.field.LegSymbol;
import quickfix.field.ListID;
import quickfix.field.ListSeqNo;
import quickfix.field.MDEntryPx;
import quickfix.field.MaturityMonthYear;
import quickfix.field.MsgDirection;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.NoOrders;
import quickfix.field.OrdStatus;
import quickfix.field.OrdType;
import quickfix.field.OrderID;
import quickfix.field.OrderQty;
import quickfix.field.PartyID;
import quickfix.field.PartyIDSource;
import quickfix.field.PartyRole;
import quickfix.field.PreviouslyReported;
import quickfix.field.Price;
import quickfix.field.PutOrCall;
import quickfix.field.QuoteAckStatus;
import quickfix.field.RawData;
import quickfix.field.RawDataLength;
import quickfix.field.RefMsgType;
import quickfix.field.SecureData;
import quickfix.field.SecurityID;
import quickfix.field.SecurityIDSource;
import quickfix.field.SecurityReqID;
import quickfix.field.SecurityRequestResult;
import quickfix.field.SecurityResponseID;
import quickfix.field.SecurityType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.Side;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.StrikePrice;
import quickfix.field.Symbol;
import quickfix.field.TargetCompID;
import quickfix.field.TargetSubID;
import quickfix.field.Text;
import quickfix.field.TotNoOrders;
import quickfix.field.TradeDate;
import quickfix.field.TradeReportID;
import quickfix.field.TransactTime;
import quickfix.field.UnderlyingCurrency;
import quickfix.field.UnderlyingSymbol;
import quickfix.fix42.NewOrderSingle;
import quickfix.fix43.Message.Header;
import quickfix.fix43.NewOrderList;
import quickfix.fix44.ExecutionReport;
import quickfix.fix44.IndicationOfInterest;
import quickfix.fix44.Logon;
import quickfix.fix44.Logon.NoMsgTypes;
import quickfix.fix44.NewOrderCross;
import quickfix.fix44.NewOrderSingle.NoPartyIDs;
import quickfix.fix44.News;
import quickfix.fix44.TradeCaptureReport;
import quickfix.fix44.component.Instrument;
import quickfix.fix44.component.Parties;
import quickfix.fix50.MarketDataSnapshotFullRefresh;

import javax.xml.parsers.DocumentBuilderFactory;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
    public void testTrailerFieldOrdering() throws Exception {
        final NewOrderSingle order = createNewOrderSingle();

        order.getTrailer().setField(new Signature("FOO"));
        order.getTrailer().setField(new SignatureLength(3));

        assertTrue(order.toString().contains("93=3\00189=FOO\001"));
    }

    private NewOrderSingle createNewOrderSingle() {
        return new NewOrderSingle(new ClOrdID("CLIENT"), new HandlInst(
            HandlInst.AUTOMATED_EXECUTION_INTERVENTION_OK), new Symbol("ORCL"),
            new Side(Side.BUY), new TransactTime(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC)), new OrdType(OrdType.LIMIT));
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

            final int[] trailerFieldOrder = { Signature.FIELD, SignatureLength.FIELD, CheckSum.FIELD };

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
    public void testHeaderGroupParsing() throws Exception {
        final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "627=2\001628=FOO\001628=BAR\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=228\001",
                DataDictionaryTest.getDictionary());

        final quickfix.fix44.Message.Header.NoHops hops = new quickfix.fix44.Message.Header.NoHops();
        message.getHeader().getGroup(1, hops);
        assertEquals("FOO", hops.getString(HopCompID.FIELD));
        message.getHeader().getGroup(2, hops);
        assertEquals("BAR", hops.getString(HopCompID.FIELD));
    }

    @Test
    public void testEmbeddedMessage() throws Exception {

        final ExecutionReport report = new ExecutionReport(new OrderID("ORDER"),
                new ExecID("EXEC"), new ExecType(ExecType.TRADE), new OrdStatus(OrdStatus.FILLED),
                new Side(Side.BUY), new LeavesQty(100), new CumQty(100), new AvgPx(50));

        final NewOrderSingle order = createNewOrderSingle();
        String text = order.toString();
        report.set(new EncodedTextLen(text.length()));
        report.set(new EncodedText(text));

        final Message msg = new Message(report.toString(), DataDictionaryTest.getDictionary());
        assertEquals("embedded order", text, msg.getString(EncodedText.FIELD));
    }

    private void doTestMessageWithEncodedField(String charset, String text) throws Exception {
        CharsetSupport.setCharset(charset);
        try {
            NewOrderSingle order = createNewOrderSingle();
            order.set(new EncodedTextLen(MessageUtils.length(CharsetSupport.getCharsetInstance(), text)));
            order.set(new EncodedText(text));
            final Message msg = new Message(order.toString(), DataDictionaryTest.getDictionary());
            assertEquals(charset + " encoded field", text, msg.getString(EncodedText.FIELD));
        } finally {
            CharsetSupport.setCharset(CharsetSupport.getDefaultCharset());
        }
    }

    @Test
    public void testMessageWithEncodedField() throws Exception {
        String text = "\u6D4B\u9A8C\001\u6570\u636E"; // Chinese with SOH in the middle

        doTestMessageWithEncodedField("UTF-8", text);
        doTestMessageWithEncodedField("EUC-JP", text);
        doTestMessageWithEncodedField("ISO-2022-JP", text);
        doTestMessageWithEncodedField("Shift_JIS", text);
        doTestMessageWithEncodedField("GBK", text);
//        doTestMessageWithEncodedField("UTF-16", text); // double-byte charset not supported yet
    }

    @Test
    public void testParsing() throws Exception {
        // checksum is not verified in these tests
        final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
                DataDictionaryTest.getDictionary());

        assertHeaderField(message, "FIX.4.2", BeginString.FIELD);
        assertHeaderField(message, "40", BodyLength.FIELD);
        assertEquals("wrong field value", 40, message.getHeader().getInt(BodyLength.FIELD));
        assertHeaderField(message, "A", MsgType.FIELD);
        assertBodyField(message, "0", EncryptMethod.FIELD);
        assertTrailerField(message, "96", CheckSum.FIELD);
        final NoMsgTypes valueMessageType = new Logon.NoMsgTypes();
        message.getGroup(1, valueMessageType);
        assertEquals("wrong value", "D", valueMessageType.getString(RefMsgType.FIELD));
        assertEquals("wrong value", "R", valueMessageType.getString(MsgDirection.FIELD));
        message.getGroup(2, valueMessageType);
        assertEquals("wrong value", "8", valueMessageType.getString(RefMsgType.FIELD));
        assertEquals("wrong value", "S", valueMessageType.getString(MsgDirection.FIELD));
    }

    @Test
    public void testParsing2() throws Exception {
        // checksum is not verified in these tests
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
        final Message message = new Message(data, DataDictionaryTest.getDictionary());

        assertHeaderField(message, "FIX.4.2", BeginString.FIELD);
        assertHeaderField(message, "76", BodyLength.FIELD);
        assertHeaderField(message, MsgType.INDICATION_OF_INTEREST, MsgType.FIELD);
        assertBodyField(message, "IDENTIFIER", IOIID.FIELD);
        assertTrailerField(message, "037", CheckSum.FIELD);
        final IndicationOfInterest.NoUnderlyings valueMessageType = new IndicationOfInterest.NoUnderlyings();
        message.getGroup(1, valueMessageType);
        assertEquals("wrong value", "DELL", valueMessageType.getString(UnderlyingSymbol.FIELD));
        assertEquals("wrong value", "USD", valueMessageType.getString(UnderlyingCurrency.FIELD));
        message.getGroup(2, valueMessageType);
        assertEquals("wrong value", "IBM", valueMessageType.getString(UnderlyingSymbol.FIELD));
        assertEquals("wrong value", "CAD", valueMessageType.getString(UnderlyingCurrency.FIELD));
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

    @Test
    public void testValidation() throws Exception {
        final String data = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
            "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\00139=0\001" +
            "11=184271\00138=200\001198=1494E9A0:58BD3F9D\001526=4324\00137=B-WOW-1494E9A0:58BD3F9D\001" +
            "55=WOW\00154=1\001151=200\00114=0\00140=2\00144=15\00159=1\0016=0\001453=3\001448=AAA35791\001" +
            "447=D\001452=3\001448=8\001447=D\001452=4\001448=FIX11\001" +
            "447=D\001452=36\00160=20060320-03:34:29\00110=169\001";
        final ExecutionReport executionReport = new ExecutionReport();
        final DataDictionary dictionary = DataDictionaryTest.getDictionary();
        assertNotNull(dictionary);
        executionReport.fromString(data, dictionary, true);
        dictionary.validate(executionReport);
    }

    @Test
    // QFJ-675: Message.clear() should reset position field to zero to enable Message to be reused
    public void testParseTwice() throws Exception {
        final String data1 = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
            "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\00139=0\001" +
            "11=184271\00138=200\001198=1494E9A0:58BD3F9D\001526=4324\00137=B-WOW-1494E9A0:58BD3F9D\001" +
            "55=WOW\00154=1\001151=200\00114=0\00140=2\00144=15\00159=1\0016=0\001453=3\001448=AAA35791\001" +
            "447=D\001452=3\001448=8\001447=D\001452=4\001448=FIX11\001" +
            "447=D\001452=36\00160=20060320-03:34:29\00110=169\001";

        final String data2 = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
            "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\00139=0\00111=123456\001" +
            "38=200\001198=1494E9A0:58BD3F9D\001526=4324\00137=B-WOW-1494E9A0:58BD3F9D\00155=WOW\00154=1\001" +
            "151=200\00114=0\00140=2\00144=15\00159=1\0016=0\001453=3\001448=AAA35791\001447=D\001452=3\001" +
            "448=8\001447=D\001452=4\001448=FIX11\001447=D\001452=36\00160=20060320-03:34:29\00110=167\001";

        final DataDictionary dictionary = DataDictionaryTest.getDictionary();
        final ExecutionReport executionReport = new ExecutionReport();

        assertNotNull(dictionary);
        executionReport.fromString(data1, dictionary, true);
        dictionary.validate(executionReport);

        executionReport.clear();
        executionReport.fromString(data2, dictionary, true);
        dictionary.validate(executionReport);
    }

    @Test
    // QFJ-426 Message header will not validate when containing 'Hop' group
    public void testValidationWithHops() throws Exception {
        final String data = "8=FIX.4.4\0019=309\00135=8\00149=ASX\00156=CL1_FIX44\00134=4\001" +
            "52=20060324-01:05:58\00117=X-B-WOW-1494E9A0:58BD3F9D-1109\001150=D\00139=0\00111=184271\001" +
            "38=200\001198=1494E9A0:58BD3F9D\001526=4324\00137=B-WOW-1494E9A0:58BD3F9D\00155=WOW\00154=1\001" +
            "151=200\00114=0\00140=2\00144=15\00159=1\0016=0\001453=3\001448=AAA35791\001447=D\001452=3\001" +
            "448=8\001447=D\001452=4\001448=FIX11\001447=D\001452=36\00160=20060320-03:34:29\00110=169\001";
        final ExecutionReport executionReport = new ExecutionReport();
        final DataDictionary dictionary = DataDictionaryTest.getDictionary();
        assertNotNull(dictionary);

        executionReport.fromString(data, dictionary, true);
        final Header.NoHops hops = new Header.NoHops();
        hops.set(new HopCompID("FOO"));
        executionReport.header.addGroup(hops);

        dictionary.validate(executionReport);
    }

    @Test
    public void testAppMessageValidation() throws Exception {
        final String data = "8=FIXT.1.1\0019=234\00135=W\00134=2\00149=ABFX\00152=20080722-16:37:11.234\001" +
            "56=X2RV1\00155=EUR/USD\001262=CAP0000011\001268=2\001269=0\001270=1.57844\00115=EUR\001" +
            "271=500000\001272=20080724\001269=1\001270=1.57869\00115=EUR\001271=500000\001272=20080724\00110=097\001";
        final MarketDataSnapshotFullRefresh mdsfr = new MarketDataSnapshotFullRefresh();
        final DataDictionary sessDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        final DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIX50.xml");
        assertNotNull(sessDictionary);
        assertNotNull(appDictionary);
        mdsfr.fromString(data, sessDictionary, appDictionary, true);
        DataDictionary.validate(mdsfr, sessDictionary, appDictionary);
    }
    
    @Test
    public void testAppMessageValidationFixLatest() throws Exception {
        final String data = "8=FIXT.1.1\0019=234\00135=W\00134=2\00149=ABFX\00152=20080722-16:37:11.234\001" +
            "56=X2RV1\00155=EUR/USD\001262=CAP0000011\001779=20080722-16:37:11.234\001268=2\001269=0\001270=1.57844\00115=EUR\001" +
            "271=500000\001272=20080724\001269=1\001270=1.57869\00115=EUR\001271=500000\001272=20080724\00110=118\001";
        final quickfix.fixlatest.MarketDataSnapshotFullRefresh mdsfr = new quickfix.fixlatest.MarketDataSnapshotFullRefresh();
        final DataDictionary sessDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        final DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIXLatest.xml");
        assertNotNull(sessDictionary);
        assertNotNull(appDictionary);
        mdsfr.fromString(data, sessDictionary, appDictionary, true);
        DataDictionary.validate(mdsfr, sessDictionary, appDictionary);
    }

    @Test
    public void testAdminMessageValidation() throws Exception {
        final String data = "8=FIXT.1.1\0019=84\00135=A\00149=EXEC\00156=BANZAI\00134=1\001" +
            "52=20080811-13:26:12.409\001108=1\001141=Y\00198=0\0011137=7\00110=102\001";
        final Logon logon = new Logon();
        final DataDictionary sessionDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        final DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIX50.xml");
        assertNotNull(sessionDictionary);
        assertNotNull(appDictionary);
        logon.fromString(data, sessionDictionary, appDictionary, true);
        DataDictionary.validate(logon, sessionDictionary, sessionDictionary);
    }

    @Test
    public void testGroupDelimOrdering() throws Exception {
        // Test the generic group constructor (QFJ-95)
        final quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        final Group partyGroup = new Group(quickfix.field.NoPartyIDs.FIELD, PartyID.FIELD);
        partyGroup.setField(new PartyID("TraderName"));
        partyGroup.setField(new PartyIDSource(
                PartyIDSource.GENERAL_IDENTIFIER));
        partyGroup.setField(new PartyRole(11));
        order.addGroup(partyGroup);
        final String data = order.toString();
        assertTrue("wrong field order", data.contains("453=1\001448=TraderName"));
    }

    @Test
    public void testComponentGroupExtraction() throws Exception {
        final quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        final NoPartyIDs partyIds = new NoPartyIDs();
        partyIds.set(new PartyID("PARTY_ID_1"));
        order.addGroup(partyIds);
        partyIds.set(new PartyID("PARTY_ID_2"));
        order.addGroup(partyIds);

        final Parties parties = order.getParties();
        assertEquals("wrong # of party IDs", 2, parties.getNoPartyIDs().getValue());
    }

    @Test
    public void testComponentGroupInsertion() throws Exception {
        final Parties parties = new Parties();
        final NoPartyIDs partyIds = new NoPartyIDs();
        partyIds.set(new PartyID("PARTY_ID_1"));
        parties.addGroup(partyIds);
        partyIds.set(new PartyID("PARTY_ID_2"));
        parties.addGroup(partyIds);

        final quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        order.set(parties);

        assertEquals("wrong # of party IDs", 2, order.getNoPartyIDs().getValue());
    }

    // QFJ-66 Should not throw exception when parsing data field in header
    @Test
    public void testHeaderDataField() throws Exception {
        final Message m = new Message("8=FIX.4.2\0019=53\00135=A\00190=4\00191=ABCD\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=241\001",
                DataDictionaryTest.getDictionary());
        assertEquals("ABCD", m.getHeader().getString(SecureData.FIELD));
    }

    // QFJ-52
    @Test
    public void testInvalidFirstFieldInGroup() throws Exception {
        final News news = new News();
        news.set(new Headline("Test"));
        final News.NoRelatedSym relatedSym = new News.NoRelatedSym();
        relatedSym.set(new SecurityID("SECID"));
        relatedSym.set(new SecurityIDSource("SECID_SOURCE"));
        news.addGroup(relatedSym);

        try {
            new Message(news.toString(), DataDictionaryTest.getDictionary());
        } catch (final InvalidMessage e) {
            // expected
        } catch (final NullPointerException e) {
            fail("Should not throw NPE when first field is missing.");
        }
    }

    @Test
    public void testRequiredGroupValidation() throws Exception {
        final News news = new News();
        news.set(new Headline("Test"));
        final DataDictionary dictionary = DataDictionaryTest.getDictionary();
        try {
            dictionary.validate(news);
            fail("no field exception for missing lines group");
        } catch (final FieldException e) {
            // expected
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

    /**
     * Test for data fields with SOH. This test is based on report from a user on
     * the QuickFIX mailing list. The problem was the user's configuration but this
     * seems like a good unit test to keep in the suite.
     */
    @Test
    public void testDataFieldWithManualFieldInsertion() throws Exception {
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
            final Message m = new Message();
            m.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
            final MsgType msgType = new MsgType("U678");
            m.getHeader().setField(msgType);
            m.setInt(RawDataLength.FIELD, data.length());
            m.setString(RawData.FIELD, data);
            assertEquals(1108 + msgType.getValue().length(), m.bodyLength());
            final Message m2 = new Message(m.toString(), dictionary);
            assertEquals(m.bodyLength(), m2.bodyLength());
        } catch (final InvalidMessage e) {
            fail(e.getMessage());
        }
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
    public void testCalculateStringWithNestedGroups() throws Exception {
        final NewOrderCross noc = new NewOrderCross();
        noc.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
        noc.getHeader().setInt(MsgSeqNum.FIELD, 5);
        noc.getHeader().setString(SenderCompID.FIELD, "sender");
        noc.getHeader().setString(TargetCompID.FIELD, "target");
        noc.getHeader().setString(SendingTime.FIELD, "20060319-09:08:20.881");

        noc.setString(SecurityIDSource.FIELD, SecurityIDSource.EXCHANGE_SYMBOL);
        noc.setChar(OrdType.FIELD, OrdType.LIMIT);
        noc.setDouble(Price.FIELD, 9.00);
        noc.setString(SecurityID.FIELD, "ABC");
        noc.setString(Symbol.FIELD, "ABC");
        noc.setString(TransactTime.FIELD, "20060319-09:08:19");
        noc.setString(CrossID.FIELD, "184214");
        noc.setInt(CrossType.FIELD,
                CrossType.CROSS_IOC);
        noc.setInt(CrossPrioritization.FIELD, CrossPrioritization.NONE);

        final NewOrderCross.NoSides side = new NewOrderCross.NoSides();
        side.setChar(Side.FIELD, Side.BUY);
        side.setDouble(OrderQty.FIELD, 9);

        final NewOrderCross.NoSides.NoPartyIDs party = new NewOrderCross.NoSides.NoPartyIDs();
        party.setString(PartyID.FIELD, "8");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY);
        party.setInt(PartyRole.FIELD, PartyRole.CLEARING_FIRM);

        side.addGroup(party);

        party.setString(PartyID.FIELD, "AAA35777");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY);
        party.setInt(PartyRole.FIELD, PartyRole.CLIENT_ID);

        side.addGroup(party);

        noc.addGroup(side);

        side.clear();
        side.setChar(Side.FIELD, Side.SELL);
        side.setDouble(OrderQty.FIELD, 9);

        party.clear();
        party.setString(PartyID.FIELD, "8");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY);
        party.setInt(PartyRole.FIELD, PartyRole.CLEARING_FIRM);
        side.addGroup(party);

        party.clear();
        party.setString(PartyID.FIELD, "aaa");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY);
        party.setInt(PartyRole.FIELD, PartyRole.CLIENT_ID);
        side.addGroup(party);

        noc.addGroup(side);

        final String expectedMessage = "8=FIX.4.4\0019=247\00135=s\00134=5\00149=sender\00152=20060319-09:08:20.881\001"
            + "56=target\00122=8\00140=2\00144=9\00148=ABC\00155=ABC\00160=20060319-09:08:19\001548=184214\001549=2\001"
            + "550=0\001552=2\00154=1\001453=2\001448=8\001447=D\001452=4\001448=AAA35777\001447=D\001452=3\00138=9\00154=2\001"
            + "453=2\001448=8\001447=D\001452=4\001448=aaa\001447=D\001452=3\00138=9\00110=056\001";
        assertEquals("wrong message", expectedMessage, noc.toString());
    }

    @Test
    public void testFieldOrdering() throws Exception {
        final String expectedMessageString = "8=FIX.4.4\0019=171\00135=D\00149=SenderCompId\00156=TargetCompId\001" +
            "11=183339\00122=8\00138=1\00140=2\00144=12\00148=BHP\00154=2\00155=BHP\00159=1\00160=20060223-22:38:33\001" +
            "526=3620\001453=2\001448=8\001447=D\001452=4\001448=AAA35354\001447=D\001452=3\00110=168\001";
        final DataDictionary dataDictionary = new DataDictionary("FIX44.xml");
        final Message message = new DefaultMessageFactory()
                .create(dataDictionary.getVersion(), "D");
        message.fromString(expectedMessageString, dataDictionary, false);
        final String actualMessageString = message.toString();
        assertTrue(
                "wrong field ordering",
                actualMessageString.contains("453=2\001448=8\001447=D\001452=4\001448=AAA35354\001447=D\001452=3"));
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
    public void testMessageGroups() {
        final Message message = new Message();
        final NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        assertGroupContent(message, numAllocs);
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
    public void testMessageCloneWithGroups() {
        final Message message = new Message();
        final NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        final Message clonedMessage = (Message) message.clone();
        assertGroupContent(clonedMessage, numAllocs);
    }

    @Test
    public void testFieldOrderAfterClone() {
        final Message message = new quickfix.fix44.NewOrderSingle();
        final quickfix.fix44.NewOrderSingle.NoPartyIDs partyIdGroup = new quickfix.fix44.NewOrderSingle.NoPartyIDs();
        partyIdGroup.set(new PartyID("PARTY_1"));
        partyIdGroup.set(new PartyIDSource(PartyIDSource.ISITCACRONYM));
        partyIdGroup.set(new PartyRole(PartyRole.INTRODUCING_FIRM));
        message.addGroup(partyIdGroup);
        final Message clonedMessage = (Message) message.clone();
        assertEquals("wrong field order",
                "8=FIX.4.4\0019=35\00135=D\001453=1\001448=PARTY_1\001447=I\001452=6\00110=040\001",
                clonedMessage.toString());
    }

    @Test
    public void testMessageGroupRemovalUsingGroupObject() {
        final Message message = new Message();

        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        // Remove all

        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));

        assertNoZeroLengthGroupTag(message);
        assertEquals("wrong message length", 0, message.calculateLength());

        // Remove one at a time

        numAllocs = setUpGroups(message);
        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(2, numAllocs);

        assertEquals("wrong # of group members", 1, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(1, numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));

        assertNoZeroLengthGroupTag(message);
        assertEquals("wrong message length", 0, message.calculateLength());
    }

    @Test
    public void testMessageGroupRemovalUsingGroupFieldTag() {
        final Message message = new Message();

        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        // Remove all

        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));

        assertNoZeroLengthGroupTag(message);
        assertEquals("wrong message length", 0, message.calculateLength());

        assertEquals("wrong checksum", 0, message.calculateChecksum());

        // Remove one at a time

        numAllocs = setUpGroups(message);

        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(2, numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 1, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(1, numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));

        assertNoZeroLengthGroupTag(message);
        assertEquals("wrong message length", 0, message.calculateLength());

        assertEquals("wrong checksum", 0, message.calculateChecksum());
    }

    @Test
    public void testMessageGroupRemovalFromEmptyGroup() {
        final Message message = new Message();
        final NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);
        message.removeGroup(numAllocs);

        // ensure no exception when groups are empty
        message.removeGroup(1, numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));

        assertNoZeroLengthGroupTag(message);
        assertEquals("wrong message length", 0, message.calculateLength());
    }

    private void assertNoZeroLengthGroupTag(final Message message) {
        assertFalse("Zero-length group tag exists in message string",
                message.toString().contains("\00178="));
    }

    @Test
    public void testHasGroup() {
        final Message message = new Message();
        final NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        assertFalse("wrong value", message.hasGroup(654));
        assertTrue("wrong value", message.hasGroup(numAllocs.getFieldTag()));
        assertTrue("wrong value", message.hasGroup(numAllocs));
        assertTrue("wrong value", message.hasGroup(1, numAllocs));
        assertTrue("wrong value", message.hasGroup(1, numAllocs.getFieldTag()));
        assertTrue("wrong value", message.hasGroup(2, numAllocs));
        assertTrue("wrong value", message.hasGroup(2, numAllocs.getFieldTag()));
        assertFalse("wrong value", message.hasGroup(3, numAllocs));
        assertFalse("wrong value", message.hasGroup(3, numAllocs.getFieldTag()));
    }

    @Test
    public void testIsEmpty() {
        final Message message = new Message();
        assertTrue("Message should be empty on construction", message.isEmpty());
        message.getHeader().setField(new BeginString("FIX.4.2"));
        assertFalse("Header should contain a field", message.isEmpty());
        message.clear();
        assertTrue("Message should be empty after clear", message.isEmpty());
        message.setField(new Symbol("MSFT"));
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

        try {
            message.setString(100, null);
            fail("exception not thrown");
        } catch (final NullPointerException e) {
        }
    }

    @Test
    public void testMessagesetGetBoolean() {
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
        assertArrayEquals(new char[] {'a', 'b', '4'}, message.getChars(18));
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

    @Test
    public void testComponent() throws Exception {
        final Instrument instrument = new Instrument();
        instrument.set(new Symbol("DELL"));
        instrument.set(new CountryOfIssue("USA"));
        instrument.set(new SecurityType(SecurityType.COMMON_STOCK));

        final quickfix.fix44.NewOrderSingle newOrderSingle = new quickfix.fix44.NewOrderSingle();
        newOrderSingle.set(instrument);
        newOrderSingle.set(new OrderQty(100));
        newOrderSingle.set(new Price(45));

        assertEquals(new Symbol("DELL"), newOrderSingle.getSymbol());
        assertEquals(new CountryOfIssue("USA"), newOrderSingle.getCountryOfIssue());
        assertEquals(new SecurityType(SecurityType.COMMON_STOCK), newOrderSingle.getSecurityType());

        newOrderSingle.set(new ClOrdID("CLIENT_ORDER_ID"));
        final Instrument instrument2 = newOrderSingle.getInstrument();
        assertEquals(new Symbol("DELL"), instrument2.getSymbol());
        assertEquals(new CountryOfIssue("USA"), instrument2.getCountryOfIssue());
        assertEquals(new SecurityType(SecurityType.COMMON_STOCK), instrument2.getSecurityType());
        try {
            instrument2.getField(new ClOrdID());
            fail("should have thrown exception");
        } catch (final FieldNotFound e) {
            // expected
        }
    }

    @Test
    public void testReplaceGroup() throws Exception {
        final Message message = new Message();
        message.setField(new ListID("1"));
        message.setField(new BidType(0));
        message.setField(new TotNoOrders(3));

        final NewOrderList.NoOrders group = new NewOrderList.NoOrders();
        group.set(new ClOrdID("A"));
        group.set(new ListSeqNo(1));
        group.set(new Symbol("DELL"));
        group.set(new Side('1'));
        message.addGroup(group);

        group.set(new ClOrdID("B"));
        group.set(new ListSeqNo(2));
        group.set(new Symbol("LNUX"));
        group.set(new Side('2'));
        message.addGroup(group);

        group.set(new ClOrdID("C"));
        group.set(new ListSeqNo(3));
        group.set(new Symbol("RHAT"));
        group.set(new Side('3'));
        message.addGroup(group);

        group.set(new ClOrdID("D"));
        group.set(new ListSeqNo(4));
        group.set(new Symbol("AAPL"));
        group.set(new Side('4'));
        message.replaceGroup(2, group);

        final NoOrders noOrders = new NoOrders();

        assertTrue(message.hasGroup(1, group));
        assertTrue(message.hasGroup(2, group));
        assertTrue(message.hasGroup(3, group));
        assertEquals(3, message.getGroupCount(NoOrders.FIELD));
        message.getField(noOrders);
        assertEquals(3, noOrders.getValue());

        final ClOrdID clOrdID = new ClOrdID();
        message.getGroup(1, group);
        assertEquals("A", group.getField(clOrdID).getValue());
        message.getGroup(2, group);
        assertEquals("D", group.getField(clOrdID).getValue());
        message.getGroup(3, group);
        assertEquals("C", group.getField(clOrdID).getValue());
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

    @Test
    public void testFieldWithEqualsCharacter() {
        try {
            final DataDictionary dd = DataDictionaryTest.getDictionary();
            final Message m = new Message(
                "8=FIXT.1.1\0019=369\00135=W\00149=I\00156=F\00134=4\00152=20111021-15:09:16.535\001" +
                "262=1319209757316210\00121=2\00155=EUR/USD\001461=RCSXX=0\001268=8\001" +
                "269=0\001270=1.38898\001271=2000000\001269=0\001270=1.38897\001271=8000000\001" +
                "269=0\001270=1.38854\001271=2000000\001269=1\001270=1.38855\001271=6000000\001" +
                "269=1\001270=1.38856\001271=7000000\001269=1\001270=1.38857\001271=3000000\001" +
                "269=1\001270=1.38858\001271=9000000\001269=1\001270=1.38859\001271=100000000\00110=51\001",
                dd, true);
            assertEquals(m.getString(461), "RCSXX=0");
            final MarketDataSnapshotFullRefresh.NoMDEntries group = new MarketDataSnapshotFullRefresh.NoMDEntries();
            m.getGroup(1, group);
            final MDEntryPx px = new MDEntryPx();
            group.get(px);
            assertEquals(px.objectAsString(), "1.38898");
        } catch (final Exception e) {
            final String text = e.getMessage();
            assertTrue("Wrong exception message: " + text,
                    text != null && !text.contains("Actual body length"));
        }
    }

    @Test
    public void testMiscFeeType() {
        try {
            final DataDictionary dd = DataDictionaryTest.getDictionary();
            final Message m = new Message(
                "8=FIXT.1.1\0019=369\00135=W\00149=I\00156=F\00134=4\00152=20111021-15:09:16.535\001" +
                "262=1319209757316210\00121=2\00155=EUR/USD\001461=RCSXX=0\001268=8\001" +
                "269=0\001270=1.38898\001271=2000000\001269=0\001270=1.38897\001271=8000000\001" +
                "269=0\001270=1.38854\001271=2000000\001269=1\001270=1.38855\001271=6000000\001" +
                "269=1\001270=1.38856\001271=7000000\001269=1\001270=1.38857\001271=3000000\001" +
                "269=1\001270=1.38858\001271=9000000\001269=1\001270=1.38859\001271=100000000\00110=51\001",
                dd, true);
            assertEquals(m.getString(461), "RCSXX=0");
            final MarketDataSnapshotFullRefresh.NoMDEntries group = new MarketDataSnapshotFullRefresh.NoMDEntries();
            m.getGroup(1, group);
            final MDEntryPx px = new MDEntryPx();
            group.get(px);
            assertEquals(px.objectAsString(), "1.38898");
        } catch (final Exception e) {
            final String text = e.getMessage();
            assertTrue("Wrong exception message: " + text,
                    text != null && !text.contains("Actual body length"));
        }
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
    public void testMessageBytesField() throws Exception {
        final Logon logon = new Logon();
        final String data = "rawdata";
        logon.set(new RawDataLength(data.length()));
        logon.setField(new BytesField(RawData.FIELD, data.getBytes()));
        //logon.set(new RawData(data));
        assertEquals("8=FIX.4.4\0019=21\00135=A\00195=7\00196=rawdata\00110=086\001", logon.toString());
    }

    @Test
    // QFJ-786
    public void testInvalidHeaderFields() throws Exception {
        String message = "1=03100~11=140605JWI4440~15=USD~21=1~35=D~38=6~40=1~47=A~54=1~55=UNP~59=0~60=20140605-13:58:51.016~63=0~79=03100631~336=1~377=N~581=A~6020=COMPUS~86028=JWI~86029=4440~";
        message = message.replace('~', (char) 1);
        Message msg = new Message(message, false);
        assertTrue(msg.isSetField(Account.FIELD));
    }

    @Test
    // QFJ-791
    public void testRepeatingGroupCount() throws Exception {
        /*
         * Prepare a very simple TradeCaptureReport message template and two
         * legs.
         */
        Message tcr = new TradeCaptureReport(new TradeReportID("ABC1234"), new PreviouslyReported(
                false), new LastQty(1000), new LastPx(5.6789), new TradeDate("20140101"),
                new TransactTime(LocalDateTime.now(ZoneOffset.UTC)));
        tcr.getHeader().setField(new SenderCompID("SENDER"));
        tcr.getHeader().setField(new TargetCompID("TARGET"));
        tcr.getHeader().setField(new MsgSeqNum(1));
        tcr.getHeader().setField(new SendingTime(LocalDateTime.now(ZoneOffset.UTC)));
        TradeCaptureReport.NoLegs leg1 = new TradeCaptureReport.NoLegs();
        leg1.setField(new LegSymbol("L1-XYZ"));
        leg1.setField(new LegRefID("ABC1234-L1"));
        leg1.setField(new LegQty(333));
        leg1.setField(new LegPrice(1.2345));
        TradeCaptureReport.NoLegs leg2 = new TradeCaptureReport.NoLegs();
        leg2.setField(new LegSymbol("L2-XYZ"));
        leg2.setField(new LegRefID("ABC1234-L2"));
        leg2.setField(new LegQty(777));
        leg2.setField(new LegPrice(2.3456));

        /*
         * Create a message from the template and add two legs. Convert the
         * message to string and parse it. The parsed message should contain two
         * legs.
         */
        {
            Message m1 = new Message();
            m1.getHeader().setFields(tcr.getHeader());
            m1.setFields(tcr);
            m1.addGroup(leg1);
            m1.addGroup(leg2);

            String s1 = m1.toString();
            Message parsed1 = new Message(s1, DataDictionaryTest.getDictionary());

            assertEquals(s1, parsed1.toString());
            assertEquals(2, parsed1.getGroupCount(555));
        }

        /*
         * Create a message from the template and add two legs, but the first
         * leg contains the additional tag 58 (Text). Convert the message to
         * string and parse it. The parsed message should also contain two legs.
         */
        {
            Message m2 = new Message();
            m2.getHeader().setFields(tcr.getHeader());
            m2.setFields(tcr);

            leg1.setField(new Text("TXT1")); // add unexpected tag to leg1
            m2.addGroup(leg1);
            m2.addGroup(leg2);

            String s2 = m2.toString();
            // do not use validation to parse full message
            // regardless of errors in message structure
            Message parsed2 = new Message(s2, DataDictionaryTest.getDictionary(), false);
            
            assertEquals(s2, parsed2.toString());
            assertEquals(2, parsed2.getGroupCount(555));

            /*
             * If the above test failed, it means that a simple addition of an
             * unexpected tag made the parsing logic fail pretty badly, as the
             * number of legs is not 2.
             */
        }
    }

    @Test
    // QFJ-791
    public void testUnknownFieldsInRepeatingGroupsAndValidation() throws Exception {

        Message tcr = new TradeCaptureReport(new TradeReportID("ABC1234"), new PreviouslyReported(
                false), new LastQty(1000), new LastPx(5.6789), new TradeDate("20140101"),
                new TransactTime(LocalDateTime.now(ZoneOffset.UTC)));
        tcr.getHeader().setField(new SenderCompID("SENDER"));
        tcr.getHeader().setField(new TargetCompID("TARGET"));
        tcr.getHeader().setField(new MsgSeqNum(1));
        tcr.getHeader().setField(new SendingTime(LocalDateTime.now(ZoneOffset.UTC)));
        tcr.setField(new Symbol("ABC"));
        TradeCaptureReport.NoLegs leg1 = new TradeCaptureReport.NoLegs();
        leg1.setField(new LegSymbol("L1-XYZ"));
        leg1.setField(new LegRefID("ABC1234-L1"));
        leg1.setField(new LegQty(333));
        leg1.setField(new LegPrice(1.2345));
        TradeCaptureReport.NoLegs leg2 = new TradeCaptureReport.NoLegs();
        leg2.setField(new LegSymbol("L2-XYZ"));
        leg2.setField(new LegRefID("ABC1234-L2"));
        leg2.setField(new LegQty(777));
        leg2.setField(new LegPrice(2.3456));
        TradeCaptureReport.NoSides sides = new TradeCaptureReport.NoSides();
        sides.setField(new Side(Side.BUY));
        sides.setField(new OrderID("ID"));

        {
            // will add a user-defined tag (i.e. greater than 5000) that is not defined in that group
            Message m1 = new Message();
            m1.getHeader().setFields(tcr.getHeader());
            m1.setFields(tcr);

            leg1.setField(new StringField(10000, "TXT1")); // add unexpected tag to leg1
            m1.addGroup(leg1);
            m1.addGroup(leg2);
            m1.addGroup(sides);

            String s1 = m1.toString();
            DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
            // parsing without validation should succeed
            Message parsed1 = new Message(s1, dictionary, false);

            // validation should fail
            int failingTag = 0;
            try {
                dictionary.validate(parsed1);
            } catch (FieldException e) {
                failingTag = e.getField();
            }
            assertEquals(10000, failingTag);

            // but without checking user-defined fields, validation should succeed
            dictionary.setCheckUserDefinedFields(false);
            dictionary.validate(parsed1);

            assertEquals(s1, parsed1.toString());
            assertEquals(2, parsed1.getGroupCount(555));
        }

        {
            // will add a normal tag that is not in the dictionary for that group
            Message m2 = new Message();
            m2.getHeader().setFields(tcr.getHeader());
            m2.setFields(tcr);

            leg1.removeField(10000);         // remove user-defined tag from before
            leg1.setField(new Text("TXT1")); // add unexpected tag to leg1

            m2.addGroup(leg1);
            m2.addGroup(leg2);
            m2.addGroup(sides);

            String s2 = m2.toString();
            DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
            // parsing without validation should succeed
            Message parsed2 = new Message(s2, dictionary, false);

            // validation should fail
            int failingTag = 0;
            try {
                dictionary.validate(parsed2);
            } catch (FieldException e) {
                failingTag = e.getField();
            }
            assertEquals(Text.FIELD, failingTag);
            
            // but without checking for unknown message fields, validation should succeed
            dictionary.setAllowUnknownMessageFields(true);
            dictionary.validate(parsed2);

            assertEquals(s2, parsed2.toString());
            assertEquals(2, parsed2.getGroupCount(555));
        }
    }

    @Test
    // QFJ-169
    public void testInvalidFieldInGroup() throws Exception {
        SecurityRequestResult resultCode = new SecurityRequestResult(
                SecurityRequestResult.NO_INSTRUMENTS_FOUND);

        UnderlyingSymbol underlyingSymbolField = new UnderlyingSymbol("UND");
        SecurityReqID id = new SecurityReqID("1234");

        quickfix.fix44.DerivativeSecurityList responseMessage = new quickfix.fix44.DerivativeSecurityList();
        responseMessage.setField(id);
        responseMessage.setField(underlyingSymbolField);
        responseMessage.setField(new SecurityResponseID("2345"));
        Group optionGroup = new quickfix.fix44.DerivativeSecurityList.NoRelatedSym();
        optionGroup.setField(new Symbol("OPT+RQ"));
        optionGroup.setField(new StringField(StrikePrice.FIELD, "10"));
        // add invalid field for this FIX version
        optionGroup.setField(new QuoteAckStatus(0));
        optionGroup.setField(new PutOrCall(PutOrCall.CALL));
        optionGroup.setField(new MaturityMonthYear("200802"));
        responseMessage.addGroup(optionGroup);

        Group group2 = new quickfix.fix44.DerivativeSecurityList.NoRelatedSym();
        group2.setField(new Symbol("OPT+RB"));
        group2.setField(new StringField(StrikePrice.FIELD, "10"));
        group2.setField(new MaturityMonthYear("200802"));
        responseMessage.addGroup(group2);
        resultCode.setValue(SecurityRequestResult.VALID_REQUEST);
        responseMessage.setField(resultCode);

        DataDictionary dd = new DataDictionary(DataDictionaryTest.getDictionary());
        
        int tagNo = 0;
        try {
            dd.validate(responseMessage, true);
        } catch (FieldException e) {
            tagNo = e.getField();
        }
        // make sure that tag 297 is reported as invalid, NOT tag 55
        // (which is the first field after the invalid 297 field)
        assertEquals(QuoteAckStatus.FIELD, tagNo);

        Message msg2 = new Message(responseMessage.toString(), dd);
        try {
            dd.validate(msg2, true);
        } catch (FieldException e) {
            tagNo = e.getField();
        }
        // make sure that tag 297 is reported as invalid, NOT tag 55
        // (which is the first field after the invalid 297 field)
        assertEquals(QuoteAckStatus.FIELD, tagNo);

        // parse message again without validation
        msg2 = new Message(responseMessage.toString(), dd, false);
        assertEquals(responseMessage.toString(), msg2.toString());
        Group noRelatedSymGroup = new quickfix.fix44.DerivativeSecurityList.NoRelatedSym();
        Group group = responseMessage.getGroup(1, noRelatedSymGroup);
        assertTrue(group.isSetField(QuoteAckStatus.FIELD));

        group = responseMessage.getGroup(2, noRelatedSymGroup);
        assertFalse(group.isSetField(QuoteAckStatus.FIELD));
    }

    @Test
    // QFJ-169/QFJ-791
    public void testNestedRepeatingGroup()
        throws Exception {
        
        String newOrdersSingleString = "8=FIX.4.4|9=265|35=D|34=62|49=sender|52=20160803-12:55:42.094|"
                + "56=target|11=16H03A0000021|15=CHF|22=4|38=13|40=2|44=132|48=CH000000000|54=1|55=[N/A]|59=0|"
                + "60=20160803-12:55:41.866|207=XXXX|423=2|526=foo|528=P|"
                // tag 20000 is not defined, tag 22000 is defined for NewOrderSingle in FIX44_Custom_Test.xml
                + "453=1|448=test|447=D|452=7|20000=0|802=1|523=test|803=25|22000=foobar|10=244|";

        quickfix.fix44.NewOrderSingle nos = new quickfix.fix44.NewOrderSingle();
        // using custom dictionary with user-defined tag 22000
        final DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        dataDictionary.setCheckUserDefinedFields(false);
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, true);
        assertNull(nos.getException());
        dataDictionary.validate(nos);

        // defined tag should be set on the message
        assertTrue(nos.isSetField(22000));
        // undefined tag should not be set on the message
        assertFalse(nos.isSetField(20000));
        Group partyGroup = nos.getGroup(1, quickfix.field.NoPartyIDs.FIELD);
        // undefined tag should be set on the group instead
        assertTrue(partyGroup.isSetField(20000));
        assertFalse(partyGroup.getGroup(1, quickfix.field.NoPartySubIDs.FIELD).isSetField(20000));
    }

    @Test
    public void testUnknownTagBeforeFirstFieldInRepeatingGroup()
            throws Exception {

        // Given
        String newOrdersSingleString = "8=FIX.4.4|9=265|35=D|34=62|49=sender|52=20160803-12:55:42.094|"
                + "56=target|11=16H03A0000021|15=CHF|22=4|38=13|40=2|44=132|48=CH000000000|54=1|55=[N/A]|59=0|"
                + "60=20160803-12:55:41.866|207=XXXX|423=2|526=foo|528=P|"
                // tag 20000 is not defined for NewOrderSingle
                + "453=1|20000=0|448=test|447=D|452=7|802=1|523=test|803=25|10=244|";

        quickfix.fix44.NewOrderSingle nos = new quickfix.fix44.NewOrderSingle();
        final DataDictionary dataDictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        dataDictionary.setCheckUserDefinedFields(false);

        // When
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, true);

        // Then
        FieldException e = nos.getException();
        assertEquals(e.getMessage(), SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, e
                .getSessionRejectReason());
        assertEquals(20000, e.getField());
    }

    @Test
    // QFJ-169/QFJ-791
    public void testNestedRepeatingSubGroup()
            throws Exception {

        String newOrdersSingleString = "8=FIX.4.4|9=265|35=D|34=62|49=sender|52=20160803-12:55:42.094|"
                + "56=target|11=16H03A0000021|15=CHF|22=4|38=13|40=2|44=132|48=CH000000000|54=1|55=[N/A]|59=0|"
                + "60=20160803-12:55:41.866|207=XXXX|423=2|526=foo|528=P|"
                // tag 20000 is not defined, tag 22000 is defined for NewOrderSingle in FIX44_Custom_Test.xml
                + "453=1|448=test|447=D|452=7|802=1|523=test|803=25|20000=0|22000=foobar|10=244|";

        quickfix.fix44.NewOrderSingle nos = new quickfix.fix44.NewOrderSingle();
        // using custom dictionary with user-defined tag 22000
        final DataDictionary dataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        dataDictionary.setCheckUserDefinedFields(false);
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, true);
        assertNull(nos.getException());
        dataDictionary.validate(nos);

        // defined tag should be set on the message
        assertTrue(nos.isSetField(22000));
        // undefined tag should not be set on the message
        assertFalse(nos.isSetField(20000));
        Group partyGroup = nos.getGroup(1, quickfix.field.NoPartyIDs.FIELD);
        // undefined tag should be set on the subgroup instead
        assertFalse(partyGroup.isSetField(20000));
        assertTrue(partyGroup.getGroup(1, quickfix.field.NoPartySubIDs.FIELD).isSetField(20000));
    }

    @Test
    // QFJ-792
    public void testRepeatingGroupCountForIncorrectFieldOrder() throws Exception {
        // correct order would be 600, 687, 654, 566 
        testRepeatingGroupCountForFieldOrder(new int[]{600, 687, 566, 654});
    }

    private void testRepeatingGroupCountForFieldOrder(int fieldOrder[]) throws Exception {
        /*
          *  Prepare a very simple TradeCaptureReport message template with 1
          *  repeating group.
         */
        Message tcr = new TradeCaptureReport();
        tcr.getHeader().setField(new MsgSeqNum(1));
        tcr.getHeader().setField(new SendingTime(LocalDateTime.now(ZoneOffset.UTC)));
        tcr.getHeader().setField(new SenderCompID("SENDER"));
        tcr.getHeader().setField(new TargetCompID("TARGET"));
        tcr.setField(new TradeReportID("ABC1234"));
        tcr.setField(new PreviouslyReported(false));
        tcr.setField(new LastQty(1000));
        tcr.setField(new LastPx(5.6789));
        tcr.setField(new TradeDate("20140101"));
        tcr.setField(new TransactTime(LocalDateTime.now(ZoneOffset.UTC)));
        Group leg1 = new Group(555, 600, fieldOrder);
        leg1.setField(new LegSymbol("L1-XYZ"));
        leg1.setField(new LegRefID("ABC1234-L1"));
        leg1.setField(new LegQty(333));
        leg1.setField(new LegPrice(1.2345));
        tcr.addGroup(leg1);
        /*
          * Convert the message to string and parse it. The parsed message should
          * contain 1 repeating group.
         */
        String s = tcr.toString();
        DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        dictionary.setCheckUnorderedGroupFields(false);
        // without checking order of repeating group it should work
        Message parsed = new Message(s, dictionary);
        FieldException exception = parsed.getException();
        assertNull(exception);

        assertEquals(1, parsed.getGroupCount(555));

        dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        // when checking order of repeating group, an error should be reported
        parsed = new Message(s, dictionary);
        exception = parsed.getException();
        assertEquals(654, exception.getField());
        // but we still should have the repeating group set and not ignore it
        assertEquals(1, parsed.getGroupCount(555));
    }
    
    // QFJ-533
    @Test
    public void testRepeatingGroupCountWithNonIntegerValues() throws Exception {
        DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        Message ioi = new quickfix.fix50.IOI();
        ioi.setString(quickfix.field.NoPartyIDs.FIELD, "abc");
        final String invalidCountMessage = ioi.toString();
        try {
            Message message =  new Message(invalidCountMessage, dictionary);
        } catch (final InvalidMessage im) {
            assertNotNull("InvalidMessage correctly thrown", im);
        } catch (final Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
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
    public void testIfMessageHeaderIsOverwritten() {
        final Message fix42Message = new quickfix.fix42.Message();
        assertEquals(quickfix.fix42.Message.Header.class, fix42Message.getHeader().getClass());

        final Message fix44Message = new quickfix.fix44.Message();
        assertEquals(quickfix.fix44.Message.Header.class, fix44Message.getHeader().getClass());

        final Message fix50Message = new quickfix.fix50.Message();
        assertEquals(quickfix.fix50.Message.Header.class, fix50Message.getHeader().getClass());

        final Message fixt11Message = new quickfix.fixt11.Message();
        assertEquals(quickfix.fixt11.Message.Header.class, fixt11Message.getHeader().getClass());
    }

    // QFJ-722
    @Test
    public void testIfMessageHeaderIsCreatedWithEveryConstructor() throws Exception {
        final String rawMessage = "8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001";
        final DataDictionary dataDictionary = new DataDictionary(DataDictionaryTest.getDictionary());

        final Message emptyConstructor = new Message();
        assertNotNull(emptyConstructor.getHeader());

        final Message secondConstructor = new Message(new int[] {});
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

    @Test
    public void shouldConvertToXmlWhenDataDictionaryLoadedWithExternalDTD() throws ConfigError {
        DataDictionary dataDictionary = new DataDictionary("FIX_External_DTD.xml", DocumentBuilderFactory::newInstance);

        Message message = new Message();
        message.setString(Account.FIELD, "test-account");

        String xml = message.toXML(dataDictionary);
        xml = xml.replace("\r", "").replace("\n", "").replaceAll(">\\s+<", "><");
        System.out.println(xml);
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><message><header/><body><field name=\"Account\" tag=\"1\">test-account</field></body><trailer/></message>", xml);
    }

    @Test
    public void shouldConvertToXMLWithoutIndent() {
        Message message = new Message();
        message.setString(Account.FIELD, "test-account");
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><message><header/><body><field tag=\"1\">test-account</field></body><trailer/></message>", message.toXML());
    }
    
    @Test
    public void shouldConvertToXMLWithIndent() {
        Message message = new Message();
        message.setString(Account.FIELD, "test-account");

        String xml = message.toXML(true);
        xml = xml.replace("\r", "");
        // formatting CDATA elements can be different across JVM's so we have to strip whitespaces before and after for the test to pass
        // https://bugs.openjdk.java.net/browse/JDK-8215543
        xml = xml.replaceAll("\\s+<!\\[CDATA\\[test-account\\]\\]>\\s+", "<![CDATA[test-account]]>");
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                     "<message>\n" +
                     "   <header/>\n" + 
                     "   <body>\n" +
                     "      <field tag=\"1\">test-account</field>\n" + 
                     "   </body>\n" +
                     "   <trailer/>\n" + 
                     "</message>\n", xml);
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
            fail("field shouldn't be here: " + field);
        } catch (final FieldNotFound e) {
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

    private void assertGroupContent(Message message, NewOrderSingle.NoAllocs numAllocs) {
        StringField field;
        final java.util.Iterator<Field<?>> i = numAllocs.iterator();
        assertTrue(i.hasNext());
        field = (StringField) i.next();
        assertEquals("AllocACC2", field.getValue());
        assertTrue(i.hasNext());
        field = (StringField) i.next();
        assertEquals("2020.20", field.getValue());
        assertTrue(!i.hasNext());

        try {
            final String accountId = numAllocs.getField(new AllocAccount()).getValue();
            final Object shares = numAllocs.getField(new AllocShares()).getObject();
            message.getGroup(1, numAllocs);
            assertAllocation(accountId, shares);
            message.getGroup(2, numAllocs);
            assertEquals("AllocACC2", accountId);
            assertAllocation(accountId, shares);
        } catch (final FieldNotFound e) {
            fail("no exception should be thrown");
        }

        try {
            message.getGroup(3, numAllocs);
            fail("exception should be thrown");
        } catch (final FieldNotFound ignored) {
        }
    }

    private void assertAllocation(String accountId, Object shares) {
        switch (accountId) {
            case "AllocACC1":
                assertEquals("got shares: " + shares, 0,
                        new BigDecimal("1010.10").compareTo(new BigDecimal(shares.toString())));
                break;
            case "AllocACC2":
                assertEquals("got shares: " + shares, 0,
                        new BigDecimal("2020.20").compareTo(new BigDecimal(shares.toString())));
                break;
            default:
                fail("Unknown account");
                break;
        }
    }

    private NewOrderSingle.NoAllocs setUpGroups(Message message) {
        final NewOrderSingle.NoAllocs numAllocs = new NewOrderSingle.NoAllocs();
        numAllocs.set(new AllocAccount("AllocACC1"));
        numAllocs.setField(new StringField(AllocShares.FIELD, "1010.10"));
        message.addGroup(numAllocs);
        numAllocs.setField(new AllocAccount("AllocACC2"));
        numAllocs.setField(new StringField(AllocShares.FIELD, "2020.20"));
        message.addGroup(numAllocs);
        return numAllocs;
    }
}

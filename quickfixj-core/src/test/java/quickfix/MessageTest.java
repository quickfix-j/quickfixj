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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static org.junit.Assert.assertThrows;
import static quickfix.DataDictionaryTest.getDictionary;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.quickfixj.CharsetSupport;

import quickfix.field.Account;
import quickfix.field.AllocAccount;
import quickfix.field.AllocShares;
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
import quickfix.field.NoHops;
import quickfix.field.NoOrders;
import quickfix.field.NoSides;
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
import quickfix.fix44.NewOrderMultileg;
import quickfix.fix44.Logon.NoMsgTypes;
import quickfix.fix44.NewOrderCross;
import quickfix.fix44.NewOrderSingle.NoPartyIDs;
import quickfix.fix44.News;
import quickfix.fix44.TradeCaptureReport;
import quickfix.fix44.component.Instrument;
import quickfix.fix44.component.Parties;
import quickfix.fix50.MarketDataSnapshotFullRefresh;
import quickfix.fixt11.TestRequest;

/**
 * NOTE: There are two MessageTests. One in quickfixj-base, one in
 * quickfixj-core, which each test some functionality. This test covers some
 * test cases that cannot be tested in the quickfixj-base module due to usage of
 * message classes that are generated later in the compile process.
 */
public class MessageTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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
    public void testHeaderGroupParsing() throws Exception {
        final Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "627=2\001628=FOO\001628=BAR\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=228\001",
                DataDictionaryTest.getDictionary(), new ValidationSettings());

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

        final Message msg = new Message(report.toString(), DataDictionaryTest.getDictionary(), new ValidationSettings());
        assertEquals("embedded order", text, msg.getString(EncodedText.FIELD));
    }

    private void doTestMessageWithEncodedField(String charset, String text) throws Exception {
        CharsetSupport.setCharset(charset);
        try {
            NewOrderSingle order = createNewOrderSingle();
            order.set(new EncodedTextLen(MessageUtils.length(CharsetSupport.getCharsetInstance(), text)));
            order.set(new EncodedText(text));
            final Message msg = new Message(order.toString(), DataDictionaryTest.getDictionary(), new ValidationSettings());
            assertEquals(charset + " encoded field", text, msg.getString(EncodedText.FIELD));
        } finally {
            CharsetSupport.setDefaultCharset();
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
                DataDictionaryTest.getDictionary(), new ValidationSettings());

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
        final Message message = new Message(data, DataDictionaryTest.getDictionary(), new ValidationSettings());

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
        executionReport.fromString(data, dictionary, new ValidationSettings(), true);
        dictionary.validate(executionReport, new ValidationSettings());
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
        executionReport.fromString(data1, dictionary, new ValidationSettings(), true);
        dictionary.validate(executionReport, new ValidationSettings());

        executionReport.clear();
        executionReport.fromString(data2, dictionary, new ValidationSettings(), true);
        dictionary.validate(executionReport, new ValidationSettings());
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

        executionReport.fromString(data, dictionary, new ValidationSettings(), true);
        final Header.NoHops hops = new Header.NoHops();
        hops.set(new HopCompID("FOO"));
        executionReport.header.addGroup(hops);

        dictionary.validate(executionReport, new ValidationSettings());
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
        mdsfr.fromString(data, sessDictionary, appDictionary, new ValidationSettings(), true);
        DataDictionary.validate(mdsfr, sessDictionary, appDictionary, new ValidationSettings());
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
        ValidationSettings dds = new ValidationSettings();
        mdsfr.fromString(data, sessDictionary, appDictionary, dds, true);
        DataDictionary.validate(mdsfr, sessDictionary, appDictionary, dds);
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
        logon.fromString(data, sessionDictionary, appDictionary, new ValidationSettings(), true);
        DataDictionary.validate(logon, sessionDictionary, sessionDictionary, new ValidationSettings());
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
            new Message(news.toString(), DataDictionaryTest.getDictionary(), new ValidationSettings());
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
            dictionary.validate(news, new ValidationSettings());
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
            final Message m2 = new Message(m.toString(), dictionary, new ValidationSettings());
            assertEquals(m.bodyLength(), m2.bodyLength());
        } catch (final InvalidMessage e) {
            fail(e.getMessage());
        }
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
        message.fromString(expectedMessageString, dataDictionary, new ValidationSettings(), false);
        final String actualMessageString = message.toString();
        assertTrue(
                "wrong field ordering",
                actualMessageString.contains("453=2\001448=8\001447=D\001452=4\001448=AAA35354\001447=D\001452=3"));
    }

    @Test
    public void testMessageGroups() {
        final Message message = new Message();
        final NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        assertGroupContent(message, numAllocs);
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
                dd, new ValidationSettings(), true);
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
                dd, new ValidationSettings(), true);
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
            Message parsed1 = new Message(s1, DataDictionaryTest.getDictionary(), new ValidationSettings());

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
            Message parsed2 = new Message(s2, DataDictionaryTest.getDictionary(), new ValidationSettings(), false);

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
            ValidationSettings validationSettings = new ValidationSettings();
            DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
            // parsing without validation should succeed
            Message parsed1 = new Message(s1, dictionary, validationSettings,false);

            // validation should fail
            int failingTag = 0;
            try {
                dictionary.validate(parsed1, validationSettings);
            } catch (FieldException e) {
                failingTag = e.getField();
            }
            assertEquals(10000, failingTag);

            // but without checking user-defined fields, validation should succeed
            validationSettings.setCheckUserDefinedFields(false);
            dictionary.validate(parsed1, validationSettings);

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
            Message parsed2 = new Message(s2, dictionary, new ValidationSettings(), false);

            // validation should fail
            int failingTag = 0;
            try {
                dictionary.validate(parsed2, new ValidationSettings());
            } catch (FieldException e) {
                failingTag = e.getField();
            }
            assertEquals(Text.FIELD, failingTag);

            // but without checking for unknown message fields, validation should succeed
            ValidationSettings validationSettings = new ValidationSettings();
            validationSettings.setAllowUnknownMessageFields(true);
            dictionary.validate(parsed2, validationSettings);

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
        ValidationSettings validationSettings = new ValidationSettings();

        int tagNo = 0;
        try {
            dd.validate(responseMessage, true, validationSettings);
        } catch (FieldException e) {
            tagNo = e.getField();
        }
        // make sure that tag 297 is reported as invalid, NOT tag 55
        // (which is the first field after the invalid 297 field)
        assertEquals(QuoteAckStatus.FIELD, tagNo);

        Message msg2 = new Message(responseMessage.toString(), dd, validationSettings);
        try {
            dd.validate(msg2, true, validationSettings);
        } catch (FieldException e) {
            tagNo = e.getField();
        }
        // make sure that tag 297 is reported as invalid, NOT tag 55
        // (which is the first field after the invalid 297 field)
        assertEquals(QuoteAckStatus.FIELD, tagNo);

        // parse message again without validation
        msg2 = new Message(responseMessage.toString(), dd, validationSettings, false);
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
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckUserDefinedFields(false);
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, validationSettings, true);
        assertNull(nos.getException());
        dataDictionary.validate(nos, validationSettings);

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
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckUserDefinedFields(false);

        // When
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, validationSettings, true);

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
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckUserDefinedFields(false);
        nos.fromString(newOrdersSingleString.replaceAll("\\|", "\001"), dataDictionary, validationSettings, true);
        assertNull(nos.getException());
        dataDictionary.validate(nos, validationSettings);

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
        ValidationSettings validationSettings = new ValidationSettings();
        validationSettings.setCheckUnorderedGroupFields(false);
        // without checking order of repeating group it should work
        Message parsed = new Message(s, dictionary, validationSettings);
        FieldException exception = parsed.getException();
        assertNull(exception);

        assertEquals(1, parsed.getGroupCount(555));

        dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        // when checking order of repeating group, an error should be reported
        parsed = new Message(s, dictionary, new ValidationSettings());
        exception = parsed.getException();
        assertEquals(654, exception.getField());
        // but we still should have the repeating group set and not ignore it
        assertEquals(1, parsed.getGroupCount(555));
    }

    // QFJ-533
    @Test
    public void testRepeatingGroupCountWithNonIntegerValues() throws Exception {
        DataDictionary dictionary = new DataDictionary(DataDictionaryTest.getDictionary());
        ValidationSettings validationSettings = new ValidationSettings();
        Message ioi = new quickfix.fix50.IOI();
        ioi.setString(quickfix.field.NoPartyIDs.FIELD, "abc");
        final String invalidCountMessage = ioi.toString();
        try {
            Message message =  new Message(invalidCountMessage, dictionary, validationSettings);
        } catch (final InvalidMessage im) {
            assertNotNull("InvalidMessage correctly thrown", im);
        } catch (final Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
        }
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

    @Test
    public void shouldConvertToXmlWhenDataDictionaryLoadedWithExternalDTD() throws ConfigError {
        DataDictionary dataDictionary = new DataDictionary("FIX_External_DTD.xml", DocumentBuilderFactory::newInstance);
        Message message = new Message();
        message.setString(Account.FIELD, "test-account");

        String xml = message.toXML(dataDictionary);
        xml = xml.replace("\r", "").replace("\n", "").replaceAll(">\\s+<", "><");
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?><message><header/><body><field name=\"Account\" tag=\"1\"><![CDATA[test-account]]></field></body><trailer/></message>", xml);
    }
    @Test
    public void shouldConvertToXMLWithoutIndent() {
        Message message = new Message();
        message.setString(Account.FIELD, "test-account");
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?><message><header/><body><field tag=\"1\"><![CDATA[test-account]]></field></body><trailer/></message>", message.toXML());
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
        assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>\n" + "<message>\n" +
                    "    <header/>\n" + "    <body>\n" +
                    "        <field tag=\"1\"><![CDATA[test-account]]></field>\n" + "    </body>\n" +
                    "    <trailer/>\n" + "</message>\n", xml);
    }

    @Test
    public void testValidateFieldsOutOfOrderFIXT11() throws Exception {
        final DataDictionary sessDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        final DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIX50SP2.xml");
        final ValidationSettings dds = new ValidationSettings();
        assertNotNull(sessDictionary);
        assertNotNull(appDictionary);
        assertNotEquals(appDictionary.getVersion(),  sessDictionary.getVersion());

        final String orderedData = "8=FIXT.1.1\u00019=561\u000135=AE\u0001" +
                "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u0001" +
                "1128=9\u0001" +
                "627=2\u0001" +
                "628=HOPID1\u0001629=20220414-15:22:54\u0001" +
                "628=HOPID2\u0001629=20220414-15:22:54\u0001" +
                "15=AUD\u000122=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001381=135000\u0001461=Exxxxx\u0001487=0\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u00011003=1120000338\u00011015=0\u00011301=XASX\u0001" +
                "552=2\u0001" +
                "54=1\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093758035\u0001" +
                "54=2\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093757876\u0001" +
                "10=129\u0001";
        final TradeCaptureReport tcrOrdered = new TradeCaptureReport();
        tcrOrdered.fromString(orderedData, sessDictionary, appDictionary, dds, true);
        DataDictionary.validate(tcrOrdered, sessDictionary, appDictionary, dds);
        // As this is our reference message created with all validations switched on, make sure some message components
        // are as expected
        assertEquals(tcrOrdered.getHeader().getGroupCount(NoHops.FIELD), 2);
        assertEquals(tcrOrdered.getGroupCount(NoSides.FIELD), 2);

        dds.setCheckFieldsOutOfOrder(false);

        String unorderedData = "8=FIXT.1.1\u00019=561\u000135=AE\u0001" +
                "15=AUD\u000122=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001381=135000\u0001461=Exxxxx\u0001487=0\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u00011003=1120000338\u00011015=0\u00011301=XASX\u0001" +
                "552=2\u0001" +
                "54=1\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093758035\u0001" +
                "54=2\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093757876\u0001" +
                // Repeating Header Group, found just after a Repeating group within the body
                "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001" +
                "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u00011128=9\u0001" +
                "10=129\u0001";
        TradeCaptureReport tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, appDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, appDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());

        unorderedData = "8=FIXT.1.1\u00019=561\u000135=AE\u0001" +
                "15=AUD\u000122=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001381=135000\u0001461=Exxxxx\u0001487=0\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u00011003=1120000338\u00011015=0\u00011301=XASX\u0001" +
                "552=2\u0001" +
                "54=1\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093758035\u0001" +
                "54=2\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093757876\u0001" +
                // Header tag found just after Repeating group within the body
                "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u00011128=9\u0001" +
                "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001" +
                "10=129\u0001";
        tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, appDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, appDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());

        unorderedData = "8=FIXT.1.1\u00019=561\u000135=AE\u0001" +
                "15=AUD\u000122=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001381=135000\u0001461=Exxxxx\u0001487=0\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u00011003=1120000338\u00011015=0\u00011301=XASX\u0001" +
                // Some Header fields found after body fields detected
                "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u00011128=9\u0001" +
                // Repeating Group
                "552=2\u0001" +
                "54=1\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093758035\u0001" +
                "54=2\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u000111=7533509260093757876\u0001" +
                // Some repeating Header tags
                "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001" +
                "10=129\u0001";
        tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, appDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, appDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());

    }

    @Test
    public void testValidateFieldsOutOfOrderPreFIXT11() throws Exception {
        final DataDictionary sessDictionary = DataDictionaryTest.getDictionary("FIX44.xml");
        final ValidationSettings dds = new ValidationSettings();
        assertNotNull(sessDictionary);

        final String orderedData =
                "8=FIX.4.4\u00019=551\u000135=AE\u0001"
                        + "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u0001"
                        + "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001"
                        + "22=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001461=Exxxxx\u0001487=0\u0001570=N\u0001571=TradeReportID\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u0001"
                        + "552=2\u0001"
                        + "54=1\u000137=OrderID1\u000111=7533509260093758035\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                        + "54=2\u000137=OrderID2\u000111=7533509260093757876\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                        + "10=191\u0001";
        final TradeCaptureReport tcrOrdered = new TradeCaptureReport();
        tcrOrdered.fromString(orderedData, sessDictionary, dds, true);
        DataDictionary.validate(tcrOrdered, sessDictionary, sessDictionary, dds);

        // As this is our reference message created with all validations switched on,
        // make sure some message components
        // are as expected
        assertEquals(tcrOrdered.getHeader().getGroupCount(NoHops.FIELD), 2);
        assertEquals(tcrOrdered.getGroupCount(NoSides.FIELD), 2);

        dds.setCheckFieldsOutOfOrder(false);

        String unorderedData = "8=FIX.4.4\u00019=551\u000135=AE\u0001"
                + "22=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001461=Exxxxx\u0001487=0\u0001570=N\u0001571=TradeReportID\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u0001"
                + "552=2\u0001"
                + "54=1\u000137=OrderID1\u000111=7533509260093758035\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                + "54=2\u000137=OrderID2\u000111=7533509260093757876\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                // Repeating Header Group, found just after a Repeating group within the body
                + "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001"
                + "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u0001"
                + "10=191\u0001";
        TradeCaptureReport tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, sessDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());

        unorderedData = "8=FIX.4.4\u00019=551\u000135=AE\u0001"
                + "22=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001461=Exxxxx\u0001487=0\u0001570=N\u0001571=TradeReportID\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u0001"
                + "552=2\u0001"
                + "54=1\u000137=OrderID1\u000111=7533509260093758035\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                + "54=2\u000137=OrderID2\u000111=7533509260093757876\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                // Header tag found just after Repeating group within the body
                + "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u0001"
                + "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001"

                + "10=191\u0001";
        tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, sessDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());

        unorderedData = "8=FIX.4.4\u00019=551\u000135=AE\u0001"
                // Some body tags
                + "22=4\u000131=27\u000132=5000.000000000000\u000148=AU000000ANZ3\u000155=ANZ\u000160=20220210-02:43:27.796\u000164=20220214\u000175=20220210\u0001106=4075\u0001167=CS\u0001461=Exxxxx\u0001487=0\u0001570=N\u0001571=TradeReportID\u0001762=1\u0001880=7533509260093686098:0#NORMAL#1644451200000000000\u0001"
                // The some Header tags
                + "34=545\u000149=SENDER\u000152=20220210-02:44:00.820\u000156=TARGET\u0001115=ON_BHEHALF\u0001"
                // A Repeating body group
                + "552=2\u0001"
                + "54=1\u000137=OrderID1\u000111=7533509260093758035\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                + "54=2\u000137=OrderID2\u000111=7533509260093757876\u0001453=1\u0001448=338-3\u0001447=D\u0001452=1\u00011=1040445\u0001576=1\u0001577=0\u0001"
                // Repeating Header Group
                + "627=2\u0001628=HOPID1\u0001629=20220414-15:22:54\u0001628=HOPID2\u0001629=20220414-15:22:54\u0001"
                + "10=191\u0001";
        tcrUnOrdered = new TradeCaptureReport();
        tcrUnOrdered.fromString(unorderedData, sessDictionary, dds, true);
        DataDictionary.validate(tcrUnOrdered, sessDictionary, sessDictionary, dds);

        assertEquals(tcrOrdered.toString(), tcrUnOrdered.toString());
    }

    @Test
    public void testFirstFieldInGroupIsDelimiter() throws Exception {

        final DataDictionary dataDictionary = new DataDictionary(getDictionary());
        ValidationSettings validationSettings = new ValidationSettings();

        String fixMsg = "8=FIX.4.4\u00019=688\u000135=AB\u000149=AAA\u000156=BBB\u000134=21133\u000150=ABCABC" +
                "\u000152=20230905-13:24:37.022\u000155=AAPL\u00011=ACC1\u000111=123456abcedf\u000121=1\u000138=5\u000154=1\u000140=2\u000144=-0.8" +
                "\u000159=0\u000160=20230905-13:24:36.984\u0001100=ALGO\u0001167=MLEG\u0001555=3\u0001602=111\u0001600=AAA" +
                "\u0001602=222\u0001654=231\u0001600=BBB\u0001602=333\u0001654=332\u0001600=CCC\u000158=TEXT\u000110=168\u0001";

        String byDictFixMsg = "8=FIX.4.4\u00019=688\u000135=AB\u000149=AAA\u000156=BBB\u000134=21133\u000150=ABCABC" +
                "\u000152=20230905-13:24:37.022\u000155=AAPL\u00011=ACC1\u000111=123456abcedf\u000121=1\u000138=5\u000154=1\u000140=2\u000144=-0.8" +
                "\u000159=0\u000160=20230905-13:24:36.984\u0001100=ALGO\u0001167=MLEG\u0001555=3\u0001600=AAA\u0001602=111" +
                "\u0001600=BBB\u0001602=222\u0001654=231\u0001600=CCC\u0001602=333\u0001654=332\u000158=TEXT\u000110=168\u0001";

        validationSettings.setFirstFieldInGroupIsDelimiter(true);
        validationSettings.setCheckUnorderedGroupFields(false);
        final NewOrderMultileg noml1 = new NewOrderMultileg();
        noml1.fromString(fixMsg, dataDictionary, validationSettings, true);
        dataDictionary.validate(noml1, validationSettings);
        assertTrue(noml1.hasGroup(555));
        assertEquals(3, noml1.getGroupCount(555));
        //when firstFieldInGroupIsDelimiter = true and setCheckUnorderedGroupFields = false - valid
        //delimiter should be first tag in group
        assertEquals(602, noml1.getGroup(1, 555).delim());

        validationSettings.setFirstFieldInGroupIsDelimiter(false);
        validationSettings.setCheckUnorderedGroupFields(false);
        final NewOrderMultileg noml2 = new NewOrderMultileg();
        noml2.fromString(fixMsg, dataDictionary, validationSettings, true);
        //when firstFieldInGroupIsDelimiter = false and setCheckUnorderedGroupFields = false - exception is thrown
        assertThrows(FieldException.class, () -> dataDictionary.validate(noml2, validationSettings));

        validationSettings.setFirstFieldInGroupIsDelimiter(false);
        validationSettings.setCheckUnorderedGroupFields(true);
        final NewOrderMultileg noml3 = new NewOrderMultileg();
        noml3.fromString(fixMsg, dataDictionary, validationSettings, true);
        //when firstFieldInGroupIsDelimiter = false and setCheckUnorderedGroupFields = true - exception is thrown
        assertThrows(FieldException.class, () -> dataDictionary.validate(noml3, validationSettings));

        validationSettings.setFirstFieldInGroupIsDelimiter(true);
        validationSettings.setCheckUnorderedGroupFields(true);
        final NewOrderMultileg noml4 = new NewOrderMultileg();
        noml4.fromString(fixMsg, dataDictionary, validationSettings, true);
        //when firstFieldInGroupIsDelimiter = true and setCheckUnorderedGroupFields = true - exception is thrown, since order of tags is incorrect.
        assertThrows(FieldException.class, () -> dataDictionary.validate(noml4, validationSettings));

        validationSettings.setFirstFieldInGroupIsDelimiter(true);
        validationSettings.setCheckUnorderedGroupFields(true);
        final NewOrderMultileg noml5 = new NewOrderMultileg();
        noml5.fromString(byDictFixMsg, dataDictionary, validationSettings, true);
        //when firstFieldInGroupIsDelimiter = true and setCheckUnorderedGroupFields = true, message aligns with dictionary - do NOT fail
        dataDictionary.validate(noml5, validationSettings);
        assertTrue(noml5.hasGroup(555));
        assertEquals(3, noml5.getGroupCount(555));
        //delimiter should be dictionary first tag = 600
        assertEquals(600, noml5.getGroup(1, 555).delim());
    }

    @Test
    public void shouldReturnFixSpecificHeader() throws FieldNotFound {
        NewOrderSingle order = new NewOrderSingle();
        assertSame(quickfix.fix42.Message.Header.class, order.getHeader().getClass());

        order.getHeader().set(new TargetSubID("foo"));
        assertEquals(order.getHeader().getTargetSubID().getValue(), "foo");

        quickfix.fixlatest.NewOrderSingle fixLatestOrder = new quickfix.fixlatest.NewOrderSingle();
        assertSame(quickfix.fixlatest.Message.Header.class, fixLatestOrder.getHeader().getClass());

        quickfix.fix50sp1.NewOrderSingle fix50sp1Order = new quickfix.fix50sp1.NewOrderSingle();
        assertSame(quickfix.fix50sp1.Message.Header.class, fix50sp1Order.getHeader().getClass());

        TestRequest testRequest = new TestRequest();
        assertSame(quickfix.fixt11.Message.Header.class, testRequest.getHeader().getClass());
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

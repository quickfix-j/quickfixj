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

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import junit.framework.TestCase;
import quickfix.field.AllocAccount;
import quickfix.field.AllocShares;
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
import quickfix.field.IOIid;
import quickfix.field.LeavesQty;
import quickfix.field.ListID;
import quickfix.field.ListSeqNo;
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
import quickfix.field.Price;
import quickfix.field.RawData;
import quickfix.field.RawDataLength;
import quickfix.field.RefMsgType;
import quickfix.field.SecureData;
import quickfix.field.SecurityID;
import quickfix.field.SecurityIDSource;
import quickfix.field.SecurityType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.SessionRejectReason;
import quickfix.field.Side;
import quickfix.field.Signature;
import quickfix.field.SignatureLength;
import quickfix.field.Symbol;
import quickfix.field.TargetCompID;
import quickfix.field.TotNoOrders;
import quickfix.field.TransactTime;
import quickfix.field.UnderlyingCurrency;
import quickfix.field.UnderlyingSymbol;
import quickfix.fix42.NewOrderSingle;
import quickfix.fix43.NewOrderList;
import quickfix.fix44.ExecutionReport;
import quickfix.fix44.IndicationOfInterest;
import quickfix.fix44.Logon;
import quickfix.fix44.NewOrderCross;
import quickfix.fix44.News;
import quickfix.fix44.Logon.NoMsgTypes;
import quickfix.fix44.NewOrderSingle.NoPartyIDs;
import quickfix.fix44.component.Instrument;
import quickfix.fix44.component.Parties;
import quickfix.fix50.MarketDataSnapshotFullRefresh;

public class MessageTest extends TestCase {

    public void testRepeatingField() throws Exception {
        Message m = new Message(
                "8=FIX.4.0\0019=100\00135=D\00134=2\00149=TW\00156=ISLD\00111=ID\00121=1\001"
                        + "40=1\00154=1\00140=2\00138=200\00155=INTC\00110=160\001");
        assertFalse("message should be invalid", m.hasValidStructure());
        assertEquals("wrong invalid tag", 40, m.getInvalidTag());
    }

    public void testTrailerFieldOrdering() throws Exception {
        NewOrderSingle order = createNewOrderSingle();

        order.getTrailer().setField(new Signature("FOO"));
        order.getTrailer().setField(new SignatureLength(3));

        assertTrue(order.toString().contains("93=3\00189=FOO\001"));
    }

    private NewOrderSingle createNewOrderSingle() {
        return new NewOrderSingle(new ClOrdID("CLIENT"), new HandlInst(
                HandlInst.AUTOMATED_EXECUTION_ORDER_PUBLIC), new Symbol("ORCL"),
                new Side(Side.BUY), new TransactTime(new Date(0)), new OrdType(OrdType.LIMIT));
    }

    public void testHeaderGroupParsing() throws Exception {
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "627=2\001628=FOO\001628=BAR\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=228\001",
                DataDictionaryTest.getDictionary());

        quickfix.fix44.Message.Header.NoHops hops = new quickfix.fix44.Message.Header.NoHops();
        message.getHeader().getGroup(1, hops);
        assertEquals("FOO", hops.getString(HopCompID.FIELD));
        message.getHeader().getGroup(2, hops);
        assertEquals("BAR", hops.getString(HopCompID.FIELD));
    }

    public void testEmbeddedMessage() throws Exception {
        NewOrderSingle order = createNewOrderSingle();

        ExecutionReport report = new ExecutionReport(new OrderID("ORDER"), new ExecID("EXEC"),
                new ExecType(ExecType.FILL), new OrdStatus(OrdStatus.FILLED), new Side(Side.BUY),
                new LeavesQty(100), new CumQty(100), new AvgPx(50));

        report.set(new EncodedTextLen(order.toString().length()));
        report.set(new EncodedText(order.toString()));

        Message msg = new Message(report.toString(), DataDictionaryTest.getDictionary());
        assertEquals("embedded order", order.toString(), msg.getString(EncodedText.FIELD));
    }

    public void testParsing() throws Exception {
        // checksum is not verified in these tests
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=96\001",
                DataDictionaryTest.getDictionary());

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
        Message message = new Message(data, DataDictionaryTest.getDictionary());

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

    public void testParseEmptyString() throws Exception {
        String data = "";

        // with validation
        try {
            new Message(data, DataDictionaryTest.getDictionary());
        } catch (InvalidMessage im) {
        } catch (Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
        }

        // without validation
        try {
            new Message(data, DataDictionaryTest.getDictionary(), false);
        } catch (InvalidMessage im) {
        } catch (Throwable e) {
            e.printStackTrace();
            fail("InvalidMessage expected, got " + e.getClass().getName());
        }

    }

    public void testValidation() throws Exception {
        String data = "8=FIX.4.49=30935=849=ASX56=CL1_FIX4434=452=20060324-01:05:58"
                + "17=X-B-WOW-1494E9A0:58BD3F9D-1109150=D39=011=18427138=200198=1494E9A0:58BD3F9D"
                + "526=432437=B-WOW-1494E9A0:58BD3F9D55=WOW54=1151=20014=040=244=1559=16=0"
                + "453=3448=AAA35791447=D452=3448=8447=D452=4448=FIX11447=D452=36"
                + "60=20060320-03:34:2910=169";
        ExecutionReport executionReport = new ExecutionReport();
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        assertNotNull(dictionary);
        executionReport.fromString(data, dictionary, true);
        dictionary.validate(executionReport);
    }

    public void testAppMessageValidation() throws Exception {
        String data = "8=FIXT.1.19=23435=W34=249=ABFX52=20080722-16:37:11.23456=X2RV1"
                + "55=EUR/USD262=CAP0000011268=2269=0270=1.5784415=EUR271=500000272=20080724"
                + "269=1270=1.5786915=EUR271=500000272=2008072410=097";
        MarketDataSnapshotFullRefresh mdsfr = new MarketDataSnapshotFullRefresh();
        DataDictionary sessDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIX50.xml");
        assertNotNull(sessDictionary);
        assertNotNull(appDictionary);
        mdsfr.fromString(data, sessDictionary, appDictionary, true);
        DataDictionary.validate(mdsfr, sessDictionary, appDictionary);
    }

    public void testAdminMessageValidation() throws Exception {
        String data = "8=FIXT.1.19=8435=A49=EXEC56=BANZAI34=152=20080811-13:26:12.409108=1"
                + "141=Y98=01137=710=102";
        Logon logon = new Logon();
        DataDictionary sessionDictionary = DataDictionaryTest.getDictionary("FIXT11.xml");
        DataDictionary appDictionary = DataDictionaryTest.getDictionary("FIX50.xml");
        assertNotNull(sessionDictionary);
        assertNotNull(appDictionary);
        logon.fromString(data, sessionDictionary, appDictionary, true);
        DataDictionary.validate(logon, sessionDictionary, sessionDictionary);
    }

    public void testGroupDelimOrdering() throws Exception {
        // Test the generic group constructor (QFJ-95)
        quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        Group partyGroup = new Group(quickfix.field.NoPartyIDs.FIELD, PartyID.FIELD);
        partyGroup.setField(new PartyID("TraderName"));
        partyGroup.setField(new PartyIDSource(
                PartyIDSource.GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER));
        partyGroup.setField(new PartyRole(11));
        order.addGroup(partyGroup);
        String data = order.toString();
        assertTrue("wrong field order", data.indexOf("453=1\001448=TraderName") != -1);
    }

    public void testComponentGroupExtraction() throws Exception {
        quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        NoPartyIDs partyIds = new NoPartyIDs();
        partyIds.set(new PartyID("PARTY_ID_1"));
        order.addGroup(partyIds);
        partyIds.set(new PartyID("PARTY_ID_2"));
        order.addGroup(partyIds);

        Parties parties = order.getParties();
        assertEquals("wrong # of party IDs", 2, parties.getNoPartyIDs().getValue());
    }

    public void testComponentGroupInsertion() throws Exception {
        Parties parties = new Parties();
        NoPartyIDs partyIds = new NoPartyIDs();
        partyIds.set(new PartyID("PARTY_ID_1"));
        parties.addGroup(partyIds);
        partyIds.set(new PartyID("PARTY_ID_2"));
        parties.addGroup(partyIds);

        quickfix.fix44.NewOrderSingle order = new quickfix.fix44.NewOrderSingle();
        order.set(parties);

        assertEquals("wrong # of party IDs", 2, order.getNoPartyIDs().getValue());
    }

    // QFJ-66 Should not throw exception when parsing data field in header
    public void testHeaderDataField() throws Exception {
        Message m = new Message("8=FIX.4.2\0019=53\00135=A\00190=4\00191=ABCD\001"
                + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00110=241\001",
                DataDictionaryTest.getDictionary());
        assertEquals("ABCD", m.getHeader().getString(SecureData.FIELD));
    }

    // QFJ-52
    public void testInvalidFirstFieldInGroup() throws Exception {
        News news = new News();
        news.set(new Headline("Test"));
        News.NoRelatedSym relatedSym = new News.NoRelatedSym();
        relatedSym.set(new SecurityID("SECID"));
        relatedSym.set(new SecurityIDSource("SECID_SOURCE"));
        news.addGroup(relatedSym);

        try {
            new Message(news.toString(), DataDictionaryTest.getDictionary());
        } catch (InvalidMessage e) {
            // expected
        } catch (NullPointerException e) {
            fail("Should not throw NPE when first field is missing.");
        }
    }

    public void testRequiredGroupValidation() throws Exception {
        News news = new News();
        news.set(new Headline("Test"));
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        try {
            dictionary.validate(news);
            fail("no field exception for missing lines group");
        } catch (FieldException e) {
            // expected
        }
    }

    /**
     *  Test for data fields with SOH. This test is based on report from a user on
     *  the QuickFIX mailing list. The problem was the user's configuration but this
     *  seems like a good unit test to keep in the suite.
     */
    public void testDataFieldParsing() throws Exception {
        String data = "10001=Canonical.1.00\00110002=001058\00125001=01\00110003=SAPI_ADMRESP\00110004=SUBSCRIBE_RESP\001"
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
            DataDictionary dictionary = DataDictionaryTest.getDictionary();
            Message m = new Message(("8=FIX.4.4\0019=1144\00135=A\001"
                    + "98=0\001384=2\001372=D\001385=R\001372=8\001385=S\00195=1092\001" + "96="
                    + data + "\00110=5\001"), dictionary);
            assertEquals(1144, m.bodyLength());
            Message m2 = new Message(m.toString(), dictionary);
            assertEquals(1144, m2.bodyLength());
        } catch (InvalidMessage e) {
            fail(e.getMessage());
        }
    }

    /**
     *  Test for data fields with SOH. This test is based on report from a user on
     *  the QuickFIX mailing list. The problem was the user's configuration but this
     *  seems like a good unit test to keep in the suite.
     */
    public void testDataFieldWithManualFieldInsertion() throws Exception {
        String data = "10001=Canonical.1.00\00110002=001058\00125001=01\00110003=SAPI_ADMRESP\00110004=SUBSCRIBE_RESP\001"
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
            DataDictionary dictionary = DataDictionaryTest.getDictionary();
            Message m = new Message();
            m.getHeader().setString(BeginString.FIELD, FixVersions.BEGINSTRING_FIX44);
            MsgType msgType = new MsgType("U678");
            m.getHeader().setField(msgType);
            m.setInt(RawDataLength.FIELD, data.length());
            m.setString(RawData.FIELD, data);
            assertEquals(1108 + msgType.getValue().length(), m.bodyLength());
            Message m2 = new Message(m.toString(), dictionary);
            assertEquals(m.bodyLength(), m2.bodyLength());
        } catch (InvalidMessage e) {
            fail(e.getMessage());
        }
    }

    public void testFix5HeaderFields() {
        assertTrue(Message.isHeaderField(ApplVerID.FIELD));
        assertTrue(Message.isHeaderField(CstmApplVerID.FIELD));
    }

    public void testCalculateStringWithNestedGroups() throws Exception {
        NewOrderCross noc = new NewOrderCross();
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
                CrossType.CROSS_TRADE_WHICH_IS_EXECUTED_PARTIALLY_AND_THE_REST_IS_CANCELLED);
        noc.setInt(CrossPrioritization.FIELD, CrossPrioritization.NONE);

        NewOrderCross.NoSides side = new NewOrderCross.NoSides();
        side.setChar(Side.FIELD, Side.BUY);
        side.setDouble(OrderQty.FIELD, 9);

        NewOrderCross.NoSides.NoPartyIDs party = new NewOrderCross.NoSides.NoPartyIDs();
        party.setString(PartyID.FIELD, "8");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY_CUSTOM_CODE);
        party.setInt(PartyRole.FIELD, PartyRole.CLEARING_FIRM);

        side.addGroup(party);

        party.setString(PartyID.FIELD, "AAA35777");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY_CUSTOM_CODE);
        party.setInt(PartyRole.FIELD, PartyRole.CLIENT_ID);

        side.addGroup(party);

        noc.addGroup(side);

        side.clear();
        side.setChar(Side.FIELD, Side.SELL);
        side.setDouble(OrderQty.FIELD, 9);

        party.clear();
        party.setString(PartyID.FIELD, "8");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY_CUSTOM_CODE);
        party.setInt(PartyRole.FIELD, PartyRole.CLEARING_FIRM);
        side.addGroup(party);

        party.clear();
        party.setString(PartyID.FIELD, "aaa");
        party.setChar(PartyIDSource.FIELD, PartyIDSource.PROPRIETARY_CUSTOM_CODE);
        party.setInt(PartyRole.FIELD, PartyRole.CLIENT_ID);
        side.addGroup(party);

        noc.addGroup(side);

        String expectedMessage = "8=FIX.4.49=24735=s34=549=sender52=20060319-09:08:20.881"
                + "56=target22=840=244=948=ABC55=ABC60=20060319-09:08:19548=184214549=2"
                + "550=0552=254=1453=2448=8447=D452=4448=AAA35777447=D452=338=954=2"
                + "453=2448=8447=D452=4448=aaa447=D452=338=910=056";
        assertEquals("wrong message", expectedMessage, noc.toString());

    }

    public void testFieldOrdering() throws Exception {
        String expectedMessageString = "8=FIX.4.49=17135=D49=SenderCompId56=TargetCompId11=183339"
                + "22=838=140=244=1248=BHP54=255=BHP59=160=20060223-22:38:33526=3620453=2448=8"
                + "447=D452=4448=AAA35354447=D452=310=168";
        DataDictionary dataDictionary = new DataDictionary("FIX44.xml");
        Message message = new DefaultMessageFactory().create(dataDictionary.getVersion(), "D");
        message.fromString(expectedMessageString, dataDictionary, false);
        String actualMessageString = message.toString();
        assertTrue("wrong field ordering", actualMessageString
                .indexOf("453=2448=8447=D452=4448=AAA35354447=D452=3") != -1);
    }

    public void testHeaderFieldsMissing() throws Exception {
        try {
            new Message("1=FIX.4.2");
        } catch (InvalidMessage e) {
            // expected
        }
    }

    public void testHeaderFieldInBody() throws Exception {
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\001212=4\001384=2\001372=D\001385=R\001372=8\001385=S\00110=103\001",
                DataDictionaryTest.getDictionary());

        assertFalse(message.hasValidStructure());

        assertTrue(message.getHeader().isSetField(212));

        assertEquals(SessionRejectReason.TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER, message
                .getException().getSessionRejectReason());
        assertEquals(212, message.getException().getField());
    }

    public void testTrailerFieldInBody() throws Exception {
        Message message = new Message("8=FIX.4.2\0019=40\00135=A\001"
                + "98=0\00193=5\001384=2\001372=D\001385=R\001372=8\001385=S\00110=63\001",
                DataDictionaryTest.getDictionary());

        assertFalse(message.hasValidStructure());

        SignatureLength signatureLength = new SignatureLength();
        message.getTrailer().getField(signatureLength);
        assertEquals(5, signatureLength.getValue());
    }

    public void testMessageFromString() {
        Message message = null;

        boolean badMessage = false;
        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=036\001");
        } catch (InvalidMessage e) {
            badMessage = true;
        }
        assertTrue("Message should be invalid", badMessage);

        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001");
        } catch (InvalidMessage e) {
            assertTrue("Message should be valid (" + e.getMessage() + ")", false);
        }
        assertEquals("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001", message.toString());
    }

    public void testMessageGroups() {
        Message message = new Message();
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        assertGroupContent(message, numAllocs);
    }

    public void testMessageGroupCountValidation() throws Exception {
        String data = "8=FIX.4.49=22235=D49=SenderCompId56=TargetCompId34=3752=20070223-22:28:33"
                + "11=18333922=838=140=244=1248=BHP54=255=BHP59=1"
                + "60=20060223-22:38:33526=362078=379=AllocACC180=1010.1"
                + "79=AllocACC280=2020.2453=2448=8447=D452=4448=AAA35354447=D452=310=082";
        Message message = new Message();
        DataDictionary dd = DataDictionaryTest.getDictionary();
        message.fromString(data, dd, true);
        try {
            dd.validate(message);
            fail("No exception thrown");
        } catch (FieldException e) {
            String emsg = e.getMessage();
            assertNotNull("No exception message", emsg);
            assertTrue(emsg.startsWith("Incorrect NumInGroup"));
        }

    }

    public void testMessageCloneWithGroups() {
        Message message = new Message();
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        Message clonedMessage = (Message) message.clone();
        assertGroupContent(clonedMessage, numAllocs);
    }

    public void testFieldOrderAfterClone() {
        Message message = new quickfix.fix44.NewOrderSingle();
        quickfix.fix44.NewOrderSingle.NoPartyIDs partyIdGroup = new quickfix.fix44.NewOrderSingle.NoPartyIDs();
        partyIdGroup.set(new PartyID("PARTY_1"));
        partyIdGroup.set(new PartyIDSource(PartyIDSource.DIRECTED_BROKER));
        partyIdGroup.set(new PartyRole(PartyRole.INTRODUCING_FIRM));
        message.addGroup(partyIdGroup);
        Message clonedMessage = (Message) message.clone();
        assertEquals("wrong field order",
                "8=FIX.4.49=3535=D453=1448=PARTY_1447=I452=610=040", clonedMessage
                        .toString());
    }
    
    public void testMessageGroupRemovalUsingGroupObject() {
        Message message = new Message();
        int length = message.calculateLength();
        int messageFieldWithZeroLengthGroup = length + "79=0\001".length();
        
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        // Remove all
        
        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));
        assertZeroLengthField(message);
        assertEquals("wrong message length", messageFieldWithZeroLengthGroup , message.calculateLength());
        
        // Remove one at a time

        numAllocs = setUpGroups(message);
        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(2, numAllocs);

        assertEquals("wrong # of group members", 1, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(1, numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));
        assertZeroLengthField(message);
        assertEquals("wrong message length", messageFieldWithZeroLengthGroup, message.calculateLength());  
   }

    private void assertZeroLengthField(Message message) {
        assertTrue("Incorrect length in message.toString()", message.toString().contains("\00178=0"));
    }

    public void testMessageGroupRemovalUsingGroupFieldTag() {
        Message message = new Message();
        int length = message.calculateLength();
        int messageFieldWithZeroLengthGroup = length + "79=0\001".length();
        int expectedTotalWithZeroLengthGroup = new IntField(78, 0).getTotal();
        
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

        // Remove all
        
        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));
        assertZeroLengthField(message);
        assertEquals("wrong message length", messageFieldWithZeroLengthGroup, message.calculateLength());
        assertEquals("wrong total", expectedTotalWithZeroLengthGroup, message.calculateTotal());

        // Remove one at a time
        
        numAllocs = setUpGroups(message);
        
        assertEquals("wrong # of group members", 2, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(2, numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 1, message.getGroupCount(numAllocs.getFieldTag()));

        message.removeGroup(1, numAllocs.getFieldTag());

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));
        assertZeroLengthField(message);
        assertEquals("wrong message length", messageFieldWithZeroLengthGroup, message.calculateLength());
        assertEquals("wrong total", expectedTotalWithZeroLengthGroup, message.calculateTotal());
    }

    public void testMessageGroupRemovalFromEmptyGroup() {
        Message message = new Message();
        int length = message.calculateLength();
        int messageFieldWithZeroLengthGroup = length + "79=0\001".length();
        int expectedTotalWithZeroLengthGroup = new IntField(78, 0).getTotal();
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);
        message.removeGroup(numAllocs);

        // ensure no exception when groups are empty
        message.removeGroup(1, numAllocs);

        assertEquals("wrong # of group members", 0, message.getGroupCount(numAllocs.getFieldTag()));
        assertZeroLengthField(message);
        assertEquals("wrong message length", messageFieldWithZeroLengthGroup, message.calculateLength());
        assertEquals("wrong total", expectedTotalWithZeroLengthGroup, message.calculateTotal());
    }

    public void testHasGroup() {
        Message message = new Message();
        NewOrderSingle.NoAllocs numAllocs = setUpGroups(message);

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

    public void testIsEmpty() {
        Message message = new Message();
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

    public void testMessageSetGetString() {
        Message message = new Message();

        try {
            message.getString(5);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        message.setString(5, "string5");

        try {
            assertEquals("string5", message.getString(5));
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }

        try {
            message.setString(100, null);
            assertTrue("exception not thrown", false);
        } catch (NullPointerException e) {
        }
    }

    public void testMessagesetGetBoolean() {
        Message message = new Message();

        try {
            message.getBoolean(7);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        message.setBoolean(7, true);

        try {
            assertEquals(true, message.getBoolean(7));
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }
    }

    public void testMessageSetGetChar() {
        Message message = new Message();

        try {
            message.getChar(12);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        message.setChar(12, 'a');

        try {
            assertEquals('a', message.getChar(12));
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }
    }

    public void testMessageSetGetInt() {
        Message message = new Message();

        try {
            message.getInt(56);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        message.setInt(56, 23);

        try {
            assertEquals(23, message.getInt(56));
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }
    }

    public void testMessageSetGetDouble() {
        Message message = new Message();

        try {
            message.getDouble(9812);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        message.setDouble(9812, 12.3443);

        try {
            assertEquals(12.3443, message.getDouble(9812));
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }
    }

    public void testMessageSetGetUtcTimeStamp() {
        Message message = new Message();

        try {
            message.getUtcTimeStamp(8);
            assertTrue("exception not thrown", false);
        } catch (FieldNotFound e) {
        }

        TimeZone timezone = TimeZone.getTimeZone("GMT+0");
        Calendar calendar = Calendar.getInstance(timezone);
        calendar.set(2002, 8, 6, 12, 34, 56);
        calendar.set(Calendar.MILLISECOND, 0);

        Date time = calendar.getTime();
        message.setUtcTimeStamp(8, time);

        try {
            assertEquals(message.getUtcTimeStamp(8).getTime(), time.getTime());
        } catch (FieldNotFound e) {
            assertTrue("exception thrown", false);
        }
    }

    public void testRemoveField() {
        Message message = new Message();
        message.setField(new StringField(12, "value"));
        assertTrue(message.isSetField(12));
        message.removeField(12);
        assertTrue(!message.isSetField(12));
    }

    public void testMessageIterator() {
        Message message = new Message();
        java.util.Iterator<Field<?>> i = message.iterator();
        assertEquals(false, i.hasNext());
        try {
            assertNull(i.next());
            fail("exception not thrown");
        } catch (java.util.NoSuchElementException e) {
        }

        try {
            message = new Message("8=FIX.4.2\0019=12\00135=A\001108=30\00110=026\001");
            i = message.iterator();
            assertTrue(i.hasNext());
            StringField field = (StringField) i.next();
            assertEquals(108, field.getField());
            assertEquals("30", field.getValue());

            assertEquals(false, i.hasNext());
            try {
                assertNull(i.next());
                fail("exception not thrown");
            } catch (java.util.NoSuchElementException e) {
            }

            java.util.Iterator<Field<?>> j = message.getHeader().iterator();
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

            assertEquals(false, j.hasNext());
            try {
                assertNull(j.next());
                fail("exception not thrown");
            } catch (java.util.NoSuchElementException e) {
            }

        } catch (InvalidMessage e) {
            fail("exception thrown");
        }
    }

    public void testIsAdmin() {
        Message message = new Message();

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

        message.getHeader().setString(MsgType.FIELD, MsgType.ORDER_SINGLE);
        assertFalse(message.isAdmin());

        message.getHeader().setString(MsgType.FIELD, MsgType.QUOTE_RESPONSE);
        assertFalse(message.isAdmin());
    }

    public void testComponent() throws Exception {
        Instrument instrument = new Instrument();
        instrument.set(new Symbol("DELL"));
        instrument.set(new CountryOfIssue("USA"));
        instrument.set(new SecurityType(SecurityType.COMMON_STOCK));

        quickfix.fix44.NewOrderSingle newOrderSingle = new quickfix.fix44.NewOrderSingle();
        newOrderSingle.set(instrument);
        newOrderSingle.set(new OrderQty(100));
        newOrderSingle.set(new Price(45));

        assertEquals(new Symbol("DELL"), newOrderSingle.getSymbol());
        assertEquals(new CountryOfIssue("USA"), newOrderSingle.getCountryOfIssue());
        assertEquals(new SecurityType(SecurityType.COMMON_STOCK), newOrderSingle.getSecurityType());

        newOrderSingle.set(new ClOrdID("CLIENT_ORDER_ID"));
        Instrument instrument2 = newOrderSingle.getInstrument();
        assertEquals(new Symbol("DELL"), instrument2.getSymbol());
        assertEquals(new CountryOfIssue("USA"), instrument2.getCountryOfIssue());
        assertEquals(new SecurityType(SecurityType.COMMON_STOCK), instrument2.getSecurityType());
        try {
            instrument2.getField(new ClOrdID());
            fail("should have thrown exception");
        } catch (FieldNotFound e) {
            // expected
        }

    }

    public void testReplaceGroup() throws Exception {
        Message message = new Message();
        message.setField(new ListID("1"));
        message.setField(new BidType(0));
        message.setField(new TotNoOrders(3));

        NewOrderList.NoOrders group = new NewOrderList.NoOrders();
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

        NoOrders noOrders = new NoOrders();

        assertTrue(message.hasGroup(1, group));
        assertTrue(message.hasGroup(2, group));
        assertTrue(message.hasGroup(3, group));
        assertEquals(3, message.getGroupCount(NoOrders.FIELD));
        message.getField(noOrders);
        assertEquals(3, noOrders.getValue());

        ClOrdID clOrdID = new ClOrdID();
        message.getGroup(1, group);
        assertEquals("A", group.getField(clOrdID).getValue());
        message.getGroup(2, group);
        assertEquals("D", group.getField(clOrdID).getValue());
        message.getGroup(3, group);
        assertEquals("C", group.getField(clOrdID).getValue());
    }

    public void testFalseMessageStructureException() {
        try {
            DataDictionary dd = DataDictionaryTest.getDictionary();
            // duplicated tag 98
            // QFJ-65
            new Message("8=FIX.4.4\0019=22\00135=A\00198=0\00198=0\001108=30\00110=223\001", dd,
                    true);
            // For now, this will not cause an exception if the length and checksum are correct
        } catch (Exception e) {
            String text = e.getMessage();
            assertTrue("Wrong exception message: " + text, text.indexOf("Actual body length") == -1);
        }
    }

    public void testFalseMessageStructureException2() {
        try {
            DataDictionary dd = DataDictionaryTest.getDictionary();
            // duplicated raw data length 
            // QFJ-121
            new Message("8=FIX.4.4\0019=22\00135=A\00196=X\001108=30\00110=223\001", dd, true);
        } catch (Exception e) {
            String text = e.getMessage();
            assertTrue("Wrong exception message: " + text, text != null
                    && text.indexOf("Actual body length") == -1);
        }
    }

    /** Verify that an empty message can still be "printed" and doesn't result in any exceptions */
    public void testEmptyMessageToString() throws Exception {
        Message msg = new quickfix.Message();
        assertNotNull(msg.toString());
        assertTrue("empty message contains no checksum", msg.toString().length() > 0);
    }

    public void testMessageBytesField() throws Exception {
        Logon logon = new Logon();
        String data = "rawdata";
        logon.set(new RawDataLength(data.length()));
        logon.setField(new BytesField(RawData.FIELD, data.getBytes()));
        //logon.set(new RawData(data));
        assertEquals("8=FIX.4.49=2135=A95=796=rawdata10=086", logon.toString());
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

    private void assertGroupContent(Message message, NewOrderSingle.NoAllocs numAllocs) {
        StringField field = null;
        java.util.Iterator<Field<?>> i = numAllocs.iterator();
        assertTrue(i.hasNext());
        field = (StringField) i.next();
        assertEquals("AllocACC2", field.getValue());
        assertTrue(i.hasNext());
        field = (StringField) i.next();
        assertEquals("2020.20", field.getValue());
        assertTrue(!i.hasNext());

        try {
            String accountId = numAllocs.getField(new AllocAccount()).getValue();
            Object shares = numAllocs.getField(new AllocShares()).getObject();
            message.getGroup(1, numAllocs);
            assertAllocation(accountId, shares);
            message.getGroup(2, numAllocs);
            assertEquals("AllocACC2", accountId);
            assertAllocation(accountId, shares);
        } catch (FieldNotFound e) {
            fail("no exception should be thrown");
        }

        try {
            message.getGroup(3, numAllocs);
            fail("exception should be thrown");
        } catch (FieldNotFound ignored) {
        }
    }

    private void assertAllocation(String accountId, Object shares) {
        if (accountId.equals("AllocACC1")) {
            assertEquals("got shares: " + shares, 0, new BigDecimal("1010.10")
                    .compareTo(new BigDecimal(shares.toString())));
        } else if (accountId.equals("AllocACC2")) {
            assertEquals("got shares: " + shares, 0, new BigDecimal("2020.20")
                    .compareTo(new BigDecimal(shares.toString())));
        } else {
            fail("Unknown account");
        }
    }

    private NewOrderSingle.NoAllocs setUpGroups(Message message) {
        NewOrderSingle.NoAllocs numAllocs = new NewOrderSingle.NoAllocs();
        numAllocs.set(new AllocAccount("AllocACC1"));
        numAllocs.setField(new StringField(AllocShares.FIELD, "1010.10"));
        message.addGroup(numAllocs);
        numAllocs.setField(new AllocAccount("AllocACC2"));
        numAllocs.setField(new StringField(AllocShares.FIELD, "2020.20"));
        message.addGroup(numAllocs);
        return numAllocs;
    }
}
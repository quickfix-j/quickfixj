package quickfix;

import junit.framework.TestCase;

public class TestDataDictionary extends TestCase {

    public TestDataDictionary(String arg0) {
        super(arg0);
    }

    public void testDictionary() throws Exception {
        DataDictionary dd = getDictionary();

        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        assertEquals("wrong value description", "BUY", dd.getValueName(4, "B"));
        assertEquals("wrong value type", FieldType.String, dd.getFieldType(1));
        assertEquals("wrong version", FixVersions.BEGINSTRING_FIX44, dd.getVersion());
        assertFalse("unexpected field values existence", dd.hasFieldValue(1));
        assertTrue("unexpected field values nonexistence", dd.hasFieldValue(4));
        assertFalse("unexpected field existence", dd.isField(9999));
        assertTrue("unexpected field nonexistence", dd.isField(4));
        assertTrue("unexpected field value existence", !dd.isFieldValue(4, "C"));
        assertTrue("unexpected field value nonexistence", dd.isFieldValue(4, "B"));
        assertTrue("wrong group info", dd.isGroup("A", 384));
        assertFalse("wrong group info", dd.isGroup("A", 1));
        assertTrue("incorrect header field", dd.isHeaderField(8));
        assertFalse("incorrect header field", dd.isHeaderField(1));
        assertTrue("incorrect trailer field", dd.isTrailerField(89));
        assertFalse("incorrect trailer field", dd.isTrailerField(1));
        assertTrue("incorrect message field", dd.isMsgField("A", 98));
        assertFalse("incorrect message field", dd.isMsgField("A", 1));
        assertTrue("incorrect message field", dd.isMsgField("6", 235)); // component
        // field
        assertTrue("incorrect message field", dd.isMsgField("6", 311)); // group/component
        // field
        assertTrue("incorrect message type", dd.isMsgType("A"));
        assertFalse("incorrect message type", dd.isMsgType("%"));
        assertTrue("incorrect field requirement", dd.isRequiredField("A", 98));
        assertFalse("incorrect field requirement", dd.isRequiredField("A", 95));
        assertEquals("incorrect field name", "Account", dd.getFieldName(1));
    }

    private static DataDictionary testDataDictionary;

    public static DataDictionary getDictionary() {
        if (testDataDictionary == null) {
            testDataDictionary = new DataDictionary(TestDataDictionary.class.getClassLoader()
                    .getResourceAsStream("quickfix/FIX44_test.xml"));
        }
        return testDataDictionary;
    }

    //    private String getSpecificationForTest() {
    //        String spec = "";
    //        spec += "<fix major='4' minor='2'>";
    //        spec += "<header>";
    //        spec += " <field name='BeginString' required='Y'/>";
    //        spec += " <field name='OnBehalfOfCompID' required='N'/>";
    //        spec += "</header>";
    //        spec += "<trailer>";
    //        spec += " <field name='Signature' required='N'/>";
    //        spec += " <field name='CheckSum' required='Y'/>";
    //        spec += "</trailer>";
    //        spec += "<messages>";
    //        spec += " <message name='Logon' msgtype='A' msgcat='admin'>";
    //        spec += " <field name='EncryptMethod' required='Y'/>";
    //        spec += " <field name='RawDataLength' required='N'/>";
    //        spec += " <component name='Instrument' required='Y'/>";
    //        spec += " <group name='NoMsgTypes' required='N'>";
    //        spec += " <field name='RefMsgType' required='Y'/>";
    //        spec += " <field name='MsgDirection' required='N'/>";
    //        spec += " <group name='NoQuoteEntries' required='N'>";
    //        spec += " <field name='QuoteEntryID' required='N'/>";
    //        spec += " </group>";
    //        spec += " </group>";
    //        spec += " </message>";
    //        spec += "</messages>";
    //        spec += "<components>";
    //        spec += " <component name='Instrument'>";
    //        spec += " <field name='Symbol' required='Y' />";
    //        spec += " <field name='SymbolSfx' required='N' />";
    //        spec += " <field name='SecurityID' required='N' />";
    //        spec += " <field name='SecurityIDSource' required='N' />";
    //        spec += " <group name='NoSecurityAltID' required='N' >";
    //        spec += " <field name='SecurityAltID' required='N' />";
    //        spec += " <field name='SecurityAltIDSource' required='N' />";
    //        spec += " </group>";
    //        spec += " </component>";
    //        spec += "</components>";
    //        spec += "<fields>";
    //        spec += " <field number='1' name='Account' type='STRING'/>";
    //        spec += " <field number='4' name='AdvSide' type='CHAR'>";
    //        spec += " <value enum='B' description='BUY'/>";
    //        spec += " <value enum='S' description='SELL'/>";
    //        spec += " <value enum='X' description='CROSS'/>";
    //        spec += " <value enum='T' description='TRADE'/>";
    //        spec += " </field>";
    //        spec += " <field number='6' name='AvgPx' type='PRICE'/>";
    //        spec += " <field number='95' name='RawDataLength' type='INT'/>";
    //        spec += " <field number='89' name='Signature' type='DATA'/>";
    //        spec += " <field number='8' name='BeginString' type='STRING'/>";
    //        spec += " <field number='98' name='EncryptMethod' type='INT'/>";
    //        spec += " <field number='7' name='BeginSeqNo' type='INT'/>";
    //        spec += " <field number='12' name='Commission' type='AMT'/>";
    //        spec += " <field number='14' name='CumQty' type='QTY'/>";
    //        spec += " <field number='15' name='Currency' type='CURRENCY'/>";
    //        spec += " <field number='18' name='ExecInst'
    // type='MULTIPLEVALUESTRING'/>";
    //        spec += " <field number='30' name='LastMkt' type='EXCHANGE'/>";
    //        spec += " <field number='42' name='OrigTime' type='UTCTIMESTAMP'/>";
    //        spec += " <field number='43' name='PossDupFlag' type='BOOLEAN'/>";
    //        spec += " <field number='44' name='Price' type='PRICE'/>";
    //        spec += " <field number='52' name='SendingTime' type='UTCTIMESTAMP'/>";
    //        spec += " <field number='64' name='FutSettDate' type='LOCALMKTDATE'/>";
    //        spec += " <field number='89' name='Signature' type='DATA'/>";
    //        spec += " <field number='384' name='NoMsgTypes' type='NUMINGROUP'/>";
    //        spec += " <field number='999' name='OnBehalfOfCompID' type='STRING'/>";
    //        spec += " <field number='998' name='CheckSum' type='INT'/>";
    //        spec += " <field number='997' name='RefMsgType' type='INT'/>";
    //        spec += " <field number='996' name='MsgDirection' type='STRING'/>";
    //        spec += " <field number='995' name='QuoteEntryID' type='STRING'/>";
    //        spec += "</fields>";
    //        spec += "</fix>";
    //        return spec;
    //    }

}
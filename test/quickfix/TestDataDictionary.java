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
//            testDataDictionary = new DataDictionary(TestDataDictionary.class.getClassLoader()
//                    .getResourceAsStream("quickfix/codegen/FIX44.xml"));
        }
        return testDataDictionary;
    }
}
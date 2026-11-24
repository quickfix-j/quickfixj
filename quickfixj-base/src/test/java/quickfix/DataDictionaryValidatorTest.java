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
import static org.junit.Assert.assertThrows;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import quickfix.field.SessionRejectReason;

public class DataDictionaryValidatorTest {

    private static final String VALID_ORDER =
        "8=FIX.4.4\0019=136\00135=D\00134=25\00149=SENDER\00156=TARGET\00152=20110412-13:43:00\001" +
        "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
        "54=1\00155=QFJ\00159=0\00110=239\001";

    // TimeInForce(59)=Z is not a valid enum value in FIX 4.4
    private static final String ORDER_WITH_UNKNOWN_ENUM_VALUE =
        "8=FIX.4.4\0019=136\00135=D\00134=25\00149=SENDER\00156=TARGET\00152=20110412-13:43:00\001" +
        "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
        "54=1\00155=QFJ\00159=Z\00110=239\001";

    // missing required header field SendingTime(52)
    private static final String ORDER_WITHOUT_SENDING_TIME =
        "8=FIX.4.4\0019=113\00135=D\00134=25\00149=SENDER\00156=TARGET\001" +
        "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
        "54=1\00155=QFJ\00159=0\00110=084\001";

    private static final String FIX42_ORDER =
        "8=FIX.4.2\0019=136\00135=D\00134=25\00149=SENDER\00156=TARGET\00152=20110412-13:43:00\001" +
        "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
        "54=1\00155=QFJ\00159=0\00110=239\001";

    @Test
    public void testValidMessageIsAccepted() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER);

        new DataDictionaryValidator(new ValidationSettings()).validate(dictionary, message);
    }

    @Test
    public void testNullSettingsFallBackToDefaults() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, ORDER_WITH_UNKNOWN_ENUM_VALUE);
        DataDictionaryValidator validator = new DataDictionaryValidator(null);

        assertThrows(IncorrectTagValue.class, () -> validator.validate(dictionary, message));
    }

    @Test
    public void testSettingsAreApplied() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, ORDER_WITH_UNKNOWN_ENUM_VALUE);
        ValidationSettings settings = new ValidationSettings();
        settings.setAllowUnknownEnumValues(true);

        new DataDictionaryValidator(settings).validate(dictionary, message);
    }

    @Test
    public void testBodyOnlySkipsHeaderValidation() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, ORDER_WITHOUT_SENDING_TIME);
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        assertThrows(FieldException.class, () -> validator.validate(dictionary, message, false));

        validator.validate(dictionary, message, true);
    }

    @Test
    public void testVersionMismatchIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, FIX42_ORDER);
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        assertThrows(UnsupportedVersion.class,
                () -> validator.validate(message, dictionary, dictionary));
    }

    @Test
    public void testBodyOnlyOverloadOnDataDictionary() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, ORDER_WITHOUT_SENDING_TIME);

        dictionary.validate(message, true, new ValidationSettings());
    }

    @Test
    public void testUnknownMsgTypeIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("35=D\001", "35=ZZ\001"));
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.INVALID_MSGTYPE, e.getSessionRejectReason());
    }

    @Test
    public void testFieldNotDefinedForMessageIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // MDEntryDate(272) is defined in FIX 4.4 but not for NewOrderSingle
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001", "55=QFJ\001272=20260819\001"));
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE, e.getSessionRejectReason());
    }

    @Test
    public void testUnknownTagIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001", "55=QFJ\001999=X\001"));
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.INVALID_TAG_NUMBER, e.getSessionRejectReason());
    }

    @Test
    public void testUnknownTagIsAcceptedWhenUnknownMessageFieldsAllowed() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001", "55=QFJ\001999=X\001"));
        ValidationSettings settings = new ValidationSettings();
        settings.setAllowUnknownMessageFields(true);

        new DataDictionaryValidator(settings).validate(dictionary, message);
    }

    @Test
    public void testInvalidTimestampFormatIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary,
                VALID_ORDER.replace("60=20110412-13:43:00\001", "60=notatimestamp\001"));
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        assertThrows(IncorrectDataFormat.class, () -> validator.validate(dictionary, message));
    }

    @Test
    public void testBooleanAndDateFieldFormatsAreAccepted() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // LocateReqd(114) BOOLEAN, MDEntryDate(272) UTCDATEONLY, MDEntryTime(273) UTCTIMEONLY
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001",
                "55=QFJ\001114=Y\001272=20260819\001273=13:43:00\001"));
        ValidationSettings settings = new ValidationSettings();
        settings.setAllowUnknownMessageFields(true);

        new DataDictionaryValidator(settings).validate(dictionary, message);
    }

    @Test
    public void testEmptyFieldValueIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001", "55=QFJ\00158=\001"));
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.TAG_SPECIFIED_WITHOUT_A_VALUE, e.getSessionRejectReason());
    }

    @Test
    public void testEmptyFieldValueIsAcceptedWhenCheckDisabled() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("55=QFJ\001", "55=QFJ\00158=\001"));
        ValidationSettings settings = new ValidationSettings();
        settings.setCheckFieldsHaveValues(false);

        new DataDictionaryValidator(settings).validate(dictionary, message);
    }

    @Test
    public void testGroupCountMismatchIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // NoAllocs(78) declares two groups but only one is present
        Message message = parse(dictionary, VALID_ORDER);
        Group alloc = new Group(78, 79);
        alloc.setString(79, "allocAccount");
        message.addGroup(alloc);
        message.setString(78, "2");
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                e.getSessionRejectReason());
    }

    @Test
    public void testMatchingGroupCountIsAccepted() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER);
        Group alloc = new Group(78, 79);
        alloc.setString(79, "allocAccount");
        message.addGroup(alloc);

        new DataDictionaryValidator(new ValidationSettings()).validate(dictionary, message);
    }

    @Test
    public void testNonIntegerGroupCountIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // an empty NoAllocs(78) passes the format check when checkFieldsHaveValues is
        // disabled, so the conversion failure surfaces in the group count check
        Message message = parse(dictionary, VALID_ORDER);
        Group alloc = new Group(78, 79);
        alloc.setString(79, "allocAccount");
        message.addGroup(alloc);
        message.setString(78, "");
        ValidationSettings settings = new ValidationSettings();
        settings.setCheckFieldsHaveValues(false);
        DataDictionaryValidator validator = new DataDictionaryValidator(settings);

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP,
                e.getSessionRejectReason());
    }

    @Test
    public void testGroupNotDefinedForMessageTypeIsRejected() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // NoMDEntries(268) is a valid FIX 4.4 group but not defined for NewOrderSingle
        Message message = parse(dictionary, VALID_ORDER);
        Group mdEntry = new Group(268, 269);
        mdEntry.setString(269, "0");
        message.addGroup(mdEntry);
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        FieldException e = assertThrows(FieldException.class,
                () -> validator.validate(dictionary, message));
        assertEquals(SessionRejectReason.TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE,
                e.getSessionRejectReason());
    }

    @Test
    public void testStoredParseExceptionIsRethrown() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        // header field SenderCompID(49) in the body is stored as a deferred exception during parse
        Message message = new Message();
        message.fromString(VALID_ORDER.replace("49=SENDER\001", "").replace("55=QFJ\001",
                "55=QFJ\00149=SENDER\001"), dictionary, new ValidationSettings(), true, false);
        DataDictionaryValidator validator = new DataDictionaryValidator(new ValidationSettings());

        assertFalse(message.hasValidStructure());
        assertThrows(FieldException.class, () -> validator.validate(dictionary, message));
    }

    @Test
    public void testFixt11MessageIsNotRejectedForVersionMismatch() throws Exception {
        DataDictionary dictionary = DataDictionaryTest.getDictionary();
        Message message = parse(dictionary, VALID_ORDER.replace("8=FIX.4.4\001", "8=FIXT.1.1\001"));

        new DataDictionaryValidator(new ValidationSettings()).validate(message, dictionary, dictionary);
    }

    @Test
    public void testMultipleCharValueFormat() throws Exception {
        DataDictionary dictionary = buildDictionary("4", "4",
                "<field number=\"18\" name=\"TestField\" type=\"MULTIPLECHARVALUE\"/>");

        new DataDictionaryValidator(new ValidationSettings())
                .validate(dictionary, buildMessage("FIX.4.4", "A B"));
    }

    @Test
    public void testUtcDateFormat() throws Exception {
        DataDictionary dictionary = buildDictionary("4", "4",
                "<field number=\"18\" name=\"TestField\" type=\"UTCDATE\"/>");

        new DataDictionaryValidator(new ValidationSettings())
                .validate(dictionary, buildMessage("FIX.4.4", "20260819"));
    }

    @Test
    public void testCharFieldIsNotConvertedInOldFixVersions() throws Exception {
        // before FIX 4.2 a CHAR field is treated as a String, so a multi-char value is valid
        DataDictionary dictionary = buildDictionary("4", "0",
                "<field number=\"18\" name=\"TestField\" type=\"CHAR\"/>");

        new DataDictionaryValidator(new ValidationSettings())
                .validate(dictionary, buildMessage("FIX.4.0", "ZZ"));
    }

    @Test
    public void testFix50DictionaryAcceptsOtherMessageVersions() throws Exception {
        DataDictionary dictionary = buildDictionary("5", "0",
                "<field number=\"18\" name=\"TestField\" type=\"STRING\"/>");
        Message message = buildMessage("FIX.4.4", "x");

        new DataDictionaryValidator(new ValidationSettings()).validate(message, dictionary, dictionary);
    }

    private DataDictionary buildDictionary(String major, String minor, String fieldDefinition)
            throws ConfigError {
        String data = "";
        data += "<fix major=\"" + major + "\" minor=\"" + minor + "\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "    <field name=\"MsgType\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"35\" name=\"MsgType\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += fieldDefinition;
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"Test\" msgtype=\"U1\" msgcat=\"app\">";
        data += "      <field name=\"TestField\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";
        return new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    private Message buildMessage(String beginString, String testFieldValue) {
        Message message = new Message();
        message.getHeader().setString(8, beginString);
        message.getHeader().setString(35, "U1");
        message.setString(18, testFieldValue);
        message.getTrailer().setString(10, "000");
        return message;
    }

    private Message parse(DataDictionary dictionary, String data) throws Exception {
        Message message = new Message();
        message.fromString(data, dictionary, new ValidationSettings(), false);
        return message;
    }
}

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

import junit.framework.TestCase;
import org.junit.Assert;
import quickfix.field.BeginString;
import quickfix.field.LegSymbol;
import quickfix.field.OrderID;
import quickfix.field.SessionRejectReason;
import quickfix.field.SettlDate2;
import quickfix.field.Symbol;
import quickfix.fix44.Quote;
import quickfix.fix50sp2.QuoteRequest;

public class RepeatingGroupTest extends TestCase {

    // In this testcase we use only FIX4.4 message, but we could use the others
    // FIX version. Indeed the group
    // management is independent from the version

    // NON NESTED Groups
    private Quote.NoLegs buildGroupWithStandardFields(String settingValue) {
        final Quote.NoLegs grp = new Quote.NoLegs();
        grp.set(new LegSymbol(settingValue));
        return grp;
    }

    public void testSettingGettingGroupWithStandardFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        final Quote.NoLegs grp = buildGroupWithStandardFields(settingValue);

        final LegSymbol accessorField = new LegSymbol();
        final LegSymbol gotField = (LegSymbol) grp.getField(accessorField);

        // We assume that checksum equality s enough - DV
        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField
                .getValue());
    }

    private Quote.NoLegs buildGroupWithCustomFields(String settingValue) {
        final Quote.NoLegs grp = new Quote.NoLegs();
        grp.setField(new StringField(9001, settingValue)); // Custom tag is
        // 9001
        return grp;
    }

    public void testSettingGettingGroupWithCustomFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        final Quote.NoLegs grp = buildGroupWithCustomFields(settingValue);

        final StringField accessorField = new StringField(9001); // Custom tag is
        // 9001
        final StringField gotField = grp.getField(accessorField);

        // We assume that checksum equality s enough - DV
        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField
                .getValue());
    }

    private Quote.NoLegs buildGroupWithCustomAndStandardFields(String settingValue) {
        final Quote.NoLegs grp = new Quote.NoLegs();
        grp.setField(new StringField(9001, settingValue)); // Custom tag is
        // 9001
        grp.set(new LegSymbol(settingValue));
        return grp;
    }

    public void testSettingGettingGroupWithCustomAndStandardFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        final Quote.NoLegs grp = buildGroupWithCustomAndStandardFields(settingValue);

        final StringField accessorField = new StringField(9001); // Custom tag is
        // 9001
        final StringField gotField = grp.getField(accessorField);

        final LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        final LegSymbol gotFieldStd = (LegSymbol) grp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField
                .getValue());

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd
                .getValue());
    }

    // NESTED Groups outside messages
    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithStandardFields(
            String settingValue) {
        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // The nested group
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol(settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        return gNoRelatedSym;
    }

    private quickfix.fix50sp2.QuoteRequest.NoRelatedSym buildNestedGroupWithStandardFieldsFIX50SP2(
            String settingValue) {
        // The root group
        final quickfix.fix50sp2.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix50sp2.QuoteRequest.NoRelatedSym();

        // The nested group
        final quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol(settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        final quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithStandardFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields(settingValue);

        // Getting part
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        final LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        final LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd
                .getValue());
    }

    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithCustomFields(
            String settingValue) {
        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // The nested group
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new StringField(9001, settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new StringField(9001, "Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithCustomFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithCustomFields(settingValue);

        // Getting part
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        final StringField accessorField = new StringField(9001); // Custom Field
        final StringField gotFieldStd = getgrp.getField(accessorField);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd
                .getValue());
    }

    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithCustomAndStandardFields(
            String settingValue) {
        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // The nested group
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol(settingValue));
        nestedgroup.setField(new StringField(9001, settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        oneMoreNestedgroup.setField(new StringField(9001, "Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithCustomAndStandardFields() throws FieldNotFound {
        final String settingValue = "SETTING_VALUE";

        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithCustomAndStandardFields(settingValue);

        // Getting part
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        final StringField accessorField = new StringField(9001); // Custom Field
        final StringField gotField = getgrp.getField(accessorField);

        final LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        final LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField
                .getValue());

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd
                .getValue());
    }

    // Testing group re-usability when setting values
    public void testSettingGettingGroupByReusingGroup() throws FieldNotFound {
        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // Create the initial group
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        final String notOverridenFieldValue = "Value1.1";
        nestedgroup.setField(new LegSymbol(notOverridenFieldValue));
        nestedgroup.setField(new StringField(9001, "Value1.2"));
        gNoRelatedSym.addGroup(nestedgroup);

        // Create the second group by re-using the same group and changing one value of only one field
        final String overridenFieldValue = "Value2.2";
        nestedgroup.setField(new StringField(9001, overridenFieldValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Getting part
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(2, getgrp);
        final StringField accessorField = new StringField(9001); // Custom Field
        final StringField gotField = getgrp.getField(accessorField);

        final LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        final LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        // Ensures that the field overriden has been set correctly
        assertEquals("GettingValue is not the same the SettingValue", overridenFieldValue, gotField
                .getValue());

        // Ensures that the field not overriden has been set correctly
        assertEquals("GettingValue is not the same the SettingValue", notOverridenFieldValue,
                gotFieldStd.getValue());
    }

    // Testing Message validation
    private static DataDictionary defaultDataDictionary = null;
    private static DataDictionary defaultDataDictionaryWithIgnoreOutOfOrder = null;
    private static DataDictionary customDataDictionary = null;
    private final DefaultMessageFactory messageFactory = new DefaultMessageFactory();

    static {
        try {
            defaultDataDictionary = new DataDictionary("FIX44.xml");
            defaultDataDictionaryWithIgnoreOutOfOrder = new DataDictionary("FIX44.xml");
            defaultDataDictionaryWithIgnoreOutOfOrder.setCheckUnorderedGroupFields(false);
            customDataDictionary = new DataDictionary("FIX44_Custom_Test.xml");
        } catch (final ConfigError e) {
            e.printStackTrace();
        }
    }

    private Message buildValidatedMessage(String sourceFIXString, DataDictionary dd)
            throws InvalidMessage {
        final Message message = messageFactory.create(MessageUtils.getStringField(sourceFIXString,
                BeginString.FIELD), MessageUtils.getMessageType(sourceFIXString));
        message.fromString(sourceFIXString, dd, true);
        return message;
    }

    public void testValidationWithNestedGroupAndStandardFields() throws InvalidMessage {
        final quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        final quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields("DEFAULT_VALUE");
        gNoRelatedSym.setField(new Symbol("SYM00"));

        quoteRequest.addGroup(gNoRelatedSym);
        quoteRequest.addGroup(gNoRelatedSym);

        final String sourceFIXString = quoteRequest.toString();

        final quickfix.fix44.QuoteRequest validatedMessage = (quickfix.fix44.QuoteRequest) buildValidatedMessage(
                sourceFIXString, defaultDataDictionary);
        String validateFIXString = null;
        if (validatedMessage != null) {
            validateFIXString = validatedMessage.toString();
        }

        assertEquals("Message validation failed", sourceFIXString, validateFIXString);
    }

    public void testValidationWithNestedGroupAndStandardFieldsFIX50SP2() throws InvalidMessage, ConfigError {
        final quickfix.fix50sp2.QuoteRequest quoteRequest = new quickfix.fix50sp2.QuoteRequest();

        final quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        final quickfix.fix50sp2.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFieldsFIX50SP2("DEFAULT_VALUE");
        gNoRelatedSym.setField(new Symbol("SYM00"));
        gNoRelatedSym.setField(new SettlDate2("20120801"));

        quoteRequest.addGroup(gNoRelatedSym);
        quoteRequest.addGroup(gNoRelatedSym);

        final String sourceFIXString = quoteRequest.toString();
        final DataDictionary fix50sp2DataDictionary = new DataDictionary("FIX50SP2.xml");
        final quickfix.fix50sp2.QuoteRequest validatedMessage = (quickfix.fix50sp2.QuoteRequest) messageFactory.create(FixVersions.FIX50SP2, QuoteRequest.MSGTYPE);
        validatedMessage.fromString(sourceFIXString, fix50sp2DataDictionary, true);

        String validateFIXString = validatedMessage.toString();

        assertEquals("Message validation failed", sourceFIXString, validateFIXString);
        assertEquals(2, validatedMessage.getGroupCount(gNoRelatedSym.getFieldTag()));
    }

    public void testValidationWithNestedGroupAndStandardFieldsWithoutDelimiter() {
        final quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        final quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields("DEFAULT_VALUE");

        quoteRequest.addGroup(gNoRelatedSym);

        quoteRequest.addGroup(gNoRelatedSym);

        final String sourceFIXString = quoteRequest.toString();

        try {
            buildValidatedMessage(sourceFIXString, defaultDataDictionary);
            fail("No Exception thrown");
        } catch (final InvalidMessage e) {
            // We expect that Exception did happen, so we don't do anything.
        }
    }

    public void testGroupFieldsOrderWithCustomDataDictionary() throws InvalidMessage {
        final quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        final quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        // The root group
        final quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();
        gNoRelatedSym.setField(new Symbol("SYM00"));

        // The nested group
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol("DEFAULT_VALUE"));
        nestedgroup.setField(new OrderID("111")); // The non ordered field
        nestedgroup.setField(new StringField(9001, "1.9001")); // The custom non ordered field
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        final quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        oneMoreNestedgroup.setField(new OrderID("112")); // The non ordered field
        oneMoreNestedgroup.setField(new StringField(9001, "2.9001")); // The custom non ordered field
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        quoteRequest.addGroup(gNoRelatedSym);

        final String sourceFIXString = quoteRequest.toString();
        final quickfix.fix44.QuoteRequest validatedMessage = (quickfix.fix44.QuoteRequest) buildValidatedMessage(
                sourceFIXString, customDataDictionary);

        assertNull("Invalid message", validatedMessage.getException());

        String validatedFIXString = validatedMessage.toString();
        assertEquals("Message validation failed",
                MessageUtils.checksum(sourceFIXString), MessageUtils.checksum(validatedFIXString));
    }

    public void testOutOfOrderGroupMembersDelimiterField() throws Exception {
        final Message m = new Message(
            "8=FIX.4.4\0019=0\00135=D\00134=2\00149=TW\00152=<TIME>\00156=ISLD\00111=ID\001" +
            "21=1\00140=1\00154=1\00138=200.00\00155=INTC\00178=2\00180=50\00179=acct1\001" +
            "80=150\00179=acct2\00160=<TIME>\00110=000\001",
            defaultDataDictionary, false);
        try {
            defaultDataDictionary.validate(m);
            Assert.fail("No exception");
        } catch (final FieldException e) {
            // expected
            assertEquals(SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, e
                    .getSessionRejectReason());
            assertEquals(80, e.getField());
        }
    }

    public void testIgnoreOutOfOrderGroupMembersDelimiterField() throws Exception {
        final Message m = new Message(
            "8=FIX.4.4\0019=0\00135=D\00134=2\00149=TW\00152=<TIME>\00156=ISLD\00111=ID\001" +
            "21=1\00140=1\00154=1\00138=200.00\00155=INTC\00178=2\00180=50\00179=acct1\001" +
            "80=150\00179=acct2\00160=<TIME>\00110=000\001",
            defaultDataDictionaryWithIgnoreOutOfOrder, false);
        try {
            defaultDataDictionaryWithIgnoreOutOfOrder.validate(m);
            Assert.fail("No exception");
        } catch (final FieldException e) {
            // expected
            assertEquals(SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, e
                    .getSessionRejectReason());
            assertEquals(80, e.getField());
        }
    }

    public void testOutOfOrderGroupMembers() throws Exception {
        final Message m = new Message(
            "8=FIX.4.4\0019=0\00135=D\00134=2\00149=TW\00152=20080203-00:29:51.453\00156=ISLD\001" +
            "11=ID\00121=1\00140=1\00154=1\00138=200.00\00155=INTC\00178=2\00179=acct1\00180=50\001" +
            "661=X\00179=acct2\00180=150\001661=X\00160=20080203-00:29:51.453\00110=000\001",
            defaultDataDictionary, false);
        try {
            defaultDataDictionary.validate(m);
            Assert.fail("No exception");
        } catch (final FieldException e) {
            // expected
            assertEquals(e.getMessage(), SessionRejectReason.REPEATING_GROUP_FIELDS_OUT_OF_ORDER, e
                    .getSessionRejectReason());
            assertEquals(661, e.getField());
        }
    }

    public void testIgnoreOutOfOrderGroupMembers() throws Exception {
        final Message m = new Message(
            "8=FIX.4.4\0019=0\00135=D\00134=2\00149=TW\00152=20080203-00:29:51.453\00156=ISLD\001" +
            "11=ID\00121=1\00140=1\00154=1\00138=200.00\00155=INTC\00178=2\00179=acct1\00180=50\001" +
            "661=10\00179=acct2\00180=150\001661=11\00160=20080203-00:29:51.453\00110=000\001",
            defaultDataDictionaryWithIgnoreOutOfOrder, false);
        try {
            defaultDataDictionaryWithIgnoreOutOfOrder.validate(m);
        } catch (final FieldException e) {
            Assert.fail("Exception");
        }
    }

    public void testRequiredGroupMembers() throws Exception {
        // Missing group tag 304
        final Message m = new Message("8=FIX.4.4\0019=0\00135=i\00134=2\00149=TW\001" +
            "52=20080203-00:29:51.453\00156=ISLD\001117=ID\001296=1\001302=X\00110=000\001",
            defaultDataDictionary, false);
        try {
            defaultDataDictionary.validate(m);
            Assert.fail("No exception");
        } catch (final FieldException e) {
            // expected
            assertEquals(e.getMessage(), SessionRejectReason.REQUIRED_TAG_MISSING, e
                    .getSessionRejectReason());
            assertEquals(304, e.getField());
        }
    }

    public void testWrongGroupCount() throws Exception {
        // Excessive group counts in nested group
        final Message m = new Message("8=FIX.4.4\0019=0\00135=i\00134=2\00149=TW\001" +
            "52=20080203-00:29:51.453\00156=ISLD\001117=ID\001296=1\001302=X\001" +
            "304=5\001295=50\001299=QID\00110=085\001",
            defaultDataDictionary, true);
        try {
            defaultDataDictionary.validate(m);
            Assert.fail("No exception");
        } catch (final FieldException e) {
            // expected
            assertEquals("Wrong reject reason: [" + e.getMessage() + "]",
                    SessionRejectReason.INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP, e
                            .getSessionRejectReason());
            assertEquals(295, e.getField());
        }
    }

    public void testInvalidEnumFieldInGroup() throws Exception {
        // Excessive group counts
        final Message m = new Message(
            "8=FIX.4.4\0019=0\00135=A\00134=2\00152=20080203-00:29:51.453\00156=ISLD\001" +
            "49=TW\001108=10\001384=1\001372=D\001385=X\00198=0\00110=129\001",
            defaultDataDictionary, false);
        try {
            defaultDataDictionary.validate(m);
            Assert.fail("No exception");
        } catch (final IncorrectTagValue e) {
            // expected
            assertEquals(385, e.field);
        }
    }

    public void testSettingGettingGroupWithStandardFieldsInHeader() throws Exception {
        final Message m = new Message(
            "8=FIX.4.4\0019=87\00135=0\00134=2\00152=20080203-00:29:51.453\00156=ISLD\001" +
            "49=TW\001627=2\001628=_TED02A\001629=20090717-13:25:31.896\001628=_GWSURV\001" +
            "629=20090717-13:25:31.928\00110=012\001",
            defaultDataDictionary, false);
        try {
            defaultDataDictionary.validate(m);
        } catch (final IncorrectTagValue e) {
            // not expected
            Assert.fail("Exception occured");
        }
    }

}

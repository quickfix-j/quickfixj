/*============================================================================
 *
 * Copyright (c) 2000-2005 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package quickfix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import junit.framework.TestCase;
import quickfix.field.LegSymbol;
import quickfix.field.OrderID;
import quickfix.field.Symbol;
import quickfix.fix44.Quote;
import quickfix.netty.FIXMessageData;

public class RepeatingGroupTest extends TestCase {

    // In this testcase we use only FIX4.4 message, but we could use the others
    // FIX version. Indeed the group
    // management is independent from the version

    // NON NESTED Groups
    private Quote.NoLegs buildGroupWithStandardFields(String settingValue) {
        Quote.NoLegs grp = new Quote.NoLegs();
        grp.set(new LegSymbol(settingValue));
        return grp;
    }

    public void testSettingGettingGroupWithStandardFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        Quote.NoLegs grp = buildGroupWithStandardFields(settingValue);

        LegSymbol accessorField = new LegSymbol();
        LegSymbol gotField = (LegSymbol) grp.getField(accessorField);

        // We assume that checksum equality s enough - DV
        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField.getValue());
    }

    private Quote.NoLegs buildGroupWithCustomFields(String settingValue) {
        Quote.NoLegs grp = new Quote.NoLegs();
        grp.setField(new StringField(9001, settingValue)); // Custom tag is
                                                            // 9001
        return grp;
    }

    public void testSettingGettingGroupWithCustomFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        Quote.NoLegs grp = buildGroupWithCustomFields(settingValue);

        StringField accessorField = new StringField(9001); // Custom tag is
                                                            // 9001
        StringField gotField = (StringField) grp.getField(accessorField);

        // We assume that checksum equality s enough - DV
        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField.getValue());
    }

    private Quote.NoLegs buildGroupWithCustomAndStandardFields(String settingValue) {
        Quote.NoLegs grp = new Quote.NoLegs();
        grp.setField(new StringField(9001, settingValue)); // Custom tag is
                                                            // 9001
        grp.set(new LegSymbol(settingValue));
        return grp;
    }

    public void testSettingGettingGroupWithCustomAndStandardFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        Quote.NoLegs grp = buildGroupWithCustomAndStandardFields(settingValue);

        StringField accessorField = new StringField(9001); // Custom tag is
                                                            // 9001
        StringField gotField = (StringField) grp.getField(accessorField);

        LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        LegSymbol gotFieldStd = (LegSymbol) grp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField.getValue());

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd.getValue());
    }

    // NESTED Groups outside messages
    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithStandardFields(String settingValue) {
        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();
        
        // The nested group
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol(settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithStandardFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields(settingValue);

        // Getting part
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd.getValue());
    }
    
    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithCustomFields(String settingValue) {
        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // The nested group
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new StringField(9001, settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new StringField(9001, "Donald"));
        gNoRelatedSym.addGroup(oneMoreNestedgroup);
        
        return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithCustomFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithCustomFields(settingValue);
            
        // Getting part
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        StringField accessorField = new StringField(9001); // Custom Field
        StringField gotFieldStd = (StringField) getgrp.getField(accessorField);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd.getValue());
    }
    
    private quickfix.fix44.QuoteRequest.NoRelatedSym buildNestedGroupWithCustomAndStandardFields(String settingValue) {
        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();

        // The nested group
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol(settingValue));
        nestedgroup.setField(new StringField(9001, settingValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
         quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup =
         new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
         oneMoreNestedgroup.setField(new LegSymbol("Donald"));
         oneMoreNestedgroup.setField(new StringField(9001, "Donald"));
         gNoRelatedSym.addGroup(oneMoreNestedgroup);
         
         return gNoRelatedSym;
    }

    public void testSettingGettingNestedGroupWithCustomAndStandardFields() throws FieldNotFound {
        String settingValue = "SETTING_VALUE";

        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithCustomAndStandardFields(settingValue);

        // Getting part
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(1, getgrp);
        StringField accessorField = new StringField(9001); // Custom Field
        StringField gotField = (StringField) getgrp.getField(accessorField);

        LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotField.getValue());

        assertEquals("GettingValue is not the same the SettingValue", settingValue, gotFieldStd.getValue());
    }
    
    // Testing group re-usability when setting values
    public void testSettingGettingGroupByReusingGroup() throws FieldNotFound {
        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();
        
        // Create the initial group
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        String notOverridenFieldValue = "Value1.1";
        nestedgroup.setField(new LegSymbol(notOverridenFieldValue));
        nestedgroup.setField(new StringField(9001, "Value1.2"));
        gNoRelatedSym.addGroup(nestedgroup);
        
        // Create the second group by re-using the same group and changing one value of only one field
        String overridenFieldValue = "Value2.2";
        nestedgroup.setField(new StringField(9001, overridenFieldValue));
        gNoRelatedSym.addGroup(nestedgroup);

        // Getting part
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs getgrp = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        gNoRelatedSym.getGroup(2, getgrp);
        StringField accessorField = new StringField(9001); // Custom Field
        StringField gotField = (StringField) getgrp.getField(accessorField);

        LegSymbol accessorFieldStd = new LegSymbol(); // Standard Field
        LegSymbol gotFieldStd = (LegSymbol) getgrp.getField(accessorFieldStd);

        // Ensures that the field overriden has been set correctly
        assertEquals("GettingValue is not the same the SettingValue", overridenFieldValue, gotField.getValue());
        
        // Ensures that the field not overriden has been set correctly
        assertEquals("GettingValue is not the same the SettingValue", notOverridenFieldValue, gotFieldStd.getValue());
    }

    // Testing Message validation
    private static DataDictionary defaultDataDictionary = null; 
    private static DataDictionary customDataDictionary = null; 
        
    static {
        try {
            defaultDataDictionary = new DataDictionary("etc/FIX44.xml");
            customDataDictionary = new DataDictionary("test/FIX44_Custom_Test.xml");
        } catch (ConfigError e) {
            e.printStackTrace();
        }
    }
    
    // Helper class building simulation the message parsing from a nio.Buffer - as managed in the networking part
    private Message buildValidatedMessage(String sourceFIXString, DataDictionary dd) throws InvalidMessage {
        Message res = null;
        FileChannel in;
        try {
            // Building the nio buffer
            final String fileName = File.createTempFile("validationTest", "dat").getPath();
            FileOutputStream out = new FileOutputStream(fileName);
            ObjectOutputStream outs = new ObjectOutputStream(out);
            outs.writeObject(sourceFIXString);
            outs.flush();
            in = new FileInputStream(fileName).getChannel();
            int filesize = (int) in.size();
            ByteBuffer buffer = in.map(FileChannel.MapMode.READ_ONLY, 0, filesize);
            FIXMessageData msg = new FIXMessageData();
            msg.read(buffer);

            // Parse - Validate
            res = msg.parse(dd);

        } catch (FileNotFoundException e) {
            fail(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            fail(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
    
    public void testValidationWithNestedGroupAndStandardFields() throws InvalidMessage {
        quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields("DEFAULT_VALUE");
        gNoRelatedSym.setField(new Symbol("SYM00"));
        
        quoteRequest.addGroup(gNoRelatedSym);
        
        quoteRequest.addGroup(gNoRelatedSym);
        
        String sourceFIXString = quoteRequest.toString();
        
        quickfix.fix44.QuoteRequest validatedMessage = (quickfix.fix44.QuoteRequest)buildValidatedMessage(sourceFIXString, defaultDataDictionary);
        String validateFIXString = null;
        if(validatedMessage != null) {
            validateFIXString = validatedMessage.toString();
        }
        
        assertEquals("Message validation failed", sourceFIXString, validateFIXString);
        
    }
    
    public void testValidationWithNestedGroupAndStandardFieldsWithoutDelimiter() {
        quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);

        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = buildNestedGroupWithStandardFields("DEFAULT_VALUE");
        
        quoteRequest.addGroup(gNoRelatedSym);
        
        quoteRequest.addGroup(gNoRelatedSym);
        
        String sourceFIXString = quoteRequest.toString();
        
        try {
            buildValidatedMessage(sourceFIXString, defaultDataDictionary);
            fail("No Exception thrown");
        } catch (InvalidMessage e) {
            // We expect that Exception did happen, so we don't do anything.
        }
        
    }
    
    public void testGroupFieldsOrderWithCustomDataDictionary() throws InvalidMessage {
        quickfix.fix44.QuoteRequest quoteRequest = new quickfix.fix44.QuoteRequest();

        quickfix.field.QuoteReqID gQuoteReqID = new quickfix.field.QuoteReqID();
        gQuoteReqID.setValue("12342");
        quoteRequest.setField(gQuoteReqID);
        
        // The root group
        quickfix.fix44.QuoteRequest.NoRelatedSym gNoRelatedSym = new quickfix.fix44.QuoteRequest.NoRelatedSym();
        gNoRelatedSym.setField(new Symbol("SYM00"));
        
        // The nested group
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs nestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        nestedgroup.setField(new LegSymbol("DEFAULT_VALUE"));
        nestedgroup.setField(new OrderID("111")); // The non ordered field
        nestedgroup.setField(new StringField(9001, "1.9001")); // The custom non ordered field
        gNoRelatedSym.addGroup(nestedgroup);
        
        // Adding a second fake nested group to avoid being the case of having
        // one element which is not relevant :-)
        quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs oneMoreNestedgroup = new quickfix.fix44.QuoteRequest.NoRelatedSym.NoLegs();
        oneMoreNestedgroup.setField(new LegSymbol("Donald"));
        oneMoreNestedgroup.setField(new OrderID("112")); // The non ordered field
        oneMoreNestedgroup.setField(new StringField(9001, "2.9001")); // The custom non ordered field
        gNoRelatedSym.addGroup(oneMoreNestedgroup);

        quoteRequest.addGroup(gNoRelatedSym);
        
        String sourceFIXString = quoteRequest.toString();
        quickfix.fix44.QuoteRequest validatedMessage = (quickfix.fix44.QuoteRequest)buildValidatedMessage(sourceFIXString, customDataDictionary);
        String validatedFIXString = null;
        if(validatedMessage != null) {
            validatedFIXString = validatedMessage.toString();
        }
        
        System.out.println(validatedFIXString);
        assertEquals("Message validation failed", checkSum(sourceFIXString), checkSum(validatedFIXString));
        
    }
    
    public int checkSum(String s) {
        int offset = s.lastIndexOf("\00110=");
        int sum = 0;
        for (int i = 0; i < offset; i++) {
            sum += s.charAt(i);
        }
        return (sum + 1) % 256;
    }
    
}

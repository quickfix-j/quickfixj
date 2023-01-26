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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.net.URLClassLoader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import quickfix.field.MsgType;
import quickfix.field.NoHops;

public class DataDictionaryTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testDictionary() throws Exception {
        DataDictionary dd = getDictionary();

        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        assertEquals("wrong value description", "BUY", dd.getValueName(4, "B"));
        assertEquals("wrong value for given value name", "2", dd.getValue(54, "SELL"));
        assertEquals("wrong value type", FieldType.STRING, dd.getFieldType(1));
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

    @Test
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
            assertTrue(e.getMessage().contains("does not have a 'required'"));
        }
    }

    @Test
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

    @Test
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

    @Test
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
        assertEquals(1, dd.getNumMessageCategories());
        assertEquals("0", dd.getMsgType("Heartbeat"));

        assertTrue("BeginString should be required", dd.isRequiredHeaderField(8));
        assertFalse("OnBehalfOfCompID should not be required", dd.isRequiredHeaderField(115));
        assertTrue("Checksum should be required", dd.isRequiredTrailerField(10));
        assertFalse("Signature should not be required", dd.isRequiredTrailerField(89));

        // now tests for fields that aren't actually in the dictionary - should come back false
        assertFalse("Unknown header field shows up as required", dd.isRequiredHeaderField(666));
        assertFalse("Unknown trailer field shows up as required", dd.isRequiredTrailerField(666));
    }

    @Test
    public void testMessageWithNoChildren40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\"/>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=msg");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessageWithTextElement40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=msg");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessagesWithNoChildren40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages/>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No messages defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessagesWithTextElement40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No messages defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHeaderWithNoChildren40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header/>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=HEADER");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHeaderWithTextElement40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=HEADER");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testTrailerWithNoChildren40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer/>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=TRAILER");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testTrailerWithTextElement40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=TRAILER");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testFieldsWithNoChildren40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields/>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testFieldsWithTextElement40() throws Exception {
        String data = "";
        data += "<fix major=\"4\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessageWithNoChildren50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\"/>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=msg");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessageWithTextElement50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields found: msgType=msg");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessagesWithNoChildren50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages/>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No messages defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testMessagesWithTextElement50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No messages defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHeaderWithNoChildren50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header/>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHeaderWithTextElement50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "  </header>";
        data += "  <trailer>";
        data += "    <field name=\"CheckSum\" required=\"Y\"/>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testTrailerWithNoChildren50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer/>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testTrailerWithTextElement50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header>";
        data += "    <field name=\"BeginString\" required=\"Y\"/>";
        data += "  </header>";
        data += "  <trailer>";
        data += "  </trailer>";
        data += "  <fields>";
        data += "    <field number=\"1\" name=\"Account\" type=\"STRING\"/>";
        data += "    <field number=\"8\" name=\"BeginString\" type=\"STRING\"/>";
        data += "    <field number=\"10\" name=\"CheckSum\" type=\"STRING\"/>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testFieldsWithNoChildren50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header/>";
        data += "  <trailer/>";
        data += "  <fields/>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testFieldsWithTextElement50() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\">";
        data += "  <header/>";
        data += "  <trailer/>";
        data += "  <fields>";
        data += "  </fields>";
        data += "  <messages>";
        data += "    <message name=\"MessageWithNoChildren\" msgtype=\"msg\" msgcat=\"custom\">";
        data += "      <field name=\"Account\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";

        expectedException.expect(ConfigError.class);
        expectedException.expectMessage("No fields defined");

        new DataDictionary(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testHeaderGroupField() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isHeaderGroup(NoHops.FIELD));
    }

    // QF C++ treats the string argument as a filename although it's
    // named 'url'. QFJ string argument can be either but this test
    // ensures the DD works correctly with a regular file path.
    @Test
    public void testDictionaryWithFilename() throws Exception {
        DataDictionary dd = new DataDictionary("FIX40.xml");
        assertEquals("wrong field name", "Currency", dd.getFieldName(15));
        // It worked!
    }

    // Support finding DD in classpath
    @Test
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
    @Test
    public void testWildcardEnumValue() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isFieldValue(65, "FOO"));
    }

    @Test
    public void testMessageCategory() throws Exception {
        DataDictionary dd = getDictionary();
        assertTrue(dd.isAdminMessage(MsgType.LOGON));
        assertFalse(dd.isAppMessage(MsgType.LOGON));
        assertFalse(dd.isAdminMessage(MsgType.NEW_ORDER_SINGLE));
        assertTrue(dd.isAppMessage(MsgType.NEW_ORDER_SINGLE));
    }

    // QFJ-535
    @Test
    public void testValidateFieldsOutOfOrderForGroups() throws Exception {
        final DataDictionary dictionary = new DataDictionary(getDictionary());
        dictionary.setCheckUnorderedGroupFields(false);
        Message messageWithGroupLevel1 = new Message(
            "8=FIX.4.4\0019=185\00135=D\00134=25\00149=SENDER\00156=TARGET\00152=20110412-13:43:00\001" +
            "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
            "54=1\00155=QFJ\00159=0\00178=1\00179=allocAccount\001736=currency\001661=1\00110=130\001",
            dictionary);
        dictionary.validate(messageWithGroupLevel1);

        Message messageWithGroupLevel2 = new Message(
            "8=FIX.4.4\0019=185\00135=D\00134=25\00149=SENDER\00156=TARGET\00152=20110412-13:43:00\001" +
            "60=20110412-13:43:00\0011=testAccount\00111=123\00121=3\00138=42\00140=2\00144=42.37\001" +
            "54=1\00155=QFJ\00159=0\00178=1\00179=allocAccount\001539=1\001524=1\001538=1\001525=a\00110=145\001",
            dictionary);
        dictionary.validate(messageWithGroupLevel2);
    }

    @Test
    public void shouldLoadDictionaryWhenExternalDTDisEnabled() throws ConfigError {
        new DataDictionary("FIX_External_DTD.xml", DocumentBuilderFactory::newInstance);
    }

    @Test
    public void shouldFailToLoadDictionaryWhenExternalDTDisDisabled() {
        try {
            new DataDictionary("FIX_External_DTD.xml");
            fail("should fail to load dictionary with external DTD");
        } catch (ConfigError e) {
            assertEquals("External DTD: Failed to read external DTD 'mathml.dtd', because 'http' access is not allowed due to restriction set by the accessExternalDTD property.", e.getCause().getCause().getMessage());
        }
    }
    
    /**
     * For FIX.Latest a minor version is not required.
     */
    @Test
    public void testMissingMinorVersion() throws Exception {
        String data = "";
        data += "<fix major=\"5\">";
        data = getCommonDataDictionaryString(data);

        DataDictionary dataDictionary = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertEquals(0, dataDictionary.getMinorVersion());
    }

    @Test
    public void testFixLatestMajorVersion() throws Exception {
        String data = "";
        data += "<fix major=\"Latest\">";
        data = getCommonDataDictionaryString(data);

        DataDictionary dataDictionary = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertEquals(0, dataDictionary.getMinorVersion());
        assertEquals("FIX.Latest", dataDictionary.getFullVersion());
    }

    @Test
    public void testFixLatestMajorVersionAndEP() throws Exception {
        String data = "";
        data += "<fix major=\"Latest\" extensionpack=\"260\">";
        data = getCommonDataDictionaryString(data);

        DataDictionary dataDictionary = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertEquals(0, dataDictionary.getMinorVersion());
        assertEquals("FIX.Latest_EP260", dataDictionary.getFullVersion());
    }

    @Test
    public void testSP() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\" servicepack=\"2\">";
        data = getCommonDataDictionaryString(data);

        DataDictionary dataDictionary = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertEquals(0, dataDictionary.getMinorVersion());
        assertEquals("FIX.5.0", dataDictionary.getVersion());
        assertEquals("FIX.5.0SP2", dataDictionary.getFullVersion());
    }

    @Test
    public void testEPAndSP() throws Exception {
        String data = "";
        data += "<fix major=\"5\" minor=\"0\" extensionpack=\"260\" servicepack=\"2\">";
        data = getCommonDataDictionaryString(data);

        DataDictionary dataDictionary = new DataDictionary(new ByteArrayInputStream(data.getBytes()));
        assertEquals(0, dataDictionary.getMinorVersion());
        assertEquals("FIX.5.0", dataDictionary.getVersion());
        assertEquals("FIX.5.0SP2_EP260", dataDictionary.getFullVersion());
    }

    private String getCommonDataDictionaryString(String data) {
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
        data += "      <field name=\"TestReqID\" required=\"N\"/>";
        data += "    </message>";
        data += "  </messages>";
        data += "</fix>";
        return data;
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

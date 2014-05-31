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

import java.util.Arrays;
import java.util.Date;

import junit.framework.TestCase;
import quickfix.field.RawData;
import quickfix.field.Side;

public class FieldTest extends TestCase {

    public FieldTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    public void testMessageSetGetString() {
        Side side1 = new Side(Side.BUY);
        Side side2 = new Side(Side.BUY);
        assertEquals(side1, side2);

        side2 = new Side();
        side2.setValue(Side.BUY);
        assertEquals(side1, side2);
    }

    public void testFieldCalculations() {
        Field<String> object = new Field<String>(12, "VALUE");
        object.setObject("VALUE");
        assertEquals("12=VALUE", object.toString());
        assertEquals(30, object.getChecksum());
        assertEquals(9, object.getLength());
        object.setObject("VALUF");
        assertEquals("12=VALUF", object.toString());
        assertEquals(31, object.getChecksum());
        assertEquals(9, object.getLength());
        object.setTag(13);
        assertEquals("13=VALUF", object.toString());
        assertEquals(32, object.getChecksum());
        assertEquals(9, object.getLength());
    }

    public void testDateField() {
        DateField field = new DateField(11);
        Date date = new Date();
        field.setValue(date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
        field = new DateField(11, date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
    }

    public void testUtcDateOnlyField() {
        UtcDateOnlyField field = new UtcDateOnlyField(11);
        Date date = new Date();
        field.setValue(date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
        field = new UtcDateOnlyField(11, date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
    }

    public void testUtcTimeOnlyField() {
        UtcTimeOnlyField field = new UtcTimeOnlyField(11);
        Date date = new Date();
        field.setValue(date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
        field = new UtcTimeOnlyField(11, date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
    }
 
    public void testUtcTimeStampField() {
        UtcTimeStampField field = new UtcTimeStampField(11);
        Date date = new Date();
        field.setValue(date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
        field = new UtcTimeStampField(11, date);
        assertEquals(11, field.getTag());
        assertEquals(date, field.getValue());
    }

    public void testBooleanField() {
        BooleanField field = new BooleanField(11);
        field.setValue(true);
        assertEquals(11, field.getTag());
        assertEquals(true, field.getValue());
        field.setValue(Boolean.FALSE);
        assertEquals(11, field.getTag());
        assertEquals(false, field.getValue());
        field = new BooleanField(22, true);
        assertEquals(22, field.getTag());
        assertEquals(true, field.getValue());
        field = new BooleanField(33, Boolean.TRUE);
        assertEquals(33, field.getTag());
        assertEquals(true, field.getValue());
    }

    public void testDoubleField() {
        DoubleField field = new DoubleField(11);
        field.setValue(12.3);
        assertEquals(11, field.getTag());
        assertEquals(12.3, field.getValue(), 0);
        field.setValue(new Double(23.4));
        assertEquals(11, field.getTag());
        assertEquals(23.4, field.getValue(), 0);
        field = new DoubleField(22, 34.5);
        assertEquals(22, field.getTag());
        assertEquals(34.5, field.getValue(), 0);
        field = new DoubleField(33, new Double(45.6));
        assertEquals(33, field.getTag());
        assertEquals(45.6, field.getValue(), 0);
    }

    public void testCharField() {
        CharField field = new CharField(11);
        field.setValue('x');
        assertEquals(11, field.getTag());
        assertEquals('x', field.getValue());
        field.setValue(Character.valueOf('X'));
        assertEquals(11, field.getTag());
        assertEquals('X', field.getValue());
        field = new CharField(22, 'a');
        assertEquals(22, field.getTag());
        assertEquals('a', field.getValue());
        field = new CharField(33, Character.valueOf('A'));
        assertEquals(33, field.getTag());
        assertEquals('A', field.getValue());
    }

    public void testIntField() {
        IntField field = new IntField(11);
        field.setValue(12);
        assertEquals(11, field.getTag());
        assertEquals(12, field.getValue());
        field.setValue(Integer.valueOf(23));
        assertEquals(11, field.getTag());
        assertEquals(23, field.getValue());
        field = new IntField(22, 23);
        assertEquals(22, field.getTag());
        assertEquals(23, field.getValue());
        field = new IntField(33, Integer.valueOf(44));
        assertEquals(33, field.getTag());
        assertEquals(44, field.getValue());
    }
    
    public void testBytesField() {
        byte[] data = "rawdata".getBytes();

        BytesField field = new BytesField(RawData.FIELD);
        field.setValue(data);
        assertEquals(RawData.FIELD, field.getTag());
        assertTrue(Arrays.equals(data, field.getObject()));
        
        StringBuilder sb = new StringBuilder();
        field.toString(sb);
        assertEquals("96=rawdata", sb.toString());
    }
    
    public void testFieldhashCode() throws Exception {
        assertEqualsAndHash(new IntField(11, 100), new IntField(11, 100));
        assertEqualsAndHash(new DoubleField(11, 100.0), new DoubleField(11, 100.0));
        assertEqualsAndHash(new StringField(11, "foo"), new StringField(11, "foo"));
        assertEqualsAndHash(new BooleanField(11, true), new BooleanField(11, true));
        assertEqualsAndHash(new CharField(11, 'x'), new CharField(11, 'x'));
        Date date = new Date();
        assertEqualsAndHash(new UtcDateOnlyField(11, date), new UtcDateOnlyField(11, date));
        assertEqualsAndHash(new UtcTimeOnlyField(11, date), new UtcTimeOnlyField(11, date));
        assertEqualsAndHash(new UtcTimeStampField(11, date), new UtcTimeStampField(11, date));
    }

    private void assertEqualsAndHash(Field<?> field1, Field<?> field2) {
        assertEquals("fields not equal", field1, field2);
        assertEquals("fields hashcode not equal", field1.hashCode(), field2.hashCode());
    }
}

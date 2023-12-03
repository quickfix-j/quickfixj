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
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.Test;
import org.quickfixj.CharsetSupport;

import quickfix.field.ClOrdID;
import quickfix.field.ExecInst;
import quickfix.field.MDUpdateAction;
import quickfix.field.OrdType;
import quickfix.field.RawData;
import quickfix.field.Side;
import quickfix.field.TradeCondition;
import quickfix.field.TransactTime;
import quickfix.fix50.MarketDataIncrementalRefresh;
import quickfix.fix50.NewOrderSingle;

public class FieldTest {

    @Test
    public void testMessageSetGetString() {
        Side side1 = new Side(Side.BUY);
        Side side2 = new Side(Side.BUY);
        assertEquals(side1, side2);

        side2 = new Side();
        side2.setValue(Side.BUY);
        assertEquals(side1, side2);
    }

    @Test
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

    @Test
    public void testBytesFieldFullRange() {
        byte[] data = new byte[256];

        for (int i = 0; i < 256; i++) {
            data[i] = (byte) i;
        }

        BytesField field = new BytesField(RawData.FIELD);
        field.setValue(data);

        byte[] tagPrefixedData = field.toString().getBytes(CharsetSupport.getCharsetInstance());
        assertEquals(256 + 3, tagPrefixedData.length);

        for (int i = 0; i < data.length; ++i) {
            assertEquals(data[i], tagPrefixedData[i + 3]);
        }
    }

    // QFJ-881
    @Test
    public void testMultipleStringValue() throws Exception {
        assertEquals(FieldType.MULTIPLESTRINGVALUE, FieldType.fromName("notused", "MULTIPLESTRINGVALUE"));
        assertEquals(FieldType.MULTIPLEVALUESTRING, FieldType.fromName("notused", "MULTIPLEVALUESTRING"));

        MarketDataIncrementalRefresh md = new MarketDataIncrementalRefresh();
        MarketDataIncrementalRefresh.NoMDEntries value = new MarketDataIncrementalRefresh.NoMDEntries();
        value.set(new MDUpdateAction(MDUpdateAction.NEW));
        value.set(new TradeCondition("A B AF AG"));
        md.addGroup(value);

        DataDictionary dd = new DataDictionary("FIX50.xml");
        dd.validate(md);
    }

    @Test
    public void testMultipleCharValue() throws Exception {
        assertEquals(FieldType.MULTIPLECHARVALUE, FieldType.fromName("notused", "MULTIPLECHARVALUE"));

        NewOrderSingle nos = new NewOrderSingle();
        nos.set(new ClOrdID("ORDER-1"));
        nos.set(new Side(Side.BUY));
        nos.set(new OrdType(OrdType.MARKET));
        nos.set(new ExecInst("i V 7"));
        nos.set(new TransactTime(LocalDateTime.of(2020, 3, 10, 12, 23, 44)));

        DataDictionary dd = new DataDictionary("FIX50.xml");
        dd.validate(nos);
    }

    private void assertEqualsAndHash(Field<?> field1, Field<?> field2) {
        assertEquals("fields not equal", field1, field2);
        assertEquals("fields hashcode not equal", field1.hashCode(), field2.hashCode());
    }
}

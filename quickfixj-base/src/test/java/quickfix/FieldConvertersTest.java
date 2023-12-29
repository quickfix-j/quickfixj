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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import quickfix.field.converter.BooleanConverter;
import quickfix.field.converter.CharArrayConverter;
import quickfix.field.converter.CharConverter;
import quickfix.field.converter.DoubleConverter;
import quickfix.field.converter.IntConverter;
import quickfix.field.converter.UtcDateOnlyConverter;
import quickfix.field.converter.UtcTimeOnlyConverter;
import quickfix.field.converter.UtcTimestampConverter;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FieldConvertersTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testIntegerConversion() throws Exception {
        String intMaxValuePlus3 = "2147483650";
        String intMinValueMinus3 = "-2147483651";
        String intLargeValue  = "999999999";
        String intLargeValue2 = "2000000000";
        assertEquals(String.valueOf(Integer.MAX_VALUE), IntConverter.convert(Integer.MAX_VALUE));
        assertEquals(String.valueOf(Integer.MIN_VALUE), IntConverter.convert(Integer.MIN_VALUE));
        assertEquals(999999999, IntConverter.convert(intLargeValue));
        assertEquals(2000000000, IntConverter.convert(intLargeValue2));
        assertEquals("123", IntConverter.convert(123));
        assertEquals(123, IntConverter.convert("123"));
        assertEquals(-1, IntConverter.convert("-1"));
        assertEquals(23, IntConverter.convert("00023"));
        try {
            IntConverter.convert("abc");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            IntConverter.convert("123.4");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            IntConverter.convert("+200");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        // this should fail and not overflow
        try {
            IntConverter.convert(intMaxValuePlus3);
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        // this should fail and not overflow
        try {
            IntConverter.convert(intMinValueMinus3);
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            IntConverter.convert("");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            IntConverter.convert("-");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            IntConverter.convert("+");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testDoubleConversion() throws Exception {
        assertEquals("45.32", DoubleConverter.convert(45.32));
        assertEquals("45", DoubleConverter.convert(45));
        assertEquals("0", DoubleConverter.convert(0));
        assertEquals(45.32, DoubleConverter.convert("45.32"), 0);
        assertEquals(45.32, DoubleConverter.convert("45.3200"), 0);
        assertEquals(0.00340244, DoubleConverter.convert("0.00340244000"), 0);
        assertEquals(45.32, DoubleConverter.convert("45.32"), 0);
        assertEquals(12.000000000001, DoubleConverter
                .convert("12.000000000001"), 0);
        assertEquals(0, DoubleConverter.convert("0.0"), 0);
        assertEquals(45.32, DoubleConverter.convert("0045.32"), 0);
        assertEquals(0, DoubleConverter.convert("0."), 0);
        assertEquals(0, DoubleConverter.convert(".0"), 0);
        assertEquals(0.06, DoubleConverter.convert("000.06"), 0);
        assertEquals(0.06, DoubleConverter.convert("0.0600"), 0);
        assertEquals(23.0, DoubleConverter.convert("00023."), 0);

        try {
            DoubleConverter.convert("abc");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            DoubleConverter.convert("+200");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            DoubleConverter.convert("123.A");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            DoubleConverter.convert(".");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            DoubleConverter.convert("1E6");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            DoubleConverter.convert("1e6");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        assertEquals("1.500", DoubleConverter.convert(1.5, 3));
        assertEquals("45.00000", DoubleConverter.convert(45, 5));
        assertEquals("5.00", DoubleConverter.convert(5, 2));
        assertEquals("-5.00", DoubleConverter.convert(-5, 2));
        assertEquals("-12.2345", DoubleConverter.convert(-12.2345, 3));
        assertEquals("0.0", DoubleConverter.convert(0, 1));
    }

    @Test
    public void testCharConversion() throws Exception {
        assertEquals("a", CharConverter.convert('a'));
        assertEquals("1", CharConverter.convert('1'));
        assertEquals("F", CharConverter.convert('F'));
        assertEquals('a', CharConverter.convert("a"));
        assertEquals('1', CharConverter.convert("1"));
        assertEquals('F', CharConverter.convert("F"));
        try {
            CharConverter.convert("");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            CharConverter.convert("a1");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
    }

    public void testCharArrayConversion() throws Exception {
        assertEquals("a 2 Z", CharArrayConverter.convert('a', '2', 'Z'));

        try {
            CharArrayConverter.convert("");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            CharArrayConverter.convert("a B cD");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testBooleanConversion() throws Exception {
        assertEquals("Y", BooleanConverter.convert(true));
        assertEquals("N", BooleanConverter.convert(false));
        assertTrue(BooleanConverter.convert("Y"));
        assertFalse(BooleanConverter.convert("N"));
        try {
            BooleanConverter.convert("D");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            BooleanConverter.convert("true");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testUtcTimeStampConversion() throws Exception {
        Calendar c = new GregorianCalendar(2000, 3, 26, 12, 5, 6);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        c.set(Calendar.MILLISECOND, 555);
        assertEquals("20000426-12:05:06", UtcTimestampConverter.convert(c
                .getTime(), false));
        assertEquals("20000426-12:05:06.555", UtcTimestampConverter.convert(c
                .getTime(), true));

        Date date = UtcTimestampConverter.convert("20000426-12:05:06.555");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, c.get(Calendar.MINUTE));
        assertEquals(6, c.get(Calendar.SECOND));
        assertEquals(555, c.get(Calendar.MILLISECOND));
        assertEquals(2000, c.get(Calendar.YEAR));
        assertEquals(3, c.get(Calendar.MONTH));
        assertEquals(26, c.get(Calendar.DAY_OF_MONTH));
        try {
            UtcTimestampConverter.convert("2000042x-12:05:06.555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimestampConverter.convert("200004261-2:05:06.555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimestampConverter.convert("20000426-1205:06.555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimestampConverter.convert("20000426-12:0506.555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimestampConverter.convert("20000426-12:05:06555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }

        // just accept up to picoseconds but truncate after millis
        date = UtcTimestampConverter.convert("20120922-12:34:56.123456");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(34, c.get(Calendar.MINUTE));
        assertEquals(56, c.get(Calendar.SECOND));
        assertEquals(2012, c.get(Calendar.YEAR));
        assertEquals(Calendar.SEPTEMBER, c.get(Calendar.MONTH));
        assertEquals(22, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(123, c.get(Calendar.MILLISECOND));

        date = UtcTimestampConverter.convert("20120922-12:34:56.123456789");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(34, c.get(Calendar.MINUTE));
        assertEquals(56, c.get(Calendar.SECOND));
        assertEquals(2012, c.get(Calendar.YEAR));
        assertEquals(Calendar.SEPTEMBER, c.get(Calendar.MONTH));
        assertEquals(22, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(123, c.get(Calendar.MILLISECOND));

        date = UtcTimestampConverter.convert("20120922-12:34:56.123456789123");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(34, c.get(Calendar.MINUTE));
        assertEquals(56, c.get(Calendar.SECOND));
        assertEquals(2012, c.get(Calendar.YEAR));
        assertEquals(Calendar.SEPTEMBER, c.get(Calendar.MONTH));
        assertEquals(22, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(123, c.get(Calendar.MILLISECOND));

        try {
            UtcTimestampConverter.convert("20120922-12:34:56.12345");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimestampConverter.convert("20120922-12:34:56.1234567");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        
        LocalDateTime dateTime = UtcTimestampConverter.convertToLocalDateTime("20120922-12:34:56");
        assertEquals(12, dateTime.getHour());
        assertEquals(34, dateTime.getMinute());
        assertEquals(56, dateTime.getSecond());
        assertEquals(2012, dateTime.getYear());
        assertEquals(9, dateTime.getMonthValue());
        assertEquals(22, dateTime.getDayOfMonth());
        assertEquals(0, dateTime.getLong(ChronoField.MILLI_OF_SECOND));
        assertEquals(0, dateTime.getLong(ChronoField.MICRO_OF_SECOND));
        assertEquals(0, dateTime.getNano());
        
        dateTime = UtcTimestampConverter.convertToLocalDateTime("20120922-12:34:56.123456789111");
        assertEquals(12, dateTime.getHour());
        assertEquals(34, dateTime.getMinute());
        assertEquals(56, dateTime.getSecond());
        assertEquals(2012, dateTime.getYear());
        assertEquals(9, dateTime.getMonthValue());
        assertEquals(22, dateTime.getDayOfMonth());
        assertEquals(123, dateTime.getLong(ChronoField.MILLI_OF_SECOND));
        assertEquals(123456, dateTime.getLong(ChronoField.MICRO_OF_SECOND));
        assertEquals(123456789, dateTime.getNano());

        dateTime = UtcTimestampConverter.convertToLocalDateTime("20120922-12:34:56.123456789");
        assertEquals(12, dateTime.getHour());
        assertEquals(34, dateTime.getMinute());
        assertEquals(56, dateTime.getSecond());
        assertEquals(2012, dateTime.getYear());
        assertEquals(9, dateTime.getMonthValue());
        assertEquals(22, dateTime.getDayOfMonth());
        assertEquals(123, dateTime.getLong(ChronoField.MILLI_OF_SECOND));
        assertEquals(123456, dateTime.getLong(ChronoField.MICRO_OF_SECOND));
        assertEquals(123456789, dateTime.getNano());

        dateTime = UtcTimestampConverter.convertToLocalDateTime("20120922-12:34:56.123456");
        assertEquals(12, dateTime.getHour());
        assertEquals(34, dateTime.getMinute());
        assertEquals(56, dateTime.getSecond());
        assertEquals(2012, dateTime.getYear());
        assertEquals(9, dateTime.getMonthValue());
        assertEquals(22, dateTime.getDayOfMonth());
        assertEquals(123, dateTime.getLong(ChronoField.MILLI_OF_SECOND));
        assertEquals(123456, dateTime.getLong(ChronoField.MICRO_OF_SECOND));
        assertEquals(123456000, dateTime.getNano());

        assertEquals("2012-09-22T12:34:56", UtcTimestampConverter.convertToLocalDateTime("20120922-12:34:56").toString());
        
        assertEquals("20120922-12:34:56", UtcTimestampConverter.convert(dateTime, UtcTimestampPrecision.SECONDS));
        assertEquals("20120922-12:34:56.123", UtcTimestampConverter.convert(dateTime, UtcTimestampPrecision.MILLIS));
        assertEquals("20120922-12:34:56.123456", UtcTimestampConverter.convert(dateTime, UtcTimestampPrecision.MICROS));
        assertEquals("20120922-12:34:56.123456000", UtcTimestampConverter.convert(dateTime, UtcTimestampPrecision.NANOS));

    }

    @Test
    public void testUtcTimeOnlyConversion() throws Exception {
        Calendar c = new GregorianCalendar(0, 0, 0, 12, 5, 6);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        c.set(Calendar.MILLISECOND, 555);
        assertEquals("12:05:06", UtcTimeOnlyConverter.convert(c.getTime(),
                false));
        assertEquals("12:05:06.555", UtcTimeOnlyConverter.convert(c.getTime(),
                true));

        Date date = UtcTimeOnlyConverter.convert("12:05:06.555");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, c.get(Calendar.MINUTE));
        assertEquals(6, c.get(Calendar.SECOND));
        assertEquals(555, c.get(Calendar.MILLISECOND));
        assertEquals(1970, c.get(Calendar.YEAR));
        assertEquals(0, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DAY_OF_MONTH));
        try {
            UtcTimeOnlyConverter.convert("I2:05:06.555");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        
        date = UtcTimeOnlyConverter.convert("12:05:06.555444");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, c.get(Calendar.MINUTE));
        assertEquals(6, c.get(Calendar.SECOND));
        assertEquals(555, c.get(Calendar.MILLISECOND));
        assertEquals(1970, c.get(Calendar.YEAR));
        assertEquals(0, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DAY_OF_MONTH));
        
        date = UtcTimeOnlyConverter.convert("12:05:06.555444333");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, c.get(Calendar.MINUTE));
        assertEquals(6, c.get(Calendar.SECOND));
        assertEquals(555, c.get(Calendar.MILLISECOND));
        assertEquals(1970, c.get(Calendar.YEAR));
        assertEquals(0, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DAY_OF_MONTH));

        date = UtcTimeOnlyConverter.convert("12:05:06.555444333222");
        c.setTime(date);
        assertEquals(12, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(5, c.get(Calendar.MINUTE));
        assertEquals(6, c.get(Calendar.SECOND));
        assertEquals(555, c.get(Calendar.MILLISECOND));
        assertEquals(1970, c.get(Calendar.YEAR));
        assertEquals(0, c.get(Calendar.MONTH));
        assertEquals(1, c.get(Calendar.DAY_OF_MONTH));

        UtcTimeOnlyConverter.convert("12:05:06");

        try {
            UtcTimeOnlyConverter.convert("12:05:06.55544");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcTimeOnlyConverter.convert("12:05:06.55544433");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        
        LocalTime time = UtcTimeOnlyConverter.convertToLocalTime("12:05:06.555444333222");
        assertEquals(12, time.getHour());
        assertEquals(5, time.getMinute());
        assertEquals(6, time.getSecond());
        assertEquals(555, time.getLong(ChronoField.MILLI_OF_SECOND));
        assertEquals(555444, time.getLong(ChronoField.MICRO_OF_SECOND));
        assertEquals(555444333, time.getNano());

        assertEquals("12:05:06", UtcTimeOnlyConverter.convert(time, UtcTimestampPrecision.SECONDS));
        assertEquals("12:05:06.555", UtcTimeOnlyConverter.convert(time, UtcTimestampPrecision.MILLIS));
        assertEquals("12:05:06.555444", UtcTimeOnlyConverter.convert(time, UtcTimestampPrecision.MICROS));
        assertEquals("12:05:06.555444333", UtcTimeOnlyConverter.convert(time, UtcTimestampPrecision.NANOS));
        
    }

    @Test
    public void testUtcDateOnlyConversion() throws Exception {
        Calendar c = new GregorianCalendar(2000, 3, 26, 0, 0, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));
        c.set(Calendar.MILLISECOND, 555);
        assertEquals("20000426", UtcDateOnlyConverter.convert(c.getTime()));

        Date date = UtcDateOnlyConverter.convert("20000426");
        c.setTime(date);
        assertEquals(0, c.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, c.get(Calendar.MINUTE));
        assertEquals(0, c.get(Calendar.SECOND));
        assertEquals(0, c.get(Calendar.MILLISECOND));
        assertEquals(2000, c.get(Calendar.YEAR));
        assertEquals(3, c.get(Calendar.MONTH));
        assertEquals(26, c.get(Calendar.DAY_OF_MONTH));
        try {
            UtcDateOnlyConverter.convert("b000042b");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcDateOnlyConverter.convert("2000042");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcDateOnlyConverter.convert("200004268");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcDateOnlyConverter.convert("2000042b");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        try {
            UtcDateOnlyConverter.convert("200k0425");
            fail();
        } catch (FieldConvertError e) {
            // expected
        }
        
        LocalDate localDate = UtcDateOnlyConverter.convertToLocalDate("20120922");
        assertEquals(2012, localDate.getYear());
        assertEquals(9, localDate.getMonthValue());
        assertEquals(22, localDate.getDayOfMonth());
        
        LocalDate localDate2 = LocalDate.of(2012, 9, 20);
        assertEquals("20120920", UtcDateOnlyConverter.convert(localDate2));
        
    }

    @Test
    public void shouldConvertFromCharArrayToString() {
        assertEquals("a", CharArrayConverter.convert('a'));
        assertEquals("5 a", CharArrayConverter.convert('5', 'a'));
        assertEquals("5 a b", CharArrayConverter.convert('5', 'a', 'b'));
        assertEquals("5 a b 5", CharArrayConverter.convert('5', 'a', 'b', '5'));
        assertEquals("5 a b \0", CharArrayConverter.convert('5', 'a', 'b', '\0'));
    }

    @Test
    public void shouldFailToConvertFromCharArrayToStringWhenTabCharacterPresent() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("whitespace character present: 9");

        CharArrayConverter.convert('5', '\t', 'b');
    }

    @Test
    public void shouldConvertFromStringToCharArray() throws FieldConvertError {
        assertArrayEquals(new char[] {'a'}, CharArrayConverter.convert("a"));
        assertArrayEquals(new char[] { '5', 'a' }, CharArrayConverter.convert("5 a"));
        assertArrayEquals(new char[] { '5', 'a', 'b'}, CharArrayConverter.convert("5 a b"));
        assertArrayEquals(new char[] { '5', 'a', 'b', '5'}, CharArrayConverter.convert("5 a b 5"));
        assertArrayEquals(new char[] { '5', 'a', 'b', '\0'}, CharArrayConverter.convert("5 a b \0"));
    }

    @Test
    public void shouldFailToConvertFromStringToCharArrayWhenTabCharacterPresent() throws FieldConvertError {
        expectedException.expect(FieldConvertError.class);
        expectedException.expectMessage("invalid char array: [53, 32, 9, 32, 98]");

        CharArrayConverter.convert("5 \t b");
    }

    @Test
    public void shouldFailToConvertFromStringToCharArrayWhenDoubleSpaceCharacterPresent() throws FieldConvertError {
        expectedException.expect(FieldConvertError.class);
        expectedException.expectMessage("invalid char array: [53, 32, 32, 32, 32, 98]");

        CharArrayConverter.convert("5    b");
    }

    @Test
    public void shouldFailToConvertFromStringToCharArrayWhenTerminatedWithSpaceCharacter() throws FieldConvertError {
        expectedException.expect(FieldConvertError.class);
        expectedException.expectMessage("invalid char array: [53, 32, 98, 32]");

        CharArrayConverter.convert("5 b ");
    }

    @Test
    public void shouldFailToConvertFromStringToCharArrayWhenNoCharactersPresent() throws FieldConvertError {
        expectedException.expect(FieldConvertError.class);
        expectedException.expectMessage("invalid char array: []");

        CharArrayConverter.convert("");
    }
}

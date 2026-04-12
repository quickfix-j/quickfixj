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

import org.junit.Test;
import quickfix.field.converter.LongConverter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Tests for {@link LongConverter}: unsigned long ↔ String conversion used by
 * FIX SEQNUM fields such as MsgSeqNum.
 */
public class LongConverterTest {

    // -----------------------------------------------------------------------
    // convert(long) — long → String
    // -----------------------------------------------------------------------

    @Test
    public void testConvertLongToString_zero() {
        assertEquals("0", LongConverter.convert(0L));
    }

    @Test
    public void testConvertLongToString_small() {
        assertEquals("1", LongConverter.convert(1L));
        assertEquals("123", LongConverter.convert(123L));
        assertEquals("99999", LongConverter.convert(99999L));
    }

    @Test
    public void testConvertLongToString_beyondCache() {
        assertEquals("100000", LongConverter.convert(100000L));
        assertEquals("2147483647", LongConverter.convert((long) Integer.MAX_VALUE));
    }

    @Test
    public void testConvertLongToString_maxSigned() {
        assertEquals(Long.toString(Long.MAX_VALUE), LongConverter.convert(Long.MAX_VALUE));
    }

    @Test
    public void testConvertLongToString_maxUnsigned() {
        // Long.MAX_VALUE + 1 … 2^64-1 are valid unsigned values; bit-pattern
        // of -1L is 2^64-1 = 18446744073709551615
        assertEquals("18446744073709551615", LongConverter.convert(-1L));
        assertEquals("9223372036854775808", LongConverter.convert(Long.MIN_VALUE));
    }

    // -----------------------------------------------------------------------
    // convert(String) — String → unsigned long
    // -----------------------------------------------------------------------

    @Test
    public void testConvertStringToLong_zero() throws Exception {
        assertEquals(0L, LongConverter.convert("0"));
    }

    @Test
    public void testConvertStringToLong_small() throws Exception {
        assertEquals(1L, LongConverter.convert("1"));
        assertEquals(123L, LongConverter.convert("123"));
    }

    @Test
    public void testConvertStringToLong_leadingZeros() throws Exception {
        // Leading zeros are permitted; they must not cause overflow or errors.
        assertEquals(0L, LongConverter.convert("0000"));
        assertEquals(42L, LongConverter.convert("00042"));
        assertEquals(1L, LongConverter.convert("000000000000000001"));
    }

    @Test
    public void testConvertStringToLong_maxSigned() throws Exception {
        assertEquals(Long.MAX_VALUE, LongConverter.convert(Long.toString(Long.MAX_VALUE)));
    }

    @Test
    public void testConvertStringToLong_maxUnsigned() throws Exception {
        // 2^64 - 1 = 18446744073709551615
        assertEquals(-1L, LongConverter.convert("18446744073709551615"));
    }

    @Test
    public void testConvertStringToLong_beyondUnsignedMax_fails() {
        // 18446744073709551616 = 2^64, one beyond the unsigned maximum
        try {
            LongConverter.convert("18446744073709551616");
            fail("Expected FieldConvertError for value beyond unsigned max");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_fastPathBoundary() throws Exception {
        // 19-digit value is handled by the fast path (FAST_PATH_MAX_DIGITS = 19).
        // Long.MAX_VALUE = 9223372036854775807 (19 digits, fits in signed long).
        assertEquals(Long.MAX_VALUE, LongConverter.convert(Long.toString(Long.MAX_VALUE)));
        // One less than Long.MAX_VALUE — also a 19-digit value on the fast path.
        assertEquals(Long.MAX_VALUE - 1, LongConverter.convert(Long.toString(Long.MAX_VALUE - 1)));
    }

    @Test
    public void testConvertStringToLong_emptyString_fails() {
        try {
            LongConverter.convert("");
            fail("Expected FieldConvertError for empty string");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_negativeSign_fails() {
        try {
            LongConverter.convert("-1");
            fail("Expected FieldConvertError for negative value");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_negativeSignOnly_fails() {
        try {
            LongConverter.convert("-");
            fail("Expected FieldConvertError for bare minus sign");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_plusSign_fails() {
        try {
            LongConverter.convert("+1");
            fail("Expected FieldConvertError for explicit positive sign");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_alphaCharacters_fails() {
        try {
            LongConverter.convert("abc");
            fail("Expected FieldConvertError for non-numeric string");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_decimalPoint_fails() {
        try {
            LongConverter.convert("123.4");
            fail("Expected FieldConvertError for decimal point");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    @Test
    public void testConvertStringToLong_digitWithEmbeddedLetter_fails() {
        try {
            LongConverter.convert("12a34");
            fail("Expected FieldConvertError for embedded letter");
        } catch (FieldConvertError e) {
            // expected
        }
    }

    // -----------------------------------------------------------------------
    // Round-trip: convert(long) → convert(String) must be identity
    // -----------------------------------------------------------------------

    @Test
    public void testRoundTrip_typicalSeqNums() throws Exception {
        long[] values = {0L, 1L, 100L, 99999L, 100000L, Integer.MAX_VALUE,
                (long) Integer.MAX_VALUE + 1L, Long.MAX_VALUE};
        for (long v : values) {
            assertEquals("round-trip failed for " + v,
                    v, LongConverter.convert(LongConverter.convert(v)));
        }
    }

    @Test
    public void testRoundTrip_unsignedRange() throws Exception {
        long[] values = {Long.MIN_VALUE, -1L, Long.MAX_VALUE + 1L};
        for (long v : values) {
            assertEquals("round-trip failed for unsigned value " + Long.toUnsignedString(v),
                    v, LongConverter.convert(LongConverter.convert(v)));
        }
    }
}

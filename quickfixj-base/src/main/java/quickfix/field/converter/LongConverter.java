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

package quickfix.field.converter;

import quickfix.FieldConvertError;
import quickfix.NumbersCache;

/**
 * Convert between an unsigned long and a String.
 *
 * <p>This converter is intended for FIX SEQNUM fields (e.g. MsgSeqNum) whose
 * values are non-negative integers that may exceed the range of a signed
 * {@code int}.  Negative values are therefore rejected during parsing.
 */
public final class LongConverter {

    /**
     * The string representation of {@link Long#MAX_VALUE}, used to determine
     * whether the fast parse path can be taken safely (i.e. without any risk
     * of overflow in the digit-accumulation loop).
     */
    private static final String LONG_MAX_STRING = Long.toUnsignedString(Long.MAX_VALUE);

    /**
     * The string representation of the maximum unsigned long value
     * ({@code 2^64 - 1 = 18446744073709551615}).  Used as the overflow-safe
     * fast-path boundary for unsigned long parsing.
     */
    private static final String ULONG_MAX_STRING = Long.toUnsignedString(-1L);

    // ULONG_MAX_STRING has 20 digits.  Strings with strictly fewer digits than
    // ULONG_MAX_STRING cannot overflow when accumulated digit-by-digit, so the
    // fast path threshold is ULONG_MAX_STRING.length() - 1 = 19 digits.
    private static final int FAST_PATH_MAX_DIGITS = ULONG_MAX_STRING.length() - 1;

    private LongConverter() {
    }

    /**
     * Convert an unsigned long to a String.
     *
     * <p>Small values (0 – 99 999) are served from the {@link NumbersCache};
     * all other values go through {@link Long#toUnsignedString(long)}.
     *
     * @param value the unsigned long to convert
     * @return the decimal string representation
     * @see NumbersCache#get(long)
     */
    public static String convert(long value) {
        return NumbersCache.get(value);
    }

    /**
     * Convert a String to an unsigned long.
     *
     * <p>Only non-empty strings consisting entirely of ASCII decimal digits are
     * accepted.  A leading {@code '-'} sign is rejected because MsgSeqNum is an
     * unsigned field.  Leading zeros are permitted (e.g. {@code "00042"} → 42).
     *
     * <p><b>Fast path:</b> strings with at most {@value #FAST_PATH_MAX_DIGITS}
     * digits are parsed digit-by-digit without any risk of overflow and without
     * allocating intermediate objects.  Longer strings are delegated to
     * {@link Long#parseUnsignedLong(String)} to handle the overflow check.
     *
     * @param value the String to convert
     * @return the converted unsigned long
     * @throws FieldConvertError if the string is empty, starts with a sign
     *         character, contains non-digit characters, or represents a value
     *         outside the range [0, 2<sup>64</sup>−1]
     */
    public static long convert(String value) throws FieldConvertError {
        if (value.isEmpty()) {
            throw new FieldConvertError("invalid unsigned long value: empty string");
        }

        final char firstChar = value.charAt(0);
        if (!isDigit(firstChar)) {
            // Reject '+' and '-' — unsigned sequence numbers cannot be negative.
            throw new FieldConvertError("invalid unsigned long value: " + value);
        }

        if (value.length() <= FAST_PATH_MAX_DIGITS) {
            return parseUnsignedLong(value);
        }

        // String is long enough that simple digit accumulation might overflow;
        // delegate to the JDK which performs the necessary overflow check.
        try {
            return Long.parseUnsignedLong(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid unsigned long value: " + value + ": " + e);
        }
    }

    /**
     * Digit-by-digit unsigned long parser — no sign handling, no overflow
     * check.  The caller guarantees that {@code value} has already been
     * validated to contain only digits and that its length is at most
     * {@link #FAST_PATH_MAX_DIGITS}, making overflow impossible.
     *
     * @param value the string to parse (all digits, non-empty)
     * @return the parsed unsigned long
     * @throws FieldConvertError if any character is not a decimal digit
     */
    private static long parseUnsignedLong(String value) throws FieldConvertError {
        long num = 0L;
        for (int i = 0; i < value.length(); i++) {
            final char c = value.charAt(i);
            if (!isDigit(c)) {
                throw new FieldConvertError("invalid unsigned long value: " + value);
            }
            num = (num * 10L) + (c - '0');
        }
        return num;
    }

    /**
     * Check whether a character is an ASCII decimal digit (0–9).
     *
     * @param character the character to test
     * @return {@code true} if the character is between {@code '0'} and {@code '9'} inclusive
     */
    static boolean isDigit(char character) {
        return (character >= '0' && character <= '9');
    }
}

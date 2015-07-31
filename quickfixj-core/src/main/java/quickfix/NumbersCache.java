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

import java.util.ArrayList;

/**
 * A cache for commonly used string representing numbers.
 * Hold values from 0 to 999999 and from 1000 to 200 000 000 by step of 1000
 */
public final class NumbersCache {

    private static final int littleNumbersLength = 1000000;
    private static final int bigNumbersLength = 200000;
    private static final int bigNumbersOffset = 1000;
    private static final int bigNumbersMax = bigNumbersLength * bigNumbersOffset;

    public static final ArrayList<String> littleNumbers;
    public static final ArrayList<String> bigNumbers;

    static {
        littleNumbers = new ArrayList<String>(littleNumbersLength);
        bigNumbers = new ArrayList<String>(bigNumbersLength);
        for (int i = 0; i < littleNumbersLength; i++)
            littleNumbers.add(Integer.toString(i));
        for (long i = 0; i < bigNumbersLength;)
            bigNumbers.add(Long.toString(++i * bigNumbersOffset));

    }

    /**
     * Get the string representing the given number
     *
     * @param i the long to convert
     * @return the String representing the long
     */
    public static String get(long i) {
        if (i < littleNumbersLength)
            return littleNumbers.get((int)i);
        if (i <= bigNumbersMax && i % bigNumbersOffset == 0)
            return bigNumbers.get((int)(i/bigNumbersOffset)-1);
        return String.valueOf(i);
    }

    /**
     * Get the string representing the given double if it's an integer
     *
     * @param d the double to convert
     * @return the String representing the double or null if the double is not an integer
     */
    public static String get(double d) {
        long l = (long)d;
        if (d == (double)l)
            return get(l);
        return null;
    }
}

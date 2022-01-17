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
 * A cache for commonly used strings representing numbers.
 * Holds values from 0 to 99999.
 */
public final class NumbersCache {

    private static final int LITTLE_NUMBERS_LENGTH = 100000;
    private static final ArrayList<String> LITTLE_NUMBERS;

    static {
        LITTLE_NUMBERS = new ArrayList<>(LITTLE_NUMBERS_LENGTH);
        for (int i = 0; i < LITTLE_NUMBERS_LENGTH; i++)
            LITTLE_NUMBERS.add(Integer.toString(i));
    }

    /**
     * Get the String representing the given number
     *
     * @param i the long to convert
     * @return the String representing the long
     */
    public static String get(int i) {
        if (i < LITTLE_NUMBERS_LENGTH)
            return LITTLE_NUMBERS.get(i);
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

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

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/**
 * Utility class for converting between day names and offsets. This method handles
 * international week day names based on the default locale.
 */
public class DayConverter {
    /**
     * Convert a day name (possibly abbreviated) to an offset.
     * 
     * @param dayName the day name (unambiguous abbreviations to 2 letters are allowed)
     * @return the week offset (starting at 1)
     * @throws ConfigError raised if conversion failed.
     */
    public static int toInteger(String dayName) throws ConfigError {
        String dayNames[] = new DateFormatSymbols(Locale.US).getWeekdays();
        dayName = dayName.toLowerCase();
    	for (int i = 1; i < dayNames.length; i++) {
    	    if (dayNames[i].toLowerCase().startsWith(dayName)) {
    	        return i;
    	    }
    	}
        throw new ConfigError("invalid format for day (valid values: "
                + Arrays.asList(dayNames).subList(1, dayNames.length)
                + " or prefix); actual value was '" + dayName + "'");
    }

    /**
     * Convert a day offset into a day name. This method handles
     * international week day names based on the default locale.
     * 
     * @param dayOffset week day offset (starting at 1)
     * @return the week day name
     * @throws ConfigError raised if offset is invalid.
     */
    public static String toString(int dayOffset) throws ConfigError {
        String dayNames[] = new DateFormatSymbols(Locale.US).getWeekdays();
        if (dayOffset > 0 && dayOffset < dayNames.length) {
            return dayNames[dayOffset].toLowerCase();
        }
        throw new ConfigError("invalid offset for day: " + dayOffset);
    }
}

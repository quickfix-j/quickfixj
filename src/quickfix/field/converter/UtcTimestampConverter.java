package quickfix.field.converter;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import quickfix.FieldConvertError;
import quickfix.SystemTime;

public class UtcTimestampConverter extends AbstractDateTimeConverter {
    private static ThreadLocal utcTimestampConverter = new ThreadLocal();
    private final DateFormat utcTimestampFormat = createDateFormat("yyyyMMdd-HH:mm:ss");
    private final DateFormat utcTimestampFormatMillis = createDateFormat("yyyyMMdd-HH:mm:ss.SSS");
    private static HashMap dateCache = new HashMap();

    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimestampConverter converter = (UtcTimestampConverter) utcTimestampConverter.get();
        if (converter == null) {
            converter = new UtcTimestampConverter();
            utcTimestampConverter.set(converter);
        }
        return includeMillis ? converter.utcTimestampFormatMillis : converter.utcTimestampFormat;
    }

    //
    // Performance optimization: the calendar for the start of the day is cached.
    // The time is converted to millis and then added to the millis specified by
    // the base calendar.
    //
    
    public static Date convert(String value) throws FieldConvertError {
        verifyFormat(value);
        String dateString = value.substring(0, 8);
        Calendar c = getCalendarForDay(value, dateString);
        long timeOffset = (parseLong(value.substring(9, 11)) * 3600000L)
                + (parseLong(value.substring(12, 14)) * 60000L)
                + (parseLong(value.substring(15, 17)) * 1000L);
        if (value.length() == 21) {
            timeOffset += parseLong(value.substring(18, 21));
        }
        return new Date(c.getTimeInMillis() + timeOffset);
    }

    private static Calendar getCalendarForDay(String value, String dateString) {
        Calendar c = (Calendar) dateCache.get(dateString);
        if (c == null) {
            c = new GregorianCalendar(1970, 0, 1, 0, 0, 0);
            c.setTimeZone(SystemTime.UTC_TIMEZONE);
            int year = Integer.parseInt(value.substring(0, 4));
            int month = Integer.parseInt(value.substring(4, 6));
            int day = Integer.parseInt(value.substring(6, 8));
            c.set(year, month - 1, day);
            dateCache.put(dateString, c);
        }
        return c;
    }

    private static void verifyFormat(String value) throws FieldConvertError {
        String type = "timestamp";
        assertDigitSequence(value, 0, 8, type);
        assertSeparator(value, 8, '-', type);
        assertDigitSequence(value, 9, 11, type);
        assertSeparator(value, 11, ':', type);
        assertDigitSequence(value, 12, 14, type);
        assertSeparator(value, 14, ':', type);
        assertDigitSequence(value, 15, 17, type);
        if (value.length() == 21) {
            assertSeparator(value, 17, '.', type);
            assertDigitSequence(value, 18, 21, type);
        } else if (value.length() != 17) {
            throwFieldConvertError(value, type);
        }
    }
}
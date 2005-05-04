package quickfix.field.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import quickfix.FieldConvertError;

public class UtcTimeOnlyConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static class UtcTimeFormats {
        public SimpleDateFormat utcTimeFormat = new SimpleDateFormat("HH:mm:ss");
        public SimpleDateFormat utcTimeFormatMillis = new SimpleDateFormat("HH:mm:ss.SSS");

        public UtcTimeFormats() {
            utcTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            utcTimeFormatMillis.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    private static ThreadLocal utcTimeFormats = new ThreadLocal();

    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimeFormats formats = (UtcTimeFormats) utcTimeFormats.get();
        if (formats == null) {
            formats = new UtcTimeFormats();
            utcTimeFormats.set(formats);
        }
        return includeMillis ? formats.utcTimeFormatMillis : formats.utcTimeFormat;
    }

    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        try {
            d = getFormatter(true).parse(value);
        } catch (ParseException e) {
            try {
                d = getFormatter(false).parse(value);
            } catch (ParseException e1) {
                throw new FieldConvertError("invalid UTC time value: " + value);
            }
        }
        return d;
    }

}
package quickfix.field.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import quickfix.FieldConvertError;

public class UtcTimestampConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static class UtcTimestampFormats {
        public SimpleDateFormat utcTimestampFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
        public SimpleDateFormat utcTimestampFormatMillis = new SimpleDateFormat(
                "yyyyMMdd-HH:mm:ss.SSS");

        public UtcTimestampFormats() {
            utcTimestampFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            utcTimestampFormatMillis.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    private static ThreadLocal utcTimestampFormats = new ThreadLocal();

    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimestampFormats formats = (UtcTimestampFormats) utcTimestampFormats.get();
        if (formats == null) {
            formats = new UtcTimestampFormats();
            utcTimestampFormats.set(formats);
        }
        return includeMillis ? formats.utcTimestampFormatMillis : formats.utcTimestampFormat;
    }

    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        try {
            d = getFormatter(true).parse(value);
        } catch (ParseException e) {
            try {
                d = getFormatter(false).parse(value);
            } catch (ParseException e1) {
                throw new FieldConvertError("invalid UTC timestamp value: " + value);
            }
        }
        return d;
    }

}
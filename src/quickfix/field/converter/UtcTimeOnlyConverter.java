package quickfix.field.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import quickfix.FieldConvertError;

public class UtcTimeOnlyConverter extends AbstractDateTimeConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static ThreadLocal utcTimeConverter = new ThreadLocal();
    private DateFormat utcTimeFormat = createDateFormat("HH:mm:ss");
    private DateFormat utcTimeFormatMillis = createDateFormat("HH:mm:ss.SSS");

    public static String convert(Date d, boolean includeMilliseconds) {
        return getFormatter(includeMilliseconds).format(d);
    }

    private static DateFormat getFormatter(boolean includeMillis) {
        UtcTimeOnlyConverter converter = (UtcTimeOnlyConverter) utcTimeConverter.get();
        if (converter == null) {
            converter = new UtcTimeOnlyConverter();
            utcTimeConverter.set(converter);
        }
        return includeMillis ? converter.utcTimeFormatMillis : converter.utcTimeFormat;
    }

    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        try {
            d = getFormatter(value.length() == 12).parse(value);
        } catch (ParseException e) {
            throwFieldConvertError(value, "time");
        }
        return d;
    }

}
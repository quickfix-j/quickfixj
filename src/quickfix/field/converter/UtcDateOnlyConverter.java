package quickfix.field.converter;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import quickfix.FieldConvertError;


public class UtcDateOnlyConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static ThreadLocal utcDateFormat = new ThreadLocal();
    
    public static String convert(Date d) {
        return getFormatter().format(d);
    }

    private static DateFormat getFormatter() {
        SimpleDateFormat format = (SimpleDateFormat) utcDateFormat.get();
        if (format == null) {
            format = new SimpleDateFormat("yyyyMMdd");
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            format.setDateFormatSymbols(new DateFormatSymbols(Locale.US));
            utcDateFormat.set(format);
        }
        return format;
    }

    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        try {
            for (int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i))) {
                    throw new FieldConvertError("invalid UTC date value: " + value);
                }
            }
            d = getFormatter().parse(value);
        } catch (ParseException e) {
            throw new FieldConvertError("invalid UTC date value: " + value);
        }
        return d;
    }
}
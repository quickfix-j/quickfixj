package quickfix.field.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import quickfix.FieldConvertError;

public class UtcDateOnlyConverter extends AbstractDateTimeConverter {
    // SimpleDateFormats are not thread safe. A thread local is being
    // used to maintain high concurrency among multiple session threads
    private static ThreadLocal utcDateConverter = new ThreadLocal();
    private DateFormat dateFormat = createDateFormat("yyyyMMdd");

    public static String convert(Date d) {
        return getFormatter().format(d);
    }

    private static DateFormat getFormatter() {
        UtcDateOnlyConverter converter = (UtcDateOnlyConverter) utcDateConverter.get();
        if (converter == null) {
            converter = new UtcDateOnlyConverter();
            utcDateConverter.set(converter);
        }
        return converter.dateFormat;
    }

    public static Date convert(String value) throws FieldConvertError {
        Date d = null;
        String type = "date";
        assertLength(value, 8, type);
        assertDigitSequence(value, 0, 8, type);
        try {
            d = getFormatter().parse(value);
        } catch (ParseException e) {
            throwFieldConvertError(value, type);
        }
        return d;
    }

}
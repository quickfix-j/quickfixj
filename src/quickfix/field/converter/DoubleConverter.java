package quickfix.field.converter;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickfix.FieldConvertError;


public class DoubleConverter {
    private static DecimalFormat doubleFormat = new DecimalFormat("#.##############");
    private static final Pattern doublePattern = Pattern.compile("-?\\d*(\\.\\d*)?");

    public static String convert(double d) {
        // TODO This can be optimized!
        synchronized (doubleFormat) {
            return doubleFormat.format(d);
        }
    }

    public static double convert(String value) throws FieldConvertError {
        try {
            Matcher matcher = doublePattern.matcher(value);
            if (!matcher.matches()) {
                throw new NumberFormatException();
            }
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid double value: " + value);
        }
    }
}
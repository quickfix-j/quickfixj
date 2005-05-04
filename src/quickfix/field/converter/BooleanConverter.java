package quickfix.field.converter;

import quickfix.FieldConvertError;


public class BooleanConverter {
    public static String convert(boolean b) {
        return b ? "Y" : "N";
    }

    public static boolean convert(String value) throws FieldConvertError {
        if ("Y".equals(value)) {
            return true;
        } else if ("N".equals(value)) {
            return false;
        } else {
            throw new FieldConvertError("invalid boolean value: " + value);
        }
    }
}
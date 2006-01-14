package quickfix.field.converter;

import quickfix.FieldConvertError;


public class CharConverter {
    public static String convert(char c) {
        return Character.toString(c);
    }

    public static char convert(String value) throws FieldConvertError {
        if (value.length() != 1) {
            throw new FieldConvertError("invalid character value: " + value);
        }
        return value.charAt(0);
    }
}
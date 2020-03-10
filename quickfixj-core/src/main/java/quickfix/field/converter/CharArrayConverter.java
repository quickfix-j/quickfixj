package quickfix.field.converter;

import quickfix.FieldConvertError;

/**
 * Converts between character array and string.
 */
public class CharArrayConverter {

    private static final String CHAR_ARRAY_REGEX = "[A-Za-z0-9]( [A-Za-z0-9])*";

    public static String convert(char... chars) {
        if (chars.length == 0) {
            throw new IllegalArgumentException("empty character array");
        }

        StringBuilder builder = new StringBuilder(chars.length * 2 - 1);
        builder.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            builder.append(' ').append(chars[i]);
        }

        return builder.toString();
    }

    public static char[] convert(String value) throws FieldConvertError {
        if (!value.matches(CHAR_ARRAY_REGEX)) {
            throw new FieldConvertError("invalid char array value: " + value);
        }

        String[] split = value.split(" ");
        char[] chars = new char[split.length];

        for (int i = 0; i < split.length; i++) {
            chars[i] = split[i].charAt(0);
        }
        return chars;
    }
}

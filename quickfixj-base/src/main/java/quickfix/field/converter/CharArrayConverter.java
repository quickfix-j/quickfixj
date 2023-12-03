package quickfix.field.converter;

import quickfix.FieldConvertError;

import java.util.Arrays;

/**
 * Converts between character array and string.
 */
public class CharArrayConverter {

    private static final String CHAR_ARRAY_REGEX = "\\S( \\S)*";

    public static String convert(char... chars) {
        if (chars.length == 0) {
            throw new IllegalArgumentException("empty character array");
        }

        StringBuilder builder = new StringBuilder(chars.length * 2 - 1);
        builder.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                throw new IllegalArgumentException("whitespace character present: " + ((int)chars[i]));
            }

            builder.append(' ').append(chars[i]);
        }

        return builder.toString();
    }

    public static char[] convert(String value) throws FieldConvertError {
        if (!value.matches(CHAR_ARRAY_REGEX)) {
            throw new FieldConvertError("invalid char array: " + Arrays.toString(value.getBytes()));
        }

        String[] split = value.split(" ");
        char[] chars = new char[split.length];

        for (int i = 0; i < split.length; i++) {
            chars[i] = split[i].charAt(0);
        }
        return chars;
    }
}

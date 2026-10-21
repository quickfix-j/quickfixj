package quickfix.field.converter;

import static quickfix.field.converter.IntConverter.window;

import quickfix.FieldConvertError;

import java.util.Arrays;

/**
 * Converts between character array and string.
 */
public class CharArrayConverter {

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
        return convert(value, 0, value == null ? 0 : value.length());
    }
    
    public static char[] convert(String value, int offset, int length) throws FieldConvertError {
        if (value == null) {
            throw new NullPointerException();
        }
        if (offset < 0 || length < 0 || value.length() - offset < length) {
            throw new FieldConvertError("invalid char array: offset=" + offset
                    + ", length=" + length + ", value.length=" + value.length());
        }
        
        if (length == 0 || (length & 1) == 0) {
            throw error(value, offset, length);
        }
        
        final char[] chars = new char[(length + 1) >>> 1];
        for (int i = 0, p = offset, end = offset + length; p < end; i++, p += 2) {
            final char c = value.charAt(p);
            if (!isTokenChar(c)) {
                throw error(value, offset, length);
            }
            chars[i] = c;
            if (p + 1 < end && value.charAt(p + 1) != ' ') {
                throw error(value, offset, length);
            }
        }
        return chars;
    }
    
    private static FieldConvertError error(String value, int offset, int length) {
        return new FieldConvertError("invalid char array: " + Arrays.toString(window(value, offset, length).getBytes()));
    }
    
    private static boolean isTokenChar(char c) {
        return c != ' ' && c != '\t' && c != '\n' && c != '\u000B' && c != '\f' && c != '\r';
    }
}

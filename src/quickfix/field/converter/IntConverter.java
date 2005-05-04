package quickfix.field.converter;

import quickfix.FieldConvertError;


public final class IntConverter {
    private IntConverter() { }
    
    public static String convert(int i) {
        // TODO This can be optimized!
        return Long.toString(i);
    }

    public static int convert(String value) throws FieldConvertError {
        try {
            for (int i = 0; i < value.length(); i++) {
                if (!Character.isDigit(value.charAt(i))) {
                    throw new NumberFormatException();
                }
            }
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new FieldConvertError("invalid integral value: " + value);
        }
    }
}
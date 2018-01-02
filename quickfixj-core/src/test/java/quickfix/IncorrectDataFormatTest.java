package quickfix;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IncorrectDataFormatTest {

    private final int tag = 44;
    private final String value = "value";

    @Test
    public void getMessage_provides_field() {
        IncorrectDataFormat exception = new IncorrectDataFormat(tag, value);
        String message = exception.getMessage();

        assertTrue(message.contains(Integer.toString(tag)));
    }

    @Test
    public void getMessage_provides_value() {
        IncorrectDataFormat exception = new IncorrectDataFormat(tag, value);
        String message = exception.getMessage();

        assertTrue(message.contains(value));
    }
}

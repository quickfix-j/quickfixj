package quickfix;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.*;

public class UTCDateOnlyFieldTest {

    public static final int MD_ENTRY_DATE_FIELD = 272;

    @Test
    public void testUtcDateOnlyFieldFromLocalDate() {
        LocalDate localDate = LocalDate.of(2023, 3, 19);
        UtcDateOnlyField utcDateOnlyField = new UtcDateOnlyField(MD_ENTRY_DATE_FIELD,localDate);
        assertTrue(utcDateOnlyField.valueEquals(localDate));
        assertEquals(localDate,utcDateOnlyField.getValue());
        assertEquals(MD_ENTRY_DATE_FIELD, utcDateOnlyField.getField());
    }

    @Test
    public void testUtcDateOnlyFieldFromNow() {
        UtcDateOnlyField utcDateOnlyField = new UtcDateOnlyField(MD_ENTRY_DATE_FIELD);
        assertNotNull(utcDateOnlyField.getValue());
        assertEquals(MD_ENTRY_DATE_FIELD, utcDateOnlyField.getField());
    }

    @Test
    public void testAssignment() {
        LocalDate localDate = LocalDate.of(2023, 12, 31);
        UtcDateOnlyField utcDateOnlyField = new UtcDateOnlyField(MD_ENTRY_DATE_FIELD);
        utcDateOnlyField.setValue(localDate);
        assertTrue(utcDateOnlyField.valueEquals(localDate));
        assertEquals(localDate,utcDateOnlyField.getValue());
    }
}

package quickfix;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

import org.junit.Test;

import quickfix.field.EffectiveTime;
import quickfix.field.MDEntryTime;
import quickfix.field.converter.UtcTimeOnlyConverter;

/**
 * Tests the {@link FieldMap} class.
 * Specifically, verifies that the setters for {@link UtcTimeStampField} work correctly.
 *
 * @author toli
 */
public class FieldMapTest {

    @Test
    public void testSetUtcTimeStampField() throws Exception {
        FieldMap map = new Message();
        LocalDateTime aDate = LocalDateTime.now();
        map.setField(new UtcTimeStampField(EffectiveTime.FIELD, aDate, false));
        assertEquals("milliseconds should not be preserved", epochMilliOfLocalDate(aDate) - (epochMilliOfLocalDate(aDate) % 1000),
                epochMilliOfLocalDate(map.getField(new EffectiveTime()).getValue()));

        // now set it with preserving millis
        map.setField(new UtcTimeStampField(EffectiveTime.FIELD, aDate, true));
        assertEquals("milliseconds should be preserved", epochMilliOfLocalDate(aDate),
                epochMilliOfLocalDate(map.getField(new EffectiveTime()).getValue()));
    }

    @Test
    public void testSetUtcTimeOnlyField() throws Exception {
        FieldMap map = new Message();
        LocalTime aDate = LocalTime.now();
        map.setField(new UtcTimeOnlyField(MDEntryTime.FIELD, aDate, false));
        assertEquals("milliseconds should not be preserved", UtcTimeOnlyConverter.convert(aDate, UtcTimestampPrecision.SECONDS),
                UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), UtcTimestampPrecision.SECONDS));

        // now set it with preserving millis
        map.setField(new UtcTimeOnlyField(MDEntryTime.FIELD, aDate, true));
        assertEquals("milliseconds should be preserved", UtcTimeOnlyConverter.convert(aDate, UtcTimestampPrecision.MILLIS),
                UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), UtcTimestampPrecision.MILLIS));
    }

    /**
     * Try a subclass of {@link UtcTimeOnlyField} and {@link UtcTimeStampField} directly
     */
    @Test
    public void testSpecificFields() throws Exception {
        FieldMap map = new Message();
        LocalDateTime aDate = LocalDateTime.now();
        map.setField(new EffectiveTime(aDate));
        assertEquals("milliseconds should be preserved", epochMilliOfLocalDate(aDate),
                epochMilliOfLocalDate(map.getField(new EffectiveTime()).getValue()));
        LocalTime aTime = LocalTime.now();
        map.setField(new MDEntryTime(aTime));
        assertEquals("milliseconds should be preserved", UtcTimeOnlyConverter.convert(aTime, UtcTimestampPrecision.MILLIS),
                UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), UtcTimestampPrecision.MILLIS));
    }

    private long epochMilliOfLocalDate(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }
}

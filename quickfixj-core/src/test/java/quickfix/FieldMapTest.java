package quickfix;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import quickfix.field.EffectiveTime;
import quickfix.field.MDEntryTime;
import quickfix.field.converter.UtcTimeOnlyConverter;

import java.util.Iterator;
import java.util.Optional;

/**
 * Tests the {@link FieldMap} class.
 * Specifically, verifies that the setters for {@link UtcTimeStampField} work correctly.
 *
 * @author toli
 * @version $Id$
 */
public class FieldMapTest extends TestCase {
    public FieldMapTest(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new TestSuite(FieldMapTest.class);
    }

    public void testDefaultFieldOrderIsInsertionOrdering()  {
        FieldMap map = new Message();
        map.setString(2, "A");
        map.setString(1, "B");
        assertEquals("9=82=A1=B10=017",map.toString());
    }

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

    private void testOrdering(int[] vals, int[] order, int[] expected) {
        FieldMap map = new Message(order);
        for (int v : vals)
            map.setInt(v, v);
        Iterator<Field<?>> it = map.iterator();
        for (int e : expected)
            assertEquals(String.valueOf(e), it.next().getObject());
    }

    public void testOrdering() {
        testOrdering(new int[] { 1, 2, 3 }, null, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 3, 2, 1 }, null, new int[] { 3, 2, 1 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 3, 2 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 3 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 3 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 3, 1 }, new int[] { 3, 1, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 3, 1 }, new int[] { 3, 1, 2 });
    }

    public void testOptionalString() {
        FieldMap map = new Message();
        map.setField(new StringField(128, "bigbank"));
        Optional<String> optValue = map.getOptionalString(128);
        assertTrue(optValue.isPresent());
        assertEquals("bigbank", optValue.get());
        assertFalse(map.getOptionalString(129).isPresent());
    }

    public void testOptionalDecimal() {
        FieldMap map = new Message();
        map.setField(new DecimalField(44, new BigDecimal("1565.10")));
        Optional<BigDecimal> optValue = map.getOptionalDecimal(44);
        assertTrue(optValue.isPresent());
        assertEquals(0, optValue.get().compareTo(new BigDecimal("1565.10")));
        assertFalse(map.getOptionalDecimal(6).isPresent());
    }

    private long epochMilliOfLocalDate(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }
}

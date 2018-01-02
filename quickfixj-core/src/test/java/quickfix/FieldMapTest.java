package quickfix;

import org.junit.Test;
import quickfix.field.EffectiveTime;
import quickfix.field.MDEntryTime;
import quickfix.field.converter.UtcTimeOnlyConverter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class FieldMapTest {

    @Test
    public void testDefaultFieldOrderIsInsertionOrdering()  {
        FieldMap map = new Message();
        map.setString(2, "A");
        map.setString(1, "B");
        assertEquals("9=82=A1=B10=017",map.toString());
    }

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

    private void testOrdering(int[] vals, int[] order, int[] expected) {
        FieldMap map = new Message(order);
        for (int v : vals)
            map.setInt(v, v);
        Iterator<Field<?>> it = map.iterator();
        for (int e : expected)
            assertEquals(String.valueOf(e), it.next().getObject());
    }

    @Test
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

    @Test
    public void testOptionalString() {
        FieldMap map = new Message();
        map.setField(new StringField(128, "bigbank"));
        Optional<String> optValue = map.getOptionalString(128);
        assertTrue(optValue.isPresent());
        assertEquals("bigbank", optValue.get());
        assertFalse(map.getOptionalString(129).isPresent());
    }

    @Test
    public void testOptionalDecimal() {
        FieldMap map = new Message();
        map.setField(new DecimalField(44, new BigDecimal("1565.10")));
        Optional<BigDecimal> optValue = map.getOptionalDecimal(44);
        assertTrue(optValue.isPresent());
        assertEquals(0, optValue.get().compareTo(new BigDecimal("1565.10")));
        assertFalse(map.getOptionalDecimal(6).isPresent());
    }

    @Test
    public void testNullFieldException() {
        FieldMap map = new Message();
        StringField field = new StringField(0, null);
        assertThrows(FieldException.class, () -> map.setField(field));
    }

    public void testGroupRemovalByGroup() {
        FieldMap map = new Message();
        Group g = new Group(73, 11);
        map.addGroup(g);
        assertEquals(1, map.getGroups(73).size());
        assertTrue(map.isSetField(73));

        map.removeGroup(g);

        //Method doesn't remove group entry
        assertTrue(map.getGroups().containsKey(73));
        assertEquals(0, map.getGroups(73).size());
        assertFalse(map.isSetField(73));
    }

    public void testGroupRemovalByField() {
        FieldMap map = new Message();
        Group g = new Group(73, 11);
        map.addGroup(g);
        assertEquals(1, map.getGroups(73).size());
        assertTrue(map.isSetField(73));

        map.removeGroup(73);

        //Method doesn't remove group entry
        assertTrue(map.getGroups().containsKey(73));
        assertEquals(0, map.getGroups(73).size());
        assertFalse(map.isSetField(73));
    }

    public void testGroupRemovalByFieldBoolean() {
        FieldMap map = new Message();
        Group g = new Group(73, 11);
        map.addGroup(g);
        assertEquals(1, map.getGroups(73).size());
        assertTrue(map.isSetField(73));

        map.removeGroup(73, true);

        assertFalse(map.getGroups().containsKey(73));
        assertEquals(0, map.getGroups(73).size());
        assertFalse(map.isSetField(73));
    }

    private long epochMilliOfLocalDate(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    @Test
    public void testRemoveGroup() {
        FieldMap map = new Message();
        Group group = new Group(73, 11);
        map.addGroup(group);
        assertTrue(map.hasGroup(73));
        map.removeGroup(73);
        assertFalse(map.hasGroup(73));
    }

    @Test
    public void testRemoveMissingField() {
        FieldMap map = new Message();
        map.removeField(1);
    }
}

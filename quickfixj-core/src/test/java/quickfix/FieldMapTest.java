package quickfix;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import quickfix.field.EffectiveTime;
import quickfix.field.MDEntryTime;
import quickfix.field.converter.UtcTimeOnlyConverter;

import java.util.Date;
import java.util.Iterator;

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

    public void testSetUtcTimeStampField() throws Exception {
        FieldMap map = new Message();
        Date aDate = new Date();
        map.setField(new UtcTimeStampField(EffectiveTime.FIELD, aDate, false));
        assertEquals("milliseconds should not be preserved", aDate.getTime() - (aDate.getTime() % 1000),
                    map.getField(new EffectiveTime()).getValue().getTime());

        // now set it with preserving millis
        map.setField(new UtcTimeStampField(EffectiveTime.FIELD, aDate, true));
        assertEquals("milliseconds should be preserved", aDate.getTime(),
                    map.getField(new EffectiveTime()).getValue().getTime());
    }

    public void testSetUtcTimeOnlyField() throws Exception {
        FieldMap map = new Message();
        Date aDate = new Date();
        map.setField(new UtcTimeOnlyField(MDEntryTime.FIELD, aDate, false));
        assertEquals("milliseconds should not be preserved", UtcTimeOnlyConverter.convert(aDate, false),
                    UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), false));

        // now set it with preserving millis
        map.setField(new UtcTimeOnlyField(MDEntryTime.FIELD, aDate, true));
        assertEquals("milliseconds should be preserved", UtcTimeOnlyConverter.convert(aDate, true),
                    UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), true));
    }

    /**
     * Try a subclass of {@link UtcTimeOnlyField} and {@link UtcTimeStampField} directly
     */
    public void testSpecificFields() throws Exception {
        FieldMap map = new Message();
        Date aDate = new Date();
        map.setField(new EffectiveTime(aDate));
        assertEquals("milliseconds should be preserved", aDate.getTime(),
                    map.getField(new EffectiveTime()).getValue().getTime());
        map.setField(new MDEntryTime(aDate));
        assertEquals("milliseconds should be preserved", UtcTimeOnlyConverter.convert(aDate, true),
                    UtcTimeOnlyConverter.convert(map.getField(new MDEntryTime()).getValue(), true));
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
        testOrdering(new int[] { 3, 2, 1 }, null, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 3, 2 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 1, 3 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 1, 3 }, new int[] { 1, 3, 2 });
        testOrdering(new int[] { 1, 2, 3 }, new int[] { 3, 1 }, new int[] { 3, 1, 2 });
        testOrdering(new int[] { 3, 2, 1 }, new int[] { 3, 1 }, new int[] { 3, 1, 2 });
    }
}

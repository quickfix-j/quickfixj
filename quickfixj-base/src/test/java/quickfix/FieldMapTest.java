package quickfix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Optional;

import org.junit.Test;

/**
 * Tests the {@link FieldMap} class.
 * Specifically, verifies that the setters for {@link UtcTimeStampField} work correctly.
 *
 * @author toli
 */
public class FieldMapTest {

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
        testOrdering(new int[]{1, 2, 3}, null, new int[]{1, 2, 3});
        testOrdering(new int[]{3, 2, 1}, null, new int[]{1, 2, 3});
        testOrdering(new int[]{1, 2, 3}, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        testOrdering(new int[]{3, 2, 1}, new int[]{1, 2, 3}, new int[]{1, 2, 3});
        testOrdering(new int[]{1, 2, 3}, new int[]{1, 3, 2}, new int[]{1, 3, 2});
        testOrdering(new int[]{3, 2, 1}, new int[]{1, 3, 2}, new int[]{1, 3, 2});
        testOrdering(new int[]{1, 2, 3}, new int[]{1, 3}, new int[]{1, 3, 2});
        testOrdering(new int[]{3, 2, 1}, new int[]{1, 3}, new int[]{1, 3, 2});
        testOrdering(new int[]{1, 2, 3}, new int[]{3, 1}, new int[]{3, 1, 2});
        testOrdering(new int[]{3, 2, 1}, new int[]{3, 1}, new int[]{3, 1, 2});
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

    @Test
    public void testRemoveGroup() {
        FieldMap map = new Message();
        Group group = new Group(73, 11);
        map.addGroup(group);
        assertTrue(map.hasGroup(73));
        map.removeGroup(73);
        assertFalse(map.hasGroup(73));
    }
}

package org.quickfixj.jmx.openmbean;

import org.junit.Before;
import org.junit.Test;

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.SimpleType;

import static org.junit.Assert.assertEquals;

public class CompositeTypeFactoryTest {

    private CompositeTypeFactory underTest;

    @Before
    public void setUp() {
        underTest = new CompositeTypeFactory("user", "registered user");
    }

    @Test
    public void shouldCreateCompositeTypeWithDescription() throws OpenDataException {
        underTest.defineItem("age", "age of a person", SimpleType.INTEGER);
        underTest.defineItem("email", "email address", SimpleType.STRING);
        underTest.defineItem("dob", "date of birth", SimpleType.DATE);

        CompositeType compositeType = underTest.createCompositeType();
        assertEquals("user", compositeType.getTypeName());
        assertEquals("registered user", compositeType.getDescription());
        assertEquals("javax.management.openmbean.CompositeData", compositeType.getClassName());

        assertEquals(SimpleType.INTEGER, compositeType.getType("age"));
        assertEquals("age of a person", compositeType.getDescription("age"));

        assertEquals(SimpleType.STRING, compositeType.getType("email"));
        assertEquals("email address", compositeType.getDescription("email"));

        assertEquals(SimpleType.DATE, compositeType.getType("dob"));
        assertEquals("date of birth", compositeType.getDescription("dob"));
    }

    @Test
    public void shouldCreateCompositeTypeWithoutDescription() throws OpenDataException {
        underTest.defineItem("age", SimpleType.INTEGER);
        underTest.defineItem("email", SimpleType.STRING);
        underTest.defineItem("dob", SimpleType.DATE);

        CompositeType compositeType = underTest.createCompositeType();
        assertEquals("user", compositeType.getTypeName());
        assertEquals("registered user", compositeType.getDescription());
        assertEquals("javax.management.openmbean.CompositeData", compositeType.getClassName());

        assertEquals(SimpleType.INTEGER, compositeType.getType("age"));
        assertEquals("age", compositeType.getDescription("age"));

        assertEquals(SimpleType.STRING, compositeType.getType("email"));
        assertEquals("email", compositeType.getDescription("email"));

        assertEquals(SimpleType.DATE, compositeType.getType("dob"));
        assertEquals("dob", compositeType.getDescription("dob"));
    }
}

package com.dishan;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Verify expected value
        assertEquals(5, 2 + 3);

        // Verify condition is true
        assertTrue(5 > 3);

        // Verify condition is false
        assertFalse(5 < 3);

        // Verify object reference is null
        Object emptyObject = null;
        assertNull(emptyObject);

        // Verify object reference is not null
        Object newObject = new Object();
        assertNotNull(newObject);
    }
}
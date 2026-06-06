/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for SystemTime.nanoTime() and the MockSystemTimeSource nanoTime support.
 */
public class SystemTimeTest {

    private MockSystemTimeSource timeSource;

    @Before
    public void setUp() {
        timeSource = new MockSystemTimeSource(1_000L);
        SystemTime.setTimeSource(timeSource);
    }

    @After
    public void tearDown() {
        SystemTime.setTimeSource(null);
    }

    @Test
    public void testNanoTimeMatchesMillisInMock() {
        // MockSystemTimeSource derives nanoTime from millis, so they must be consistent
        long expectedNanos = TimeUnit.MILLISECONDS.toNanos(SystemTime.currentTimeMillis());
        assertEquals("nanoTime must be millis * 1_000_000 in mock",
                expectedNanos, SystemTime.nanoTime());
    }

    @Test
    public void testNanoTimeAdvancesWithIncrement() {
        long nanosBefore = SystemTime.nanoTime();
        timeSource.increment(500L); // advance by 500 ms
        long nanosAfter = SystemTime.nanoTime();

        assertEquals("nanoTime must advance by 500 ms expressed in nanoseconds",
                TimeUnit.MILLISECONDS.toNanos(500L), nanosAfter - nanosBefore);
    }

    @Test
    public void testNanoTimeAdvancesWithSetSystemTimes() {
        timeSource.setSystemTimes(2_000L);
        assertEquals(TimeUnit.MILLISECONDS.toNanos(2_000L), SystemTime.nanoTime());
    }

    @Test
    public void testDefaultTimeSourceReturnsRealNanoTime() {
        SystemTime.setTimeSource(null); // resets to real UTC source
        long before = System.nanoTime();
        long systemTimeNanos = SystemTime.nanoTime();
        long after = System.nanoTime();
        assertTrue("SystemTime.nanoTime() must fall within System.nanoTime() bounds",
                systemTimeNanos >= before && systemTimeNanos <= after);
    }

    @Test
    public void testDurationMeasurementWithMock() {
        // Simulate recording a start time, advancing the clock, and measuring elapsed duration
        long startNanos = SystemTime.nanoTime();
        timeSource.increment(2_000L); // 2 seconds pass
        long elapsedMillis = TimeUnit.NANOSECONDS.toMillis(SystemTime.nanoTime() - startNanos);
        assertEquals("Elapsed time must be 2000 ms", 2_000L, elapsedMillis);
    }
}

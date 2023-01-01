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

package quickfix.mina;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

import static quickfix.mina.WatermarkTracker.newMono;
import static quickfix.mina.WatermarkTracker.newMulti;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WatermarkTrackerTest {
    @Mock
    private Runnable onLowerMono;

    @Mock
    private Runnable onUpperMono;

    @Mock
    private Consumer<Integer> onLowerMulti;

    @Mock
    private Consumer<Integer> onUpperMulti;

    private BlockingQueue<Integer> queue;

    private WatermarkTracker<Integer, Void> mono;

    @Before
    public void setUp() {
        queue = new ArrayBlockingQueue<>(4);
        mono = newMono(queue, 1, 3, onLowerMono, onUpperMono);
    }

    @Test
    public void basics() throws InterruptedException {
        mono.put(1);
        assertEquals(1, queue.size());

        final Integer x = mono.poll(1, TimeUnit.DAYS);
        assertEquals(0, queue.size());
        assertEquals(1, x.intValue());
    }

    /*
     * Queue size over time in the below test, covers all scenarios
     *
     * (queue size)
     *  3           *   *
     *  2         *   *   *
     *  1   *   *           *
     *  0 *   *               *
     *    1 2 3 4 5 6 7 8 9 0 1 (steps)
     */
    @Test
    public void watermarks() throws InterruptedException {
        // cross lower watermark up
        mono.put(1);
        verifyState(false, false, false);

        // cross lower watermark down while not suspended
        mono.poll(1, TimeUnit.DAYS);
        verifyState(false, false, false);

        // cross lower then upper watermarks up
        mono.put(1);
        verifyState(false, false, false);

        mono.put(2);
        verifyState(false, false, false);

        mono.put(3);
        verifyState(true, false, true);

        // cross upper watermark down
        mono.poll(1, TimeUnit.DAYS); // 3
        verifyState(true, false, false);

        // cross upper watermark back up (without reaching the lower)
        mono.put(3);
        verifyState(true, false, false);

        // cross upper then lower watermarks down
        mono.poll(1, TimeUnit.DAYS); // 2
        verifyState(true, false, false);

        mono.poll(1, TimeUnit.DAYS); // 2
        verifyState(false, true, false);

        mono.poll(1, TimeUnit.DAYS); // 1
        verifyState(false, false, false);
    }

    @Test
    public void multiShouldWork() throws InterruptedException {
        final Function<Integer, Integer> classifier = x -> x % 2;
        final WatermarkTracker<Integer, Integer> multi
                = newMulti(queue, 1, 3, classifier, onLowerMulti, onUpperMulti);

        assertEquals(multi.trackerForStream(0), multi.trackerForStream(0));
        assertEquals(multi.trackerForStream(1), multi.trackerForStream(1));
        assertNotEquals(multi.trackerForStream(0), multi.trackerForStream(1));

        assertEquals(multi.trackerForPayload(0), multi.trackerForPayload(2));
        assertEquals(multi.trackerForPayload(1), multi.trackerForPayload(3));
        assertNotEquals(multi.trackerForPayload(0), multi.trackerForPayload(1));

        multi.put(1);
        assertEquals(1, multi.trackerForPayload(1).counter);
        multi.put(3);
        assertEquals(2, multi.trackerForPayload(3).counter);
    }

    // === helpers ===

    private void verifyState(boolean suspended, boolean onLower, boolean onUpper) {
        assertEquals(suspended, mono.isSuspended());
        verify(onLowerMono, times(onLower ? 1 : 0)).run();
        verify(onUpperMono, times(onUpper ? 1 : 0)).run();
        reset(onLowerMono, onUpperMono);
    }
}
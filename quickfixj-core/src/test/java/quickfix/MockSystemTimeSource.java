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

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MockSystemTimeSource implements SystemTimeSource {

    private long[] systemTimes = {System.currentTimeMillis()};
    private long[] systemTimesNanos = {System.nanoTime()};
    private int offset;

    public MockSystemTimeSource() {
        // empty
    }

    public MockSystemTimeSource(long time) {
        setSystemTimes(time);
        setSystemTimesNanos(TimeUnit.MILLISECONDS.toNanos(time));
    }

    public void setSystemTimes(long[] times) {
        systemTimes = times;
    }

    void setSystemTimes(long time) {
        systemTimes = new long[]{time};
    }

    void setSystemTimesNanos(long time) {
        systemTimesNanos = new long[]{time};
    }

    public void setTime(Calendar c) {
        setSystemTimes(c.getTimeInMillis());
    }

    @Override
    public long getTime() {
        if (systemTimes.length - offset > 1) {
            offset++;
        }
        return systemTimes[offset];
    }

    @Override
    public long getTimeFromNanos() {
        if (systemTimesNanos.length - offset > 1) {
            offset++;
        }
        return systemTimesNanos[offset];
    }

    public void increment(long delta) {
        if (systemTimes.length - offset == 1) {
            systemTimes[offset] += delta;
        }
        if (systemTimesNanos.length - offset == 1) {
            systemTimesNanos[offset] += TimeUnit.MILLISECONDS.toNanos(delta);
        }
    }

    @Override
    public LocalDateTime getNow() {
        // TODO maybe we need nano-precision later on
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(getTime()), ZoneOffset.UTC);
    }

}

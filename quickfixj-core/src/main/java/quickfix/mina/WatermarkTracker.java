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

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A blocking queue wrapper implementing watermarks-based back pressure propagation
 * from the queue sink to one or more logical sources.
 *
 * @param <E> payload type
 * @param <S> logical source key type
 *
 * @author Vladimir Lysyy (mrbald@github)
 */
public class WatermarkTracker<E,S> implements QueueTracker<E> {
    private final BlockingQueue<E> queue;
    private final long lowerWatermark;
    private final long upperWatermark;
    private final Consumer<S> onLowerWatermarkCrossed;
    private final Consumer<S> onUpperWatermarkCrossed;
    private final Function<E, S> classifier;
    private final Function<S, StreamTracker> trackerSupplier;

    class StreamTracker {
        private final S key;
        long counter = 0;
        private boolean suspended = false;

        StreamTracker(S key) {
            this.key = key;
        }

        synchronized void incoming(int n) {
            if ((counter += n) >= upperWatermark && !suspended) {
                suspended = true;
                onUpperWatermarkCrossed.accept(key);
            }
        }

        synchronized void outgoing(int n) {
            if ((counter -= n) == lowerWatermark && suspended) {
                suspended = false;
                onLowerWatermarkCrossed.accept(key);
            }
        }

        synchronized boolean isSuspended() {
            return suspended;
        }
    }

    static <E, Void> WatermarkTracker<E, Void> newMono(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Runnable onLowerWatermarkCrossed, Runnable onUpperWatermarkCrossed) {
        return new WatermarkTracker<>(queue, lowerWatermark, upperWatermark, onLowerWatermarkCrossed, onUpperWatermarkCrossed);
    }

    static <E, S> WatermarkTracker<E, S> newMulti(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Function<E, S> classifier,
            Consumer<S> onLowerWatermarkCrossed, Consumer<S> onUpperWatermarkCrossed) {
        return new WatermarkTracker<>(queue, lowerWatermark, upperWatermark, classifier, onLowerWatermarkCrossed, onUpperWatermarkCrossed);
    }

    private WatermarkTracker(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Function<E, S> classifier,
            Consumer<S> onLowerWatermarkCrossed, Consumer<S> onUpperWatermarkCrossed) {
        this.queue = queue;
        this.lowerWatermark = lowerWatermark;
        this.upperWatermark = upperWatermark;
        this.classifier = classifier;
        this.onLowerWatermarkCrossed = onLowerWatermarkCrossed;
        this.onUpperWatermarkCrossed = onUpperWatermarkCrossed;

        final Map<S, StreamTracker> trackerMap = new ConcurrentHashMap<>();

        this.trackerSupplier = key -> trackerMap.computeIfAbsent(key, StreamTracker::new);
    }

    private WatermarkTracker(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Runnable onLowerWatermarkCrossed, Runnable onUpperWatermarkCrossed) {
        this.queue = queue;
        this.lowerWatermark = lowerWatermark;
        this.upperWatermark = upperWatermark;
        this.classifier = x -> null;
        this.onLowerWatermarkCrossed = x -> onLowerWatermarkCrossed.run();
        this.onUpperWatermarkCrossed = x -> onUpperWatermarkCrossed.run();

        final StreamTracker streamTracker = new StreamTracker(null);

        this.trackerSupplier = key -> streamTracker;
    }

    @Override
    public void put(E e) throws InterruptedException {
        queue.put(e);
        trackerForPayload(e).incoming(1);
    }

    @Override
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        final E e = queue.poll(timeout, unit);

        if (e != null) {
            trackerForPayload(e).outgoing(1);
        }

        return e;
    }

    @Override
    public int drainTo(Collection<E> collection) {
        return queue.drainTo(new AbstractCollection<E>() {
            @Override public Iterator<E> iterator() { throw new UnsupportedOperationException(); }
            @Override public int size() { throw new UnsupportedOperationException(); }

            public boolean add(E e) {
                final boolean added = collection.add(e);
                if (added) {
                    trackerForPayload(e).outgoing(1);
                }
                return added;
            }

        });
    }

    public boolean isSuspended(S key) {
        return trackerForStream(key).isSuspended();
    }

    public boolean isSuspended() {
        return isSuspended(null);
    }

    StreamTracker trackerForPayload(E e) {
        return trackerForStream(classifier.apply(e));
    }

    StreamTracker trackerForStream(S s) {
        return trackerSupplier.apply(s);
    }

}

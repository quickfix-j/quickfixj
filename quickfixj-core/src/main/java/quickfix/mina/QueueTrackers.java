package quickfix.mina;

import org.apache.mina.core.session.IoSession;
import quickfix.Responder;
import quickfix.Session;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.lang.String.format;

/**
 * Queue trackers factory methods
 */
final class QueueTrackers {
    private static final String LOWER_WATERMARK_FMT = "inbound queue size < lower watermark (%d), socket reads resumed";
    private static final String UPPER_WATERMARK_FMT = "inbound queue size > upper watermark (%d), socket reads suspended";

    /**
     * Watermarks-based queue tracker
     */
    static <E> WatermarkTracker<E, Session> newMultiSessionWatermarkTracker(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Function<E, Session> classifier) {
        return WatermarkTracker.newMulti(queue, lowerWatermark, upperWatermark, classifier,
                qfSession -> resumeReads(qfSession, (int)lowerWatermark),
                qfSession -> suspendReads(qfSession, (int)upperWatermark));
    }

    /**
     * Default no-op queue tracker
     */
    static <E> QueueTracker<E> newDefaultQueueTracker(BlockingQueue<E> queue) {
        return new QueueTracker<E>() {
            @Override
            public void put(E e) throws InterruptedException {
                queue.put(e);
            }

            @Override
            public E poll(long timeout, TimeUnit unit) throws InterruptedException {
                return queue.poll(timeout, unit);
            }

            @Override
            public int drainTo(Collection<E> collection) {
                return queue.drainTo(collection);
            }
        };
    }

    private static IoSession lookupIoSession(Session qfSession) {
        final Responder responder = qfSession.getResponder();

        if (responder instanceof IoSessionResponder) {
            return ((IoSessionResponder)responder).getIoSession();
        } else {
            return null;
        }
    }

    private static void resumeReads(Session qfSession, int queueLowerWatermark) {
        final IoSession ioSession = lookupIoSession(qfSession);
        if (ioSession != null && ioSession.isReadSuspended()) {
            ioSession.resumeRead();
            qfSession.getLog().onEvent(format(LOWER_WATERMARK_FMT, queueLowerWatermark));
        }
    }

    private static void suspendReads(Session qfSession, int queueUpperWatermark) {
        final IoSession ioSession = lookupIoSession(qfSession);
        if (ioSession != null && !ioSession.isReadSuspended()) {
            ioSession.suspendRead();
            qfSession.getLog().onEvent(format(UPPER_WATERMARK_FMT, queueUpperWatermark));
        }
    }

    static <E, Void> WatermarkTracker<E, Void> newSingleSessionWatermarkTracker(
            BlockingQueue<E> queue,
            long lowerWatermark, long upperWatermark,
            Session qfSession) {
        return WatermarkTracker.newMono(queue, lowerWatermark, upperWatermark,
                () -> resumeReads(qfSession, (int)lowerWatermark),
                () -> suspendReads(qfSession, (int)upperWatermark));
    }
}

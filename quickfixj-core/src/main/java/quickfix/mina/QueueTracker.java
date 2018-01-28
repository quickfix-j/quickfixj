package quickfix.mina;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

interface QueueTracker<E> {
    void put(E e) throws InterruptedException;
    E poll(long timeout, TimeUnit unit) throws InterruptedException;
    int drainTo(Collection<E> collection);

    static <E> QueueTracker<E> wrap(BlockingQueue<E> queue) {
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
}

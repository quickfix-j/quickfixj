package quickfix.mina;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

interface QueueTracker<E> {
    void put(E e) throws InterruptedException;
    E poll(long timeout, TimeUnit unit) throws InterruptedException;
    int drainTo(Collection<E> collection);
}

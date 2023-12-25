package quickfix;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A bounded-size version of InMemoryMessageQueue.
 * @see InMemoryMessageQueue
 */
public class BoundInMemoryMessageQueue implements MessageQueue {
    // The map should be accessed from a single thread
    private final Map<Integer, Message> backingMap = new LinkedHashMap<>();
    private final int maxSize;

    public BoundInMemoryMessageQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public void enqueue(int sequence, Message message) {
        if (backingMap.size() >= maxSize) {
            List<Integer> keys = backingMap.keySet().stream().sorted().collect(Collectors.toList());
            if (sequence < keys.get(0)) {
                backingMap.remove(keys.get(keys.size()-1));
                backingMap.put(sequence, message);
            }
        } else {
            this.backingMap.put(sequence, message);
        }
    }

    public Message dequeue(int sequence) {
        return (Message) this.backingMap.remove(sequence);
    }

    public void clear() {
        this.backingMap.clear();
    }

    Map<Integer, Message> getBackingMap() {
        return this.backingMap;
    }
}


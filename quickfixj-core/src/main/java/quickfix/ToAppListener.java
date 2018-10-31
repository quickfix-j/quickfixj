package quickfix;

public interface ToAppListener<T extends Message> {
    void accept(T message, SessionID sessionId) throws DoNotSend;
}

package quickfix;

public interface ToAppListener<T extends IMessage> {
    void accept(T message, SessionID sessionId) throws DoNotSend;
}

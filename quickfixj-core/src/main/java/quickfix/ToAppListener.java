package quickfix;

public interface ToAppListener {
    void accept(Message message, SessionID sessionId) throws DoNotSend;
}

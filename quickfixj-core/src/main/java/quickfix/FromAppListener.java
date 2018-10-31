package quickfix;

public interface FromAppListener<T extends Message> {
    void accept(T message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType;
}

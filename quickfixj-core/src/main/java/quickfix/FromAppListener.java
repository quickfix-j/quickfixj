package quickfix;

public interface FromAppListener<T extends IMessage> {
    void accept(T message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType;
}

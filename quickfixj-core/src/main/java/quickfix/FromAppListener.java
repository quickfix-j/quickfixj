package quickfix;

public interface FromAppListener {
    void accept(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType;
}

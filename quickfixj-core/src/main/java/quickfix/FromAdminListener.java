package quickfix;

public interface FromAdminListener<T extends IMessage> {
    void accept(T message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
}

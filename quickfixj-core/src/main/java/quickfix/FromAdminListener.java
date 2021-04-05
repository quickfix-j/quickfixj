package quickfix;

public interface FromAdminListener<T extends Message> {
    void accept(T message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
}

package quickfix;

public interface FromAdminListener {
    void accept(Message message, SessionID sessionId) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon;
}

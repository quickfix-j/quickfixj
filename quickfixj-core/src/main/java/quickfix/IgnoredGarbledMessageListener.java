package quickfix;

public interface IgnoredGarbledMessageListener {
    void garbledMessageIgnored(SessionID sessionID, Message message);
}

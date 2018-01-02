package quickfix;

public interface SessionResendListener {
    void onDuplicateResendRequested(SessionID sessionID, int fromSeqNo, int toSeqNo);

    void onResendRequestSatisfied(SessionID sessionID, int fromSeqNo, int toSeqNo);
}

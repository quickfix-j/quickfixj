package quickfix;

public enum SendResult {
    DO_NOT_SEND(false, false, false),
    NOT_PERSISTED_NOT_SENT(false, false, false),
    PERSISTED_NOT_SENT(false, true, false),
    NOT_PERSISTED_SENT(true, false, true),
    PERSISTED_SENT(true, true, true);

    private boolean originalResult;
    private boolean persisted;
    private boolean sent;

    SendResult(boolean originalResult, boolean persisted, boolean sent) {
        this.originalResult = originalResult;
        this.persisted = persisted;
        this.sent = sent;
    }

    public boolean getOriginalResult() {
        return originalResult;
    }

    public boolean isPersisted() {
        return persisted;
    }

    public boolean isSent() {
        return sent;
    }
}

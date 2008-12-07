package quickfix;

public class MessageParseError extends Exception {

    public MessageParseError() {
        super();
    }

    public MessageParseError(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageParseError(String message) {
        super(message);
    }
}

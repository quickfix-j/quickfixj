package org.quickfixj;

public class QFJException extends RuntimeException {

    public QFJException() {
        super();
    }

    public QFJException(String message, Throwable cause) {
        super(message, cause);
    }

    public QFJException(String message) {
        super(message);
    }

    public QFJException(Throwable cause) {
        super(cause);
    }

}

package quickfix.mina;

import org.apache.mina.protocol.ProtocolViolationException;

/**
 * This type of exception usually requires a disconnect of the connection. 
 */
public class CriticalSessionProtocolException extends ProtocolViolationException {

    public CriticalSessionProtocolException() {
    }

    public CriticalSessionProtocolException(String message, Throwable cause) {
        super(message, cause);
    }

    public CriticalSessionProtocolException(String message) {
        super(message);
    }

    public CriticalSessionProtocolException(Throwable cause) {
        super(cause);
    }

}

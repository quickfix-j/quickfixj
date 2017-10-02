package quickfix;

public class MessageFactoryException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9213732643467684379L;

	public MessageFactoryException(String message, Exception e) {
		super(message,e);
	}
}

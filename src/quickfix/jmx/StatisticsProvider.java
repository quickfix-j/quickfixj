package quickfix.jmx;

/**
 * Provides messaging statistics information.
 *
 */
public interface StatisticsProvider {
    /**
     * Get the number of incoming messages since the session's server
     * was started.
     * 
     * @return incoming message count
     */
    int getIncomingMessageCount();
    
    
    /**
     * Get the number of outgoing messages since the session's server
     * was started.
     * 
     * @return outgoing message count
     */
    int getOutgoingMessageCount();
}

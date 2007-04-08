/*============================================================================
 *
 * Copyright (c) 2000-2007 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package quickfix;

/**
 * This extension of the QF JNI LogFactory interface provides the fully
 * qualified class name of the calling class so it can be filtered for
 * logging purposes. (Initially for SLF4J support.) 
 */
public interface LocationAwareLogFactory extends LogFactory {
    /**
     * Create a log implementation.
     *
     * @param sessionID
     *            session ID usually used for configuration access
     * @param callerFQCN
     *            fully-qualified class name of the parent logger
     *            in case we are being constructed as part of a composite logger
     * @return the log implementation
     */
    Log create(SessionID sessionID, String callerFQCN);

}

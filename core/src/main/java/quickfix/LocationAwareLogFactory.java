/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

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

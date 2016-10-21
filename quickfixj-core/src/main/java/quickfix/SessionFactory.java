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
 * Creates a Session based on the specified settings.
 */
public interface SessionFactory {

    /**
     * Specifies the connection type for a session. Valid values are "initiator"
     * and "acceptor".
     */
    String SETTING_CONNECTION_TYPE = "ConnectionType";

    /**
     * Instructs the connection-related code to continue if there is an error
     * creating or initializing a session. In other words, one bad session won't
     * stop the initialization of other sessions.
     */
    String SETTING_CONTINUE_INIT_ON_ERROR = "ContinueInitializationOnError";

    String ACCEPTOR_CONNECTION_TYPE = "acceptor";
    String INITIATOR_CONNECTION_TYPE = "initiator";

    Session create(SessionID sessionID, SessionSettings settings) throws ConfigError;

}

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

/*
 * An exception when a message is not valid according to the
 * basic message validation or the data dictionary.
 */
public class InvalidMessage extends Exception {

    Message fixMessage;

    public InvalidMessage() {
        super();
    }

    public InvalidMessage(Message fixMessage) {
        super();
        setGarbledFixMessage(fixMessage);
    }

    public InvalidMessage(String message) {
        super(message);
    }

    public InvalidMessage(String message, Message fixMessage) {
        super(message);
        setGarbledFixMessage(fixMessage);
    }
    
    public InvalidMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMessage(String message, Throwable cause, Message fixMessage) {
        super(message, cause);
        setGarbledFixMessage(fixMessage);
    }
    
    public Message getFixMessage() {
        return fixMessage;
    }
    
    private void setGarbledFixMessage(Message fixMessage) {
        this.fixMessage = fixMessage;
        this.fixMessage.setGarbled(true);
    }

}

/*******************************************************************************
 * Copyright (c) 2001-2004 quickfixengine.org All rights reserved.
 * 
 * This file is part of the QuickFIX FIX Engine
 * 
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file LICENSE
 * included in the packaging of this file.
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing are not
 * clear to you.
 *  
 ******************************************************************************/

package quickfix;

public class FileLogFactory implements LogFactory {
    private SessionSettings settings;
    
    public FileLogFactory(SessionSettings settings) {
        this.settings = settings;
    }
    
	public Log create(SessionID sessionID) {
		try {
            return new FileLog(settings.getString(sessionID, SessionSettings.FILE_LOG_PATH), sessionID);
        } catch (Exception e) {
            // TODO should we use a quickfix exception here?
            throw new RuntimeException("error creating file log", e);
        }
	}
}
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

public class SessionID {
    private String beginString;

    private String senderCompID;

    private String targetCompID;

    private String sessionQualifier;

    private String id;

    public SessionID(String beginString, String senderCompID, String targetCompID) {
        create(beginString, senderCompID, targetCompID, "");
    }

    public SessionID(String beginString, String senderCompID, String targetCompID,
            String sessionQualifier) {
        create(beginString, senderCompID, targetCompID, sessionQualifier);
    }

    protected void finalize() {
        destroy();
    }

    public String getBeginString() {
        return beginString;
    }

    public String getSenderCompID() {
        return senderCompID;
    }

    public String getTargetCompID() {
        return targetCompID;
    }

    public String getSessionQualifier() {
        return sessionQualifier;
    }

    public boolean equals(Object object) {
        return object != null ? toString().equals(object.toString()) : false;
    }

    public String toString() {
        return id;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    private void create(String beginString, String senderCompID, String targetCompID,
            String sessionQualifier) {
        this.beginString = beginString;
        this.senderCompID = senderCompID;
        this.targetCompID = targetCompID;
        this.sessionQualifier = sessionQualifier;
        id = beginString + ":" + senderCompID + "->" + targetCompID + 
        	(sessionQualifier != null && !sessionQualifier.equals("") 
        	        ? ":" + sessionQualifier : "");
    }

    private void destroy() {

    }
}
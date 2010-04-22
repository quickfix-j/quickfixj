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

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import quickfix.field.BeginString;
import quickfix.field.SenderCompID;
import quickfix.field.SenderLocationID;
import quickfix.field.SenderSubID;
import quickfix.field.TargetCompID;
import quickfix.field.TargetLocationID;
import quickfix.field.TargetSubID;

/**
 * Identifier for a session. Only supports a company ID (target, sender)
 * and a session qualifier. Sessions are also identified by FIX version so
 * that it's possible to have multiple sessions to the same counterparty
 * but using different FIX versions (and/or session qualifiers). 
 */
public class SessionID implements Serializable {
    private static Pattern pattern = Pattern.compile("(.*?):(.*?)(?:/(.*?)|)(?:/(.*?)|)->(.*?)(?:/(.*?)|)(?:/(.*?)|)(?::(.*)|)");
    public static final String NOT_SET = "";

    private final String id;
    private final String beginString;
    private final String senderCompID;
    private final String senderSubID;
    private final String senderLocationID;
    private final String targetCompID;
    private final String targetSubID;
    private final String targetLocationID;
    private final String sessionQualifier;

    public SessionID(String beginString, String senderCompID, String senderSubID,
            String senderLocationID, String targetCompID, String targetSubID,
            String targetLocationID, String sessionQualifier) {
        this.beginString = value(beginString);
        this.senderCompID = value(senderCompID);
        this.senderSubID = value(senderSubID);
        this.senderLocationID = value(senderLocationID);
        this.targetCompID = value(targetCompID);
        this.targetSubID = value(targetSubID);
        this.targetLocationID = value(targetLocationID);
        this.sessionQualifier = value(sessionQualifier);
        id = createID();
    }

    public SessionID(BeginString beginString, SenderCompID senderCompID, SenderSubID senderSubID,
            SenderLocationID senderLocationID, TargetCompID targetCompID, TargetSubID targetSubID,
            TargetLocationID targetLocationID, String qualifier) {
        this(value(beginString), value(senderCompID), value(senderSubID), value(senderLocationID),
                value(targetCompID), value(targetSubID), value(targetLocationID), value(qualifier));
    }

    public SessionID(String beginString, String senderCompID, String senderSubID,
            String targetCompID, String targetSubID) {
        this(beginString, senderCompID, senderSubID, NOT_SET, targetCompID, targetSubID, NOT_SET,
                NOT_SET);
    }

    public SessionID(BeginString beginString, SenderCompID senderCompID, SenderSubID senderSubID,
            TargetCompID targetCompID, TargetSubID targetSubID) {
        this(value(beginString), value(senderCompID), value(senderSubID), value(targetCompID),
                value(targetSubID));
    }

    public SessionID(String beginString, String senderCompID, String targetCompID, String qualifier) {
        this(beginString, senderCompID, NOT_SET, NOT_SET, targetCompID, NOT_SET, NOT_SET, qualifier);
    }

    public SessionID(BeginString beginString, SenderCompID senderCompID, TargetCompID targetCompID,
            String qualifier) {
        this(value(beginString), value(senderCompID), value(targetCompID), value(qualifier));
    }

    public SessionID(String beginString, String senderCompID, String targetCompID) {
        this(beginString, senderCompID, NOT_SET, NOT_SET, targetCompID, NOT_SET, NOT_SET, NOT_SET);
    }

    public SessionID(BeginString beginString, SenderCompID senderCompID, TargetCompID targetCompID) {
        this(value(beginString), value(senderCompID), value(targetCompID));
    }

    public SessionID() {
        throw new UnsupportedOperationException("Unsupported QuickFIX feature: use constructor with arguments");
    }

    public SessionID(String id) {
        Matcher matcher = pattern.matcher(id);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid session ID string: "+id);
        }
        beginString = matcher.group(1);
        senderCompID = matcher.group(2);
        senderSubID = value(matcher.group(3));
        senderLocationID = value(matcher.group(4));
        targetCompID = matcher.group(5);
        targetSubID = value(matcher.group(6));
        targetLocationID = value(matcher.group(7));
        sessionQualifier = value(matcher.group(8));
        this.id = createID();
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

    public String getSenderSubID() {
        return senderSubID;
    }

    public String getSenderLocationID() {
        return senderLocationID;
    }

    public String getTargetSubID() {
        return targetSubID;
    }

    public String getTargetLocationID() {
        return targetLocationID;
    }


    /**
     * Session qualifier can be used to identify different sessions
     * for the same target company ID. Session qualifiers can only me used
     * with initiated sessions. They cannot be used with accepted sessions.
     * @return the session qualifier
     */
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

    private String createID() {
        return beginString
                + ":"
                + senderCompID
                + (isSet(senderSubID) ? "/" + senderSubID : "")
                + (isSet(senderLocationID) ? "/" + senderLocationID : "")
                + "->"
                + targetCompID
                + (isSet(targetSubID) ? "/" + targetSubID : "")
                + (isSet(targetLocationID) ? "/" + targetLocationID : "")
                + (sessionQualifier != null && !sessionQualifier.equals(NOT_SET) ? ":"
                        + sessionQualifier : NOT_SET);
    }

    private boolean isSet(String value) {
        return !value.equals(NOT_SET);
    }

    private static String value(StringField f) {
        return f != null ? f.getValue() : NOT_SET;
    }

    private static String value(String s) {
        return s == null ? NOT_SET : s;
    }

    /**
     * @return true if session version if FIXT 1.1 or newer.
     */
    public boolean isFIXT() {
        return FixVersions.BEGINSTRING_FIXT11.equals(beginString);
    }

    /**
     * Populate the sessionID from a string.
     * @param sessionIDString
     * @return the sessionIDString
     */
    public String fromString(String sessionIDString) {
        throw new UnsupportedOperationException("Unsupported QuickFIX feature: use SessionID constructor instead.");
    }
}
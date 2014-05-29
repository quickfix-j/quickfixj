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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

/**
 * A Log using the SLFJ wrapper that supports JDK 1.4 logging, Log4J and others. This log should be created using the
 * associated factory.
 *
 * @see SLF4JLogFactory
 */
public class SLF4JLog extends AbstractLog {

    public static final String DEFAULT_EVENT_CATEGORY = "quickfixj.event";

    public static final String DEFAULT_ERROR_EVENT_CATEGORY = "quickfixj.errorEvent";

    public static final String DEFAULT_INCOMING_MSG_CATEGORY = "quickfixj.msg.incoming";

    public static final String DEFAULT_OUTGOING_MSG_CATEGORY = "quickfixj.msg.outgoing";

    private final Logger eventLog;

    private final Logger errorEventLog;

    private final Logger incomingMsgLog;

    private final Logger outgoingMsgLog;

    private final String logPrefix;

    private final String callerFQCN;

    public SLF4JLog(SessionID sessionID, String eventCategory, String errorEventCategory,
            String incomingMsgCategory, String outgoingMsgCategory, boolean prependSessionID,
            boolean logHeartbeats, String inCallerFQCN) {
        setLogHeartbeats(logHeartbeats);
        logPrefix = prependSessionID ? (sessionID + ": ") : null;
        eventLog = getLogger(sessionID, eventCategory, DEFAULT_EVENT_CATEGORY);
        errorEventLog = getLogger(sessionID, errorEventCategory, DEFAULT_ERROR_EVENT_CATEGORY);
        incomingMsgLog = getLogger(sessionID, incomingMsgCategory, DEFAULT_INCOMING_MSG_CATEGORY);
        outgoingMsgLog = getLogger(sessionID, outgoingMsgCategory, DEFAULT_OUTGOING_MSG_CATEGORY);
        callerFQCN = inCallerFQCN;
    }

    private Logger getLogger(SessionID sessionID, String category, String defaultCategory) {
        return LoggerFactory.getLogger(category != null
                ? substituteVariables(sessionID, category)
                : defaultCategory);
    }

    private static final String FIX_MAJOR_VERSION_VAR = "\\$\\{fixMajorVersion}";

    private static final String FIX_MINOR_VERSION_VAR = "\\$\\{fixMinorVersion}";

    private static final String SENDER_COMP_ID_VAR = "\\$\\{senderCompID}";

    private static final String SENDER_SUB_ID_VAR = "\\$\\{senderSubID}";

    private static final String SENDER_LOC_ID_VAR = "\\$\\{senderLocationID}";

    private static final String TARGET_COMP_ID_VAR = "\\$\\{targetCompID}";

    private static final String TARGET_SUB_ID_VAR = "\\$\\{targetSubID}";

    private static final String TARGET_LOC_ID_VAR = "\\$\\{targetLocationID}";

    private static final String QUALIFIER_VAR = "\\$\\{qualifier}";

    private String substituteVariables(SessionID sessionID, String category) {
        final String[] beginStringFields = sessionID.getBeginString().split("\\.");
        String processedCategory = category;
        processedCategory = processedCategory.replaceAll(FIX_MAJOR_VERSION_VAR,
                beginStringFields[1]);
        processedCategory = processedCategory.replaceAll(FIX_MINOR_VERSION_VAR,
                beginStringFields[2]);
        processedCategory = processedCategory.replaceAll(SENDER_COMP_ID_VAR,
                sessionID.getSenderCompID());
        processedCategory = processedCategory.replaceAll(SENDER_SUB_ID_VAR,
                sessionID.getSenderSubID());
        processedCategory = processedCategory.replaceAll(SENDER_LOC_ID_VAR,
                sessionID.getSenderLocationID());
        processedCategory = processedCategory.replaceAll(TARGET_COMP_ID_VAR,
                sessionID.getTargetCompID());
        processedCategory = processedCategory.replaceAll(TARGET_SUB_ID_VAR,
                sessionID.getTargetSubID());
        processedCategory = processedCategory.replaceAll(TARGET_LOC_ID_VAR,
                sessionID.getTargetLocationID());
        processedCategory = processedCategory.replaceAll(QUALIFIER_VAR,
                sessionID.getSessionQualifier());
        return processedCategory;
    }

    public void onEvent(String text) {
        log(eventLog, text);
    }

    public void onErrorEvent(String text) {
        logError(errorEventLog, text);
    }

    @Override
    protected void logIncoming(String message) {
        log(incomingMsgLog, message);
    }

    @Override
    protected void logOutgoing(String message) {
        log(outgoingMsgLog, message);
    }

    /** Made protected to enable unit testing of callerFQCN coming through correctly */
    protected void log(org.slf4j.Logger log, String text) {
        if (log.isInfoEnabled()) {
            final String message = logPrefix != null ? (logPrefix + text) : text;
            if (log instanceof LocationAwareLogger) {
                final LocationAwareLogger la = (LocationAwareLogger) log;
                la.log(null, callerFQCN, LocationAwareLogger.INFO_INT, message, null, null);
            } else {
                log.info(message);
            }
        }
    }

    protected void logError(org.slf4j.Logger log, String text) {
        final String message = logPrefix != null ? (logPrefix + text) : text;
        log.error(message);
    }

    public void clear() {
        onEvent("Log clear operation is not supported: " + getClass().getName());
    }

}

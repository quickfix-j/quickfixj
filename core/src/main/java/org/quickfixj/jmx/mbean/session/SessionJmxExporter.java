package org.quickfixj.jmx.mbean.session;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.quickfixj.jmx.mbean.ObjectNameFactory;

import quickfix.ConfigError;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;

public class SessionJmxExporter {
    private Map<SessionID, ObjectName> sessionObjectNames = new HashMap<SessionID, ObjectName>();

    public void export(MBeanServer mbeanServer, Session session, ObjectName connectorName,
            SessionSettings settings) throws JMException, ConfigError {
        ObjectName sessionName = createSessionName(session.getSessionID());
        sessionObjectNames.put(session.getSessionID(), sessionName);
        SessionAdmin sessionAdmin = new SessionAdmin(session, connectorName);
        session.addStateListener(sessionAdmin);
        mbeanServer.registerMBean(sessionAdmin, sessionName);
        ObjectNameFactory settingsNameFactory = new ObjectNameFactory();
        settingsNameFactory.addProperty("type", "Settings");
        addSessionIdProperties(session.getSessionID(), settingsNameFactory);
        mbeanServer.registerMBean(new SessionSettingsAdmin(session.getSessionID(), settings),
                settingsNameFactory.createName());
    }

    public ObjectName getSessionName(SessionID sessionID) {
        return sessionObjectNames.get(sessionID);
    }

    public ObjectName createSessionName(SessionID sessionID) throws MalformedObjectNameException {
        TreeMap<String, String> properties = new TreeMap<String, String>();
        properties.put("type", "Session");
        ObjectNameFactory nameFactory = new ObjectNameFactory();
        nameFactory.addProperty("type", "Session");
        addSessionIdProperties(sessionID, nameFactory);
        return nameFactory.createName();
    }

    private void addSessionIdProperties(SessionID sessionID, ObjectNameFactory nameFactory) {
        nameFactory.addProperty("beginString", sessionID.getBeginString());
        nameFactory.addProperty("senderCompID", sessionID.getSenderCompID());
        nameFactory.addProperty("targetCompID", sessionID.getTargetCompID());
        String sessionQualifier = sessionID.getSessionQualifier();
        if (!"".equals(sessionQualifier)) {
            nameFactory.addProperty("qualifier", sessionQualifier);
        }
    }

}

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
    private Map sessionObjectNames = new HashMap();

    public void export(MBeanServer mbeanServer, Session session, ObjectName connectorName,
            SessionSettings settings) throws JMException, ConfigError {
        ObjectName sessionName = createSessionName(session);
        sessionObjectNames.put(session.getSessionID(), sessionName);
        mbeanServer.registerMBean(new SessionAdmin(session, connectorName), sessionName);
        ObjectNameFactory settingsNameFactory = new ObjectNameFactory();
        settingsNameFactory.addProperty("type", "Settings");
        addSessionIdProperties(session.getSessionID(), settingsNameFactory);
        mbeanServer.registerMBean(new SessionSettingsAdmin(session.getSessionID(), settings),
                settingsNameFactory.createName());
    }

    public ObjectName getSessionName(SessionID sessionID) {
        return (ObjectName) sessionObjectNames.get(sessionID);
    }

    private ObjectName createSessionName(Session session) throws MalformedObjectNameException {
        TreeMap properties = new TreeMap();
        properties.put("type", "Session");
        SessionID sessionID = session.getSessionID();
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

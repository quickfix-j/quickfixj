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

package quickfix.examples.executor;

import static quickfix.Acceptor.SETTING_ACCEPTOR_TEMPLATE;
import static quickfix.Acceptor.SETTING_SOCKET_ACCEPT_ADDRESS;
import static quickfix.Acceptor.SETTING_SOCKET_ACCEPT_PORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.management.JMException;
import javax.management.ObjectName;

import org.quickfixj.jmx.JmxExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FieldConvertError;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.mina.acceptor.DynamicAcceptorSessionProvider;
import quickfix.mina.acceptor.DynamicAcceptorSessionProvider.TemplateMapping;

public class Executor {
    private final static Logger log = LoggerFactory.getLogger(Executor.class);
    private final SocketAcceptor acceptor;
    private final Map<InetSocketAddress, List<TemplateMapping>> dynamicSessionMappings = new HashMap<InetSocketAddress, List<TemplateMapping>>();
    
    private final JmxExporter jmxExporter;
    private final ObjectName connectorObjectName;
    
    public Executor(SessionSettings settings) throws ConfigError, FieldConvertError, JMException {
        Application application = new Application(settings);
        MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
        LogFactory logFactory = new ScreenLogFactory(true, true, true);
        MessageFactory messageFactory = new DefaultMessageFactory();

        acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory,
                messageFactory);

        configureDynamicSessions(settings, application, messageStoreFactory, logFactory,
                messageFactory);

        jmxExporter = new JmxExporter();
        connectorObjectName = jmxExporter.register(acceptor);
        log.info("Acceptor registered with JMX, name=" + connectorObjectName);
    }

    private void configureDynamicSessions(SessionSettings settings, Application application,
            MessageStoreFactory messageStoreFactory, LogFactory logFactory,
            MessageFactory messageFactory) throws ConfigError, FieldConvertError {
        //
        // If a session template is detected in the settings, then
        // set up a dynamic session provider.
        //

        Iterator<SessionID> sectionIterator = settings.sectionIterator();
        while (sectionIterator.hasNext()) {
            SessionID sessionID = sectionIterator.next();
            if (isSessionTemplate(settings, sessionID)) {
                InetSocketAddress address = getAcceptorSocketAddress(settings, sessionID);
                getMappings(address).add(new TemplateMapping(sessionID, sessionID));
            }
        }

        for (Map.Entry<InetSocketAddress, List<TemplateMapping>> entry : dynamicSessionMappings
                .entrySet()) {
            acceptor.setSessionProvider(entry.getKey(), new DynamicAcceptorSessionProvider(
                    settings, entry.getValue(), application, messageStoreFactory, logFactory,
                    messageFactory));
        }
    }

    private List<TemplateMapping> getMappings(InetSocketAddress address) {
        List<TemplateMapping> mappings = dynamicSessionMappings.get(address);
        if (mappings == null) {
            mappings = new ArrayList<TemplateMapping>();
            dynamicSessionMappings.put(address, mappings);
        }
        return mappings;
    }

    private InetSocketAddress getAcceptorSocketAddress(SessionSettings settings, SessionID sessionID)
            throws ConfigError, FieldConvertError {
        String acceptorHost = "0.0.0.0";
        if (settings.isSetting(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS)) {
            acceptorHost = settings.getString(sessionID, SETTING_SOCKET_ACCEPT_ADDRESS);
        }
        int acceptorPort = (int) settings.getLong(sessionID, SETTING_SOCKET_ACCEPT_PORT);

        InetSocketAddress address = new InetSocketAddress(acceptorHost, acceptorPort);
        return address;
    }

    private boolean isSessionTemplate(SessionSettings settings, SessionID sessionID)
            throws ConfigError, FieldConvertError {
        return settings.isSetting(sessionID, SETTING_ACCEPTOR_TEMPLATE)
                && settings.getBool(sessionID, SETTING_ACCEPTOR_TEMPLATE);
    }

    private void start() throws RuntimeError, ConfigError {
        acceptor.start();
    }

    private void stop() {
        try {
            jmxExporter.getMBeanServer().unregisterMBean(connectorObjectName);
        } catch (Exception e) {
            log.error("Failed to unregister acceptor from JMX", e);
        }
        acceptor.stop();
    }

    public static void main(String args[]) throws Exception {
        try {
            InputStream inputStream = getSettingsInputStream(args);
            SessionSettings settings = new SessionSettings(inputStream);
            inputStream.close();

            Executor executor = new Executor(settings);
            executor.start();

            System.out.println("press <enter> to quit");
            System.in.read();

            executor.stop();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

    private static InputStream getSettingsInputStream(String[] args) throws FileNotFoundException {
        InputStream inputStream = null;
        if (args.length == 0) {
            inputStream = Executor.class.getResourceAsStream("executor.cfg");
        } else if (args.length == 1) {
            inputStream = new FileInputStream(args[0]);
        }
        if (inputStream == null) {
            System.out.println("usage: " + Executor.class.getName() + " [configFile].");
            System.exit(1);
        }
        return inputStream;
    }
}

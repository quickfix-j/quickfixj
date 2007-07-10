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

import java.io.FileInputStream;
import java.io.InputStream;

import org.quickfixj.jmx.JmxExporter;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public class Executor {

    private static SocketAcceptor acceptor = null;

    public static void main(String args[]) throws Exception {
        InputStream inputStream = null;
        if (args.length == 0) {
            inputStream = Executor.class.getResourceAsStream("executor.cfg");
        } else if (args.length == 1) {
            inputStream = new FileInputStream(args[0]);
        }
        if (inputStream == null) {
            System.out.println("usage: " + Executor.class.getName() + " [configFile].");
            return;
        }

        try {

            SessionSettings settings = new SessionSettings(inputStream);
            inputStream.close();
            Application application = new Application(settings);
            MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
            LogFactory logFactory = new ScreenLogFactory(true, true, true);
            MessageFactory messageFactory = new DefaultMessageFactory();

            acceptor = new SocketAcceptor(application, messageStoreFactory, settings, logFactory,
                    messageFactory);

            // Uncomment this section to support dynamic sessions
            // See the executor_dynamic.cfg file for the associated configuration
//            acceptor.setSessionProvider(new InetSocketAddress("0.0.0.0", 9876),
//                    new DynamicAcceptorSessionProvider(settings, new SessionID("FIX.4.0",
//                            "INITIATOR", "ACCEPTOR"), application, messageStoreFactory, logFactory,
//                            messageFactory));

            JmxExporter jmxExporter = new JmxExporter();
            jmxExporter.export(acceptor);

            acceptor.start();

            System.out.println("press <enter> to quit");
            System.in.read();
            acceptor.stop();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

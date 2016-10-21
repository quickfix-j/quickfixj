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

package quickfix.examples.ordermatch;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = null;
            if (args.length == 0) {
                inputStream = OrderMatcher.class.getResourceAsStream("ordermatch.cfg");
            } else if (args.length == 1) {
                inputStream = new FileInputStream(args[0]);
            }
            if (inputStream == null) {
                System.out.println("usage: " + OrderMatcher.class.getName() + " [configFile].");
                return;
            }
            SessionSettings settings = new SessionSettings(inputStream);

            Application application = new Application();
            FileStoreFactory storeFactory = new FileStoreFactory(settings);
            LogFactory logFactory = new ScreenLogFactory(settings);
            SocketAcceptor acceptor = new SocketAcceptor(application, storeFactory, settings,
                    logFactory, new DefaultMessageFactory());

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            acceptor.start();
            label:
            while (true) {
                System.out.println("type #quit to quit");
                String value = in.readLine();
                if (value != null) {
                    switch (value) {
                        case "#symbols":
                            application.orderMatcher().display();
                            break;
                        case "#quit":
                            break label;
                        default:
                            application.orderMatcher().display();
                            break;
                    }
                }
            }
            acceptor.stop();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

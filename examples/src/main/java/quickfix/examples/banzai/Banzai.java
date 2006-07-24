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

package quickfix.examples.banzai;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import quickfix.DefaultMessageFactory;
import quickfix.FileStoreFactory;
import quickfix.Initiator;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.ScreenLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.examples.banzai.ui.BanzaiFrame;

/**
 * Entry point for the Banzai application.
 */
public class Banzai {

    /** enable logging for this class */
    private static Logger log = LoggerFactory.getLogger(Banzai.class);
    private static Banzai banzai;
    private Initiator initiator = null;
    private JFrame frame = null;

    public Banzai(String[] args) throws Exception {
        InputStream inputStream = null; 
        if (args.length == 0) {
            inputStream = Banzai.class.getResourceAsStream("banzai.cfg");
        } else if (args.length == 1) {
            inputStream = new FileInputStream(args[0]);
        }
        if (inputStream == null) {
            System.out.println("usage: " + Banzai.class.getName() + " [configFile].");
            return;
        }
        SessionSettings settings = new SessionSettings(inputStream);

        OrderTableModel orderTableModel = new OrderTableModel();
        ExecutionTableModel executionTableModel = new ExecutionTableModel();
        BanzaiApplication application = new BanzaiApplication(orderTableModel, executionTableModel);
        MessageStoreFactory messageStoreFactory = new FileStoreFactory(settings);
        LogFactory logFactory = new ScreenLogFactory(true, true, true);
        MessageFactory messageFactory = new DefaultMessageFactory();

        initiator = new SocketInitiator(application, messageStoreFactory, settings, logFactory,
                messageFactory);

        frame = new BanzaiFrame(orderTableModel, executionTableModel, application);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void logon() {
        try {
            initiator.start();
        } catch (Exception e) {
            log.error("error starting initiator", e);
        }
    }

    public void logout() {
        initiator.stop();
    }

    public void stop() {
        synchronized (banzai) {
            banzai.notify();
        }
    }

    public JFrame getFrame() {
        return frame;
    }

    public static Banzai get() {
        return banzai;
    }

    public static void main(String args[]) throws Exception {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            log.info(e.getMessage(), e);
        }
        banzai = new Banzai(args);
        if (!System.getProperties().containsKey("openfix")) {
            banzai.logon();
        }
        synchronized (banzai) {
            banzai.wait();
        }
    }

}
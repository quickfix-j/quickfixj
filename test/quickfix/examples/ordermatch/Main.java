package quickfix.examples.ordermatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.RuntimeError;
import quickfix.ScreenLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("usage: java " + Main.class.getName() + " file");
            return;
        }

        try {
            FileInputStream settingsFile = new FileInputStream(args[0]);
            SessionSettings settings = new SessionSettings(settingsFile);

            Application application = new Application();
            FileStoreFactory storeFactory = new FileStoreFactory(settings);
            LogFactory logFactory = new ScreenLogFactory(settings);
            SocketAcceptor acceptor = new SocketAcceptor(application, storeFactory, settings,
                    logFactory, new DefaultMessageFactory());

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            acceptor.start();
            while (true) {
                System.out.println("press <enter> to quit");
                String value = in.readLine();
                if (value.equals("#symbols")) {
                    application.orderMatcher().display();
                } else if (value.equals("#quit")) {
                    break;
                } else {
                    application.orderMatcher().display();
                }
            }
            acceptor.stop();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
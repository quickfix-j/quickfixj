package quickfix.test;

import java.io.FileInputStream;

import junit.framework.TestCase;

import org.apache.log4j.Category;

import quickfix.DefaultMessageFactory;
import quickfix.Initiator;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.SessionSettings;
import quickfix.SocketInitiator;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.OrdType;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix42.NewOrderSingle;

public class OrderTest extends TestCase {
    private static Category category
        = Category.getInstance(OrderTest.class.getName());
    private Initiator initiator;
    private QuickFixThread quickFixThread;
    private ApplicationImpl application;
    private Process server;

    class QuickFixThread extends Thread {

        public void run() {
            try {
                initiator.start();
            } catch( Exception e ) {
            }
        }
    }

    public OrderTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        application = new ApplicationImpl();
        FileInputStream configuration =
            new FileInputStream("../quickfix_cvs/src/java/cfg/at_client.cfg");
        SessionSettings settings = new SessionSettings(configuration);
        MessageStoreFactory messageStoreFactory =
            new MemoryStoreFactory();
        MessageFactory messageFactory = new DefaultMessageFactory();

        initiator = new SocketInitiator
            (application, messageStoreFactory, settings, messageFactory);

        quickFixThread = new QuickFixThread();
        server = Runtime.getRuntime().exec
            ("../../bin/at -f cfg/at_server.cfg", null);
        quickFixThread.start();

        for(int i = 0;i < 50;++i) {
            if(application.isLoggedOn()) {
                break;
            }
            Thread.sleep(1000);
        }
        if(!application.isLoggedOn()) {
            throw new Exception();
        }
    }

    public void tearDown() throws Exception {
        application.stop();
        server.destroy();
        Thread.sleep(2000);
    }

    public void testOrderSend() throws Exception {
        SessionNotFound exception = null;
        NewOrderSingle order = new NewOrderSingle();
        try {
            Session.sendToTarget(order);
        }
        catch(SessionNotFound e) {
            exception = e;
        }
        assertNotNull("no exception thrown", exception);

        exception = null;
        SessionID sessionID = new SessionID
            ("FIX.4.2", "TW", "ISLD");
        order.set(new ClOrdID("12345"));
        order.set(new Symbol("LNUX"));
        order.set(new HandlInst('1'));
        order.set(new Side(Side.BUY));
        order.set(new OrdType(OrdType.MARKET));
        order.set(new TransactTime());
        try {
            assertTrue(Session.sendToTarget(order, sessionID));
            Message message = application.getMessage();
            assertNotNull("Message not received", message);
            assertTrue("Message not a NewOrderSingle",
                       message instanceof NewOrderSingle);
            assertTrue(Session.sendToTarget(order, sessionID));
        }
        catch(SessionNotFound e) {
            exception = e;
        }
        assertNull("exception thrown", exception);
    }
}

package quickfix.mina;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import quickfix.Application;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.MemoryStoreFactory;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;
import quickfix.UnsupportedMessageType;
import quickfix.field.Headline;
import quickfix.field.MsgType;
import quickfix.fix44.News;

/**
 * QFJ-790
 *
 * This test demonstrates a scenario where a Logout message
 * correctly delivered to the counter party over the network
 * doesn't get propagated to the application layer.
 * Important information, like logout reason, will not
 * be available to the application.
 * 
 * The source of this problem lies in inconsistent signalling 
 * between the mina thread and the processing thread (QFJ
 * Message Processor) which leads to random or incorrect
 * behaviour.
 * 
 * The best way to fix this issue would be to signal the
 * end of a TCP/IP stream to the QFJ Message Processor
 * through the message queue instead of polling the
 * session's responder field (Session.hasResponder())
 * inside the event handling strategy.
 * @author Andrzej Hajderek
 */
public class LostLogoutTest {
    private ServerApp server;
    private ClientApp client;
    volatile String logoutMessage = null;

    @Test
    public void lostLogoutMessageTest() throws Exception {
        // create server (acceptor)
        server = new ServerApp();

        // create client (initiator) and start the FIX session (log on)
        client = new ClientApp();

        // wait until until client is logged on
        client.waitUntilLoggedOn();

        // send application message from client to server
        client.sendMessage();
        // and wait some time to make sure the logout is sent
        // separately from the application message
        Thread.sleep(500);

        // send logout request from client to server and close the socket
        client.sendLogoutAndDisconnect();

        // give the server plenty of time to process the logout request 
        Thread.sleep(3000);

        // verify if the server received the logout message via the fromAdmin() call-back 
        System.out.println("EXPECTED LOGOUT MESSAGE FROM CLIENT: " + logoutMessage);
        try {
            assertNotNull("Logout message from client lost", logoutMessage);
        } finally {
            client.shutdown();
            server.shutdown();
        }
    }

    /*
     * The server app is a simple FIX 4.4 acceptor. 
     */
    private class ServerApp implements Application {
        private SocketAcceptor acceptor = null;

        private final SessionID sid = new SessionID("FIX.4.4", "SERVER", "CLIENT");
        public ServerApp() throws Exception {
            SessionSettings settings = new SessionSettings();
            settings.setString("ConnectionType", "acceptor");
            settings.setString("SocketAcceptAddress", "127.0.0.1");
            settings.setLong("SocketAcceptPort", 54321);
            settings.setString("StartTime", "00:00:00");
            settings.setString("EndTime", "00:00:00");
            settings.setString("UseDataDictionary", "N");
            settings.setString("BeginString", sid.getBeginString());
            settings.setString(sid, "SenderCompID", sid.getSenderCompID());
            settings.setString(sid, "TargetCompID", sid.getTargetCompID());

            acceptor = new SocketAcceptor(this, new MemoryStoreFactory(), settings,
                    new ScreenLogFactory(), new DefaultMessageFactory());
            acceptor.start();
            Thread.sleep(1000);
        }

        public void onCreate(SessionID sessionId) {
        }

        public void onLogon(SessionID sessionId) {
        }

        public void onLogout(SessionID sessionId) {
        }

        public void toAdmin(Message message, SessionID sessionId) {
        }

        /*
         * Save the logout message received from client.  
         */
        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            if (message.getHeader().getString(MsgType.FIELD).equals("5")) {
                logoutMessage = message.toString();
                System.out.println("Server: Logout message received: " + logoutMessage);
            }
        }

        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        }

        /*
         * Process the incoming application message.
         * Simulate a slow server, which needs 1000 ms to process each application message.
         */
        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            System.out.println("Server: Message received: " + message.toString());
            System.out.println("Server: message processing begin");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Server: message processing end");
        }

        /*
         * Shut down the server.
         */
        void shutdown() throws Exception {
            acceptor.stop(true);
        }
    }

    /*
     * The client app is a simple FIX 4.4 initiator.
     */
    private static class ClientApp implements Application {
        private SocketInitiator initiator = null;
        private Session session;

        public ClientApp() throws Exception {
            SessionID sid = new SessionID("FIX.4.4", "CLIENT", "SERVER");
            SessionSettings settings = new SessionSettings();
            settings.setString("ConnectionType", "initiator");
            settings.setString("SocketConnectHost", "127.0.0.1");
            settings.setLong("SocketConnectPort", 54321);
            settings.setString("StartTime", "00:00:00");
            settings.setString("EndTime", "00:00:00");
            settings.setLong("HeartBtInt", 30);
            settings.setString("UseDataDictionary", "N");
            settings.setString("BeginString", sid.getBeginString());
            settings.setString(sid, "SenderCompID", sid.getSenderCompID());
            settings.setString(sid, "TargetCompID", sid.getTargetCompID());

            initiator = new SocketInitiator(this, new MemoryStoreFactory(), settings,
                    new ScreenLogFactory(), new DefaultMessageFactory());
            initiator.start();
            session = Session.lookupSession(sid);
        }

        public void onCreate(SessionID sessionId) {
        }

        public void onLogon(SessionID sessionId) {
        }

        public void onLogout(SessionID sessionId) {
        }

        public void toAdmin(Message message, SessionID sessionId) {
        }

        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
        }

        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        }

        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        }

        /*
         * Wait until the client logon is complete.
         */
        void waitUntilLoggedOn() throws Exception {
            System.out.println("Client: waiting for logon response...");
            while (!session.isLoggedOn())
                Thread.sleep(10);
            System.out.println("Client: logon response received.");
        }

        /*
         * Send a single application message from client to server.
         */
        void sendMessage() throws Exception {
            Session.sendToTarget(new News(new Headline("App message")), session.getSessionID());
        }

        /*
         * Send Logout message from client to server and disconnect immediately.
         */
        void sendLogoutAndDisconnect() throws Exception {
            session.generateLogout();
            session.disconnect("Session closed by application", false);
        }

        /*
         * Shut down the client.
         */
        void shutdown() throws Exception {
            initiator.stop(true);
        }
    }
}

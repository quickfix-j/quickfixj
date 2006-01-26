package quickfix.test.acceptance;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;
import junit.framework.TestResult;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ConnectToServerStep implements TestStep {
    private Log log = LogFactory.getLog(getClass());
    private static final Pattern CONNECT_PATTERN = Pattern.compile("i(\\d+)*,?CONNECT");
    private String command;
    private int clientId = 0;

    public ConnectToServerStep(String data) {
        this.command = data;
    }

    public void run(TestResult result, TestContext context) {
        Matcher matcher = CONNECT_PATTERN.matcher(command);
        if (matcher.lookingAt()) {
            if (matcher.group(1) != null) {
                clientId = Integer.parseInt(matcher.group(1));
            } else {
                clientId = 1;
            }
        } else {
            Assert.fail("incorrect connect command: " + command);
        }
        log.debug("connecting to client " + clientId);
        long reconnectDelay = Long.getLong("at.reconnectDelay", 0).longValue();
        if (reconnectDelay > 0) {
            try {
                Thread.sleep(reconnectDelay);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        try {
            Socket socket = new Socket(InetAddress.getByName("localhost"), 9877);
            context.setClientSocket(clientId, socket);
            log.debug("connected: "+socket.getLocalSocketAddress());
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    public String toString() {
        return "connect to server: " + command;
    }
}

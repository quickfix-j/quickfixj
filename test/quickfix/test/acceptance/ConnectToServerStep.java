package quickfix.test.acceptance;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Assert;
import junit.framework.TestResult;

import org.apache.mina.common.TransportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectToServerStep implements TestStep {
    private Logger log = LoggerFactory.getLogger(getClass());
    private static final Pattern CONNECT_PATTERN = Pattern.compile("i(\\d+)*,?CONNECT");
    private String command;
    private int clientId = 0;
    private TransportType transportType = TransportType.SOCKET;
    private final int port;

    public ConnectToServerStep(String command, TransportType transportType, int port) {
        this.command = command;
        this.transportType = transportType;
        this.port = port;
    }
    
    public void run(TestResult result, TestConnection connection) {
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
        long reconnectDelay = Long.getLong("atest.reconnectDelay", 50L).longValue();
        if (reconnectDelay > 0) {
            try {
                Thread.sleep(reconnectDelay);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        try {
            connection.connect(clientId, transportType, port);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    public String toString() {
        return "connect to server: " + command;
    }
}

package quickfix.mina;

import java.net.InetSocketAddress;

import junit.framework.TestCase;

import org.apache.mina.protocol.ProtocolSession;
import org.easymock.MockControl;

public class ProtocolSessionResponderTest extends TestCase {
    public void testSend() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(ProtocolSession.class);
        ProtocolSession mockProtocolSession = (ProtocolSession) mockProtocolSessionControl
                .getMock();
        mockProtocolSession.write("abcd");

        ProtocolSessionResponder responder = new ProtocolSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        responder.send("abcd");

        mockProtocolSessionControl.verify();
    }

    public void testDisconnect() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(ProtocolSession.class);
        ProtocolSession mockProtocolSession = (ProtocolSession) mockProtocolSessionControl
                .getMock();
        mockProtocolSession.close();

        ProtocolSessionResponder responder = new ProtocolSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        responder.disconnect();

        mockProtocolSessionControl.verify();
    }

    public void testGetRemoteSocketAddress() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(ProtocolSession.class);
        ProtocolSession mockProtocolSession = (ProtocolSession) mockProtocolSessionControl
                .getMock();
        mockProtocolSessionControl.expectAndReturn(mockProtocolSession.getRemoteAddress(),
                new InetSocketAddress("1.2.3.4", 5432));

        ProtocolSessionResponder responder = new ProtocolSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        assertEquals("/1.2.3.4:5432", responder.getRemoteIPAddress());

        mockProtocolSessionControl.verify();
    }
}

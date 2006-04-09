package quickfix.mina;

import java.net.InetSocketAddress;

import junit.framework.TestCase;

import org.apache.mina.common.IoSession;
import org.easymock.MockControl;

public class IoSessionResponderTest extends TestCase {
    public void testSend() throws Exception {
        MockControl mockIoSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockIoSession = (IoSession) mockIoSessionControl.getMock();
        mockIoSession.write("abcd");
        mockIoSessionControl.setReturnValue(null);

        IoSessionResponder responder = new IoSessionResponder(mockIoSession);

        mockIoSessionControl.replay();

        responder.send("abcd");

        mockIoSessionControl.verify();
    }

    public void testDisconnect() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockProtocolSession = (IoSession) mockProtocolSessionControl.getMock();
        mockProtocolSession.close();
        mockProtocolSessionControl.setReturnValue(null);

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        responder.disconnect();

        mockProtocolSessionControl.verify();
    }

    public void testGetRemoteSocketAddress() throws Exception {
        MockControl mockProtocolSessionControl = MockControl.createControl(IoSession.class);
        IoSession mockProtocolSession = (IoSession) mockProtocolSessionControl.getMock();
        mockProtocolSessionControl.expectAndReturn(mockProtocolSession.getRemoteAddress(),
                new InetSocketAddress("1.2.3.4", 5432));

        IoSessionResponder responder = new IoSessionResponder(mockProtocolSession);

        mockProtocolSessionControl.replay();

        assertEquals("/1.2.3.4:5432", responder.getRemoteIPAddress());

        mockProtocolSessionControl.verify();
    }
}

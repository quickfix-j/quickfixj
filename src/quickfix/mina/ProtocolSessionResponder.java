/**
 * 
 */
package quickfix.mina;

import org.apache.mina.protocol.ProtocolSession;

import quickfix.Responder;

public class ProtocolSessionResponder implements Responder {
    private ProtocolSession protocolSession;

    public ProtocolSessionResponder(ProtocolSession session) {
        protocolSession = session;
    }

    public boolean send(String data) {
        protocolSession.write(data);
        return true;
    }

    public void disconnect() {
        protocolSession.close();
    }

    public String getRemoteIPAddress() {
        return protocolSession.getRemoteAddress().toString();
    }

}
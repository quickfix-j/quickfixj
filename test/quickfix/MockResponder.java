package quickfix;

public class MockResponder implements Responder {
    public String sendData;
    
    public boolean send(String data) {
        sendData = data;
        return true;
    }

    public boolean disconnectCalled;
    
    public void disconnect() {
        disconnectCalled = true;
    }

    public String getRemoteIPAddress() {
        return "1.2.3.4";
    }
}

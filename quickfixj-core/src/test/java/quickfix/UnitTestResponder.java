package quickfix;

import java.util.ArrayList;
import java.util.List;

public class UnitTestResponder extends Responder {
    List<String> sentMessages = new ArrayList<>();

    @Override
    public void send(String message) {
        sentMessages.add(message);
        super.send(message);
    }

    public List<String> getSentMessages() {
        return sentMessages;
    }
}
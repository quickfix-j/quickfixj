package quickfix.mina;

import quickfix.Message;
import quickfix.Session;

public interface EventHandlingStrategy {
    void onMessage(Session quickfixSession, Message message);
}

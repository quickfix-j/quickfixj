package quickfix.mina;

import java.util.Map;

import quickfix.LogUtil;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue;
import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentHashMap;
import edu.emory.mathcs.backport.java.util.concurrent.LinkedBlockingQueue;

public class ThreadPerSessionEventHandlingStrategy implements EventHandlingStrategy {
    private Map dispatchers = new ConcurrentHashMap();

    public void onMessage(Session quickfixSession, Message message) {
        MessageDispatchingThread dispatcher = (MessageDispatchingThread) dispatchers
                .get(quickfixSession.getSessionID());
        if (dispatcher == null) {
            dispatcher = new MessageDispatchingThread(quickfixSession);
            dispatchers.put(quickfixSession.getSessionID(), dispatcher);
            startDispatcherThread(dispatcher);
        }
        dispatcher.enqueue(message);
    }

    protected void startDispatcherThread(MessageDispatchingThread dispatcher) {
        dispatcher.start();
    }

    class MessageDispatchingThread extends Thread {
        private final Session quickfixSession;
        final BlockingQueue messages = new LinkedBlockingQueue();

        public MessageDispatchingThread(Session session) {
            super("QF/J Session dispatcher: " + session.getSessionID());
            quickfixSession = session;
        }

        public void enqueue(Message message) {
            try {
                messages.put(message);
            } catch (InterruptedException e) {
                quickfixSession.getLog().onEvent(e.getMessage());
            }
        }

        public void run() {
            while (true) {
                try {
                    Message message = getNextMessage(messages);
                    if (quickfixSession.getResponder() != null) {
                        quickfixSession.next(message);
                    }
                } catch (InterruptedException e) {
                    return;
                } catch (Throwable e) {
                    LogUtil.logThrowable(quickfixSession.getSessionID(),
                            "Error during message processing", e);
                }
            }
        }
    }

    BlockingQueue getMessages(SessionID sessionID) {
        MessageDispatchingThread dispatcher = getDispatcher(sessionID);
        return dispatcher.messages;
    }

    MessageDispatchingThread getDispatcher(SessionID sessionID) {
        return (MessageDispatchingThread) dispatchers.get(sessionID);
    }

    Message getNextMessage(BlockingQueue messages) throws InterruptedException {
        return (Message) messages.take();
    }
    

}

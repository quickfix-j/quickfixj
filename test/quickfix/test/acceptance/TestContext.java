package quickfix.test.acceptance;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestContext {
    private Log log = LogFactory.getLog(getClass());
    private HashMap clientSockets = new HashMap();
    private HashMap messageReaders = new HashMap();

    public OutputStream getClientOutputStream(int clientId) throws IOException {
        return getClientSocket(clientId).getOutputStream();
    }

    public Socket getClientSocket(int clientId) {
        return (Socket) clientSockets.get(new Integer(clientId));
    }

    public void setClientSocket(int clientId, Socket socket) {
        clientSockets.put(new Integer(clientId), socket);
        messageReaders.put(new Integer(clientId), new MessageReader(clientId, socket));
    }

    public void tearDown() {
        Iterator clientIdIter = clientSockets.keySet().iterator();
        while (clientIdIter.hasNext()) {
            Object clientId = clientIdIter.next();
            ((MessageReader) messageReaders.get(clientId)).interrupt();
            try {
                ((Socket) clientSockets.get(clientId)).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        messageReaders.clear();
        clientSockets.clear();
    }

    public CharSequence getNextMessage(int clientId, long timeout) throws InterruptedException {
        MessageReader reader = (MessageReader) messageReaders.get(new Integer(clientId));
        return reader.getNextMessage(timeout);
    }

    private class MessageReader extends Thread {
        private static final char EOF = (char) -1;
        private Socket socket;
        private ArrayList messages = new ArrayList();

        public MessageReader(int clientId, Socket socket) {
            super("FIX message reader: client " + clientId);
            this.socket = socket;
            start();
        }

        public void run() {
            for (;;) {
                try {
                    InputStream in = socket.getInputStream();
                    CharBuffer message = CharBuffer.allocate(1024);
                    char ch = nextCharacter(in, message);
                    int length = 0;
                    while (ch != '8') {
                        ch = nextCharacter(in, message);
                        if (ch == EOF) {
                            return;
                        }
                    }
                    if (nextCharacter(in, message) == '=' && nextCharacter(in, message) == 'F'
                            && nextCharacter(in, message) == 'I'
                            && nextCharacter(in, message) == 'X'
                            && nextCharacter(in, message) == '.'
                            && Character.isDigit(nextCharacter(in, message))
                            && nextCharacter(in, message) == '.'
                            && Character.isDigit(nextCharacter(in, message))
                            && nextCharacter(in, message) == '\001') {
                        if (nextCharacter(in, message) == '9' && nextCharacter(in, message) == '=') {
                            char digit = nextCharacter(in, message);
                            while (Character.isDigit(digit)) {
                                length = length * 10 + (digit - '0');
                                digit = nextCharacter(in, message);
                            }
                            if (digit != '\001') {
                                message.clear();
                            }
                            if (log.isTraceEnabled()) {
                                log.trace("readFully " + (length + 7) + " bytes");
                            }
                            readFully(in, message, length + 7);
                            synchronized (messages) {
                                if (log.isTraceEnabled()) {
                                    log.trace("message added to queue -- " + Thread.currentThread());
                                }
                                message.flip();
                                messages.add(message);
                                messages.notify();
                            }
                        }
                    }
                } catch (IOException e) {
                    return;
                }
            }

        }

        private char nextCharacter(InputStream in, CharBuffer message) throws IOException {
            int ch = in.read();
            if (ch == -1) {
                return (char) ch;
            }
            message.put((char) ch);
            return message.get(message.position() - 1);
        }

        private void readFully(InputStream in, CharBuffer message, int length) throws IOException {
            for (int i = 0; i < length; i++) {
                nextCharacter(in, message);
            }
        }

        public CharSequence getNextMessage(long timeout) throws InterruptedException {
            synchronized (messages) {
                if (messages.size() == 0) {
                    if (log.isTraceEnabled()) {
                        log.debug("client waiting for message");
                    }
                    messages.wait(timeout);
                }
                if (messages.size() == 0) {
                    if (log.isTraceEnabled()) {
                        log.debug("no client messages found");
                    }
                    return null;
                }
                if (log.isTraceEnabled()) {
                    log.debug("message removed from queue");
                }
                return (CharSequence) messages.remove(0);
            }
        }
    }

}
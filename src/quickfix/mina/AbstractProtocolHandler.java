package quickfix.mina;

import java.io.IOException;
import java.net.SocketAddress;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.protocol.ProtocolHandlerAdapter;
import org.apache.mina.protocol.ProtocolSession;
import org.apache.mina.protocol.ProtocolViolationException;

import quickfix.DataDictionary;
import quickfix.LogUtil;
import quickfix.Message;
import quickfix.MessageFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.mina.message.MessageUtils;

public abstract class AbstractProtocolHandler extends ProtocolHandlerAdapter {
    protected Log log = LogFactory.getLog(getClass());
    private final NetworkingOptions networkingOptions;
    
    public AbstractProtocolHandler(NetworkingOptions options) {
        networkingOptions = options;
    }

    public void exceptionCaught(ProtocolSession protocolSession, Throwable cause) throws Exception {
        boolean disconnectNeeded = false;
        Session quickFixSession = findQFSession(protocolSession);
        if (cause instanceof IOException) {
            SocketAddress remoteAddress = protocolSession.getRemoteAddress();
            String message = cause.getMessage();
            log.error("socket exception (" + remoteAddress + "): " + message);
            disconnectNeeded = true;
        } else if (cause instanceof CriticalSessionProtocolException) {
            disconnectNeeded = true;
        } else if (cause instanceof ProtocolViolationException) {
            String text = "protocol handler exception: " + cause.getMessage();
            if (quickFixSession != null) {
                quickFixSession.getLog().onEvent(text);
            } else {
                log.error(text);
            }
        } else {
            if (quickFixSession != null) {
                LogUtil.logThrowable(quickFixSession.getLog(), cause.getMessage(), cause);
            } else {
                log.error("protocol handler exception", cause);
            }
        }
        if (disconnectNeeded) {
            if (quickFixSession != null) {
                quickFixSession.disconnect();
            } else {
                protocolSession.close();
            }
        }
    }

    
    public void sessionCreated(ProtocolSession session) throws Exception {
        super.sessionCreated(session);
        networkingOptions.apply(session);
    }


    public void sessionClosed(ProtocolSession protocolSession) throws Exception {
        Session quickFixSession = findQFSession(protocolSession);
        if (quickFixSession != null) {
            protocolSession.removeAttribute(SessionConnector.QF_SESSION);
            if (quickFixSession.getResponder() != null) {
                quickFixSession.disconnect();
            }
        }
    }

    public void messageReceived(ProtocolSession protocolSession, Object message) throws Exception {
        String messageString = (String) message;
        SessionID remoteSessionID = MessageUtils.getRemoteSessionID(messageString);
        Session quickFixSession = findQFSession(protocolSession, remoteSessionID);
        if (quickFixSession != null) {
            quickFixSession.getLog().onIncoming(messageString);
            MessageFactory messageFactory = quickFixSession.getMessageFactory();
            DataDictionary dataDictionary = quickFixSession.getDataDictionary();
            Message fixMessage = MessageUtils.parse(messageFactory, dataDictionary, messageString);
            processMessage(protocolSession, fixMessage);
        } else {
            log.error("Disconnecting; received message for unknown session: " + messageString);
            protocolSession.close();
        }
    }

    private Session findQFSession(ProtocolSession protocolSession, SessionID sessionID) {
        Session quickfixSession = findQFSession(protocolSession);
        if (quickfixSession == null) {
            quickfixSession = Session.lookupSession(sessionID);
        }
        return quickfixSession;
    }

    private Session findQFSession(ProtocolSession protocolSession) {
        return (Session) protocolSession.getAttribute(SessionConnector.QF_SESSION);
    }

    protected abstract void processMessage(ProtocolSession protocolSession, Message message)
            throws Exception;

}

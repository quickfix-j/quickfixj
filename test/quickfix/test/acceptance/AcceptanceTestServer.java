package quickfix.test.acceptance;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import quickfix.Application;
import quickfix.DefaultMessageFactory;
import quickfix.DoNotSend;
import quickfix.Field;
import quickfix.FieldNotFound;
import quickfix.FileStoreFactory;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.LogFactory;
import quickfix.Message;
import quickfix.RejectLogon;
import quickfix.ScreenLogFactory;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.UnsupportedMessageType;
import quickfix.field.BeginString;
import quickfix.field.BusinessRejectReason;
import quickfix.field.ClOrdID;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.OrigSendingTime;
import quickfix.field.PossResend;
import quickfix.field.RefMsgType;
import quickfix.field.RefSeqNum;
import quickfix.field.SenderCompID;
import quickfix.field.TargetCompID;
import quickfix.field.Text;
import quickfix.field.TransactTime;

public class AcceptanceTestServer {
    public static void main(String[] args) {

        try {
            Logger.getRootLogger().setLevel(Level.DEBUG);
            SessionSettings settings = new SessionSettings(args[0]);
            
            FileStoreFactory storeFactory = new FileStoreFactory(settings);
            LogFactory logFactory = new ScreenLogFactory(settings);
            SocketAcceptor acceptor = new SocketAcceptor(new AcceptanceTestApplication(),
                    storeFactory, settings, logFactory, new DefaultMessageFactory());
            acceptor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class AcceptanceTestApplication implements Application {
        private DefaultMessageFactory messageFactory = new DefaultMessageFactory();

        public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, RejectLogon {
            // empty
        }

        private HashSet orderIds = new HashSet();

        public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
                IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
            String msgType = message.getHeader().getString(MsgType.FIELD);
            try {
                if (msgType.equals(MsgType.ORDER_SINGLE)) {
                    if (message.getHeader().isSetField(PossResend.FIELD)
                            && message.getHeader().getBoolean(PossResend.FIELD)
                            && orderIds.contains(message.getString(ClOrdID.FIELD))) {
                        return;
                    }
                    orderIds.add(message.getString(ClOrdID.FIELD));
                    message.setUtcTimeStamp(TransactTime.FIELD, new Date(), false);
                    message.getHeader().removeField(OrigSendingTime.FIELD);
                    Session.sendToTarget(message, sessionId);
                } else if (msgType.equals(MsgType.SECURITY_DEFINITION)) {
                    Message reply = createMessage(message, MsgType.SECURITY_DEFINITION);
                    copyBodyFields(message, reply);
                    reverseRoute(message, reply);
                    Session.sendToTarget(reply);
                } else {
                    Message reply = createMessage(message, MsgType.BUSINESS_MESSAGE_REJECT);
                    reverseRoute(message, reply);
                    reply.setString(RefSeqNum.FIELD, message.getHeader().getString(MsgSeqNum.FIELD));
                    reply.setString(RefMsgType.FIELD, message.getHeader().getString(MsgType.FIELD));
                    reply.setString(BusinessRejectReason.FIELD, "3");
                    reply.setString(Text.FIELD, "Unsupported Message Type");
                    Session.sendToTarget(reply);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private Message createMessage(Message message, String msgType) throws FieldNotFound {
            return messageFactory.create(message.getHeader().getString(BeginString.FIELD), msgType);
        }

        private void copyBodyFields(Message message, Message reply) throws FieldNotFound {
            Iterator i = message.iterator();
            while (i.hasNext()) {
                Field f = (Field) i.next();
                reply.setString(f.getTag(), message.getString(f.getTag()));
            }
        }

        private void reverseRoute(Message message, Message reply) throws FieldNotFound {
            reply.getHeader().setString(SenderCompID.FIELD,
                    message.getHeader().getString(TargetCompID.FIELD));
            reply.getHeader().setString(TargetCompID.FIELD,
                    message.getHeader().getString(SenderCompID.FIELD));
        }

        public void onCreate(SessionID sessionId) {
            Session session = Session.lookupSession(sessionId);
            try {
                session.setResetOnLogout(true);
                session.setResetOnDisconnect(true);
                session.getStore().reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onLogon(SessionID sessionId) {
            //          empty
        }

        public void onLogout(SessionID sessionId) {
            orderIds.clear();
        }

        public void toAdmin(Message message, SessionID sessionId) {
            // empty

        }

        public void toApp(Message message, SessionID sessionId) throws DoNotSend {
            // empty
        }
    }
}
package quickfix.examples.ordermatch;

import java.io.IOException;
import java.util.ArrayList;

import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFoundException;
import quickfix.UnsupportedMessageType;
import quickfix.field.*;
import quickfix.field.SenderCompID;
import quickfix.field.Symbol;
import quickfix.fix40.Logout;
import quickfix.fix42.ExecutionReport;
import quickfix.fix42.MarketDataRequest;
import quickfix.fix42.NewOrderSingle;
import quickfix.fix42.OrderCancelRequest;

public class Application extends MessageCracker implements quickfix.Application {
    private OrderMatcher orderMatcher = new OrderMatcher();
    private IdGenerator generator = new IdGenerator();

    public void fromAdmin(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
    }

    public void fromApp(Message message, SessionID sessionId) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        crack(message, sessionId);
    }

    public void onMessage(NewOrderSingle message, SessionID sessionID) throws FieldNotFound,
            UnsupportedMessageType, IncorrectTagValue {
        String senderCompId = message.getHeader().getString(SenderCompID.FIELD);
        String targetCompId = message.getHeader().getString(TargetCompID.FIELD);
        String clOrdId = message.getString(ClOrdID.FIELD);
        String symbol = message.getString(Symbol.FIELD);
        char side = message.getChar(Side.FIELD);
        char ordType = message.getChar(OrdType.FIELD);

        double price = 0;
        if (ordType == OrdType.LIMIT) {
            price = message.getDouble(Price.FIELD);
        }

        double qty = message.getDouble(OrderQty.FIELD);
        char timeInForce = TimeInForce.DAY;
        if (message.isSetField(TimeInForce.FIELD)) {
            timeInForce = message.getChar(TimeInForce.FIELD);
        }

        try {
            if (timeInForce != TimeInForce.DAY) {
                throw new RuntimeException("Unsupported TIF, use Day");
            }

            Order order = new Order(clOrdId, symbol, senderCompId, targetCompId, side, ordType,
                    price, (int) qty);

            processOrder(order);
        } catch (Exception e) {
            rejectOrder(senderCompId, targetCompId, clOrdId, symbol, side, e.getMessage());
        }
    }

    private void rejectOrder(String senderCompId, String targetCompId, String clOrdId,
            String symbol, char side, String message) {

        ExecutionReport fixOrder = new ExecutionReport(new OrderID(clOrdId), new ExecID(generator
                .genExecutionID()), new ExecTransType(ExecTransType.NEW), new ExecType(
                ExecType.REJECTED), new OrdStatus(ExecType.REJECTED), new Symbol(symbol), new Side(
                side), new LeavesQty(0), new CumQty(0), new AvgPx(0));

        fixOrder.setString(ClOrdID.FIELD, clOrdId);
        fixOrder.setString(Text.FIELD, message);

        try {
            Session.sendToTarget(fixOrder, senderCompId, targetCompId);
        } catch (SessionNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void processOrder(Order order) {
        if (orderMatcher.insert(order)) {
            acceptOrder(order);

            ArrayList orders = new ArrayList();
            orderMatcher.match(order.getSymbol(), orders);

            while (orders.size() > 0) {
                fillOrder((Order) orders.remove(0));
            }
            orderMatcher.display(order.getSymbol());
        } else {
            rejectOrder(order);
        }
    }

    private void rejectOrder(Order order) {
        updateOrder(order, OrdStatus.REJECTED);
    }

    private void acceptOrder(Order order) {
        updateOrder(order, OrdStatus.FILLED);
    }

    private void cancelOrder(Order order) {
        updateOrder(order, OrdStatus.CANCELED);
    }

    private void updateOrder(Order order, char status) {
        String targetCompId = order.getOwner();
        String senderCompId = order.getTarget();

        ExecutionReport fixOrder = new ExecutionReport(new OrderID(order.getClientOrderId()),
                new ExecID(generator.genExecutionID()), new ExecTransType(ExecTransType.NEW),
                new ExecType(status), new OrdStatus(status), new Symbol(order.getSymbol()),
                new Side(order.getSide()), new LeavesQty(order.getOpenQuantity()), new CumQty(order
                        .getExecutedQuantity()), new AvgPx(order.getAvgExecutedPrice()));

        fixOrder.setString(ClOrdID.FIELD, order.getClientOrderId());
        fixOrder.setDouble(OrderQty.FIELD, order.getQuantity());

        if (status == OrdStatus.FILLED || status == OrdStatus.PARTIALLY_FILLED) {
            fixOrder.setDouble(LastShares.FIELD, order.getLastExecutedQuantity());
            fixOrder.setDouble(LastPx.FIELD, order.getPrice());
        }

        try {
            Session.sendToTarget(fixOrder, senderCompId, targetCompId);
        } catch (SessionNotFoundException e) {
        }
    }

    private void fillOrder(Order order) {
        updateOrder(order, order.isFilled() ? OrdStatus.FILLED : OrdStatus.PARTIALLY_FILLED);
    }

    public void onMessage(OrderCancelRequest message, SessionID sessionID) throws FieldNotFound,
            UnsupportedMessageType, IncorrectTagValue {
        String symbol = message.getString(Symbol.FIELD);
        char side = message.getChar(Side.FIELD);
        String id = message.getString(OrigClOrdID.FIELD);
        Order order = orderMatcher.find(symbol, side, id);
        order.cancel();
        cancelOrder(order);
        orderMatcher.erase(order);
    }

    public void onMessage(MarketDataRequest message, SessionID sessionID) throws FieldNotFound,
            UnsupportedMessageType, IncorrectTagValue {
        MarketDataRequest.NoRelatedSym noRelatedSyms = new MarketDataRequest.NoRelatedSym();

        String mdReqId = message.getString(MDReqID.FIELD);
        char subscriptionRequestType = message.getChar(SubscriptionRequestType.FIELD);

        if (subscriptionRequestType != SubscriptionRequestType.SNAPSHOT)
            throw new IncorrectTagValue(SubscriptionRequestType.FIELD);
        int marketDepth = message.getInt(MarketDepth.FIELD);
        int relatedSymbolCount = message.getInt(NoRelatedSym.FIELD);

        for (int i = 1; i <= relatedSymbolCount; ++i) {
            message.getGroup(i, noRelatedSyms);
            String symbol = noRelatedSyms.getString(Symbol.FIELD);
            System.err.println("*** market data: " + symbol);
        }
    }

    public void onCreate(SessionID sessionId) {
    }

    public void onLogon(SessionID sessionId) {
        System.out.println("Logon - " + sessionId);
    }

    public void onLogout(SessionID sessionId) {
        System.out.println("Logout - " + sessionId);
    }

    public void toAdmin(Message message, SessionID sessionId) {
        // empty
    }

    public void toApp(Message message, SessionID sessionId) throws DoNotSend {
        // empty
    }

    public OrderMatcher orderMatcher() {
        return orderMatcher;
    }
}
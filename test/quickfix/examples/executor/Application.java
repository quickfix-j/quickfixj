/****************************************************************************
** Copyright (c) 2001-2005 quickfixengine.org  All rights reserved.
**
** This file is part of the QuickFIX FIX Engine
**
** This file may be distributed under the terms of the quickfixengine.org
** license as defined by quickfixengine.org and appearing in the file
** LICENSE included in the packaging of this file.
**
** This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
** WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
**
** See http://www.quickfixengine.org/LICENSE for licensing information.
**
** Contact ask@quickfixengine.org if any conditions of this licensing are
** not clear to you.
**
****************************************************************************/

package quickfix.examples.executor;

import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFoundException;
import quickfix.UnsupportedMessageType;
import quickfix.field.AvgPx;
import quickfix.field.ClOrdID;
import quickfix.field.CumQty;
import quickfix.field.ExecID;
import quickfix.field.ExecTransType;
import quickfix.field.ExecType;
import quickfix.field.LastPx;
import quickfix.field.LastQty;
import quickfix.field.LastShares;
import quickfix.field.LeavesQty;
import quickfix.field.OrdStatus;
import quickfix.field.OrdType;
import quickfix.field.OrderID;
import quickfix.field.OrderQty;
import quickfix.field.Price;
import quickfix.field.Side;
import quickfix.field.Symbol;

public class Application extends quickfix.MessageCracker implements quickfix.Application {

    public Application() {
    }

    public void onCreate(SessionID sessionID) {
    }

    public void onLogon(SessionID sessionID) {
    }

    public void onLogout(SessionID sessionID) {
    }

    public void toAdmin(quickfix.Message message, SessionID sessionID) {
    }

    public void toApp(quickfix.Message message, SessionID sessionID) throws DoNotSend {
    }

    public void fromAdmin(quickfix.Message message, SessionID sessionID) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, RejectLogon {
    }

    public void fromApp(quickfix.Message message, SessionID sessionID) throws FieldNotFound,
            IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
        crack(message, sessionID);
    }

    public void onMessage(quickfix.fix40.NewOrderSingle order, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        Symbol symbol = new Symbol();
        Side side = new Side();
        OrdType ordType = new OrdType();
        OrderQty orderQty = new OrderQty();
        Price price = new Price();
        ClOrdID clOrdID = new ClOrdID();

        order.get(ordType);

        if (ordType.getValue() != OrdType.LIMIT)
            throw new IncorrectTagValue(ordType.getField());

        order.get(symbol);
        order.get(side);
        order.get(orderQty);
        order.get(price);
        order.get(clOrdID);

        quickfix.fix40.ExecutionReport executionReport = new quickfix.fix40.ExecutionReport(
                genOrderID(), genExecID(), new ExecTransType(ExecTransType.NEW), new OrdStatus(
                        OrdStatus.FILLED), symbol, side, orderQty, new LastShares(orderQty
                        .getValue()), new LastPx(price.getValue()),
                new CumQty(orderQty.getValue()), new AvgPx(price.getValue()));

        executionReport.set(clOrdID);

        try {
            Session.sendToTarget(executionReport, sessionID);
        } catch (SessionNotFoundException e) {
        }
    }

    public void onMessage(quickfix.fix41.NewOrderSingle order, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        Symbol symbol = new Symbol();
        Side side = new Side();
        OrdType ordType = new OrdType();
        OrderQty orderQty = new OrderQty();
        Price price = new Price();
        ClOrdID clOrdID = new ClOrdID();

        order.get(ordType);

        if (ordType.getValue() != OrdType.LIMIT)
            throw new IncorrectTagValue(ordType.getField());

        order.get(symbol);
        order.get(side);
        order.get(orderQty);
        order.get(price);
        order.get(clOrdID);

        quickfix.fix41.ExecutionReport executionReport = new quickfix.fix41.ExecutionReport(
                genOrderID(), genExecID(), new ExecTransType(ExecTransType.NEW), new ExecType(
                        ExecType.FILL), new OrdStatus(OrdStatus.FILLED), symbol, side, orderQty,
                new LastShares(orderQty.getValue()), new LastPx(price.getValue()),
                new LeavesQty(0), new CumQty(orderQty.getValue()), new AvgPx(price.getValue()));

        executionReport.set(clOrdID);

        try {
            Session.sendToTarget(executionReport, sessionID);
        } catch (SessionNotFoundException e) {
        }
    }

    public void onMessage(quickfix.fix42.NewOrderSingle order, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        Symbol symbol = new Symbol();
        Side side = new Side();
        OrdType ordType = new OrdType();
        OrderQty orderQty = new OrderQty();
        Price price = new Price();
        ClOrdID clOrdID = new ClOrdID();

        order.get(ordType);

        if (ordType.getValue() != OrdType.LIMIT)
            throw new IncorrectTagValue(ordType.getField());

        order.get(symbol);
        order.get(side);
        order.get(orderQty);
        order.get(price);
        order.get(clOrdID);

        quickfix.fix42.ExecutionReport executionReport = new quickfix.fix42.ExecutionReport(
                genOrderID(), genExecID(), new ExecTransType(ExecTransType.NEW), new ExecType(
                        ExecType.FILL), new OrdStatus(OrdStatus.FILLED), symbol, side,
                new LeavesQty(0), new CumQty(orderQty.getValue()), new AvgPx(price.getValue()));

        executionReport.set(clOrdID);
        executionReport.set(orderQty);
        executionReport.set(new LastShares(orderQty.getValue()));
        executionReport.set(new LastPx(price.getValue()));

        try {
            Session.sendToTarget(executionReport, sessionID);
        } catch (SessionNotFoundException e) {
        }
    }

    public void onMessage(quickfix.fix43.NewOrderSingle order, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        Symbol symbol = new Symbol();
        Side side = new Side();
        OrdType ordType = new OrdType();
        OrderQty orderQty = new OrderQty();
        Price price = new Price();
        ClOrdID clOrdID = new ClOrdID();

        order.get(ordType);

        if (ordType.getValue() != OrdType.LIMIT)
            throw new IncorrectTagValue(ordType.getField());

        order.get(symbol);
        order.get(side);
        order.get(orderQty);
        order.get(price);
        order.get(clOrdID);

        quickfix.fix43.ExecutionReport executionReport = new quickfix.fix43.ExecutionReport(
                genOrderID(), genExecID(), new ExecType(ExecType.FILL), new OrdStatus(
                        OrdStatus.FILLED), side, new LeavesQty(0), new CumQty(orderQty.getValue()),
                new AvgPx(price.getValue()));

        executionReport.set(clOrdID);
        executionReport.set(symbol);
        executionReport.set(orderQty);
        executionReport.set(new LastQty(orderQty.getValue()));
        executionReport.set(new LastPx(price.getValue()));

        try {
            Session.sendToTarget(executionReport, sessionID);
        } catch (SessionNotFoundException e) {
        }
    }

    public void onMessage(quickfix.fix44.NewOrderSingle order, SessionID sessionID)
            throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
        Symbol symbol = new Symbol();
        Side side = new Side();
        OrdType ordType = new OrdType();
        OrderQty orderQty = new OrderQty();
        Price price = new Price();
        ClOrdID clOrdID = new ClOrdID();

        order.get(ordType);

        if (ordType.getValue() != OrdType.LIMIT)
            throw new IncorrectTagValue(ordType.getField());

        order.get(symbol);
        order.get(side);
        order.get(orderQty);
        order.get(price);
        order.get(clOrdID);

        quickfix.fix44.ExecutionReport executionReport = new quickfix.fix44.ExecutionReport(
                genOrderID(), genExecID(), new ExecType(ExecType.FILL), new OrdStatus(
                        OrdStatus.FILLED), side, new LeavesQty(0), new CumQty(orderQty.getValue()),
                new AvgPx(price.getValue()));

        executionReport.set(clOrdID);
        executionReport.set(symbol);
        executionReport.set(orderQty);
        executionReport.set(new LastQty(orderQty.getValue()));
        executionReport.set(new LastPx(price.getValue()));

        try {
            Session.sendToTarget(executionReport, sessionID);
        } catch (SessionNotFoundException e) {
        }
    }

    public OrderID genOrderID() {
        return new OrderID(new Integer(++m_orderID).toString());
    }

    public ExecID genExecID() {
        return new ExecID(new Integer(++m_execID).toString());
    }

    private int m_orderID = 0;
    private int m_execID = 0;
}
package quickfix.examples.ordermatch;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import quickfix.field.OrdType;
import quickfix.field.Side;

public class Market {

    private List bidOrders = new ArrayList();
    private List askOrders = new ArrayList();

    public boolean match(String symbol, List orders) {
        while (true) {
            if (bidOrders.size() == 0 || askOrders.size() == 0) {
                return orders.size() != 0;
            }
            Order bidOrder = (Order) bidOrders.get(0);
            Order askOrder = (Order) askOrders.get(0);
            if (bidOrder.getType() == OrdType.MARKET || askOrder.getType() == OrdType.MARKET
                    || (bidOrder.getPrice() >= askOrder.getPrice())) {
                match(bidOrder, askOrder);
                if (!orders.contains(bidOrder)) {
                    orders.add(0, bidOrder);
                }
                if (!orders.contains(askOrder)) {
                    orders.add(0, askOrder);
                }

                if (bidOrder.isClosed()) {
                    bidOrders.remove(bidOrder);
                }
                if (askOrder.isClosed()) {
                    askOrders.remove(askOrder);
                }
            } else
                return orders.size() != 0;
        }
    }

    private void match(Order bid, Order ask) {
        double price = ask.getType() == OrdType.LIMIT ? ask.getPrice() : bid.getPrice();
        long quantity = 0;

        if (bid.getOpenQuantity() >= ask.getOpenQuantity())
            quantity = ask.getOpenQuantity();
        else
            quantity = bid.getOpenQuantity();

        bid.execute(price, quantity);
        ask.execute(price, quantity);
    }

    public boolean insert(Order order) {
        boolean inserted = false;
        if (order.getSide() == Side.BUY) {
            inserted = insert(order, true, bidOrders);
        } else {
            inserted = insert(order, false, askOrders);
        }
        return inserted;
    }

    private boolean insert(Order order, boolean descending, List orders) {
        if (orders.size() == 0) {
            orders.add(order);
        } else if (order.getType() == OrdType.MARKET) {
            orders.add(0, order);
        } else {
            for (int i = 0; i < orders.size(); i++) {
                Order o = (Order) orders.get(i);
                if ((descending ? order.getPrice() > o.getPrice() : order.getPrice() < o.getPrice())
                        && order.getEntryTime() < o.getEntryTime()) {
                    orders.add(i, order);
                }
            }
            orders.add(order);
        }
        return true;
    }

    public void erase(Order order) {
        if (order.getSide() == Side.BUY) {
            bidOrders.remove(find(bidOrders, order.getClientOrderId()));
        } else {
            askOrders.remove(find(askOrders, order.getClientOrderId()));
        }
    }

    public Order find(String symbol, char side, String id) {
        Order order = null;
        if (side == Side.BUY) {
            order = find(bidOrders, id);
        } else {
            order = find(askOrders, id);
        }
        return order;
    }

    private Order find(List orders, String clientOrderId) {
        for (int i = 0; i < orders.size(); i++) {
            Order o = (Order) orders.get(i);
            if (o.getClientOrderId().equals(clientOrderId)) {
                return o;
            }
        }
        return null;
    }

    public void display() {
        displaySide(bidOrders, "BIDS");
        displaySide(askOrders, "ASKS");
    }

    private void displaySide(List orders, String title) {
        DecimalFormat priceFormat = new DecimalFormat("#.00");
        DecimalFormat qtyFormat = new DecimalFormat("######");
        System.out.println(title + ":\n----");
        for (int i = 0; i < orders.size(); i++) {
            Order order = (Order) orders.get(i);
            System.out.println("  $" + priceFormat.format(order.getPrice()) + " "
                    + qtyFormat.format(order.getOpenQuantity()) + " " + order.getOwner() + " "
                    + new Date(order.getEntryTime()));
        }
    }
}
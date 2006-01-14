package quickfix.examples.ordermatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OrderMatcher {
    private HashMap markets = new HashMap();

    private Market getMarket(String symbol) {
        Market m = (Market) markets.get(symbol);
        if (m == null) {
            m = new Market();
            markets.put(symbol, m);
        }
        return m;
    }

    public boolean insert(Order order) {
        return getMarket(order.getSymbol()).insert(order);
    }

    public void match(String symbol, ArrayList orders) {
        getMarket(symbol).match(symbol, orders);
    }

    public Order find(String symbol, char side, String id) {
        return getMarket(symbol).find(symbol, side, id);
    }

    public void erase(Order order) {
        getMarket(order.getSymbol()).erase(order);
    }

    public void display() {
        for (Iterator iter = markets.keySet().iterator(); iter.hasNext();) {
            String symbol = (String) iter.next();
            System.out.println("MARKET: " + symbol);
            display(symbol);
        }
    }

    public void display(String symbol) {
        getMarket(symbol).display();
    }

}
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.examples.ordermatch;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMatcher {
    private final HashMap<String, Market> markets = new HashMap<>();

    private Market getMarket(String symbol) {
        return markets.computeIfAbsent(symbol, k -> new Market());
    }

    public boolean insert(Order order) {
        return getMarket(order.getSymbol()).insert(order);
    }

    public void match(String symbol, ArrayList<Order> orders) {
        getMarket(symbol).match(symbol, orders);
    }

    public Order find(String symbol, char side, String id) {
        return getMarket(symbol).find(symbol, side, id);
    }

    public void erase(Order order) {
        getMarket(order.getSymbol()).erase(order);
    }

    public void display() {
        for (String symbol : markets.keySet()) {
            System.out.println("MARKET: " + symbol);
            display(symbol);
        }
    }

    public void display(String symbol) {
        getMarket(symbol).display();
    }

}

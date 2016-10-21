/*******************************************************************************
 * Copyright (c) quickfixj.org  All rights reserved.
 *
 * This file is part of the QuickFIX/J FIX Engine
 *
 * This file may be distributed under the terms of the quickfixj.org
 * license as defined by quickfixj.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixj.org/LICENSE for licensing information.
 *
 ******************************************************************************/

package org.quickfixj.jmx.openmbean;

import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeDataSupport;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import java.util.ArrayList;

public class CompositeDataFactory {
    private final CompositeType compositeType;
    private final ArrayList<String> itemNames = new ArrayList<>();
    private final ArrayList<Object> itemValues = new ArrayList<>();

    public CompositeDataFactory(CompositeType compositeType) {
        this.compositeType = compositeType;
    }

    public void setValue(String itemName, Object itemValue) {
        itemNames.add(itemName);
        itemValues.add(itemValue);
    }

    public void setValue(String itemName, double itemValue) {
        itemNames.add(itemName);
        itemValues.add(itemValue);
    }

    public void setValue(String itemName, boolean itemValue) {
        itemNames.add(itemName);
        itemValues.add(itemValue);
    }

    public CompositeData createCompositeData() throws OpenDataException {
        return new CompositeDataSupport(compositeType, itemNames
                .toArray(new String[itemNames.size()]), itemValues.toArray());
    }

    public void clear() {
        itemNames.clear();
        itemValues.clear();
    }
}

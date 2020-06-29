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

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenType;
import java.util.ArrayList;
import java.util.List;

public class CompositeTypeFactory {

    private final String name;
    private final String description;
    private final List<String> itemNames = new ArrayList<>();
    private final List<String> itemDescriptions = new ArrayList<>();
    private final List<OpenType<?>> itemTypes = new ArrayList<>();

    public CompositeTypeFactory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void defineItem(String itemName, OpenType<?> itemType) {
        defineItem(itemName, itemName, itemType);
    }

    public void defineItem(String itemName, String itemDesc, OpenType<?> itemType) {
        itemNames.add(itemName);
        itemDescriptions.add(itemDesc);
        itemTypes.add(itemType);
    }

    public CompositeType createCompositeType() throws OpenDataException {
        return new CompositeType(name, description, itemNames
                .toArray(new String[itemNames.size()]), itemDescriptions
                .toArray(new String[itemDescriptions.size()]), itemTypes
                .toArray(new OpenType[itemTypes.size()]));
    }
}

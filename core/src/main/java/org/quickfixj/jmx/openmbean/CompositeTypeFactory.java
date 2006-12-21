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

import java.util.ArrayList;

import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenDataException;
import javax.management.openmbean.OpenType;

public class CompositeTypeFactory {
    private String name;
    private String description;
    private ArrayList itemNames = new ArrayList();
    private ArrayList itemDescriptions = new ArrayList();
    private ArrayList itemTypes = new ArrayList();

    public CompositeTypeFactory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void defineItem(String itemName, OpenType itemType) {
        defineItem(itemName, null, itemType);
    }

    public void defineItem(String itemName, String itemDesc, OpenType itemType) {
        itemNames.add(itemName);
        itemDescriptions.add(itemDesc);
        itemTypes.add(itemType);
    }

    public CompositeType createCompositeType() throws OpenDataException {
        return new CompositeType(name, description, (String[]) itemNames
                .toArray(new String[itemNames.size()]), (String[]) itemNames
                .toArray(new String[itemDescriptions.size()]), (OpenType[]) itemTypes
                .toArray(new OpenType[itemTypes.size()]));
    }

}

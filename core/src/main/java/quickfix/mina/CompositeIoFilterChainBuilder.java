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

package quickfix.mina;

import org.apache.mina.common.DefaultIoFilterChainBuilder;
import org.apache.mina.common.IoFilterChain;
import org.apache.mina.common.IoFilterChainBuilder;

/**
 * (For internal usage only.) This is the filter that initializes the FIX 
 * coder/decoder factory and delegate additional filter customizations to
 * an optional user-defined IoFilterChainBuilder.
 * 
 * @see IoFilterChainBuilder
 * @see DefaultIoFilterChainBuilder
 *
 */
public class CompositeIoFilterChainBuilder extends DefaultIoFilterChainBuilder {
    private final IoFilterChainBuilder userFilterChainBuilder;

    public CompositeIoFilterChainBuilder(IoFilterChainBuilder userFilterChainBuilder) {
        this.userFilterChainBuilder = userFilterChainBuilder;
    }

    public void buildFilterChain(IoFilterChain chain) throws Exception {
        super.buildFilterChain(chain);
        if (userFilterChainBuilder != null) {
            userFilterChainBuilder.buildFilterChain(chain);
        }
    }
}
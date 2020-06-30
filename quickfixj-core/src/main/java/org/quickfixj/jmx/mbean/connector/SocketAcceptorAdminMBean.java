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

package org.quickfixj.jmx.mbean.connector;

import java.io.IOException;

import javax.management.openmbean.TabularData;

/**
 * Management interface for a socket acceptor connector.
 */
public interface SocketAcceptorAdminMBean extends ConnectorAdminMBean {

    /**
     * @return the acceptor addresses configured for this connector's sessions.
     */
    TabularData getAcceptorAddresses() throws IOException;

}

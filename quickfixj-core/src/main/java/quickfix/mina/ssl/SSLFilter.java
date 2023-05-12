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

package quickfix.mina.ssl;

import org.apache.mina.filter.ssl.SslFilter;

import javax.net.ssl.SSLContext;

/**
 * An extended SSL filter based on MINA {@link SslFilter} that applies
 * some adaptations.
 */
public class SSLFilter extends SslFilter {

    public SSLFilter(SSLContext sslContext) {
        super(sslContext);
    }
}

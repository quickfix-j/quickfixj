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

import javax.net.ssl.SSLContext;

import org.apache.mina.filter.ssl.SslFilter;

/**
 * An extended SSL filter based on MINA {@link SslFilter} that disables setting
 * enabled cipher suites via default method.
 */
public class SSLFilter extends SslFilter {

    public SSLFilter(SSLContext sslContext, boolean autoStart) {
        super(sslContext, autoStart);
    }

    public SSLFilter(SSLContext sslContext) {
        super(sslContext);
    }

    /**
     * This method is called from {@link SslFilter#onPreAdd} every time new
     * session is created which makes impossible to override enabled cipher
     * suites configuration.
     */
    @Override
    public void setEnabledCipherSuites(String[] cipherSuites) {
    }

    public void setCipherSuites(String[] cipherSuites) {
        super.setEnabledCipherSuites(cipherSuites);
    }
}

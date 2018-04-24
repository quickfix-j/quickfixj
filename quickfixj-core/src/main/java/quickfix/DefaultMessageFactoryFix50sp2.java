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

package quickfix;


import quickfix.field.ApplVerID;

/**
 * The default factory for creating FIX message instances.
 * This is a cut and paste from quickfixj.DefaultMessageFactory.
 * DefaultMessageFactory is not designed for extension
 */
public class DefaultMessageFactoryFix50sp2 extends DefaultMessageFactory {

    /**
     * Constructs a DefaultMessageFactory, which dynamically loads and delegates to
     * the default version-specific message factories, if they are available at runtime.
     * <p>
     * Callers can set the {@link Thread#setContextClassLoader context classloader},
     * which will be used to load the classes if {@link Class#forName Class.forName}
     * fails to do so (e.g. in an OSGi environment).
     */
    public DefaultMessageFactoryFix50sp2() {
    	super(ApplVerID.FIX50SP2);
    }

}

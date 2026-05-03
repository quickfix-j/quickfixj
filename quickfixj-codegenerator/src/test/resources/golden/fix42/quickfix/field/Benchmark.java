/* Generated Java Source File */
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

package quickfix.field;

import quickfix.CharField;

public class Benchmark extends CharField {

    static final long serialVersionUID = 20050617;

    public static final int FIELD = 219;
    public static final char CURVE = '1';
    public static final char FIVEYR = '2';
    public static final char OLD5 = '3';
    public static final char TENYR = '4';
    public static final char OLD10 = '5';
    public static final char THIRTYYR = '6';
    public static final char OLD30 = '7';
    public static final char THREEMOLIBOR = '8';
    public static final char SIXMOLIBOR = '9';
    
    public Benchmark() {
        super(219);
    }

    public Benchmark(char data) {
        super(219, data);
    }
}
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

package quickfix.test.acceptance;

import junit.framework.TestResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintComment implements TestStep {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final String line;

    public PrintComment(String line) {
        this.line = line;
    }

    public void run(TestResult result, TestConnection connection) throws Exception {
        log.info(line);
    }

}

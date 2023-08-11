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

/**
 * Applications can throw this exception to abort the fulfillment of an
 * incoming ResendRequest.
 *
 * Example use case: the counterparty sends an excessive number of
 * ResendRequests in error, and we want to prevent quickfix from fulfilling
 * them, spiking cpu and disk I/O, overwhelming the server.  Further action,
 * such as sending Rejects to alert the counterparty to the problem, are left
 * up to Applications.
 */
public class DoNotFulfillResendRequest extends Exception {
    private final static String defaultMsg = "Fulfillment of ResendRequest aborted by Application";

    public DoNotFulfillResendRequest() {
        super(defaultMsg);
    }

    public DoNotFulfillResendRequest(String msg) {
        super(defaultMsg + ": " + msg);
    }
}

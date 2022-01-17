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

import java.util.Calendar;

/**
 * Used to decide when to login and out of FIX sessions
 */
public interface SessionSchedule {

    /**
     * Predicate for determining if the two times are in the same session
     * @param time1 test time 1
     * @param time2 test time 2
     * @return return true if in the same session
     */
    boolean isSameSession(Calendar time1, Calendar time2);

    boolean isNonStopSession();

    /**
     * Predicate for determining if the session should be active at the current time.
     *
     * @return true if session should be active, false otherwise.
     */
    boolean isSessionTime();

}

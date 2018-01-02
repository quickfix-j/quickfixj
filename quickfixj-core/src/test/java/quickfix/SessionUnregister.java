package quickfix;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests make use of sessions that exist from previous tests, stored statically
 * on the Session class. This class provides an API through which a test can
 * unregister sessions before running.
 */
public class SessionUnregister {

    public static void unregisterSession(SessionID sessionId) {
        List<SessionID> sessionIdHolder = new ArrayList<SessionID>();
        sessionIdHolder.add(sessionId);
        unregisterSessions(sessionIdHolder);
    }

    public static void unregisterSessions(List<SessionID> sessionIds) {
        Session.unregisterSessions(sessionIds, true);
    }
}

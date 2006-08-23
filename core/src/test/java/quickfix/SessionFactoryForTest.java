/*============================================================================
 *
 * Copyright (c) 2000-2006 Smart Trade Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of Smart Trade Technologies
 * Use is subject to license terms.
 *
 *============================================================================*/

package quickfix;

public class SessionFactoryForTest implements SessionFactory {
    private static SessionFactoryForTest instance = new SessionFactoryForTest();
    
    public Session create(SessionID sessionID, SessionSettings settings) throws ConfigError {
        if (sessionID == null) {
            sessionID = new SessionID();
            sessionID.fromString("FIX.4.2:SENDER->TARGET");
        }
        return new Session(new UnitTestApplication(), new MemoryStoreFactory(), sessionID, null, 
                null, null, new DefaultMessageFactory(), 30);
    }

    public static Session create() throws ConfigError {
        return instance.create(null, null);
    }
}

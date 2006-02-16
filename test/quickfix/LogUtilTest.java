package quickfix;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import junit.framework.TestCase;

public class LogUtilTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
        SystemTime.setTimeSource(new MockSystemTimeSource(System.currentTimeMillis()));
    }
    
    public void testLogThrowable() {
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        LogFactory mockLogFactory = createLogFactory(data);
        createSessionAndGenerateException(mockLogFactory);
        
        String message = new String(data.toByteArray());
        assertTrue(message.indexOf("IOException") != -1);
    }
    
    private void createSessionAndGenerateException(LogFactory mockLogFactory) {
        new Session(null, new MessageStoreFactory() {
            public MessageStore create(SessionID sessionID) {
                try {
                    return new MemoryStore() {
                        public Date getCreationTime() throws IOException {
                            throw new IOException("test");
                        }
                    };
                } catch (IOException e) {
                    // ignore
                    return null;
                }
            }
        }, null, null, new SessionSchedule(new Date(), new Date(), 1, 7), mockLogFactory, null, 0);
    }

    private LogFactory createLogFactory(ByteArrayOutputStream data) {
        final ScreenLog log = new ScreenLog(true, true, true, true, null, new PrintStream(data));
        LogFactory mockLogFactory = new LogFactory() {
            public Log create(SessionID sessionID) {
                return log;
            }

        };
        return mockLogFactory;
    }

}
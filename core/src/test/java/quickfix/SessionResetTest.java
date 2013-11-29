package quickfix;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

import quickfix.field.BeginString;
import quickfix.field.EncryptMethod;
import quickfix.field.HeartBtInt;
import quickfix.field.MsgSeqNum;
import quickfix.field.MsgType;
import quickfix.field.SenderCompID;
import quickfix.field.SendingTime;
import quickfix.field.TargetCompID;
import quickfix.field.TestReqID;
import quickfix.fix44.TestRequest;

public class SessionResetTest {

    private static final int NUMBER_OF_ADMIN_MESSAGES = 50;

    
    @Test
    // QFJ-645, QFJ-716
    public void testSessionResetDeadlock() throws Exception {

        final UnitTestApplication application = new UnitTestApplication();
        final SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        final Session session = SessionFactoryTestSupport.createSession(sessionID,
                application, true, false);
        final UnitTestResponder responder = new UnitTestResponder();
        session.setResponder(responder);
        session.addStateListener(responder);
        session.logon();
        session.next();

        assertFalse(responder.onResetCalled);
        
        final Message logonRequest = new Message(responder.sentMessageData);
        final Message logonResponse = new DefaultMessageFactory().create(
                sessionID.getBeginString(), MsgType.LOGON);
        logonResponse.setInt(EncryptMethod.FIELD, EncryptMethod.NONE_OTHER);
        logonResponse.setInt(HeartBtInt.FIELD, logonRequest.getInt(HeartBtInt.FIELD));

        final Message.Header header = logonResponse.getHeader();
        header.setString(BeginString.FIELD, sessionID.getBeginString());
        header.setString(SenderCompID.FIELD, sessionID.getSenderCompID());
        header.setString(TargetCompID.FIELD, sessionID.getTargetCompID());
        header.setInt(MsgSeqNum.FIELD, 1);
        header.setUtcTimeStamp(SendingTime.FIELD, SystemTime.getDate(), true);
        
        Thread resetThread = new Thread(new Runnable() {
            public void run() {
                try {
                    session.reset();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, "SessionReset");

        Thread messageSender = new Thread(new Runnable() {
            public void run() {
                for (int i = 2; i <= NUMBER_OF_ADMIN_MESSAGES; i++) {
                    session.send(createAdminMessage(i));
                }
            }
        }, "SessionSend");

        // submit threads to pausable executor and try to let them start at the same time
        PausableThreadPoolExecutor ptpe = new PausableThreadPoolExecutor();
        ptpe.pause();
        ptpe.submit(messageSender);
        ptpe.submit(resetThread);
        ptpe.resume();
        ptpe.awaitTermination(2, TimeUnit.SECONDS);

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] threadIds = bean.findDeadlockedThreads();
        assertNull("no threads should be deadlocked", threadIds);
        assertTrue("session should have been reset", responder.onResetCalled);
    }


    private Message createAdminMessage(int sequence) {
        final TestRequest msg = new TestRequest(new TestReqID("SessionResetTest"));
        msg.getHeader().setString(SenderCompID.FIELD, "TARGET");
        msg.getHeader().setString(TargetCompID.FIELD, "SENDER");
        msg.getHeader().setInt(MsgSeqNum.FIELD, sequence);
        msg.getHeader().setUtcTimeStamp(SendingTime.FIELD, new Date());
        return msg;
    }


    private class UnitTestResponder implements Responder, SessionStateListener {
        public String sentMessageData;
        public boolean onResetCalled;

        public boolean send(String data) {
            sentMessageData = data;
            return true;
        }

        public String getRemoteIPAddress() {
            return null;
        }

        public void disconnect() {
        }

        public void onConnect() {
        }

        public void onDisconnect() {
        }

        public void onLogon() {
        }

        public void onLogout() {
        }

        public void onReset() {
            onResetCalled = true;
        }

        public void onRefresh() {
        }

        public void onMissedHeartBeat() {
        }

        public void onHeartBeatTimeout() {
        }
    }

    
    private class PausableThreadPoolExecutor extends ThreadPoolExecutor {
        private boolean isPaused;
        private ReentrantLock pauseLock = new ReentrantLock();
        private Condition unpaused = pauseLock.newCondition();

        public PausableThreadPoolExecutor() {
            super(2, 2, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10000));
        }
      
        protected void beforeExecute(Thread t, Runnable r) {
          super.beforeExecute(t, r);
          pauseLock.lock();
          try {
            while (isPaused) unpaused.await();
          } catch(InterruptedException ie) {
            t.interrupt();
          } finally {
            pauseLock.unlock();
          }
        }
      
        public void pause() {
          pauseLock.lock();
          try {
            isPaused = true;
          } finally {
            pauseLock.unlock();
          }
        }
      
        public void resume() {
          pauseLock.lock();
          try {
            isPaused = false;
            unpaused.signalAll();
          } finally {
            pauseLock.unlock();
          }
        }
      }
}

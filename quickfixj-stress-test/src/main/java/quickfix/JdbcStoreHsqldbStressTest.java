package quickfix;

import org.apache.mina.util.AvailablePortFinder;
import org.hsqldb.Server;
import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Arbiter;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.JJJJ_Result;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings("unused")
public class JdbcStoreHsqldbStressTest {

    private static final SessionID SESSION_ID = new SessionID(FixVersions.BEGINSTRING_FIX44, "JDBC_INITIATOR", "JDBC_ACCEPTOR");

    private static JdbcStoreWrapper createWrapper() throws Exception {
        int dbPort = AvailablePortFinder.getNextAvailable();

        Server dbServer = new Server();
        dbServer.setDatabaseName(0, "quickfix-jdbc-test");
        dbServer.setDatabasePath(0, "mem:quickfix-jdbc-test");
        dbServer.setAddress("127.0.0.1");
        dbServer.setPort(dbPort);
        dbServer.start();

        String connectionUrl = "jdbc:hsqldb:hsql://127.0.0.1:" + dbPort + "/quickfix-jdbc-test";

        SessionSettings settings = new SessionSettings();
        settings.setString(SESSION_ID, JdbcSetting.SETTING_JDBC_DRIVER, "org.hsqldb.jdbcDriver");
        settings.setString(SESSION_ID, JdbcSetting.SETTING_JDBC_CONNECTION_URL, connectionUrl);
        settings.setString(SESSION_ID, JdbcSetting.SETTING_JDBC_USER, "SA");
        settings.setString(SESSION_ID, JdbcSetting.SETTING_JDBC_PASSWORD, "");
        settings.setString(SESSION_ID, JdbcSetting.SETTING_JDBC_CONNECTION_TEST_QUERY, "CALL NOW()");

        DataSource dataSource = JdbcUtil.getDataSource(settings, SESSION_ID);
        StressTestDbUtil.initTables(dataSource);

        JdbcStore store = new JdbcStore(settings, SESSION_ID, null);

        return new JdbcStoreWrapper(store, dbServer);
    }

    @State
    @JCStressTest
    @Outcome(id = "2, 2, 2, 2", expect = Expect.ACCEPTABLE)
    public static class SingleSenderSequenceTest {

        private final JdbcStoreWrapper underTest;

        public SingleSenderSequenceTest() {
            try {
                this.underTest = createWrapper();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        // application thread
        @SuppressWarnings("unused")
        @Actor
        public void incrementSender() {
            underTest.incrementSenderSeqNum();
        }

        // QFJ Message Processor
        @SuppressWarnings("unused")
        @Actor
        public void incrementTarget() {
            underTest.incrementTargetSeqNum();
        }

        @Arbiter
        public void captureResult(JJJJ_Result result) {
            result.r1 = underTest.getCacheSenderSequence();
            result.r2 = underTest.getCacheTargetSequence();

            int[] seqs = underTest.getNextMsgSeqNumsFromDb();

            result.r3 = seqs[0];
            result.r4 = seqs[1];

            underTest.close();
        }
    }

    @State
    @JCStressTest
    @Outcome(id = "3, 2, 3, 2", expect = Expect.ACCEPTABLE)
    public static class TwoSendersSequenceTest {

        private final JdbcStoreWrapper underTest;

        public TwoSendersSequenceTest() {
            try {
                this.underTest = createWrapper();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        // application thread
        @SuppressWarnings("unused")
        @Actor
        public void incrementSender1() {
            underTest.incrementSenderSeqNum();
        }

        // application thread
        @SuppressWarnings("unused")
        @Actor
        public void incrementSender2() {
            underTest.incrementSenderSeqNum();
        }

        // QFJ Message Processor
        @SuppressWarnings("unused")
        @Actor
        public void incrementTarget() {
            underTest.incrementTargetSeqNum();
        }

        @Arbiter
        public void captureResult(JJJJ_Result result) {
            result.r1 = underTest.getCacheSenderSequence();
            result.r2 = underTest.getCacheTargetSequence();

            int[] seqs = underTest.getNextMsgSeqNumsFromDb();

            result.r3 = seqs[0];
            result.r4 = seqs[1];

            underTest.close();
        }
    }

    private static final class JdbcStoreWrapper {

        private final JdbcStore messageStore;
        private final Server dbServer;
        private final Lock senderSequenceLock;
        private final Lock targetSequenceLock;

        public JdbcStoreWrapper(JdbcStore messageStore, Server dbServer) {
            this.messageStore = messageStore;
            this.dbServer = dbServer;
            this.senderSequenceLock = new ReentrantLock();
            this.targetSequenceLock = new ReentrantLock();
        }

        public void incrementSenderSeqNum() {
            senderSequenceLock.lock();

            try {
                messageStore.incrNextSenderMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                senderSequenceLock.unlock();
            }
        }

        public void incrementTargetSeqNum() {
            targetSequenceLock.lock();

            try {
                messageStore.incrNextTargetMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                targetSequenceLock.unlock();
            }
        }

        public int getCacheSenderSequence() {
            try {
                return messageStore.getNextSenderMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int getCacheTargetSequence() {
            try {
                return messageStore.getNextTargetMsgSeqNum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int[] getNextMsgSeqNumsFromDb() {
            try {
                return messageStore.getNextMsgSeqNumsFromDb();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                dbServer.stop();
            } catch (RuntimeException ignored) {
            }
        }
    }
}

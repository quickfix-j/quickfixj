package quickfix;

import org.openjdk.jcstress.annotations.Actor;
import org.openjdk.jcstress.annotations.Arbiter;
import org.openjdk.jcstress.annotations.Expect;
import org.openjdk.jcstress.annotations.JCStressTest;
import org.openjdk.jcstress.annotations.Outcome;
import org.openjdk.jcstress.annotations.State;
import org.openjdk.jcstress.infra.results.JJJJ_Result;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SuppressWarnings("unused")
public class JdbcStoreStressTest {

    private static final SessionID SESSION_ID = new SessionID(FixVersions.BEGINSTRING_FIX44, "JDBC_INITIATOR", "JDBC_ACCEPTOR");

    private static JdbcStoreWrapper createWrapper() throws Exception {
        ResultSet columnsResultSet = mock(ResultSet.class);
        doReturn(true).when(columnsResultSet).next();

        SessionSettings settings = new SessionSettings();
        String sessionTableName = JdbcStore.getSessionTableName(settings, SESSION_ID);
        String messageTableName = JdbcStore.getMessageTableName(settings, SESSION_ID);

        DatabaseMetaData metaData = mock(DatabaseMetaData.class);
        doReturn(columnsResultSet).when(metaData).getColumns(null, null, sessionTableName.toUpperCase(), "SENDERSUBID");

        Connection connection = mock(Connection.class);
        doReturn(metaData).when(connection).getMetaData();

        DataSource dataSource = mock(DataSource.class);
        doReturn(connection).when(dataSource).getConnection();

        boolean extendedSessionIdSupport = JdbcUtil.determineSessionIdSupport(dataSource, sessionTableName);
        String idColumns = JdbcUtil.getIDColumns(extendedSessionIdSupport);
        String idPlaceholders = JdbcUtil.getIDPlaceholders(extendedSessionIdSupport);
        String idWhereClause = JdbcUtil.getIDWhereClause(extendedSessionIdSupport);

        // GET SEQUENCE NUMS
        ResultSet getSequenceResult = mock(ResultSet.class);
        doReturn(false).when(getSequenceResult).next();

        PreparedStatement getSequenceNumsQuery = mock(PreparedStatement.class);
        doReturn(getSequenceResult).when(getSequenceNumsQuery).executeQuery();

        String sequenceNumsSql = JdbcStore.getSequenceNumsSql(sessionTableName, idWhereClause);
        doReturn(getSequenceNumsQuery).when(connection).prepareStatement(sequenceNumsSql);

        // INSERT SESSION
        PreparedStatement insertSessionQuery = mock(PreparedStatement.class);

        String insertSessionSql = JdbcStore.getInsertSessionSql(sessionTableName, idColumns, idPlaceholders);
        doReturn(insertSessionQuery).when(connection).prepareStatement(insertSessionSql);

        // UPDATE SEQUENCE NUMS
        UpdateSequenceStatement updateSequenceNumsQuery = new UpdateSequenceStatement();

        String updateSequenceNumsSql = JdbcStore.getUpdateSequenceNumsSql(sessionTableName, idWhereClause);
        doReturn(updateSequenceNumsQuery).when(connection).prepareStatement(updateSequenceNumsSql);

        JdbcStore jdbcStore = new JdbcStore(settings, SESSION_ID, dataSource);

        if (jdbcStore.getNextSenderMsgSeqNum() != 1) {
            throw new IllegalStateException("Invalid next sender sequence: " + jdbcStore.getNextSenderMsgSeqNum());
        }

        if (jdbcStore.getNextTargetMsgSeqNum() != 1) {
            throw new IllegalStateException("Invalid next target sequence: " + jdbcStore.getNextTargetMsgSeqNum());
        }

        return new JdbcStoreWrapper(jdbcStore, updateSequenceNumsQuery);
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
            result.r3 = underTest.getDbSenderSequence();
            result.r4 = underTest.getDbTargetSequence();
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
            result.r3 = underTest.getDbSenderSequence();
            result.r4 = underTest.getDbTargetSequence();
        }
    }

    private static final class JdbcStoreWrapper {

        private final JdbcStore messageStore;
        private final UpdateSequenceStatement updateSequenceNumsQuery;
        private final Lock senderSequenceLock;
        private final Lock targetSequenceLock;

        public JdbcStoreWrapper(JdbcStore messageStore, UpdateSequenceStatement updateSequenceNumsQuery) {
            this.messageStore = messageStore;
            this.updateSequenceNumsQuery = updateSequenceNumsQuery;
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

        public int getDbSenderSequence() {
            return updateSequenceNumsQuery.senderSeqNum;
        }

        public int getDbTargetSequence() {
            return updateSequenceNumsQuery.targetSeqNum;
        }
    }

    private static final class UpdateSequenceStatement implements PreparedStatement {

        private int senderSeqNum;
        private int targetSeqNum;

        public UpdateSequenceStatement() {
            this.senderSeqNum = -1;
            this.targetSeqNum = -1;
        }

        @Override
        public ResultSet executeQuery() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int executeUpdate() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNull(int parameterIndex, int sqlType) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBoolean(int parameterIndex, boolean x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setByte(int parameterIndex, byte x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setShort(int parameterIndex, short x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setInt(int parameterIndex, int x) {
            if (parameterIndex == 1) {
                targetSeqNum = x;
            } else if (parameterIndex == 2) {
                senderSeqNum = x;
            }
        }

        @Override
        public void setLong(int parameterIndex, long x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setFloat(int parameterIndex, float x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setDouble(int parameterIndex, double x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBigDecimal(int parameterIndex, BigDecimal x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setString(int parameterIndex, String x) {
        }

        @Override
        public void setBytes(int parameterIndex, byte[] x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setDate(int parameterIndex, Date x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setTime(int parameterIndex, Time x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setTimestamp(int parameterIndex, Timestamp x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setAsciiStream(int parameterIndex, InputStream x, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setUnicodeStream(int parameterIndex, InputStream x, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBinaryStream(int parameterIndex, InputStream x, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clearParameters() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setObject(int parameterIndex, Object x, int targetSqlType) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setObject(int parameterIndex, Object x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean execute() {
            return true;
        }

        @Override
        public void addBatch() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setCharacterStream(int parameterIndex, Reader reader, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setRef(int parameterIndex, Ref x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBlob(int parameterIndex, Blob x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setClob(int parameterIndex, Clob x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setArray(int parameterIndex, Array x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResultSetMetaData getMetaData() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setDate(int parameterIndex, Date x, Calendar cal) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setTime(int parameterIndex, Time x, Calendar cal) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNull(int parameterIndex, int sqlType, String typeName) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setURL(int parameterIndex, URL x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ParameterMetaData getParameterMetaData() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setRowId(int parameterIndex, RowId x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNString(int parameterIndex, String value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNCharacterStream(int parameterIndex, Reader value, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNClob(int parameterIndex, NClob value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setClob(int parameterIndex, Reader reader, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBlob(int parameterIndex, InputStream inputStream, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNClob(int parameterIndex, Reader reader, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setSQLXML(int parameterIndex, SQLXML xmlObject) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setAsciiStream(int parameterIndex, InputStream x, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBinaryStream(int parameterIndex, InputStream x, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setCharacterStream(int parameterIndex, Reader reader, long length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setAsciiStream(int parameterIndex, InputStream x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBinaryStream(int parameterIndex, InputStream x) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setCharacterStream(int parameterIndex, Reader reader) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNCharacterStream(int parameterIndex, Reader value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setClob(int parameterIndex, Reader reader) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setBlob(int parameterIndex, InputStream inputStream) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setNClob(int parameterIndex, Reader reader) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResultSet executeQuery(String sql) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int executeUpdate(String sql) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void close() {
        }

        @Override
        public int getMaxFieldSize() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setMaxFieldSize(int max) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getMaxRows() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setMaxRows(int max) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setEscapeProcessing(boolean enable) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getQueryTimeout() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setQueryTimeout(int seconds) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void cancel() {
            throw new UnsupportedOperationException();
        }

        @Override
        public SQLWarning getWarnings() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clearWarnings() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setCursorName(String name) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean execute(String sql) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResultSet getResultSet() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getUpdateCount() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean getMoreResults() {
            throw new UnsupportedOperationException();
        }

        @Override
        public <T> T unwrap(Class<T> iface) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isWrapperFor(Class<?> iface) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setFetchDirection(int direction) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getFetchDirection() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setFetchSize(int rows) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getFetchSize() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getResultSetConcurrency() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getResultSetType() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void addBatch(String sql) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clearBatch() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int[] executeBatch() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Connection getConnection() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean getMoreResults(int current) {
            throw new UnsupportedOperationException();
        }

        @Override
        public ResultSet getGeneratedKeys() {
            throw new UnsupportedOperationException();
        }

        @Override
        public int executeUpdate(String sql, int autoGeneratedKeys) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int executeUpdate(String sql, int[] columnIndexes) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int executeUpdate(String sql, String[] columnNames) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean execute(String sql, int autoGeneratedKeys) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean execute(String sql, int[] columnIndexes) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean execute(String sql, String[] columnNames) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int getResultSetHoldability() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isClosed() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void setPoolable(boolean poolable) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isPoolable() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void closeOnCompletion() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isCloseOnCompletion() {
            throw new UnsupportedOperationException();
        }
    }
}

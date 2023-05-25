package quickfix.test.acceptance;

import junit.extensions.TestSetup;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.apache.mina.util.AvailablePortFinder;
import org.logicalcobwebs.proxool.ProxoolException;
import org.logicalcobwebs.proxool.ProxoolFacade;
import org.logicalcobwebs.proxool.admin.SnapshotIF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Session;
import quickfix.SystemTime;
import quickfix.mina.ProtocolFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AcceptanceTestSuite extends TestSuite {
    private static final String ATEST_TIMEOUT_KEY = "atest.timeout";
    private static final String ATEST_TRANSPORT_KEY = "atest.transport";
    private static final String ATEST_SKIPSLOW_KEY = "atest.skipslow";
    private static final Logger log = LoggerFactory.getLogger(AcceptanceTestSuite.class);
    private static final String acceptanceTestResourcePath = "quickfix/test/acceptance/definitions/";
    private static final String acceptanceTestBaseDir = AcceptanceTestSuite.class.getClassLoader().getResource(acceptanceTestResourcePath).getPath();

    private static int transportType = ProtocolFactory.SOCKET;
    private static int port = 9887;

    private final boolean skipSlowTests;
    private final boolean multithreaded;

    private final Map<Object, Object> overridenProperties;

    private static class TestDefinitionFilter implements FileFilter {
        public boolean accept(File file) {
            return (file.getName().endsWith(".def") && !file.getParentFile().getName().equals(
                    "future"))
                    || file.isDirectory();
        }
    }

    private class AcceptanceTest extends TestCase {
        private final String filename;
        private final String testname;

        public AcceptanceTest(String filename) {
            this.filename = filename;
            testname = filename.substring(filename.lastIndexOf(File.separatorChar + "fix") + 1) +
                (multithreaded ? "-threaded" : "");
            setName(testname);
        }

        public int countTestCases() {
            return 1;
        }

        public void run(TestResult result) {
            result.startTest(this);
            TestConnection connection = null;
            String failureString = "test " + filename + " failed with message: ";
            try {
                log.info("Running test {}, filename : {}", this.testname, this.filename);
                connection = new TestConnection();
                List<TestStep> testSteps = load(filename);
                for (TestStep testStep : testSteps) {
                    testStep.run(result, connection);
                }
            } catch (AssertionFailedError e) {
                result.addFailure(this, e);
                log.error(failureString + e.getMessage());
            } catch (Throwable t) {
                result.addError(this, t);
                log.error(failureString + t.getMessage());
            } finally {
                if (connection != null) {
                    connection.tearDown();
                }
            }
            result.endTest(this);
            //printDatabasePoolingStatistics();
        }

        @SuppressWarnings("unused")
        protected void printDatabasePoolingStatistics() {
            try {
                for (String alias : ProxoolFacade.getAliases()) {
                    SnapshotIF snapshot = ProxoolFacade.getSnapshot(alias, true);
                    System.out.println("active:" + snapshot.getActiveConnectionCount() + ",max:"
                            + snapshot.getMaximumConnectionCount() + ",served:"
                            + snapshot.getServedCount());
                }
            } catch (ProxoolException e) {
                e.printStackTrace();
            }
        }

        private List<TestStep> load(String filename) throws IOException {
            ArrayList<TestStep> steps = new ArrayList<>();
            log.info("load test: " + filename);
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "ISO8859_1"));
                String line = in.readLine();
                while (line != null) {
                    if (line.matches("^[ \t]*#.*")) {
                        steps.add(new PrintComment(line));
                    } else if (line.startsWith("I")) {
                        steps.add(new InitiateMessageStep(line, getOverridenProperties()));
                    } else if (line.startsWith("E")) {
                        steps.add(new ExpectMessageStep(line));
                    } else if (line.matches("^i\\d*,?CONNECT")) {
                        steps.add(new ConnectToServerStep(line, transportType, port));
                    } else if (line.matches("^iSET_SESSION.*")) {
                        steps.add(new ConfigureSessionStep(line));
                    } else if (line.matches("^e\\d*,?DISCONNECT")) {
                        steps.add(new ExpectDisconnectStep(line));
                    }
                    line = in.readLine();
                }
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            return steps;
        }

        public String toString() {
            return testname;
        }
    }

    public AcceptanceTestSuite(String testDirectory, boolean multithreaded) {
        this(testDirectory, multithreaded, null);
    }

    public AcceptanceTestSuite(String testDirectory, boolean multithreaded, Map<Object, Object> overridenProperties) {
        this.multithreaded = multithreaded;
        this.overridenProperties = overridenProperties;
        SystemTime.setTimeSource(null);

        String name = testDirectory.substring(testDirectory.lastIndexOf(File.separatorChar) + 1);
        this.setName(name + (multithreaded ? "-threaded" : ""));
        Long timeout = Long.getLong(ATEST_TIMEOUT_KEY);
        if (timeout != null) {
            ExpectMessageStep.TIMEOUT_IN_MS = timeout;
        }

        this.skipSlowTests = Boolean.getBoolean(ATEST_SKIPSLOW_KEY);

        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix40"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix41"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix42"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix43"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix44"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fix50"));
        addTests(new File(acceptanceTestBaseDir + testDirectory + "/fixLatest"));
    }

    public String toString() {
        return "FIX Integration Tests: " + (multithreaded ? "multithreaded" : "single threaded");
    }

    public boolean isMultithreaded() {
        return multithreaded;
    }

    protected void addTest(String name) {
        addTests(new File(acceptanceTestBaseDir + "server/" + name));
    }

    protected void addTests(File directory) {
        if (!directory.exists())
            return;
        if (!directory.isDirectory()) {
            addTest(new AcceptanceTest(directory.getPath()));
        } else {
            if (directory.exists()) {
                File[] files = directory.listFiles(new TestDefinitionFilter());
                for (File file : files) {
                    if (!file.isDirectory() && !isTestSkipped(file)) {
                        addTest(new AcceptanceTest(file.getPath()));
                    }
                }
                for (File file : files) {
                    if (file.isDirectory()) {
                        addTests(file);
                    }
                }
            } else {
                System.err.println("directory does not exist: " + directory.getPath());
            }
        }
    }

    private boolean isTestSkipped(File file) {
        return skipSlowTests &&
                (file.getName().contains("NoDataSentDuringHeartBtInt")
                        || file.getName().contains("SendTestRequest"));
    }

    private static final class AcceptanceTestServerSetUp extends TestSetup {
        private final boolean threaded;
        private final Map<Object, Object> overridenProperties;
//        private Thread serverThread;
        private final ExecutorService executor = Executors.newSingleThreadExecutor();

        private ATServer server;

        private AcceptanceTestServerSetUp(AcceptanceTestSuite suite) {
            super(suite);
            this.threaded = suite.isMultithreaded();
            this.overridenProperties = suite.getOverridenProperties();
        }

        protected void setUp() throws Exception {
            super.setUp();
            server = new ATServer((TestSuite) getTest(), threaded, transportType, port, overridenProperties);
            server.setUsingMemoryStore(true);
            executor.execute(server);
            server.waitForInitialization();
        }

        protected void tearDown() throws Exception {
            server.stop();
            executor.shutdownNow();
            server.waitForTearDown();
            super.tearDown();
        }
    }

    public static Test suite() {
        transportType = ProtocolFactory.getTransportType(System.getProperty(ATEST_TRANSPORT_KEY, ProtocolFactory.getTypeString(ProtocolFactory.SOCKET)));
        port = AvailablePortFinder.getNextAvailable(port);
        TestSuite acceptanceTests = new TestSuite(AcceptanceTestSuite.class.getSimpleName());
        // default server
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("server", false)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("server", true)));

        Map<Object, Object> resendRequestChunkSizeProperties = new HashMap<>();
        resendRequestChunkSizeProperties.put(Session.SETTING_RESEND_REQUEST_CHUNK_SIZE, "5");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("resendRequestChunkSize", true, resendRequestChunkSizeProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("resendRequestChunkSize", false, resendRequestChunkSizeProperties)));

        Map<Object, Object> lastMsgSeqNumProcessedProperties = new HashMap<>();
        lastMsgSeqNumProcessedProperties.put(Session.SETTING_ENABLE_LAST_MSG_SEQ_NUM_PROCESSED, "Y");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("lastMsgSeqNumProcessed", true, lastMsgSeqNumProcessedProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("lastMsgSeqNumProcessed", false, lastMsgSeqNumProcessedProperties)));

        Map<Object, Object> nextExpectedMsgSeqNumProperties = new HashMap<>();
        nextExpectedMsgSeqNumProperties.put(Session.SETTING_ENABLE_NEXT_EXPECTED_MSG_SEQ_NUM, "Y");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("nextExpectedMsgSeqNum", true, nextExpectedMsgSeqNumProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("nextExpectedMsgSeqNum", false, nextExpectedMsgSeqNumProperties)));

        Map<Object, Object> timestampProperties = new HashMap<>();
        timestampProperties.put(Session.SETTING_TIMESTAMP_PRECISION, "NANOS");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("timestamps", true, timestampProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("timestamps", false, timestampProperties)));

        Map<Object, Object> rejectGarbledMessagesProperties = new HashMap<>();
        rejectGarbledMessagesProperties.put(Session.SETTING_REJECT_GARBLED_MESSAGE, "Y");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("rejectGarbledMessages", true, rejectGarbledMessagesProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("rejectGarbledMessages", false, rejectGarbledMessagesProperties)));

        Map<Object, Object> validateChecksumProperties = new HashMap<>();
        validateChecksumProperties.put(Session.SETTING_VALIDATE_CHECKSUM, "N");
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("validateChecksum", true, validateChecksumProperties)));
        acceptanceTests.addTest(new AcceptanceTestServerSetUp(new AcceptanceTestSuite("validateChecksum", false, validateChecksumProperties)));

        return acceptanceTests;
    }

    public Map<Object, Object> getOverridenProperties() {
        return overridenProperties;
    }
}

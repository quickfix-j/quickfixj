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

package quickfix.mina.ssl;

import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IoSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.ApplicationAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.FixVersions;
import quickfix.MemoryStoreFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RuntimeError;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;
import quickfix.ThreadedSocketInitiator;
import quickfix.mina.IoSessionResponder;
import quickfix.mina.ProtocolFactory;
import quickfix.mina.SessionConnector;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.apache.mina.util.AvailablePortFinder;
import org.junit.After;

public class SSLCertificateTest {

    // Note: To diagnose cipher suite errors, run with -Djavax.net.debug=ssl:handshake
    private static final String CIPHER_SUITES_ANON = "TLS_DH_anon_WITH_AES_128_CBC_SHA";
    private static final String CIPHER_SUITES_TLS = "TLS_RSA_WITH_AES_128_CBC_SHA";

    @After
    public void cleanup() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(SSLCertificateTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void shouldAuthenticateServerCertificate() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", false,
                "single-session/empty.keystore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/empty.keystore", "single-session/client.truststore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"),
                        new BigInteger("1448538842"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldAuthenticateServerAndClientCertificates() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", true,
                "single-session/server.truststore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/client.keystore", "single-session/client.truststore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"),
                        new BigInteger("1448538842"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"),
                        new BigInteger("1448538787"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldAuthenticateServerAndClientCertificatesWhenUsingDifferentKeystoreFormats() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server-pkcs12.keystore", true,
                "single-session/server-jceks.truststore", CIPHER_SUITES_TLS, "TLSv1.2", "PKCS12",
                "JCEKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(createInitiatorSettings("single-session/client-jceks.keystore",
                    "single-session/client-jceks.keystore", CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA",
                    Integer.toString(freePort), "JCEKS", "JCEKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"),
                        new BigInteger("1449683167"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"),
                        new BigInteger("1449683336"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldAuthenticateServerAndClientCertificatesForIndividualSessions() throws Exception {
        TestAcceptor acceptor = new TestAcceptor(createMultiSessionAcceptorSettings(
                "multi-session/server.keystore", true, new String[] { "multi-session/server1.truststore",
                        "multi-session/server2.truststore", "multi-session/server3.truststore" },
                CIPHER_SUITES_TLS, "TLSv1.2"));

        try {
            acceptor.start();

            TestInitiator initiator1 = new TestInitiator(
                    createInitiatorSettings("multi-session/client1.keystore", "multi-session/client1.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU0", "ALFA0", "12340", "JKS", "JKS"));
            TestInitiator initiator2 = new TestInitiator(
                    createInitiatorSettings("multi-session/client2.keystore", "multi-session/client2.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU1", "ALFA1", "12341", "JKS", "JKS"));
            TestInitiator initiator3 = new TestInitiator(
                    createInitiatorSettings("multi-session/client3.keystore", "multi-session/client3.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU2", "ALFA2", "12342", "JKS", "JKS"));

            try {
                initiator1.start();
                initiator2.start();
                initiator3.start();

                initiator1.assertNoSslExceptionThrown();
                initiator1.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU0", "ALFA0"));
                initiator1.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU0", "ALFA0"),
                        new BigInteger("1449581686"));

                initiator2.assertNoSslExceptionThrown();
                initiator2.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU1", "ALFA1"));
                initiator2.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU1", "ALFA1"),
                        new BigInteger("1449581686"));

                initiator3.assertNoSslExceptionThrown();
                initiator3.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU2", "ALFA2"));
                initiator3.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU2", "ALFA2"),
                        new BigInteger("1449581686"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA0", "ZULU0"));
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA1", "ZULU1"));
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA2", "ZULU2"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA0", "ZULU0"),
                        new BigInteger("1449581008"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA1", "ZULU1"),
                        new BigInteger("1449581372"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA2", "ZULU2"),
                        new BigInteger("1449581412"));

            } finally {
                initiator1.stop();
                initiator2.stop();
                initiator3.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailIndividualSessionsWhenInvalidCertificatesUsed() throws Exception {
        TestAcceptor acceptor = new TestAcceptor(createMultiSessionAcceptorSettings(
                "multi-session/server.keystore", true, new String[] { "multi-session/server1.truststore",
                        "multi-session/server2.truststore", "multi-session/server3.truststore" },
                CIPHER_SUITES_TLS, "TLSv1.2"));

        try {
            acceptor.start();

            TestInitiator initiator1 = new TestInitiator(
                    createInitiatorSettings("multi-session/client2.keystore", "multi-session/client2.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU0", "ALFA0", "12340", "JKS", "JKS"));
            TestInitiator initiator2 = new TestInitiator(
                    createInitiatorSettings("multi-session/client1.keystore", "multi-session/client1.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU1", "ALFA1", "12341", "JKS", "JKS"));
            TestInitiator initiator3 = new TestInitiator(
                    createInitiatorSettings("multi-session/client3.keystore", "multi-session/client3.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU2", "ALFA2", "12342", "JKS", "JKS"));

            try {
                initiator1.start();
                initiator2.start();
                initiator3.start();

                initiator1.assertSslExceptionThrown();
                initiator1.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU0", "ALFA0"));
                initiator1.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU0", "ALFA0"));

                initiator2.assertSslExceptionThrown();
                initiator2.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU1", "ALFA1"));
                initiator2.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU1", "ALFA1"));

                initiator3.assertNoSslExceptionThrown();
                initiator3.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU2", "ALFA2"));
                initiator3.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU2", "ALFA2"),
                        new BigInteger("1449581686"));

                acceptor.assertSslExceptionThrown();
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA0", "ZULU0"));
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA1", "ZULU1"));
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA2", "ZULU2"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA0", "ZULU0"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA1", "ZULU1"));
                acceptor.assertAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA2", "ZULU2"),
                        new BigInteger("1449581412"));
            } finally {
                initiator1.stop();
                initiator2.stop();
                initiator3.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldCreateFixSessionWithoutAuthenticationWhenUsingEmptyServerKeyStoreWithAnonymousCipher()
            throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/empty.keystore", false,
                "single-session/empty.keystore", CIPHER_SUITES_ANON, null, "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/empty.keystore", "single-session/empty.keystore",
                            CIPHER_SUITES_ANON, null, "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldCreateFixSessionWithoutAuthenticationWhenTrustStoresAreMissing() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", false,
                "missing", CIPHER_SUITES_ANON, null, "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(createInitiatorSettings("single-session/client.keystore",
                    "missing", CIPHER_SUITES_ANON, null, "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldCreateFixSessionWithoutAuthenticationWhenUsingDefaultKeystores() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("missing", false, "missing",
                CIPHER_SUITES_ANON, null, "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(createInitiatorSettings("missing", "missing",
                    CIPHER_SUITES_ANON, null, "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertNoSslExceptionThrown();
                initiator.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertNoSslExceptionThrown();
                acceptor.assertLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailWhenUsingEmptyServerKeyStore() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/empty.keystore", false,
                "single-session/empty.keystore", null, null, "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(createInitiatorSettings("single-session/empty.keystore",
                    "single-session/empty.keystore", null, null, "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertSslExceptionThrown();
                initiator.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertSslExceptionThrown();
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailWhenUsingEmptyClientTruststore() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", false,
                "single-session/empty.keystore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/empty.keystore", "single-session/empty.keystore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertSslExceptionThrown();
                initiator.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                // client disconnects before acceptor throws an exception
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailWhenUsingEmptyServerTrustore() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", true,
                "single-session/empty.keystore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/client.keystore", "single-session/client.truststore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertSslExceptionThrown();
                initiator.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertSslExceptionThrown();
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailWhenUsingBadClientCertificate() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/server.keystore", true,
                "single-session/server.truststore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/server.keystore", "single-session/client.truststore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertSslExceptionThrown();
                initiator.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertSslExceptionThrown();
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    @Test
    public void shouldFailWhenUsingBadServerCertificate() throws Exception {
        int freePort = AvailablePortFinder.getNextAvailable();
        TestAcceptor acceptor = new TestAcceptor(createAcceptorSettings("single-session/client.keystore", false,
                "single-session/empty.keystore", CIPHER_SUITES_TLS, "TLSv1.2", "JKS", "JKS", freePort));

        try {
            acceptor.start();

            TestInitiator initiator = new TestInitiator(
                    createInitiatorSettings("single-session/empty.keystore", "single-session/client.truststore",
                            CIPHER_SUITES_TLS, "TLSv1.2", "ZULU", "ALFA", Integer.toString(freePort), "JKS", "JKS"));

            try {
                initiator.start();

                initiator.assertSslExceptionThrown();
                initiator.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));
                initiator.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ZULU", "ALFA"));

                acceptor.assertSslExceptionThrown();
                acceptor.assertNotLoggedOn(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
                acceptor.assertNotAuthenticated(new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU"));
            } finally {
                initiator.stop();
            }
        } finally {
            acceptor.stop();
        }
    }

    static abstract class TestConnector {
        private static final Logger LOGGER = LoggerFactory.getLogger(TestConnector.class);
        private static final int TIMEOUT_SECONDS = 5;

        private final SessionConnector connector;
        private final CountDownLatch exceptionThrownLatch;

        public TestConnector(SessionSettings sessionSettings) throws ConfigError {
            this.connector = prepareConnector(sessionSettings);
            this.exceptionThrownLatch = new CountDownLatch(1);
        }

        private SessionConnector prepareConnector(SessionSettings sessionSettings) throws ConfigError {
            SessionConnector sessionConnector = createConnector(sessionSettings);
            sessionConnector.setIoFilterChainBuilder(chain -> chain.addFirst("Exception handler", new IoFilterAdapter() {
                @Override
                public void exceptionCaught(NextFilter nextFilter, IoSession session, Throwable cause)
                        throws Exception {
                    LOGGER.info("exceptionCaught", cause);
                    exceptionThrownLatch.countDown();
                    nextFilter.exceptionCaught(session, cause);
                }
            }));

            return sessionConnector;
        }

        public abstract SessionConnector createConnector(SessionSettings sessionSettings) throws ConfigError;

        private SSLSession findSSLSession(Session session) throws Exception {
            IoSession ioSession = findIoSession(session);

            if (ioSession == null)
                return null;

            IoFilterChain filterChain = ioSession.getFilterChain();
            SSLFilter sslFilter = (SSLFilter) filterChain.get(SSLSupport.FILTER_NAME);
            SSLSession sslSession = sslFilter.getSslSession(ioSession);

            return sslSession;
        }

        private Session findSession(SessionID sessionID) {
            for (Session session : connector.getManagedSessions()) {
                if (session.getSessionID().equals(sessionID))
                    return session;
            }

            return null;
        }

        private IoSession findIoSession(Session session) throws Exception {
            IoSessionResponder ioSessionResponder = (IoSessionResponder) session.getResponder();

            if (ioSessionResponder == null)
                return null;

            Field field = IoSessionResponder.class.getDeclaredField("ioSession");
            field.setAccessible(true);

            IoSession ioSession = (IoSession) field.get(ioSessionResponder);

            return ioSession;
        }

        public void assertAuthenticated(SessionID sessionID, BigInteger serialNumber) throws Exception {
            Session session = findSession(sessionID);
            SSLSession sslSession = findSSLSession(session);

            X509Certificate[] peerCertificateChain = sslSession.getPeerCertificateChain();

            for (X509Certificate certificate : peerCertificateChain) {
                if (certificate.getSerialNumber().compareTo(serialNumber) == 0) {
                    return;
                }
            }

            throw new AssertionError("Certificate with serial number " + serialNumber + " was not authenticated");
        }

        public void assertNotAuthenticated(SessionID sessionID) throws Exception {
            Session session = findSession(sessionID);
            SSLSession sslSession = findSSLSession(session);

            if (sslSession == null)
                return;

            try {
                X509Certificate[] peerCertificateChain = sslSession.getPeerCertificateChain();

                if (peerCertificateChain != null && peerCertificateChain.length > 0) {
                    throw new AssertionError("Certificate was authenticated");
                }
            } catch (SSLPeerUnverifiedException e) {
            }
        }

        public void assertLoggedOn(SessionID sessionID) throws InterruptedException {
            Session session = findSession(sessionID);

            if (!session.isLoggedOn())
                throw new AssertionError("Session is not logged on");
        }

        public void assertNotLoggedOn(SessionID sessionID) throws InterruptedException {
            Session session = findSession(sessionID);

            if (session.isLoggedOn())
                throw new AssertionError("Session is logged on");
        }

        public void assertSslExceptionThrown() throws Exception {
            boolean reachedZero = exceptionThrownLatch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS);

            if (!reachedZero) {
                throw new AssertionError("No SSL exception thrown");
            }
        }

        public void assertNoSslExceptionThrown() throws Exception {
            boolean reachedZero = exceptionThrownLatch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS);

            if (reachedZero) {
                throw new AssertionError("SSL exception thrown");
            }
        }

        public void start() throws RuntimeError, ConfigError {
            connector.start();
        }

        public void stop() {
            connector.stop();
        }
    }

    static class TestAcceptor extends TestConnector {
        private static final Logger LOGGER = LoggerFactory.getLogger(TestAcceptor.class);

        public TestAcceptor(SessionSettings sessionSettings) throws ConfigError {
            super(sessionSettings);
        }

        @Override
        public SessionConnector createConnector(SessionSettings sessionSettings) throws ConfigError {
            LOGGER.info("Creating acceptor: {}", sessionSettings);

            MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
            MessageFactory messageFactory = new DefaultMessageFactory();

            ThreadedSocketAcceptor socketAcceptor = new ThreadedSocketAcceptor(new ApplicationAdapter(),
                    messageStoreFactory, sessionSettings, messageFactory);

            return socketAcceptor;
        }
    }

    static class TestInitiator extends TestConnector {
        private static final Logger LOGGER = LoggerFactory.getLogger(TestInitiator.class);

        public TestInitiator(SessionSettings sessionSettings) throws ConfigError {
            super(sessionSettings);
        }

        @Override
        public SessionConnector createConnector(SessionSettings sessionSettings) throws ConfigError {
            LOGGER.info("Creating initiator: {}", sessionSettings);

            MessageStoreFactory messageStoreFactory = new MemoryStoreFactory();
            MessageFactory messageFactory = new DefaultMessageFactory();

            ThreadedSocketInitiator socketInitiator = new ThreadedSocketInitiator(new ApplicationAdapter(),
                    messageStoreFactory, sessionSettings, messageFactory);

            return socketInitiator;
        }

    }

    private SessionSettings createMultiSessionAcceptorSettings(String keyStoreName, boolean needClientAuth,
            String[] trustStoreNames, String cipherSuites, String protocols) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, keyStoreName);
        defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, "password");

        defaults.put(SSLSupport.SETTING_NEED_CLIENT_AUTH, needClientAuth ? "Y" : "N");
        defaults.put("SocketAcceptHost", "localhost");
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");

        if (cipherSuites != null) {
            defaults.put(SSLSupport.SETTING_CIPHER_SUITES, cipherSuites);
        }

        if (protocols != null) {
            defaults.put(SSLSupport.SETTING_ENABLED_PROTOCOLS, protocols);
        }

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);

        for (int i = 0; i < trustStoreNames.length; i++) {
            SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA" + i, "ZULU" + i);
            sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
            sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
            sessionSettings.setString(sessionID, "TargetCompID", "ZULU" + i);
            sessionSettings.setString(sessionID, "SenderCompID", "ALFA" + i);
            sessionSettings.setString(sessionID, SSLSupport.SETTING_TRUST_STORE_NAME, trustStoreNames[i]);
            sessionSettings.setString(sessionID, SSLSupport.SETTING_TRUST_STORE_PWD, "password");
            sessionSettings.setString(sessionID, "SocketAcceptPort", "1234" + i);
        }

        return sessionSettings;
    }

    private SessionSettings createAcceptorSettings(String keyStoreName, boolean needClientAuth, String trustStoreName,
            String cipherSuites, String protocols, String keyStoreType, String trustStoreType, int port) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "acceptor");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, keyStoreName);
        defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, "password");

        if (keyStoreType != null) {
            defaults.put(SSLSupport.SETTING_KEY_STORE_TYPE, keyStoreType);
        }

        if (trustStoreName != null) {
            defaults.put(SSLSupport.SETTING_TRUST_STORE_NAME, trustStoreName);
            defaults.put(SSLSupport.SETTING_TRUST_STORE_PWD, "password");

            if (trustStoreType != null) {
                defaults.put(SSLSupport.SETTING_TRUST_STORE_TYPE, trustStoreType);
            }
        }

        defaults.put(SSLSupport.SETTING_NEED_CLIENT_AUTH, needClientAuth ? "Y" : "N");
        defaults.put("SocketAcceptHost", "localhost");
        defaults.put("SocketAcceptPort", Integer.toString(port));
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");

        if (cipherSuites != null) {
            defaults.put(SSLSupport.SETTING_CIPHER_SUITES, cipherSuites);
        }

        if (protocols != null) {
            defaults.put(SSLSupport.SETTING_ENABLED_PROTOCOLS, protocols);
        }

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "ALFA", "ZULU");

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);
        sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
        sessionSettings.setString(sessionID, "SenderCompID", "ALFA");
        sessionSettings.setString(sessionID, "TargetCompID", "ZULU");

        return sessionSettings;
    }

    private SessionSettings createInitiatorSettings(String keyStoreName, String trustStoreName, String cipherSuites,
            String protocols, String senderId, String targetId, String port, String keyStoreType,
            String trustStoreType) {
        HashMap<Object, Object> defaults = new HashMap<>();
        defaults.put("ConnectionType", "initiator");
        defaults.put("SocketConnectProtocol", ProtocolFactory.getTypeString(ProtocolFactory.SOCKET));
        defaults.put(SSLSupport.SETTING_USE_SSL, "Y");
        defaults.put(SSLSupport.SETTING_KEY_STORE_NAME, keyStoreName);
        defaults.put(SSLSupport.SETTING_KEY_STORE_PWD, "password");

        if (keyStoreType != null) {
            defaults.put(SSLSupport.SETTING_KEY_STORE_TYPE, keyStoreType);
        }

        if (trustStoreName != null) {
            defaults.put(SSLSupport.SETTING_TRUST_STORE_NAME, trustStoreName);
            defaults.put(SSLSupport.SETTING_TRUST_STORE_PWD, "password");

            if (trustStoreType != null) {
                defaults.put(SSLSupport.SETTING_TRUST_STORE_TYPE, trustStoreType);
            }
        }

        defaults.put("SocketConnectHost", "localhost");
        defaults.put("SocketConnectPort", port);
        defaults.put("StartTime", "00:00:00");
        defaults.put("EndTime", "00:00:00");
        defaults.put("HeartBtInt", "30");
        defaults.put("ReconnectInterval", "2");

        if (cipherSuites != null) {
            defaults.put(SSLSupport.SETTING_CIPHER_SUITES, cipherSuites);
        }

        if (protocols != null) {
            defaults.put(SSLSupport.SETTING_ENABLED_PROTOCOLS, protocols);
        }

        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, senderId, targetId);

        SessionSettings sessionSettings = new SessionSettings();
        sessionSettings.set(defaults);
        sessionSettings.setString(sessionID, "BeginString", FixVersions.BEGINSTRING_FIX44);
        sessionSettings.setString(sessionID, "DataDictionary", "FIX44.xml");
        sessionSettings.setString(sessionID, "SenderCompID", senderId);
        sessionSettings.setString(sessionID, "TargetCompID", targetId);

        return sessionSettings;
    }
}

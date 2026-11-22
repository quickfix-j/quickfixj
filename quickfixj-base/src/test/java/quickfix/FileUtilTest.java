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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtilTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @After
    public void clearHttpResourceLoadingProperty() {
        System.clearProperty(FileUtil.ALLOW_HTTP_URL_FOR_RESOURCE_LOADING);
    }

    @Test
    public void testFileLocation() throws Exception {
        // Tests that FileUtil.open can find a file in parent directory
        InputStream in = FileUtil.open(null, "../LICENSE");
        assertNotNull("File not found", in);
        in.close();
    }

    @Test
    public void testClassResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "FixVersions.class");
        assertNotNull("Resource not found", in);
        in.close();
    }

    @Test
    public void testClassLoaderResourceLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, "quickfix/test/acceptance/definitions/client/Normal.def");
        assertNotNull("Resource not found", in);
        in.close();
    }

    @Test
    public void testURLLocation() throws Exception {
        // Assumption: Internet access
        if (isInternetAccessible()) {
            InputStream in = FileUtil.open(Message.class, "https://www.quickfixj.org/");
            if (in != null) {
                in.close();
            }
            assertNotNull("Resource not found", in);
        }
    }

    @Test
    public void testFileURLLocation() throws Exception {
        InputStream in = FileUtil.open(Message.class, new File("../LICENSE").toURI().toString());
        assertNotNull("File URL resource not found", in);
        in.close();
    }

    @Test
    public void testUnsupportedURLLocationRejected() {
        InputStream in = FileUtil.open(Message.class, "ftp://example.com/resource");
        assertNull("Unsupported URL protocol should be rejected", in);
    }

    @Test
    public void testInsecureURLLocationRejected() {
        HttpServer server = createLocalHttpServer();
        try {
            String url = "http://127.0.0.1:" + server.getAddress().getPort() + "/";
            InputStream in = FileUtil.open(Message.class, url);
            assertNull("Insecure URL protocol should be rejected", in);
        } finally {
            server.stop(0);
        }
    }

    @Test
    public void testInsecureURLLocationEnabledViaProperty() throws Exception {
        HttpServer server = createLocalHttpServer();
        try {
            System.setProperty(FileUtil.ALLOW_HTTP_URL_FOR_RESOURCE_LOADING, "true");
            String url = "http://127.0.0.1:" + server.getAddress().getPort() + "/";
            InputStream in = FileUtil.open(Message.class, url);
            assertNotNull("Insecure URL protocol should be accepted when explicitly enabled", in);
            in.close();
        } finally {
            server.stop(0);
        }
    }

    @Test
    public void testJARURLLocation() throws Exception {
        // just test that we don't run into a ClassCastException
        InputStream in = FileUtil.open(Message.class, "jar:file:/foo.bar!/");
        if (in != null) {
            in.close();
        }
    }

    @Test
    // QFJ-775
    public void testSessionIDFileName() {
        SessionID sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER???",
                "bla_/--/#()_bla", "!!!TARGET", "foo::bar");
        String sessionIdFileName = FileUtil.sessionIdFileName(sessionID);
        assertEquals("FIX.4.4-SENDER____bla__--_____bla-___TARGET_foo__bar", sessionIdFileName);
        assertTrue(sessionIdFileName.matches("[a-zA-Z0-9-._]*"));

        sessionID = new SessionID(FixVersions.BEGINSTRING_FIX44, "SENDER", "TARGET");
        sessionIdFileName = FileUtil.sessionIdFileName(sessionID);
        assertEquals("FIX.4.4-SENDER-TARGET", sessionIdFileName);
    }

    private boolean isInternetAccessible() {
        try {
            Socket socket = new Socket("www.quickfixj.org", 443);
            socket.close();
            return true;
        } catch (Exception e) {
            log.warn("No internet access");
        }
        return false;
    }

    private HttpServer createLocalHttpServer() {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
            server.createContext("/", exchange -> {
                byte[] response = "<fix major=\"4\" minor=\"2\"/>".getBytes(StandardCharsets.UTF_8);
                exchange.sendResponseHeaders(200, response.length);
                try (OutputStream responseBody = exchange.getResponseBody()) {
                    responseBody.write(response);
                }
            });
            server.start();
            return server;
        } catch (Exception e) {
            throw new RuntimeException("Could not start local HTTP server for test", e);
        }
    }
}

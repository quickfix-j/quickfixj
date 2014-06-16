package quickfix.mina.ssl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import javax.net.ssl.SSLContext;

/**
 * Test for {@link SSLContextFactory}
 *
 * @author toli
 */
public class SSLContextFactoryTest extends TestCase {
    public SSLContextFactoryTest(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new TestSuite(SSLContextFactoryTest.class);
    }

    public void testGetInstance() throws Exception {
        SSLContext context = SSLContextFactory.getInstance(SSLSupport.QUICKFIXJ_CERT, SSLSupport.QUICKFIXJ_PW.toCharArray());
        assertNotNull(context);
        assertNotNull(context.getProvider());
    }

    public void testGetInstanceWithBadCert() throws Exception {
        SSLContextFactory.getInstance("FOO", "BAR".toCharArray());
    }
}

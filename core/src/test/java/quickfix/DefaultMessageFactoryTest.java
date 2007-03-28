package quickfix;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import quickfix.field.MsgType;
import quickfix.field.LinesOfText;
import quickfix.field.NoMDEntries;
import quickfix.util.ExpectedTestFailure;

/**
 * Verifies the behaviour of the {@link DefaultMessageFactory} class
 * @author toli
 * @version $Id$
 */

public class DefaultMessageFactoryTest extends TestCase {
    public DefaultMessageFactoryTest(String inName) {
        super(inName);
    }

    public static Test suite() {
        return new TestSuite(DefaultMessageFactoryTest.class);
    }

    public void testMessageCreate() throws Exception {
        DefaultMessageFactory factory = new DefaultMessageFactory();
        assertEquals(quickfix.fix40.Advertisement.class, factory.create("FIX.4.0", MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix41.Advertisement.class, factory.create("FIX.4.1", MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix42.Advertisement.class, factory.create("FIX.4.2", MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix43.Advertisement.class, factory.create("FIX.4.3", MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix44.Advertisement.class, factory.create("FIX.4.4", MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.Message.class, factory.create("unknown", MsgType.ADVERTISEMENT).getClass());
    }
    public void testGroupCreate() throws Exception {
        final DefaultMessageFactory factory = new DefaultMessageFactory();
        new ExpectedTestFailure(IllegalArgumentException.class, "unknown") {
            protected void execute() throws Throwable {
                factory.create("unknown", MsgType.NEWS, LinesOfText.FIELD);
            }
        }.run();

        assertEquals(quickfix.fix40.News.LinesOfText.class, factory.create("FIX.4.0", MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix41.News.LinesOfText.class, factory.create("FIX.4.1", MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix42.News.LinesOfText.class, factory.create("FIX.4.2", MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix43.News.LinesOfText.class, factory.create("FIX.4.3", MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix44.News.LinesOfText.class, factory.create("FIX.4.4", MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertNull("if group can't be created return null",
                factory.create("FIX.4.0", MsgType.MARKET_DATA_SNAPSHOT_FULL_REFRESH, NoMDEntries.FIELD));
    }
}

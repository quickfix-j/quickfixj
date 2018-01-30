package quickfix;

import static org.junit.Assert.*;
import static quickfix.FixVersions.*;

import org.junit.Test;

import quickfix.field.LinesOfText;
import quickfix.field.MsgType;
import quickfix.field.NoLinesOfText;
import quickfix.field.NoMDEntries;
import quickfix.test.util.ExpectedTestFailure;
import quickfix.Message;

/**
 * Verifies the behaviour of the {@link DefaultMessageFactory} class
 *
 * @author toli
 * @version $Id$
 */
public class DefaultMessageFactoryFix50sp2Test {
    private final DefaultMessageFactoryFix50sp2 factory = new DefaultMessageFactoryFix50sp2();

    @Test
    public void testMessageCreate() throws Exception {
        assertMessage(quickfix.fix50sp2.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FIX50SP2, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.Message.class, MsgType.ADVERTISEMENT, factory.create("unknown", MsgType.ADVERTISEMENT));
    }

    @Test
    public void testFixtCreate() throws Exception {
        assertMessage(quickfix.fixt11.Logon.class, MsgType.LOGON, factory.create(BEGINSTRING_FIXT11, MsgType.LOGON));
    }

    @Test
    public void testGroupCreate() throws Exception {

        new ExpectedTestFailure(IllegalArgumentException.class, "unknown") {
            protected void execute() throws Throwable {
                factory.create("unknown", MsgType.NEWS, LinesOfText.FIELD);
            }
        }.run();

        assertEquals(quickfix.fix50sp2.News.NoLinesOfText.class, factory.create(FIX50SP2, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertNull("if group can't be created return null",
                factory.create(BEGINSTRING_FIXT11, MsgType.MARKET_DATA_SNAPSHOT_FULL_REFRESH, NoMDEntries.FIELD));
    }

    private static void assertMessage(Class<?> expectedMessageClass, String expectedMessageType, Message message) throws Exception {
        assertEquals(expectedMessageClass, message.getClass());
        assertEquals(expectedMessageType, message.getHeader().getString(MsgType.FIELD));
    }
}

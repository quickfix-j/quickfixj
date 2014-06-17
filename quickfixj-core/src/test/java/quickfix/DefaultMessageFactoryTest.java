package quickfix;

import static org.junit.Assert.*;
import static quickfix.FixVersions.*;

import org.junit.Test;

import quickfix.field.LinesOfText;
import quickfix.field.MsgType;
import quickfix.field.NoLinesOfText;
import quickfix.field.NoMDEntries;
import quickfix.test.util.ExpectedTestFailure;

/**
 * Verifies the behaviour of the {@link DefaultMessageFactory} class
 * @author toli
 * @version $Id$
 */
public class DefaultMessageFactoryTest {
    private DefaultMessageFactory factory = new DefaultMessageFactory();

    @Test
    public void testMessageCreate() throws Exception {
        assertMessage(quickfix.fix40.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX40, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix41.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX41, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix42.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX42, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix43.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX43, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix44.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX44, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix50.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FIX50, MsgType.ADVERTISEMENT));
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

        assertEquals(quickfix.fix40.News.LinesOfText.class, factory.create(BEGINSTRING_FIX40, MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix41.News.LinesOfText.class, factory.create(BEGINSTRING_FIX41, MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix42.News.LinesOfText.class, factory.create(BEGINSTRING_FIX42, MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix43.News.LinesOfText.class, factory.create(BEGINSTRING_FIX43, MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix44.News.LinesOfText.class, factory.create(BEGINSTRING_FIX44, MsgType.NEWS, LinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix50.News.NoLinesOfText.class, factory.create(FIX50, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertNull("if group can't be created return null",
                factory.create(BEGINSTRING_FIX40, MsgType.MARKET_DATA_SNAPSHOT_FULL_REFRESH, NoMDEntries.FIELD));
    }

    private static void assertMessage(Class<?> expectedMessageClass, String expectedMessageType, Message message) throws Exception {
        assertEquals(expectedMessageClass, message.getClass());
        assertEquals(expectedMessageType, message.getHeader().getString(MsgType.FIELD));
    }
}

package quickfix;

import static org.junit.Assert.*;
import static quickfix.FixVersions.*;

import org.junit.Test;

import quickfix.field.LinesOfText;
import quickfix.field.MsgType;
import quickfix.field.NoLinesOfText;
import quickfix.field.NoMDEntries;
import quickfix.util.ExpectedTestFailure;

/**
 * Verifies the behaviour of the {@link DefaultMessageFactory} class
 * @author toli
 * @version $Id$
 */
public class DefaultMessageFactoryTest {
    private DefaultMessageFactory factory = new DefaultMessageFactory();

    @Test
    public void testMessageCreate() throws Exception {
        assertEquals(quickfix.fix40.Advertisement.class, factory.create(BEGINSTRING_FIX40, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix41.Advertisement.class, factory.create(BEGINSTRING_FIX41, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix42.Advertisement.class, factory.create(BEGINSTRING_FIX42, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix43.Advertisement.class, factory.create(BEGINSTRING_FIX43, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix44.Advertisement.class, factory.create(BEGINSTRING_FIX44, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.fix50.Advertisement.class, factory.create(FIX50, MsgType.ADVERTISEMENT).getClass());
        assertEquals(quickfix.Message.class, factory.create("unknown", MsgType.ADVERTISEMENT).getClass());
    }
    
    @Test
    public void testFixtCreate() throws Exception {
        assertEquals(quickfix.fixt11.Logon.class, factory.create(BEGINSTRING_FIXT11, MsgType.LOGON).getClass());
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
}

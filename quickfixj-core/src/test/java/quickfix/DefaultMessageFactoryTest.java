package quickfix;

import static org.junit.Assert.*;
import static quickfix.FixVersions.*;
import static quickfix.field.ApplVerID.*;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import quickfix.field.*;
import quickfix.test.util.ExpectedTestFailure;

/**
 * Verifies the behaviour of the {@link DefaultMessageFactory} class
 *
 * @author toli
 * @version $Id$
 */
@RunWith(Parameterized.class)
public class DefaultMessageFactoryTest {
    private final DefaultMessageFactory factory;
    private final Class<? extends Message> fixtCreateExpectedClass;

    public DefaultMessageFactoryTest(String defaultApplVerID, Class<? extends Message> fixtCreateExpectedClass) {
        if (defaultApplVerID != null) {
            this.factory = new DefaultMessageFactory(defaultApplVerID);
        } else {
            this.factory = new DefaultMessageFactory();
        }
        this.fixtCreateExpectedClass = fixtCreateExpectedClass;
    }

    @Test
    public void testMessageCreate() throws Exception {
        assertMessage(quickfix.fix40.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX40, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix41.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX41, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix42.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX42, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix43.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX43, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix44.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(BEGINSTRING_FIX44, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix50.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FixVersions.FIX50, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix50sp1.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FixVersions.FIX50SP1, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fix50sp2.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FixVersions.FIX50SP2, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.fixlatest.Advertisement.class, MsgType.ADVERTISEMENT, factory.create(FixVersions.FIXLATEST, MsgType.ADVERTISEMENT));
        assertMessage(quickfix.Message.class, MsgType.ADVERTISEMENT, factory.create("unknown", MsgType.ADVERTISEMENT));
    }

    @Test
    public void testFixtCreate() throws Exception {
        assertMessage(quickfix.fixt11.Logon.class, MsgType.LOGON, factory.create(BEGINSTRING_FIXT11, MsgType.LOGON));
        assertMessage(fixtCreateExpectedClass, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, MsgType.EMAIL));
        assertMessage(quickfix.fix40.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(FIX40), MsgType.EMAIL));
        assertMessage(quickfix.fix41.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(FIX41), MsgType.EMAIL));
        assertMessage(quickfix.fix42.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(FIX42), MsgType.EMAIL));
        assertMessage(quickfix.fix43.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(FIX43), MsgType.EMAIL));
        assertMessage(quickfix.fix44.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(FIX44), MsgType.EMAIL));
        assertMessage(quickfix.fix50.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(ApplVerID.FIX50), MsgType.EMAIL));
        assertMessage(quickfix.fix50sp1.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(ApplVerID.FIX50SP1), MsgType.EMAIL));
        assertMessage(quickfix.fix50sp2.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(ApplVerID.FIX50SP2), MsgType.EMAIL));
        assertMessage(quickfix.fixlatest.Email.class, MsgType.EMAIL, factory.create(BEGINSTRING_FIXT11, new ApplVerID(ApplVerID.FIXLATEST), MsgType.EMAIL));
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
        assertEquals(quickfix.fix50.News.NoLinesOfText.class, factory.create(FixVersions.FIX50, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix50sp1.News.NoLinesOfText.class, factory.create(FixVersions.FIX50SP1, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertEquals(quickfix.fix50sp2.News.NoLinesOfText.class, factory.create(FixVersions.FIX50SP2, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertEquals(quickfix.fixlatest.News.NoLinesOfText.class, factory.create(FixVersions.FIXLATEST, MsgType.NEWS, NoLinesOfText.FIELD).getClass());
        assertNull("if group can't be created return null",
                factory.create(BEGINSTRING_FIX40, MsgType.MARKET_DATA_SNAPSHOT_FULL_REFRESH, NoMDEntries.FIELD));
    }

    private static void assertMessage(Class<?> expectedMessageClass, String expectedMessageType, Message message) throws Exception {
        assertEquals(expectedMessageClass, message.getClass());
        assertEquals(expectedMessageType, message.getHeader().getString(MsgType.FIELD));
    }

    @Parameterized.Parameters(name = "defaultApplVerID = {0}")
    public static Object[][] getParameters() {
        return new Object[][] {
                {ApplVerID.FIX40, quickfix.fix40.Email.class},
                {ApplVerID.FIX41, quickfix.fix41.Email.class},
                {ApplVerID.FIX42, quickfix.fix42.Email.class},
                {ApplVerID.FIX43, quickfix.fix43.Email.class},
                {ApplVerID.FIX44, quickfix.fix44.Email.class},
                {ApplVerID.FIX50, quickfix.fix50.Email.class},
                {ApplVerID.FIX50SP1, quickfix.fix50sp1.Email.class},
                {ApplVerID.FIX50SP2, quickfix.fix50sp2.Email.class},
                {ApplVerID.FIXLATEST, quickfix.fixlatest.Email.class}
        };
    }
}

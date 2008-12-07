package quickfix.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests the correctness of the {@link ExpectedTestFailure} utility wrapper
 * @author Toli Kuznets
 * @version $Id: ExpectedTestFailureTest.java 211 2006-07-20 15:08:14Z toli $
 */
public class ExpectedTestFailureTest extends TestCase
{
    public ExpectedTestFailureTest(String inName)
    {
        super(inName);
    }

    public static Test suite()
    {
        // run the test repeatedly since we can have a race condition
        return new TestSuite(ExpectedTestFailureTest.class);
    }

    public void testClassSpecified()
    {
        final RuntimeException ex = new RuntimeException();
        assertEquals(ex, (new ExpectedTestFailure(RuntimeException.class) {
            protected void execute() throws Throwable
            {
                throw ex;
            }
        }).run());
    }

    public void testMatchSpecified()
    {
        final RuntimeException rex = new RuntimeException("toli was here");
        assertEquals(rex, (new ExpectedTestFailure(RuntimeException.class, "toli") {
                protected void execute() throws Throwable
                {
                    throw rex;
                }
            }).run());
        final IllegalArgumentException ex = new IllegalArgumentException("toli was here");
        assertEquals(ex, (new ExpectedTestFailure(IllegalArgumentException.class, "was") {
                protected void execute() throws Throwable
                {
                    throw ex;
                }
            }).run());


    }

    /** Check the case when the exception has a message (toString()) but getMessage() returns null */
    public void testExceptinoHasNoMessageButHasString() throws Exception {
        final Exception ex = new Exception() {
            public String toString() {
                return "internal message 32";
            }
        };

        assertEquals(ex, new ExpectedTestFailure(Exception.class, "message 32") {
            protected void execute() throws Throwable {
                throw ex;
            }
        }.run());
    }

}

package quickfix.test.util;

import junit.framework.Assert;

/**
 * A wrapper around a piece of code that we expect to fail and throw an exception.
 * We wrap the call, capture the exception and verify the excpetion class is as expected.
 * If the "contains" string is provided we verity that it matches the excepion output as well.
 *
 * <PRE>
 *  (new ExpectedTestFailure(OrderParsingException.class) {
 *    protected void execute() throws OrderParsingException {
 *       <... Code throwing exception goes here ... >
 *  }}).run();
 * </PRE>
 *
 * @author Toli Kuznets
 * @version $Id: ExpectedTestFailure.java 211 2006-07-20 15:08:14Z toli $
 */
public abstract class ExpectedTestFailure
{
    private String mContains;
    private Class<?> mThrowable;

    public ExpectedTestFailure(Class<?> inThrowable) {
        this(inThrowable, null);
    }

    public ExpectedTestFailure(Class<?> inThrowable, String inContains)
    {
        mThrowable = inThrowable;
        mContains = inContains;
    }

    /** Subclasses must override this method with an implementation that
     * throws their expected error
     * @throws Throwable
     */
    protected abstract void execute() throws Throwable;

    /** Executes the code that was implemented in @link {execute()} method */
    public Throwable run()
    {
        try {
            execute();
        } catch(Throwable error) {
            validateError(error);
            return error;
        }
        Assert.fail("Expected an error but no exception was thrown");
        return null;
    }

    /** Validate the passed-in throwable against the class that we expected to find
     * The message of the passed in trowable is validated againt the expected message
     * if there is one
     *
     * If we are expecting a message but the incoming exception.getMessage() doesn't contain it, 
     * also check exception.toString() as well - for the case of exceptions that aren't
     * constructed correctly
     *
     * @param inError throwable to validate
     */
    protected void validateError(Throwable inError)
    {
        if ((mThrowable!=null) &&
            (!mThrowable.isAssignableFrom(inError.getClass()))) {
            Assert.fail("Thrown throwable was of the wrong class: "+
                        inError.getClass()+": "+inError);
        }
        if ((mContains!=null) &&
            (((inError.getMessage()==null) ||
             (inError.getMessage().indexOf(mContains)==-1))) &&
            (inError.toString().indexOf(mContains) == -1)) {
            Assert.fail("Thrown throwable contained incorrect message: "+
                        "looking for '" + mContains + "' in '" + inError.getMessage() + "'");
        }
    }
}

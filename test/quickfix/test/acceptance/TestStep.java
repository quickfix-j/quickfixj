package quickfix.test.acceptance;

import junit.framework.TestResult;


public interface TestStep {
    void run(TestResult result, TestContext context) throws Exception;
}

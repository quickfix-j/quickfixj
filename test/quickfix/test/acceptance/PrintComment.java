package quickfix.test.acceptance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestResult;

public class PrintComment implements TestStep {
    private Log log = LogFactory.getLog(getClass());
    private String line;
    
    public PrintComment(String line) {
        this.line = line;
    }

    public void run(TestResult result, TestContext context) throws Exception {
        log.info(line);
    }

}

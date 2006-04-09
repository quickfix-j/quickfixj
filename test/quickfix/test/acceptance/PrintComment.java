package quickfix.test.acceptance;

import junit.framework.TestResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintComment implements TestStep {
    private Logger log = LoggerFactory.getLogger(getClass());
    private String line;
    
    public PrintComment(String line) {
        this.line = line;
    }

    public void run(TestResult result, TestConnection connection) throws Exception {
        log.info(line);
    }

}

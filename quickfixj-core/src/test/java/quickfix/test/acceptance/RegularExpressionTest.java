package quickfix.test.acceptance;

import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegularExpressionTest {

    private static final String fixVersion = "fixLatest";
    private static final String unixPathString = fixVersion + "/20_SimultaneousResendRequest.def";
    private static final String windowsPathString = fixVersion + "\\20_SimultaneousResendRequest.def";
    @Test
    public void testRegularExpressionForExtractingFixVersionFromPath() {
        Matcher matcher = ATServer.fixVersionFromTestLocationPattern.matcher(unixPathString);
        assertTrue (matcher.find());
        assertEquals(fixVersion, matcher.group(1));

        matcher = ATServer.fixVersionFromTestLocationPattern.matcher(windowsPathString);
        assertTrue (matcher.find());
        assertEquals(fixVersion, matcher.group(1));
    }
}

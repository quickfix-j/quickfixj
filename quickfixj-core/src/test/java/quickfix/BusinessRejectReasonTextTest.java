package quickfix;

import org.junit.Test;

import static org.junit.Assert.*;

public class BusinessRejectReasonTextTest {

    @Test
    public void testMessage() {
        assertEquals("Other", BusinessRejectReasonText.getMessage(0));
    }

    @Test
    public void testToText() {
        assertEquals("Other", BusinessRejectReasonText.toText("OTHER"));
        assertEquals("Other", BusinessRejectReasonText.toText("other"));
        assertEquals("Other Reason", BusinessRejectReasonText.toText("OTHER_REASON"));
        assertEquals("Another Other Reason", BusinessRejectReasonText.toText("ANOTHER_OTHER_REASON"));
    }
}

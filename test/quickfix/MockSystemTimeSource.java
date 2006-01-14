package quickfix;

import java.util.Calendar;

public class MockSystemTimeSource implements SystemTimeSource {
    private long systemTime;
    
    public MockSystemTimeSource() {
        // empty
    }
    
    public MockSystemTimeSource(long time) {
        this.systemTime = time;
    }
    
    public void setTime(long time) {
        systemTime = time;
    }
    
    public void setTime(Calendar c) {
        systemTime = c.getTimeInMillis();
    }
    
    public long getTime() {
        return systemTime;
    }
}

package quickfix;

public class MockSystemTimeSource implements SystemTimeSource {
    private long systemTime;
    
    public MockSystemTimeSource(long time) {
        this.systemTime = time;
    }
    
    public long getTime() {
        return systemTime;
    }
}

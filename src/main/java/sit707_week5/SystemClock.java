package sit707_week5;

public class SystemClock implements Clock {
    
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    
    public void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

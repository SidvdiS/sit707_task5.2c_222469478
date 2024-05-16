package sit707_week5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FakeClock implements Clock {
    private long currentTimeMillis;

    public FakeClock(long currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }

   
    public long currentTimeMillis() {
        return currentTimeMillis;
    }

   
    public void sleep(long millis) throws InterruptedException {
        // Do nothing for fake clock
    }

    public void advanceTime(long millis) {
        currentTimeMillis += millis;
    }

    public String getCurrentTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(currentTimeMillis));
    }
}


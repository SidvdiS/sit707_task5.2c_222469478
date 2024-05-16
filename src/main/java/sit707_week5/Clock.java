package sit707_week5;

public interface Clock {
	long currentTimeMillis();
    void sleep(long millis) throws InterruptedException;
}

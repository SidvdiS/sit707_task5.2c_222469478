package sit707_week5;

import org.junit.Assert;
import org.junit.Test;

public class WeatherControllerTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "222469478";
		Assert.assertNotNull("Student ID is 222469478", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Siddharth";
		Assert.assertNotNull("Student name is Siddharth", studentName);
	}
	
	@Test
	public void testTemperaturePersist() {
		    FakeClock fakeClock = new FakeClock(System.currentTimeMillis());
		    WeatherController wController = new WeatherController(fakeClock);
	
		    // Simulate persistence action
		    String persistenceTimeString = wController.persistTemperature(1, 25.0);
	
		    // Get the current time in string format
		    String expectedPersistenceTimeString = fakeClock.getCurrentTimeString();
	
		    // Verify the timestamp
		    Assert.assertEquals(expectedPersistenceTimeString, persistenceTimeString);
	
		    // Shutdown controller
		    wController.close();
	}
}

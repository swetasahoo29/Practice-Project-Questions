package TaskSchedule;

import java.util.TimerTask;
import java.util.Date;

public class ScheduledTask extends TimerTask {

	Date now; // to display current time

	public void run() {
		now = new Date(); // initialize date
		System.out.println("Time is :" + now); // Display current time
	}
}
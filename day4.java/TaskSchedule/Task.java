// Timer class method
// You should create a class extending TimerTask(available in java.util package)
// TimerTask is a abstract class.
// This method schedules the specified task for execution at the specified time.
//  If the time is in the past, it schedules the task for immediate execution.
package TaskSchedule;
import java.util.Timer;
public class Task {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 1000); // Create Repetitively task for every 1sec

		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
	}
}
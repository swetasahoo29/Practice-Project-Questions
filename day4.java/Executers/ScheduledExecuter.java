package Executers;
//The ScheduledExecutorService interface in Java is a sub-interface of ExecutorService interface
//runs tasks after some predefined delay or periodically
//The schedule methods create tasks with various delays and return a task object that can be used to cancel or check execution
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuter {

    public static void main(String[] args) {

        ScheduledExecutorService session = Executors.newScheduledThreadPool(1);

        Runnable task2 = () -> System.out.println("Running task2...");

        task1();

        //run this task after 5 seconds, nonblock for task3
        session.schedule(task2, 5, TimeUnit.SECONDS);

        task3();

        session.shutdown();

    }

    public static void task1() {
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }

}

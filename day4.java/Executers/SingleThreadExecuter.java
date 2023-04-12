//Single thread executor service can execute both Runnable and Callable tasks
//Single thread executor, when we would like to execute tasks one after another
package Executers;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * Instantiates a thread pool with a single thread
 * All tasks are executed sequentially by the same thread
 */

public class SingleThreadExecuter {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Thread main started");

        Runnable task1 = () -> {
             System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
             try {
                 TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                 throw new IllegalStateException(e);
            }
        };

        Runnable task2 = () -> {
             System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
             try {
                  TimeUnit.SECONDS.sleep(4);
             } catch (InterruptedException e) {
                  throw new IllegalStateException(e);
             }
        };

        Runnable task3 = () -> {
             System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                 TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                 throw new IllegalStateException(e);
            }
       };

       final ExecutorService executorService = Executors.newSingleThreadExecutor();
       System.out.println("Submitting the tasks for execution...");
       executorService.submit(task1);
       executorService.submit(task2);
       executorService.submit(task3);

       executorService.shutdown();

       System.out.println("Thread main finished");
    }
}
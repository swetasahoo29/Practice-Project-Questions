//Write a program to run a simple ascynronous stage using completableFuture.Run a task asychronously and return the result.
//A completable future implements the future and the completionstage interfaces provides methods for combining multiple futures.
//It supports exceptionhandling
//a future is used as a refrence to the result of asynchronous computation
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletableFuture;

public class AsynchronousStage {
     //Asynchronous is writing a non-blocking code by running a task on a separate thread rather than the main application thread
     //so that the main thread will be able to execute task without waiting and execute other tasks in parallel
    public static void main(String[] args) throws InterruptedException {
        //throws exception when a thread is interrupted while it's waiting, sleeping, or otherwise occupied
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> fetchData());
        //supplyAsync() method which takes a Supplier and returns a new CompletableFuture
        future.thenAccept(s -> System.out.println(s));//The thenAccept method receives a Consumer and passes it the result of the computation.It waits for the future to complete
        System.out.println("Program is running...");
        Thread.sleep(2000);
    }
    private static String fetchData() {//private member is only visible within the class
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // prints the throwable along with other details like the line number and class name where the exception occurred. printStackTrace() is very useful in diagnosing exceptions
        }
        return "Sweta Sahoo";
    }

}

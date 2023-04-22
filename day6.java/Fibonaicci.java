//write a fork and join program to find the fibonaicci no. by using recursive loop.
//here each subtask produce its own subtask
//forked to split a task to many subtask and join all the results to find the final result
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class FibonacciTask extends RecursiveAction {
    private final int n;
    private long result;

    public FibonacciTask(int n) {
        this.n = n;//this keyword can be used to refer current class instance variable
    }

    public long getResult() {
        return result;
    }

    @Override
    protected void compute() {
        if (n <= 1) {
            result = n;
        } else {
            FibonacciTask leftTask = new FibonacciTask(n - 1);
            FibonacciTask rightTask = new FibonacciTask(n - 2);
            leftTask.fork();//Call compute directly which will result in again divide & conquer
            rightTask.compute(); //work on right task, this is a recursive call
            leftTask.join();//join all result to leftside of queue
            result = leftTask.getResult() + rightTask.getResult();
        }
    }


}

public class Fibonaicci {
    public static void main(String[] args) {
        int n = 10;
        FibonacciTask task = new FibonacciTask(n);// ForkJoinTask is the base type for tasks executed inside ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();//ForkJoinPool is used to execute ForkJoinTask
        pool.invoke(task);
        //The invoke() method of ForkJoinPool class performs the task specified as the parameter and returns the result on its completion
        System.out.println("The Fibonacci number at position " + n + " is " + task.getResult());
    }
}
// write a fork and join program to sum all the no. from a range-recursive task.
import java.util.concurrent.*;
class SumTask extends RecursiveTask<Long> {
    private static final long THRESHOLD = 1000; //The size of the array under which this task is no longer split into subtasks
    private final long[] numbers;//aray of no. to sum up
    private final int start;//The initial and final positions of the portion of the array processed by this subtask
    private final int end;

    public SumTask(long[] numbers, int start, int end) { //Private constructor used to recursively create subtasks of the main task.
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override //Override the abstract method of RecursiveTask
    protected Long compute() {//The main computation performed by this task
        int length = end - start; //The size of the portion of the array summed by this task
        if (length <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers[i];
            }
            return sum;
        } else {
            int mid = start + length / 2;
            SumTask leftTask = new SumTask(numbers, start, mid); 
         //Create a subtask to sum the 1st half of the array.
            SumTask rightTask = new SumTask(numbers, mid, end);
         //Create a subtask to sum the 2nd half of the array.
         leftTask.fork();	//Asynchronously execute the newly created subtask using another thread of the ForkJoinPool.
        Long rightResult = rightTask.compute();	//Execute this second subtask synchronously, potentially allowing further recursive splits.
            long leftResult = leftTask.join();
        return leftResult + rightResult;	//The result of this task is the combination of the results of the two subtasks.
        }
    }
}

public class SumNumbers {
    public static void main(String[] args) {
        long[] numbers = new long[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        ForkJoinPool pool = ForkJoinPool.commonPool();
        //The common pool which is a static thread  pool is used by any ForkJoinTask that is not explicitly submitted to a specified pool
        SumTask task = new SumTask(numbers, 0, numbers.length);
        long result = pool.invoke(task);
        //The invoke() method of performs the task specified as the parameter and returns the result on its completion
        System.out.println("The sum is: " + result);
    }
}



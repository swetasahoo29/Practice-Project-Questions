//java program to find even numbers using streams
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> evenNumbers = Arrays.stream(array)
            .filter(n -> n % 2 == 0)//filter the stream to keep only the even numbers
            .boxed() // box the filtered numbers into Integer objects
            .collect(Collectors.toList()); // collect the resulting stream into a list

        System.out.println("Even numbers: " + evenNumbers);
    }
}
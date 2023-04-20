//Write a list of integers,find out all the even no. exist in the list using stream functions.
import java.util.*;
//Stream is a new abstract layer where we can process data in a declarative way similar to SQL statements.
// It is nt a data structure,it takes input from collections or arrays.
import java.util.stream.*;
public class IntegerList {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            //we can convert from an array to a fixed-size List object. This List is just a wrapper that makes the array available as a list.
            myList.stream()
                  .filter(n -> n%2 == 0)//filter stream elements on the basis of a given predicate
                  .forEach(System.out::println);//The forEach() method calls a function and iterates over the elements of an array
    }
}

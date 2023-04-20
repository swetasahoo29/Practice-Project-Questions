//Given a list of integers, find out all the even numbers exist in the list using Stream functions, used custom predicate for filter().
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenStream {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<=10; i++)
            a.add(i);
        //arr.forEach(System.out::println);
        Stream<Integer> s = a.stream();
        System.out.println(s.filter(EvenStream::evenPredicate).collect(Collectors.toList())); //Predicates examine a condition and send a boolean value
    }   

    public static boolean evenPredicate(Integer i) {
        return i%2 == 0;
    }
}
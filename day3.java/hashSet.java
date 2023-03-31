import java.util.HashSet;
import java.util.Set;

public class hashSet { //HashSet class is used to create a collection that uses a hash table for storage

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); //avoid duplicate items, stores in a series
        set1.add("Welcome");
        set1.add("to");
        set1.add("Publicis");
        set1.add("Sapient");
        
        Set<String> set2 = new HashSet<>();
        set2.add("Welcome");
        set2.add("to");
        set2.add("Publicis");
        set2.add("Sapient");

        boolean isEquals = set1.equals(set2);
        System.out.println("Is set 1 and set 2 equal ? : "+isEquals);

    }
}

package sorting;
import java.util.Comparator;

public class SortComparator  implements Comparator<String>{
    
    @Override
    public int compare(String c1, String c2){
        return c2.compareTo(c1);
    }
}


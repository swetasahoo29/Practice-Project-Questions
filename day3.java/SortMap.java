import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class SortMap { //map contains values on key value pair(entry)
  public static void main(String[] args) {

    // create a hashmap(interface of map)
    Map<String, String> languages = new HashMap<>();

    languages.put("p2","JS");
    languages.put("p1","python");
    languages.put("p3","java");
    System.out.println("Map: " + languages);

    // create a tree map from the map
    // TreeMap<Integer, String> sortedNumbers = new TreeMap<>(languages); 
    // System.out.println("Map with sorted Key" + sortedNumbers);

  }
}
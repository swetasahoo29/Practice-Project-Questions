//ConcurrentHashMap is a thread-safe implementation of the Map interface in Java, which means multiple threads can access it simultaneously without any synchronization issues
import java.util.*;   
import java.util.concurrent.*;   
    
public class ConcurrentHahmap  {   
    public static void main(String[] args)   
    {   
        ConcurrentHashMap<String, Integer>  mymap = new ConcurrentHashMap<String,  Integer>();   
    //ConcurrentHashMap is a thread-safe implementation of the Map interface, which means multiple threads can access it simultaneously without any synchronization issues
        mymap.put("AAA", 10);   
        mymap.put("BBB", 15);   
        mymap.put("CCC", 25);   
        mymap.put("DDD", 255);   
        mymap.put("EEE",30);   
        System.out.println(" Mappings are: " +mymap);   
  
        System.out.println("is 255  present? ::  " + mymap.containsValue(255));  
        //checks whether a particular value is being mapped by a single or more than one key in the HashMap
   
    }   
}  
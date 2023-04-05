package sorting;
import java.util.*;   
public class Sort  
{   
public static void main(String args[])   
{   
// creating object of ArrayList class  
ArrayList<String> list = new ArrayList<String>();   
// adding elements to the ArrayList   
list.add("French");   
list.add("German");   
list.add("Spanish");   
list.add("Italian");   
list.add("English");     
// printing the unsorted ArrayList   
System.out.println("Before Sorting: "+ list);   
// Collections.sort(list);// Sorting in ascending Order   
// Collections.reverse(list); //in descending order
Collections.sort(list, new SortComparator()); //using comparator-reverse order

// printing the sorted ArrayList   
System.out.println("After Sorting: "+ list);   
}   
}  
//comparator allows to sort based on what condition we want(replacement of reverse order)
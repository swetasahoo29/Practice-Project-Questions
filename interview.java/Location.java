//sorting a string in reverse order using collections

import java.util.*;
public class Location{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();

        al.add("Banglore");
        al.add("Bhubaneswar");
        al.add("Hyderabad");
        al.add("Delhi");
        al.add("Kolkata");
        System.out.println("list before sorting:"+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("list after sorting in descending order:" +al);

    }
}
import java.util.*;
class Elements
{
        public static void main(String[] args)
        {
                ArrayList<String> al = new ArrayList<String>();
                System.out.println("Size of ArrayList: "+al.size());
                //Adding the elements
                al.add("Java");
                al.add("Python");
                System.out.println("Elements of first ArrayList: "+al);

                ArrayList<String> a2 = new ArrayList<String>();
                a2.add("Web designing");
                a2.add("Web development");
                //Adding the both array
                a2.addAll(al);
                System.out.println("Elements of second ArrayList: "+a2);
                //remove the element
                a2.remove("Web designing");
                System.out.println("Elements of ArrayList after deletion: "+a2);
                System.out.println("Size of ArrayList: "+a2.size());
                //Retriving 2nd index element
                System.out.println("The element at 2nd index is: "+a2.get(2));
        }
}
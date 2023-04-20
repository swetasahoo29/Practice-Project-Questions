//How to check if list is empty in java 8 using optional,if nt null iterate through the list and print the object.
import java.util.*;

public class EmptyList {
	public static void main(String[] args)
	{
		// creating an Empty Integer List
		List<Integer> a = new ArrayList<Integer>(10);

		// check if the list is empty or not
		// using isEmpty() function
		boolean ans = a.isEmpty();
		if (ans == true)
			System.out.println("The List is empty");
		else
			System.out.println("The List is not empty");

		// addition of a element to
		// the List
		a.add(1);

		// check if the list is empty or not
		// after adding an element
		ans = a.isEmpty();
		if (ans == true)
			System.out.println("The List is empty");
		else
			System.out.println("The List is not empty");
	}
}


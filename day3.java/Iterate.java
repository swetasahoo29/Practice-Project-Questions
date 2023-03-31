import java.util.LinkedList;
import java.util.Iterator;
public class Iterate
{
	public static void main(String[] args)
	{
		LinkedList<String> program_list = new LinkedList<String>();
		program_list.add("C");
		program_list.add("Java");
		program_list.add("JS");
		program_list.add("Python");
		program_list.add("Reactjs");
		program_list.add("Css");
		program_list.add("Html");
		program_list.add("MySql");
		System.out.println("linked list:" + program_list);
		Iterator i = program_list.descendingIterator(); //traverse a collection
		System.out.println("Reverse Order:");
		//return true if the given list iterator contains more number of element during traversing the given list
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}
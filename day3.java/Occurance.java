import java.util.LinkedList;
public class Occurance
{
	public static void main(String[] args)
	{
		LinkedList<String> subject = new LinkedList<String>();
		subject.add("Hindi");
		subject.add("Maths");
		subject.add("Social Science");
		subject.add("Science");
		subject.add("Computer");
		subject.add("English");
		System.out.println("Given linked list :" + subject);  
		Object s = subject.getFirst();
		System.out.println("First Element : "+s);
		Object s1 = subject.getLast();
		System.out.println("Last Element : "+s1);
	}
}
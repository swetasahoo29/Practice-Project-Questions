// Java program to illustrate CopyOnWriteArrayList class
//CopyOnWriteArrayList creates a Cloned copy of underlying ArrayList, for every update operation at a certain point both will be synchronized automatically, which is taken care of by JVM.
// Therefore, there isnt any effect for threads that are performing read operation.
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite extends Thread {

	static CopyOnWriteArrayList<String> l
		= new CopyOnWriteArrayList<String>();

	public void run()
	{
		// Child thread trying to
		// add new element in the
		// Collection object
		l.add("D");
	}

	public static void main(String[] args)
		throws InterruptedException
	{
		l.add("A");
		l.add("B");
		l.add("c");

		// We create a child thread
		// that is going to modify
		// ArrayList l.
		CopyOnWrite t = new CopyOnWrite();
		t.start();

		Thread.sleep(1000);

		// Now we iterate through
		// the ArrayList and get
		// exception.
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}

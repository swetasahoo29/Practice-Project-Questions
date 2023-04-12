//A Thread is a very light-weighted process, or we can say the smallest part of the process that  
//allows a program to operate more efficiently by running multiple tasks simultaneously
class Name extends Thread {
	public void run()
	{
		System.out.print("Sweta Sahoo");
	}
	public static void main(String[] args)
	{
		Name n = new Name(); // creating thread
		n.start(); // starting thread
	}
}

// Java Program to illustrate the concept of interrupt() method while a thread stops working
// The interrupt() method of thread class is used to interrupt the thread
// throws an interrupted exception
class Name extends Thread {
	public void run()
	{
		try {
			Thread.sleep(2000);
			System.out.println("Sweta Sahoo");
		}
		catch (InterruptedException e) {
			throw new RuntimeException("Thread " +
									"interrupted");
		}
	}
	public static void main(String args[])
	{
		Name n1 = new Name();
		n1.start();
		try {
			n1.interrupt();
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
}

package ThreadPriority;
//minimum value=1
public class MinimumPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        MinimumPriority t1=new MinimumPriority();    
        // print the minimum priority of this thread  
        t1.setPriority(Thread.MIN_PRIORITY);    
        // This will call the run() method  
        t1.start();    
    }    
} 
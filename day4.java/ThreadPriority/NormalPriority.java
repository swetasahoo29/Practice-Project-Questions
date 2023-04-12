package ThreadPriority;
//default priority=5
public class NormalPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());//get priority of thr thread
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        NormalPriority t1=new NormalPriority();    
        // print the normal priority of this thread  
        t1.setPriority(Thread.NORM_PRIORITY);  //set priority with an int number  
        // starting the thread   
        t1.start();    
    }    
}  
package day5_set1;

public class Thread_eg1 implements Runnable {
	public void run() {
		
	}
public static void main(String[]args)
{
	Thread thread1=new Thread();
	
	try {
		Thread.sleep(1000);
	
	}
	catch(InterruptedException e)
	{
		e.getStackTrace();
	}
	thread1.setPriority(7);
	int priority=thread1.getPriority();
	System.out.println(priority);
	thread1.start();
	System.out.println("thread running");
}

}
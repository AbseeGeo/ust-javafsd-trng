package day5_set1;

public class Thread_eg1 implements Runnable {
	public void run() {
		
	}
public static void main(String[]args)
{
	Thread thread1=new Thread();
	thread1.start();
	try {
		Thread.sleep(1000);
	
	}
	catch(InterruptedException e)
	{
		e.getStackTrace();
	}
	thread1.setPriority(1);
	int priority=thread1.getPriority();
	System.out.println(priority);
	System.out.println("thread running");
}

}
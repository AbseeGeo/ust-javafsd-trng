package day5_set1;


public class Thread_sleep implements Runnable{
	public void run()
	{
		System.out.println("doing heavy processing-START"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			doDBPrrocessing();
		}
		catch(InterruptedException e)
		{
			e.getStackTrace();
		}
		System.out.println("doing heavy processing-END"+Thread.currentThread().getName());
	}
private void doDBPrrocessing() throws InterruptedException{
	Thread.sleep(5000);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Runnable t=new Thread_sleep();
t.run();
}
}

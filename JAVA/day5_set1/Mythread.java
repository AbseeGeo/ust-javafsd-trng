package day5_set1;

public class Mythread extends Thread {
	public Mythread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("mythread start"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("mythread end"+Thread.currentThread().getName());
	}
		
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1=new Mythread("Absee");
	t1.start();
	}
	}




package day5_set1;



public class Threadeg1 {
	public static void main(String[]arg)
	{
		Thread1 b=new Thread1();
		b.start();
		synchronized(b)
		{
			try {
				System.out.println("waiting for b to ccompletee");
				b.wait();
				
			}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
			System.out.println("total is:"+b.total);
		}
	}

}
class Thread1 extends Thread
{
	int total;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				total+=i;
			}
			notify();
		}
	}
}

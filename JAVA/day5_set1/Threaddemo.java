package day5_set1;
import java.lang.*;
public class Threaddemo implements  Runnable {
	Thread t;
	Threaddemo(String str)
	{
		t=new Thread(this,str);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if((i%5)==0)
			{
				System.out.println(Thread.currentThread().getName()+"yielding control........");
				Thread.yield();
				
			}
				
		}
		System.out.println(Thread.currentThread().getName()+"has finished executing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Threaddemo("thread1");
new Threaddemo("thread2");
new Threaddemo("thread3");
	}

}

package day5_set1;

public class Threadeg  implements Runnable{
	public static void main(String[] args)
	{
		Thread Thread1=new Thread("guru1");
		Thread Thread2=new Thread("guru2");
		Thread1.start();
		Thread2.start();
		System.out.println("thread name are following:");
		System.out.println(Thread1.getName());
				System.out.println(Thread2.getName());
	}
	public void run() {
	}
	
	}



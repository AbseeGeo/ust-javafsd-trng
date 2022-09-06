package day3;
interface A1{
	void show1();
}
interface B1{
	void display1();
}
class Q2_interface implements A1,B1
{
	public void show1()
	{
		System.out.println("WELCOME");
	}

	public void display1()
	{
		
		System.out.println("HAVE A NICE DAY");
		
	}
		public static void main(String[]args)
		{
			
			Q2_interface a=new Q2_interface();
			a.show1();
			a.display1();
			
		}
	}

package day3;

class Ani
{
	public void display()
	{
		System.out.println("im an animal");
	}
}
class Dogs extends Ani
{
	public void display()
	{
		System.out.println("im  dogg");
	}
	public void printMessage()
	{
		display();
		super.display();
	}
	}

class Overriden_animal {
	public static void main(String[]args)
	{
		Dogs d1=new Dogs();
		d1.printMessage();
	}
}
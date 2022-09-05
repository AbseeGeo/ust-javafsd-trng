package This;

class Animals1 {
	public void display()
	{
		System.out.println("im an animal");
	}

}
class Dog1 extends Animals1
{
	public void display()
	{
		System.out.println("im a dog");
		
	}
	public void printMessage()
	{
		display();
		super.display();
	}
}

class Animal_override
{
	public static void main(String[]args)
	{
		Dog1 d=new Dog1();
		d.printMessage();
		
	}
}

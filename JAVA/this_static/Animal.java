package This;

class Animals {
	public void display()
	{
		System.out.println("im an animal");
	}

}
class Dog extends Animals
{
	public void display()
	{
		System.out.println("im a dog");
		
	}
	public void printMessage()
	{
		display();
	}
}

class Animal
{
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.printMessage();
		
	}
}

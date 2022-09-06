package day3;
class Main
{
	public void eat()
	{System.out.println("i can eat");
	
	}
}
class Dog122 extends Main
{
	public void eat()
	{
		super.eat();
		System.out.println("i eat dog food");
		}
	public void bark()
	{
		System.out.println("i can bark");
	
	
	}
}
class Inherit_overide {
public static void main(String[]args)
{
	Dog122 d=new Dog122();
	d.eat();
	d.bark();
}
}

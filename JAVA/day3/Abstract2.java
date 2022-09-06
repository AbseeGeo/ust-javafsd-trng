package day3;
abstract class Animal
{
	abstract void makeSound();
	public void eat()
	{
		System.out.println("i can eat");
		
	}
}
class Dog23 extends Animal
{
	public void makeSound()
	{
		System.out.println("bark bark");
	}
}
class Abstract2 {

	public static void main(String[]args)
	{
		Dog23 d1=new Dog23();
		d1.makeSound();
		d1.eat();
	}

}

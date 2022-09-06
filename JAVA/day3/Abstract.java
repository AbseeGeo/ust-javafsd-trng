package day3;
abstract class Ab
{
	abstract void makesound();
	public void eat()
	{
		System.out.println("i can eat");
	}
}
class Abstract {
	public static void main(String[]args)
	{
		Dog d1=new Dog();
		d1.makesound();
		d1.eat();
	}
	

}

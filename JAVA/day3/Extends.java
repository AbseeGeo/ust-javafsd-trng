package day3;
abstract class Anim12
{
	abstract void makesound();
	public void eat()
	{
		System.out.println("i can eat");
	}
}
class Ann extends Anim12
{
	public void makesound()
	
	
	{
		System.out.println("barkkkk");
	}
}


class Extends {
	public static void main(String [] args)
	{
		Ann a=new Ann();
		a.makesound();
		a.eat();
	}

}

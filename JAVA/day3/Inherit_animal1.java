package day3;
class Animl
{
	Animl()
	{
		System.out.println("im animal");
	}
	Animl(String type)
	{
		System.out.println("type:"+type);
	}
}
class Dogo extends Animl
{
	Dogo()
	{
		super("animal");
		System.out.println("im a dog");
	}
}
class Inherit_animal1 {
	public static void  main(String[]args)
	{
		Dogo d=new Dogo();
	}

}

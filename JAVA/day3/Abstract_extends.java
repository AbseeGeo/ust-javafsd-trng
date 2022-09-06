package day3;
abstract class Motor
{
	abstract void brake();
	
	
}
class Sports1 extends Motor
{
	public  void brake()
	{
		System.out.println("sportbike brake");
		
	}
}
class Mot extends Motor
{
	public  void brake()
	{
		System.out.println("motorbike brake");
		
	}
}

class Abstract_extends {
	public static void main(String[]args)
	{
		Mot m=new Mot();
		m.brake();
		Sports1 s=new Sports1();
		s.brake();
		
	}
	
	
	

}

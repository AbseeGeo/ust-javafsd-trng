package day3;

abstract class MotorBike{
	abstract void brake();
}

class Sports extends MotorBike
{
	public void  brake()
	{
		System.out.println("sportsbike brake");
	}
}
class Mountainbike extends MotorBike
{
	public void  brake()
	{
		System.out.println("mountainbike brake");
	}
}
class Abstract3 {
	public static void main(String[]args)
	{
		Mountainbike m=new Mountainbike();
		m.brake();
		Sports m1=new Sports();
		m1.brake();
		
	}

}

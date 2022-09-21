package default_static;

public class Static_default  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle vehicle=new Car();
vehicle.print();

	}

}
interface Vehicle
{
	default void print()
	{
		System.out.println("im a vehicle");
	}
	static void blowHorn()
	{
		System.out.println("blowing horn");
	}
}
interface FourWheeler{
	default void print()
	{
		System.out.println("im a 4 wheeler");
	}
}
class Car implements Vehicle,FourWheeler
{
	public void print()
	{
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("im a car");
			
		}
	}

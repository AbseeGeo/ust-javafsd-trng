package day3;
class Anim
{
	protected String type="animal";
	
}
class Dog1 extends Anim
{
	public String type="mammal";
	public void printType()
	{
		System.out.println("im a "+type);
		System.out.println("im an "+super.type);
	}
}












class Inherit_animal {
public static void main(String[]args)
{
Dog1 d=new Dog1();
d.printType();
}
}

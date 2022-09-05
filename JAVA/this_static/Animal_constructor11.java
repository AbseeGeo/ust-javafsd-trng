package This;
class Animalss
{
	protected String  type="animal";
}
class Dog5 extends Animalss
{
	public String type="mammal";
	public void printType()
	{
		System.out.println("iam a"+type);
		System.out.println("iam an "+super.type);
	}
}
class Animal_constructor11
{
	public static void main(String[]args)
	{		
		Dog5 dog1=new Dog5();
		dog1.printType();
		
	}

}

package day3;
class Animalll
{
	protected void displayinfo()
	{
		System.out.println("im animal");
	}
}
class Dog extends Animalll
{
	public void displayinfo()
	{
		System.out.println("im dog");
		
	}
}
class Inherit {
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.displayinfo();
	}

}

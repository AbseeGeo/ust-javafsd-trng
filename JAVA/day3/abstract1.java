package day3;

abstract class  Mains{
	public void display()
	{
		System.out.println("java programming");
	}

}
class abstract1 extends Mains
{
	public static void main(String[]args)
{
		abstract1 obj=new abstract1();
		obj.display();
}
}

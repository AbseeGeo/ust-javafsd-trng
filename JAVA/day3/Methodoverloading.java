package day3;

class Methodoverloading {
	private static void display(int a)
	{
		System.out.println("Got integer data");
		
	}
private static void display(String a)
{
	System.out.println("got string object");

}
public static void main(String []args)
{
	display(1);
	display("hello");
}
}

package generic;

public class Gen<T extends Number> {
	public void display()
	{
		System.out.println("this is bounded type ");
	}

}
class  Generic9
{
	public static void main(String[]args)
	{
		Gen<String> obj=new Gen<>();
	}
}
package default_static;
interface Test
{
	public void square(int a);
	default void show()
	{
		System.out.println("default method executed");
	}
}
public class Test_default implements Test {

	public void square(int a)
	{
		System.out.println(a*a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_default b=new Test_default();
b.square(4);
b.show();
	}

}

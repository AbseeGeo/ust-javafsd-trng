package interfaces_programs;

interface ABC
{
	void funcA();
	interface BCD extends ABC
	{
		void funcB();
	}
class CDE implements  ABC{
public void funcA()
{
	System.out.println("this is funcA");
	
}
public void funcB()
{
	System.out.println("This  is Func B");
}
}
public class Demo
{
	public static void main(String args[])
	{
		CDE obj=new CDE();
		obj.funcA();
		obj.funcB();
		
	}
}

}

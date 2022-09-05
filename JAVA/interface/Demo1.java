package interfaces_programs;

import interfaces_programs.ABC.CDE;

interface ABC1
{
	void funcA();
	interface BCD extends ABC1
	{
		void funcB();
	}
class CDE1 implements  ABC1{
public void funcA()
{
	System.out.println("this is funcA");
	
}
public void funcB()
{
	System.out.println("This  is Func B");
}
}
public class Demo1
{
	public static void main(String args[])
	{
		CDE1 obj=new CDE1();
		obj.funcA();
		obj.funcB();
		
	}
}

}

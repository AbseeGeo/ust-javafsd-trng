package This;

class This_construct1 {
	int val1;
	int val2;
	This_construct1()
	
	{
		this(10,20);
		System.out.println("default constructor");
		
	}
	This_construct1(int val1,int val2)
	{
		this.val1=val1;
		this.val2=val2;
		
		System.out.println("parameterized constructer");
		
	}

}
class This_construct
{
	public static void main(String[]args)
	{
		This_construct1 obj=new This_construct1();
		
	}
}

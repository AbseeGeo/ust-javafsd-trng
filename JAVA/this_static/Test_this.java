package This;

class Test {
	int val_a;
	int val_b;
	Test()
	{
		val_a=10;
		val_b=20;
		
	}
	Test get()
	{
		return this;
		
	}
	void display()
	{
		System.out.println("val a="+val_a+"val b="+val_b);
		
	}

}
class Test_this
{
	public static void main(String []args)
	{
		Test o=new Test();
		o.get().display();
	

	}

	
}

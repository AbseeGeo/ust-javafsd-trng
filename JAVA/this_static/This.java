package This;

class This1 {
	int val1;
	int val2;
	This1(int val1,int val2)
	{
		this.val1=val1+val2;
		this.val2=val2+val2;
		
	}
	void display()
	{
		System.out.println("value val1="+val1+"value val2="+val2);
		
	}

}
class This
{
	public static void main(String[]args)
	{
		This1 object=new This1(5,10);
		object.display();
		
	}
}
package This;

final class Finalsclass {
	public void display()
	{
		System.out.println("final method");
		
	}

}
class fin extends Finalsclass//cant use final to subclass
{
	public void display()
	{
		System.out.println("final method is overriden");
	}
	public  static void main(String[]args)
	{
		fin f=new fin();
		f.display();
	}
}

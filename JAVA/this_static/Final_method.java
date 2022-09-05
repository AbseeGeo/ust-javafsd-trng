package This;

class Final_method {
	public final void display() {
		System.out.println("final method");
		
	}

}
class Moo extends Final_method
{
	public final void display()
	{
		System.out.println("final method is overrideen");
	}



public static void main(String[]args)
{
Moo o=new Moo();
o.display();
}

}

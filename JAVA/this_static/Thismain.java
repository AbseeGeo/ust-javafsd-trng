package This;

class Ghis {
void print()

{
	this.show();

System.out.println("test this::print");

}
void show()
{
	System.out.println("test this::show");
}
}
class Thismain
{
	public static void main(String[]args)
	{
		Ghis t1=new Ghis();
		t1.print();
	}

}

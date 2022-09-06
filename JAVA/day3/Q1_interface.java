package day3;
interface A{
	void show();
}
interface B{
	void display();
}

interface C extends A,B{
	void show();
	void display();
	
}
class Q1_interface implements C{
	
public void show()
{
	System.out.println("haiiiii");
}

public void display()
{
	
	System.out.println("absee geo");
	
}
	public static void main(String[]args)
	{
		
		Q1_interface a=new Q1_interface();
		a.show();
		a.display();
		
	}
}
package interfaces_programs;

class Inter {
	int b;
	int a;
Inter()
{
	a=10;b=20;
}
Inter get() {
	return this;
	
}
void display()
{
	System.out.println("a="+a+"b="+b);
}
public static void main(String[]args)
{
	Inter i=new Inter();
	i.get().display();
}
}



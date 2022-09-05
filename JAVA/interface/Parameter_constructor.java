package interfaces_programs;
class  Parameter_constructor
{int a;
int b;
Parameter_constructor(){
	
	this(10,20);
	System.out.println("inside default constructor");
}
Parameter_constructor(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println("inside parametrised constructor");
}
public static void main(String[]args)
{
	Parameter_constructor obj=new Parameter_constructor();
}
}


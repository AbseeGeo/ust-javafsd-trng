package com.ust;

class Empl {
	String name;
	int age;
	int exp_years;
	String location;
	String designation;
void display()
{
	System.out.println("employee class");
	
}
}
class engineer extends Empl
{
	void display()
	{
		System.out.println("Engineer Class");
		
	
	super.display();

}
}

public class Employ{
public static void main(String args[])
{
	engineer eng=new engineer();
	eng.display();
}	
}


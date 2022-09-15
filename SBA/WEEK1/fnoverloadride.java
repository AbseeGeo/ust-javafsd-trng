package com.ust;
class sal
{
	int fa;
	int ta;
	int ha;
	void display()
	{
		System.out.println("override");
	}
}
class sal1 extends sal
{
	void display() {
		System.out.println("salary1");
		super.display();
		
	}
	
}
class fnoverloadride {
	int salary(int th,int fh) {
		return th+fh;
	}
	float salary(float th ,int fh)
	{
		return th+fh;
		
	}
	public static void main(String args[])
	{
		fnoverloadride o=new fnoverloadride();
		System.out.println(o.salary(350000,4507000));
		System.out.println(o.salary(3456,5555));
		
		
		sal1 a=new sal1();
		a.display();
		
}
}

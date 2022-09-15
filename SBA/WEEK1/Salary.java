package com.ust;

public class Salary 
{
	int empid;
	String name;
	String salary;
	String location;
	

	public static void main(String[]args)
	{
		Salary  e=new Salary();
		e.empid=1233;
		e.name="absee";
		e.salary="1000";
		e.location="delhi";
		System.out.println(e.empid);
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.location);
		
}
}

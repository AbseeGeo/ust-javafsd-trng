package com.ust;

public class Test_this {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		Test_this t=new Test_this();
		this.x=2;
		this.x=3;
		y=4;
		System.out.println("Test.x:"+Test_this.x);
		System.out.println("t.x:"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
		
		
	}
	public static void main(String args[])
	{
		Test_this t=new Test_this();
		t.method1(5);
		
	}

}

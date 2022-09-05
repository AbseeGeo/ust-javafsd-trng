package com.ust;
import java.util.Scanner;
class Input {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter float");
		float myfloat=input.nextFloat();
		System.out.println("float entered"+myfloat);
		System.out.println("enter double");
		double mydouble=input.nextDouble();
		System.out.println("double entered"+mydouble);
		System.out.println("enter text");
		String myString=input.next();
		System.out.println("text entered"+myString);
	}

}

package com.ust;

class A {}
	class B extends A
	{}
	public class InstanceofDemoExample
	{
		public static void main(String[] args)
		{
			B objofClassB=new B();
			System.out.println("objofclassB is an instance ofB "+(objofClassB instanceof B));
			System.out.println("objofclassA is an instance ofA "+(objofClassB instanceof A));
		}
	}
	
	



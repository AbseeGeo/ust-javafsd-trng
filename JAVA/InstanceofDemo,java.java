package com.ust;

class Fruit11
{}
	class Vehicle{}
	public class InstanceofDemo
	{
		public static void main(String[]args)
		{
			Fruit p=new Fruit();
			Vehicle tr=new Vehicle();
			System.out.println("pineapple is a fruit"+(p instanceof Fruit));
			System.out.println("truck is vehicle"+(tr instanceof Vehicle));
		}
	}



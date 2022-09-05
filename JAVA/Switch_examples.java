package com.ust;

public class Switch_examples {
	public static void main(String args[])
	{
		String str="green";
		switch(str)
		{
		case "red":
			System.out.println("im in red");
			System.out.println("**********");
		case "green":
			System.out.println("im in green");
			System.out.println("**********");
			break;
		case "orange":
			System.out.println("im in orange");
			System.out.println("**********");
			break;
			default:
				System.out.println("im default");
				System.out.println("**********");
			
		}
	}

}

package com.ust;

class String_contains {
	public static void main(String[]args)
	{
		String str1="learn java";
		String str2="java";
		String str3="java";
		Boolean result;
		if(str1.contains(str2))
		{System.out.println(str1+"contains"+str2);
		
	}
		else
		{
			System.out.println(str1+"doesn't contains"+str2);
			
		}
		if(str1.contains(str3))
		{
			System.out.println(str1+"contains"+str3);
		}
		else
		{
			System.out.println(str1+"doesnot"+str3);
			
		}
		}

}

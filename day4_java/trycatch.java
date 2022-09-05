package java_day4;

class trycatch {
	public static void main(String []jargs)
	{
		try {
			int divideByZero=5/0;
			System.out.println("rest of code in try block");
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithematic exception==>"+e.getMessage());
			
		}
	}

}

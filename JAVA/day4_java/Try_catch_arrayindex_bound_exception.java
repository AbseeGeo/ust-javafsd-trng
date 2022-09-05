package java_day4;

class Try_catch_arrayindex_bound_exception {
public static void main(String[] args)
{
	try {
		int array[]=new int[10];
		array[10]=30/0;
		
		
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		
		
	}
}
}

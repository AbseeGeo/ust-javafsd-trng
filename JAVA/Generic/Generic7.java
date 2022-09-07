package generic;

public class Generic7 {
public static void main(String[]args)
{
	DemoClass demo= new DemoClass();
	demo.<String>genericMethod("kollanooor");

	demo.<Integer>genericMethod(25);
	
}
}
class DemoClass{
	public<T> void genericMethod(T data)
	{
		System.out.println("genericMethod");
		System.out.println("data passed:"+data);
	}
}

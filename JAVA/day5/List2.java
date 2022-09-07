package day5;
import java.util.ArrayList;
class List2 {
	public static void main(String[]args)
	{
		ArrayList<String> lang=new ArrayList<>();
		lang.add("c");
		lang.add("c++");
		lang.add("java");
		System.out.println("ArrayList:"+lang);
		lang.set(2, "javascript");
		System.out.println("modified arraylist"+lang);
				
	}

}

package day5;
import java.util.ArrayList;

/**
 * The type List 2.
 */
class List2 {
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String[]args)
	{
		ArrayList<String> lang=new ArrayList<>();
		lang.add("c");
		lang.add("c++");
		lang.add("java8");
		System.out.println("ArrayList:"+lang);
		lang.set(2, "javascript");
		System.out.println("modified arraylist"+lang);
				
	}

}

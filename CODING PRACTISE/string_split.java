package git;

public class string_split {

	
	public static void main(String args[])
	{

		String str = "geekss@for@geekss";
		String[] arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}

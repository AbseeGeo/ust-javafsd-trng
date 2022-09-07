package day5;
import java.util.Map;
import java.util.TreeMap;
class List4 {
	public static void main(String[]args)
	{
		Map<String,Integer> values=new TreeMap<>();
		values.put("second", 2);
		values.put("first", 1);
		System.out.println("map using treemap:"+values);
		
		values.replace("first", 11);
		values.replace("second", 22);
		System.out.println("new map:"+values);
		int removeval=values.remove("first");
		System.out.println("removed values"+removeval);
	}

}

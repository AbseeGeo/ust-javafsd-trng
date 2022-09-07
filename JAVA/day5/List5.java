package day5;
import java.util.LinkedHashMap;

class List5 {
	public static void main(String[]args)
	{
		LinkedHashMap<String,Integer> even=new LinkedHashMap<>();
		even.put("two",2);
		even.put("one",7);
		System.out.println("LinkedHashMap"+even);
		LinkedHashMap<String,Integer> numbers=new LinkedHashMap<>(even);
		numbers.put("three",3);
		System.out.println("LinkedHashMap"+numbers);
	}

}

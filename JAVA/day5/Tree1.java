package day5;
import java.util.TreeMap;
import java.util.TreeSet;


class Tree1 {
	public static void main(String[]args)
	{
		TreeMap<String,Integer> v=new TreeMap<>();
		v.put("two",33);
		v.put("four",122);
		v.putIfAbsent("six",209882);
		System.out.println("TreeSet"+v);
	
		TreeMap<String,Integer> v1=new TreeMap<>();
	v1.put("three",33);
	v1.putAll(v);
	System.out.println("tree"+v1);

}}

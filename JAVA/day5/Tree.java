package day5;
import java.util.TreeSet;
import java.util.Iterator;

class Tree {
public static void main(String[]args)
{
	TreeSet<Integer> v=new TreeSet<>();
	v.add(33);
	v.add(122);
	v.add(209882);
	System.out.println("TreeSet"+v);
	Iterator<Integer> iterate=v.iterator();
	
	System.out.println("TreeSet using iterater");
	
	while(iterate.hasNext()) {
		System.out.println(iterate.next());
		
	}
	
}
}

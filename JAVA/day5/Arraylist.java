package day5;
import java.util.ArrayList;
import java.util.Iterator;

class Arraylist {
public static void main(String[]args)
{
	ArrayList<Integer> v=new ArrayList<>();
	v.add(33);
	v.add(122);
	v.add(209882);
	System.out.println("arraylist"+v);
	Iterator<Integer> iterate=v.iterator();
	int num=iterate.next();
	System.out.println("acceessed element:"+num);
	iterate.remove();
	System.out.println("removed elemnet"+num);
	System.out.println("updaed arraylist");
	while(iterate.hasNext()) {
		iterate.forEachRemaining((value)->System.out.println(value+","));
	}
	
}
}

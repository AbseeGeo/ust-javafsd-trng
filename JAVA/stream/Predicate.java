package stream;
import java.util.*;
public class Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("NUmber 14 is even:"+checkOddEven.test(14));
		System.out.println("NUmber 18 is odd:"+checkOddEven.test(18));
		System.out.println("NUmber 21 is even:"+checkOddEven.test(21));

	}

}

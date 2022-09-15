package Enum;
import java.util.*;
public class Hashset_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> sh=new HashSet<String>();
		sh.add("P");
		sh.add("Q");
		sh.add("R");
		Enumeration e=Collections.enumeration(sh);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}



	}



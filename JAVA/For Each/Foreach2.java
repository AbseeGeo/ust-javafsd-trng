
package Foreach;

import java.util.List;
import java.util.ArrayList;

public class Foreach2{
public static void main(String[]args)
{
	List<String>gamesList=new ArrayList<String>();
	gamesList.add("football");
	gamesList.add("cricket");
	gamesList.add("chess");
	gamesList.add("hockey");
	System.out.println("---------------iterating by passing iambda expression---------");
	gamesList.forEach(System.out::println);	
}
}

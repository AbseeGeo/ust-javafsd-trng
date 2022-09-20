package functional_interface;

import java.util.List;
import java.util.ArrayList;
public class MethodReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List names=new ArrayList();
names.add("absee");
names.add("ansee");
names.add("geo");
names.add("mini");
names.add("antony");
names.forEach(System.out::println);
	}

}

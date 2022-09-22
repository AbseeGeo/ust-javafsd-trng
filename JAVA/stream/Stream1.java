package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> str=new ArrayList<>();
str.add("absee");
str.add("ansee");
str.add("geo");
Predicate sp=s->s.equals("geo");
Stream sr=str.stream().filter(sp);
System.out.println(sr.collect(Collectors.toList()));
	}

}

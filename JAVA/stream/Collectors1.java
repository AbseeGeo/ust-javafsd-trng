package stream;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Collectors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("absee","ansee","mini","geo","antony");
Map<String,Long>map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map);
	}

}

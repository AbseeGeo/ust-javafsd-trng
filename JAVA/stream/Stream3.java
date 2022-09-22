package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>lines=Arrays.asList("APPLE","MANGO","ORANGE");
List<String>result=lines.stream().filter(line->!"ORANGE".equals(line)).collect(Collectors.toList());
result.forEach(System.out::println);
	}

}

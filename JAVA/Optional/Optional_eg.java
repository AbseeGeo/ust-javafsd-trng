package optional;

import java.util.Optional;

public class Optional_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Optional<String> emptyOption=Optional.empty();
Optional<String> strOption=Optional.of("one");
System.out.println(emptyOption.orElseGet(()->"optional  null orElseGet"));
System.out.println(strOption.orElseGet(()->"optional value orElseGet"));
	}
}

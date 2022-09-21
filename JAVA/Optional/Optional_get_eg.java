package optional;

import java.util.Optional;

public class Optional_get_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Optional<String> optional=Optional.of("hello");
if(optional.isPresent())
{
	String value=optional.get();
	System.out.println("optional value:"+value);
}
else
{
	System.out.println("optional has no value");
}
	}

}

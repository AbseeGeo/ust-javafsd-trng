package Testing;


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;




public class Mockito2 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		List s=Mockito.spy(new ArrayList());
		s.add("absee");
		Mockito.verify(s).add("absee");
	}

}

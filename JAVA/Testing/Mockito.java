package Testing;

import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Mockito {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println ("in test mthod");
		List<String> mocklist=mock(List.class);
		when(mocklist.size()).thenReturn(5);
		assertTrue(mocklist.size()==7);
		System.out.println("end of test method");
		
	}

	
	

}

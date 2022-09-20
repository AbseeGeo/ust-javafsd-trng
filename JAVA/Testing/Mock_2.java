package Testing;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Mock_2 {
@SuppressWarnings("unchecked")
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println("hi");
		List<String> mockList=mock(List.class);
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
		System.out.println("world");
	}

}

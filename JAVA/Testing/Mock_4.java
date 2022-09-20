package Testing;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Mock_4 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		List<String> list=new ArrayList<>();
		List<String>spyOnList=spy(list);
	when(spyOnList.size()).thenReturn(10);	
	assertEquals(10,spyOnList.size());
	spyOnList.add("absee");
	spyOnList.add("ansee");
	assertEquals("absee",spyOnList.get(0));
	assertEquals("ansee",spyOnList.get(1));
	
		
	}

}

package Testing;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mock_3 {
	
@Mock
List<String>mockList;
@Before
public void setup()
{
	MockitoAnnotations.initMocks(this);
}

@SuppressWarnings("inchecked")
	@Test
	public void test() {
	System.out.println("hello");
		//fail("Not yet implemented");
	when(mockList.get(0)).thenReturn("sample");
	assertEquals("sample",mockList.get(0));
	System.out.println("world");
	}

}

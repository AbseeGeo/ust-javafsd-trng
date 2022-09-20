package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2,2);
		assertEquals(5,Connection1.calculate(2,2));
		
	}
	@Test
	public void test1()
	{
	assertEquals("abc","ABC");
	
	}
	
	
	@After
	
	public void after()
	{
		System.out.println("in after");
		
	}
	@Before
	public void before()
	{
		System.out.println("in before");
	}
	@AfterClass
	public static  void afterClass()
	{
		System.out.println("in after class");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("in before class");
		
	}
	
}

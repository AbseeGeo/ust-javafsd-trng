package Testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class Suite1 {
 @RunWith(Suite.class)
 @Suite.SuiteClasses({
	 Result r=JUnitCore.runClasses(TestCase1.class,Testcase2.class);
 })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

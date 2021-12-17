package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngdemo {
@Test
public void testcase() {
	System.out.println("Line1");
	//Assert.assertEquals("A", "A");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("a", "b");
	sa.assertAll();
	System.out.println("Line2");
	System.out.println("Line3");
	
	System.out.println("Line4");
	System.out.println("Line5");
	
	
}
@BeforeTest
public void precondition() {
	System.out.println("Before Test");
}
@AfterTest
public void postcondition() {
	System.out.println("After Test");
}

}

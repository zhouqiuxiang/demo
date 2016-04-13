package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.print("@Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.print("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("@AfterTest");
  }
/*
 * ÖÜÇïÏã¸ü¸Ä
 * */
}

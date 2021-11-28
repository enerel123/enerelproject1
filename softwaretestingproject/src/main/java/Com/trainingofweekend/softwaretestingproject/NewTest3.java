package Com.trainingofweekend.softwaretestingproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest3 {
  @Test
  public void f() {
	  System.out.println("this is  test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

}

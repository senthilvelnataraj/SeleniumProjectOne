package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchy {
  @Test
  public void test() {
	  System.out.println("Im Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im BeforeMethods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im AfterSuite");
  }

}

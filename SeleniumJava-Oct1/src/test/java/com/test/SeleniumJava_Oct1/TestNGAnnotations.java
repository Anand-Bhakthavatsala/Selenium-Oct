package com.test.SeleniumJava_Oct1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
	
  @Test //Test case
  public void AnnotationsTest() {
	  System.out.println("Test case - TestNG Annotations");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod is invoked");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod is invoked");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass is invoked");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass is invoked");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest is invoked");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest is invoked");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BefireSuite is invoked");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite is invoked");
  }

}

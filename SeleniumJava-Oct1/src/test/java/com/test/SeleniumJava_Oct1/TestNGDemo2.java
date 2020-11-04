package com.test.SeleniumJava_Oct1;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	int add;
	@Test (priority=0,groups="Regression")//It is annotation in TestNG
	public void TC1()
	{
		System.out.println("Welcome to test case 1");	
		int i= sum(1,2);
		System.out.println("Value of i is "+i);
	}
	
	@Test (priority=1, groups="smoke")//It is annotation in TestNG
	public void TC2()
	{
		System.out.println("Welcome to test case 2");	
		sum(10,20);
	}
	
	public int sum(int x,int y) //Its method to add 2 numbers
	{
		add = (x+y);
		System.out.println("Addition of two numbers "+ add);
		return (x+y);
	}
	
	@Test (priority=4)
	public void Animal()
	{
		System.out.println("Elephant");
	}

	@Test (priority=3)
	public void vegitable()
	{
		System.out.println("onion");
	}

}


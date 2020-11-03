package TestNGPackage;

import org.testng.annotations.Test;

public class TestNGDemoPriority {
	
	int add;
	@Test (priority=0,groups= {"smoke","Regression"}) //It is annotation in TestNG
	public void Login()
	{
		System.out.println("Welcome to Login Test case");			
	}
	
	@Test (priority=1, groups="smoke")//It is annotation in TestNG
	public void Compose()
	{
		System.out.println("Draft an email test case");			
	}
	
	@Test (priority=4)
	public void Logout()
	{
		System.out.println("Logout test case");
	}

	@Test (priority=3)
	public void send()
	{
		System.out.println("Submit the the drafted email and send");
	}

}

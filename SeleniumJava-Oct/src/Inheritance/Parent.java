package Inheritance;

import OOPs.AccessSpecifier;

public class Parent extends AccessSpecifier {

	static String school ="Bangalore International School";
	
	public void city(String name) //parent method having the same name -> overriding
	{
		System.out.println("Bangalore");
	}	
	
	public static void main(String[] args) {
		
		Parent p = new Parent();//creating the object -> p
		p.msg();
		System.out.println(p.data);
	}

}

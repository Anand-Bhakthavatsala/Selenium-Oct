package JavaPrograms;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Please enter your name");
		//<classname> objetname = new <classname> -> to create object
		Scanner input = new Scanner(System.in); 
		String name = input.nextLine();
		System.out.println("My name is "+name);
*/		
		int a=10,b=20,c;
		System.out.println(c=a+b);
		c=b-a;
		System.out.println(b-a);
		
		System.out.println(b*a); //multiplication
		
		System.out.println(b/a); //division
		
		System.out.println(10%3); //modulus -> remainder
		float x=(float) 23.445,y=(float) 10.5;
		System.out.println(x/y);
		System.out.println(x++); //Post increment
		System.out.println(x); //incrementing the value by 1
		System.out.println(++y);//pre-increment
		System.out.println(--a);//pre decrement
		System.out.println(b--);//post decrement
		System.out.println(b);
		System.out.println(x!=y);//logical comparison
		System.out.println(a+"  "+b);
		System.out.println(a<10 && b>20);//true && false -> false
		System.out.println(a<10 || b>20);//true || false -> true
		System.out.println(a<b?a:b);// ? condition -> if true //Integers
		
		System.out.println("IPL".equalsIgnoreCase("ipl")?"Dubai":"India"); //String
	}

}

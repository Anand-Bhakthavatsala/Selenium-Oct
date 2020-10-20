package Inheritance;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Child c = new Child();
		c.city("Bombay");
		
		c.add(1,2);
		c.add(12.3,4.5);
		
	}
	
	public void city() //child method overriding
	{
		System.out.println("Name of the city is ");
	}
	
	private double add(double d, double e) { //method overloading
		// TODO Auto-generated method stub
		double x = d+e;
		System.out.println(x);
		return x;	
	}

	//method overloading	
	public int add(int a,int b) //method overloading
	{
		int x = a+b;
		System.out.println(x);
		return x;	
		
	}	
	

}

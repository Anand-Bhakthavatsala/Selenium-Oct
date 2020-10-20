package OOPs;

class Addition
{	
	Addition() //constructor overloading
	{
		System.out.println("Welcome");
	}
	
	Addition(String name) //constructor overloading
	{
		System.out.println("Welcome "+name);
	}
	
	static int add(int a,int b) //Method overloading
	{
		return (a+b);
	}
	
	static double add(double a, double b) //Method overloading
	{
		return (a+b);
	}
	
	static long add(long a,int b) //Method overloading
	{
		return (a+b);
	}
	
	static float add(float a, int b) //Method overloading
	{
		return (a+b);
	}
	
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	
}

public class Adder extends Math {

	public static void main(String[] args) {
		
		System.out.println(Addition.add(10.5, 20.7));
		System.out.println(Addition.add(5, 20));
		System.out.println(Addition.add(10000000l, 1231));
		System.out.println(Addition.add(10.7f, 34));
		
		Addition a = new Addition();//object reference
		a.sum(10, 20);
		
		Addition b = new Addition("We are learning Java");
		
		Adder ad = new Adder();
		ad.sub(20, 10);
		Adder.mul(10,20);
		Math.mul(20, 30);
		
		
	}
	
	static void mul(int a, int b) //Method overriding
	{
		System.out.println("Result of multiplication "+(a*b));
	}

}

package OOPs;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition of a & b is: "+ add(10,20));
		System.out.println(add(12.5,19.3));
	}
	
	static int add(int a,int b) //Method overloading
	{
		return (a+b);
	}
	
	static double add(double a, double b) //Method overloading
	{
		return (a+b);
	}


}

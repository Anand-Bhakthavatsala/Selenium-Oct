package JavaPrograms;

public class JavaDemo1 {

	public static void main(String[] args) {
		
		//print will print on the same line & ln means curoser will move to next line
		System.out.println("Welcome to Java learning");
		System.out.println("This is my first Java program");
		
		String name = "   All are good  ";
		System.out.println(name);
		String trim = name.trim();
		System.out.println(trim);
		
		sum();
		
	}
	
	public static void sum() //User defined menthod & function both are same
	{
		
		int i=0,j=23,k=34;
		i=j+k;
		System.out.println("Sum of j & k "+i);
	}

}

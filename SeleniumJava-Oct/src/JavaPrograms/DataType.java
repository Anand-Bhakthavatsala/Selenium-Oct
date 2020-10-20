package JavaPrograms;

public class DataType {

	public static void main(String[] args) {
		
		// Data Types Demo
		/*
		 * Java is case senstive language
		 * print -> it will print and cursor will be on the same line
		 * Keywords in Java will have pre definied meaning
		 */
		
		int i=100; //variable name is i
		int num1=342435232; //4 bytes
		
		System.out.print(i+"  "+num1); //+ both addition and also concatination
		System.out.println(num1+i);//concatination
		System.out.print("We are done");
		
		long num2 = 3424352324243l; //8 bytes
		System.out.println(num2);
		
		short s1=234; //2 bytes
		System.out.println("This is short variable "+s1);
		double d1 = 23432432.23;
		float f1= (float) 23432.23; //decimal numbers 4 bytes
		System.out.println("Value of f1 & num2 "+(f1+d1));
		
		
		System.out.println("Double variable "+ d1);
		
		
		char c = 'A';
		System.out.println(c);
		
		boolean b = false;
		System.out.println(b);
		
		String name = "We are learning and in the process of finding JOB";
		
		System.out.println(name);
		
		String IPL = "in Dubai";
		
		System.out.println(name+IPL);
		
		String favourate[] = {"Biriyani", "Sweets"}; //collection of similar data types
		System.out.println(favourate[1]+" "+favourate[0]);
		System.out.println("Length of IPL string "+IPL.length());
		
		char c1=name.charAt(2); //Index starts from 0
		System.out.println(c1);
		System.out.println(name.contains("LEARN"));
		System.out.println(IPL.toUpperCase()); //convert from lower case to upper case
		System.out.println(IPL);
		System.out.println(IPL.concat(" "+favourate[1]));
		
		String join = name + IPL;
		
		System.out.println(join);
		
		int num[]= {1,4,675,54};
		System.out.println(num[3]);
		
		//Exception is Run time error
		//compilation error -> when the syntax is wrong
		
		String ok = "It's OK";
		System.out.println(ok);
		System.out.println(ok.equals("It's ok"));
		System.out.println(ok.equalsIgnoreCase("It's ok"));
		
	}

}

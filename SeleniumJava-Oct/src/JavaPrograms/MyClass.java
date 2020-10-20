package JavaPrograms;

public class MyClass {

	public static void main(String[] args) {
		// classname obj = new classname();
		
		Sample mc = new Sample(); //create an object
		mc.cost();	
		String c = mc.color;
		System.out.println(mc.color);
		
		int maximun = Math.max(10, 20);
		System.out.println(maximun);
		
		int min = Math.min(10, 20);
		System.out.println(min);
		
		System.out.println(Math.PI);
		
		System.out.println(min=maximun);
		
		final int IPL=8; //final is constant
		System.out.println(IPL);
		
		
	}

}

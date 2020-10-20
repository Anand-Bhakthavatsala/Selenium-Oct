package loops;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		double i=0.5; // 4 bytes double 8 bytes
		System.out.println(i);
		
		while(i<5) //is 5.5 less than 5 -> exit the loop when the condition becomes false
		{
			System.out.println("Value of i "+i);
			i++;
			Thread.sleep(1000);//milliseconds
		}

	}

}

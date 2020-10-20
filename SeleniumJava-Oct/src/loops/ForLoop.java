package loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num=10;num>=1;num--)//initialize;condition;increment/decrement
		{
			System.out.println("Value of num "+num);
			try {
				Thread.sleep(2000);//we are instructing the program to stop for 2 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000 milli seconds is 1 second
		}

	}

}

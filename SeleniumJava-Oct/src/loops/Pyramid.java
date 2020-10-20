package loops;

import JavaPrograms.Sample;

public class Pyramid {

	public static void main(String [] args )
	{

		for (int outer =1; outer<=5; outer++ )
		{
			for (int inner = 0; inner<outer; inner++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		Sample s = new Sample();//instance of an object
		s.cost();
		
		Sample s2 = new Sample(); // different objects referring to the same sample class
		s2.cost();
	}
}

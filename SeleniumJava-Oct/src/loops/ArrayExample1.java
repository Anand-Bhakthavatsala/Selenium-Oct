package loops;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[]= {"Biriyani","Jamoon","Roti","Curry","chapati"}; //String array
		int num[]= {1,2,43,23,98}; //5
		double flt[]= {12.34,34.3,12}; //4
		
	/*	System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);*/
		
	//	for(int num=10;num>=1;num--)//initialize;condition;increment/decrement
		int len=name.length;
		System.out.println(len);
		
		for(int i=0;i<len;i++) //5<5 -> false
		{
			System.out.println(name[i]);
		}
		
		int j=0;
		while(j<num.length)
		{
			System.out.println("Values of number array: "+num[j]);
			j++;
		}
		
		int k=0;
		do
		{
			System.out.println("value of flt "+flt[k]);
			k++;
		}
		while(k<flt.length);
		
	}
}


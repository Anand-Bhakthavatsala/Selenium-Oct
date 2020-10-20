package loops;

public class ArrayMultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]= {{1,4,7,89,34},{12,23,45,56,45},{56,676,43,434,2323}}; //Two dimension
		System.out.println("Length of the num array : "+num.length);
		
		for (int i=0;i<num.length;i++) //nested loops
		{
			for (int j=0;j<5;j++) //0<0
			{
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}

	}

}

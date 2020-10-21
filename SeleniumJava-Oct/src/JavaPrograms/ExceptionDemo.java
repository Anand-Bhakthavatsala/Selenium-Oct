package JavaPrograms;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println(1023/1); //Airthmetic operation -> plus,minus div,mult etc
			int i[]= {1,2,3,4,10};
			System.out.println(i[5]);//Index starts from 0 -> i[4]-> 5th number
		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		finally
		{
			System.out.println("Execution is completed");
		}

	}

}

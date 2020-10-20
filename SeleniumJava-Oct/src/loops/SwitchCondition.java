package loops;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month="February"; //Declaration with value
		String day;//Initialization without any value
		
		switch(month)//expression 
		{
			case "January":
				System.out.println("1 is the first month of a calendar year");
				break;
			case "February":
				System.out.println("2 is the 2nd month of a calendar year");
				break;
			case "March":
				System.out.println("3 is the 2rd month of a calendar year");
				break;
			case "April":
				System.out.println("4 is the 4th month of a calendar year");
				break;
			case "May":
				System.out.println("5 is the 5th month of a calendar year");
				break;
			case "June":
				System.out.println("6 is the 6th month of a calendar year");
				break;
			case "July":
				System.out.println("7 is the 7th month of a calendar year");
				break;
			case "August":
				System.out.println("8 is the 8th month of a calendar year");
				break;
			case "Sept":
				System.out.println("9 is the 9th month of a calendar year");
				break;
			case "October":
				System.out.println("10 is the 10th month of a calendar year");
				break;
			case "November":
				System.out.println("11 is the 11th month of a calendar year");
				break;
			case "December":
				System.out.println("12 is the 12th month of a calendar year");
			default:
				System.out.println("End of switch");
		}
	}

}

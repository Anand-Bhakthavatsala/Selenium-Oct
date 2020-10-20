package OOPs;

public class Tester2 extends Employee implements Microsoft,Google { //tester is child class & employee is a parent class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=5000;
		String s = null;
		Tester2 t = new Tester2();//creating an object
		System.out.println(t.salary);
		System.out.println();
		
		t.technology(); //calling the methods
		t.locations();
		t.salaryMicrosoft();
		System.out.println(t.i);
		t.servers();
	}

	@Override
	public void technology() {
		// TODO Auto-generated method stub
		System.out.println("Technologies used in MS are MS office, Azure, .Net etc");
	}

	@Override
	public void locations() {
		// TODO Auto-generated method stub
		System.out.println("Hyderabad, Bangalore, Mumbai, Seatle USA, Europe etc");
	}

	@Override
	public void salaryMicrosoft() {
		// TODO Auto-generated method stub
		System.out.println("Starting Salary in MS 50000");
	}

	@Override
	public void servers() {
		// TODO Auto-generated method stub
		System.out.println("Google is a powerful search engine");
	}

}

package OOPs;

public class Student {
	
	int rollno,rn;
	String name,college,school,nm;
	float fee,fe;
	
	Student(int rollno,String name, float fee)
	{
		this.rn = rollno;
		this.nm = name;
		this.fe = fee;	//Assigning the value of fee to local variable
		this.print();//print method is called
	}
	
	void print() //method or a function -> Resuability
	{
		System.out.println("Hello & welcome");
	}
	
	void display() //method
	{
		System.out.println("Rl No St Name  Fee");
		System.out.println("---------------------");
		System.out.println(rn+" "+nm +" "+fe);
	}
	
	public static void main(String args[])
	{
		Student std1 = new Student(1, "Student1", 1000);
		std1.display();
		std1.print();
		
		Student std2 = new Student(2, "Student2", 2000);
		std2.display();
	}

}

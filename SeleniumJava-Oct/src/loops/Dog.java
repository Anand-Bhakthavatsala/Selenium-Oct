package loops;

public class Dog {
	
	//variables
	String breed,gender,color;
	int age; //initializing the variable
	
	void bark() //methods
	{
		
	}
	
	void sleep() //methods
	{
		
	}

	public Dog() //empty constructor
	{
		System.out.println("Dog empty Constructor");
	}
	
	public Dog(String name) //parameterized constructor
	{
		System.out.println("I like "+name);
	}
	
	public Dog(int age)
	{
		System.out.println("Age of the dog is "+age);
	}
	
	public static void main(String args[])
	{
		Dog puppy = new Dog("Fighter");//create an object
		Dog bulldog = new Dog(10);
		
	}

}

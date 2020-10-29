package OOPs;

public class Dog extends Animal{
	//super class name is Animal & sub-class name Dog
	int legs = 4;
	
	Dog() //Conststructor 
	{
		System.out.println(super.legs);
		System.out.println(this.legs);
	}
	
	public void move() //method overriding
	{
		System.out.println("Dogs can walk and run");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();//creating an object
		d.move();
		
		Animal a = new Animal();//Animal object
		a.move();
		
	}

}

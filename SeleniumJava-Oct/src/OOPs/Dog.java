package OOPs;

public class Dog extends Animal{
	
	int legs = 2;
	Dog()
	{
		System.out.println(super.legs);
		System.out.println(this.legs);
	}
	
	public void move() //method overriding
	{
		System.out.println("Dogs can walk and run");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.move();
		
		Animal a = new Animal();
		a.move();
		
	}

}

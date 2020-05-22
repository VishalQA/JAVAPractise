package packageone;

public class Dog extends Animal {
	
	public void sound() {
		System.out.println("Dog is to Bark");
	}
	
	public void color() {
		System.out.println("Dog color is Black");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Dog();
		obj.sound();

		Dog obj1 = new Dog();
		obj1.color();
	}

}

package packageone;

public class Employee {
	
	     
	 int id = 001;
	 int age = 30;
	 String name = "sam";
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E = new Employee();
		E.age = 31;
		E.name = "Tom";
		E.id = 102;
		
		System.out.println(E.age);
		System.out.println(E.id);
		System.out.println(E.name);
		
		
		

	}

}

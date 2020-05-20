package packageone;

public class Student5 {
	
	int id ;
	String name;
	int age;
	
	Student5(int i , String n){
		id = i;
		name = n;
		
	}
	
	Student5(int i ,String n , int a){
		id = i;
		name = n;
		age = a;
	}
	Student5 (int i ){
		id = i;
	}
	
	void displayone() {
		System.out.println(id+  "   " +name+ "   " +age);
		
	}
	
	public static void main(String [] args) {
		Student5 s1 = new Student5(100  );
				s1.displayone();
		Student5 s2 = new Student5(200 , "Tom" , 25);
		      s2.displayone();
		      
	}
	
		
	
	
}

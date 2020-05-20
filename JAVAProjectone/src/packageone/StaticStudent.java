package packageone;

public class StaticStudent {
	
	 int id;
	 String name;
	 static String college = "ABC";
	 
	 StaticStudent(int i , String n ){
		 id = i ;
		 name = n;
	 }
	 void display() {
		 System.out.println(id+ "  " +name+  "  "  +college);
	 }


	public static void main(String[] args) {
		
		StaticStudent s1 = new StaticStudent(10, "John");
		s1.display();
		StaticStudent s2 = new StaticStudent(20 , "Tom");
		s2.display();
	
	}

}

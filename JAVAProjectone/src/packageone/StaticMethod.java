package packageone;

public class StaticMethod {
	
	static int id = 10;
	String name;
	static String College = "ABC";
	
	static void change() {
		String College = "XYZ";
		int id  = 20;

	}
	
	StaticMethod(int i , String n ){
		id = i;
		name = n;
		
	}
	
	void display() {
		System.out.println(id+  "  "  +name+  "   "  +College);
	}
	
}
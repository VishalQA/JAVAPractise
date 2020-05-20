package packageone;

public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayhello("vishal", "how r u  ", 25);
		sayhello("Tom", "how r u  ", 25);
		sayhello("Mark", "how r u  ", 25);

	}

	public static void sayhello(String name , String sentence , int age) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello    "   +   name   + "        "  +   sentence  +  "      "  +age);
	}

}

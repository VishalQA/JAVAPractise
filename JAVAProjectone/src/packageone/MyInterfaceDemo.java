package packageone;

public class MyInterfaceDemo implements MyInterface {

public void method1() {
	System.out.println("Implemetation of Method1");
	}
public void method2() {
	System.out.println("Implemetation of Method2");
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface obj = new MyInterfaceDemo();
		obj.method1();
		obj.method2();
	}

}

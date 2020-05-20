package packageone;

public class CounterWithoutStatic {
	
	int count = 0;
	
	CounterWithoutStatic(){
		count++;
		System.out.println(count);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterWithoutStatic c1 = new CounterWithoutStatic();
		CounterWithoutStatic c2 = new CounterWithoutStatic();
	    CounterWithoutStatic c3 = new CounterWithoutStatic();
	}
}

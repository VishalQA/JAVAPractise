package packageone;

public class CounterWithStatic {

	static int count = 0;
	
	
	CounterWithStatic(){
		count++;
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		CounterWithStatic s1 = new CounterWithStatic();
		CounterWithStatic s2 = new CounterWithStatic();
		CounterWithStatic s3 = new CounterWithStatic();
	}

}

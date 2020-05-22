package packageone;

public class DemoInterface implements Interface2 {
	
	
	

	public static void main(String[] args) {
		
		Interface2 obj = new DemoInterface();
		obj.methodA2();

	}

	@Override
	public void methodA2() {
		System.out.println("Method A1");
	}
//	}
//	
//	public void methodA1() {
//		System.out.println("Method A2");
//		
//	}

	@Override
	public void methodA1() {
		// TODO Auto-generated method stub
		
	}

}

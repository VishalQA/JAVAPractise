package packageone;

public class TestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company_Parent x = new Company_Parent();
		int s1 = x.getsalary();
		System.out.println("Salary in parent company is ---->"  +s1);
		
		Company_Child1 y = new Company_Child1();
		int s2= y.getsalary();
		System.out.println("Salary in child1 company is ---"  +s2);
		
		Company_Child2 z = new Company_Child2();
		int s3 = z.getsalary();
		System.out.println("Salary in child2 company is ---->" +s3);
	}

}

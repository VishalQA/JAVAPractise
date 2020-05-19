package packageone;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(4,5));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10.10,20.20));

	}
	
	public static int sum (int i , int  j ) {
		int sum = i +j;
		return sum;
	}
 
	public static int sum (int p , int q , int r ) {
		int sum = p+q+r;
		return sum;
		
	}
	public static double sum (double x , double y ) {
		double sum = x+y;
		return sum;
	}
}

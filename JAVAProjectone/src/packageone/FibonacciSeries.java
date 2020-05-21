package packageone;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the count for the Fibonacci series ");
		int count = input.nextInt();
		System.out.println("You entered the count for Fabonacci series as ----> "   +count);
		
		int n1 =0 , n2 =1 ;
		
		System.out.println(n1+ "  " +n2);
		
		for (int i=2 ; i < count ; i++) {
			int n3 = n1+n2;
			System.out.println("  "  +n3);
			n1 =n2;
			n2 = n3;
			
		}
		
	}

}

package packageone;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the name of the account holder");
		String n = input.nextLine();
		System.out.println("Please enter the account number");
		int a = input.nextInt();
		System.out.println("Please enter the existing amount in the account  ");
	    float amt = input.nextFloat();
		
		Account a1 = new Account();
		a1.insert(a , n, amt);
		a1.display();
		a1.checkbalance();
		System.out.println("Please enter the anount you would like to deposit");
		float d = input.nextFloat();
		a1.deposit(d);
		a1.checkbalance();
		System.out.println("Please enter the anount you would like to withdraw");
		float w = input.nextFloat();
		a1.withdraw(w);
		a1.checkbalance();
		
	}

}

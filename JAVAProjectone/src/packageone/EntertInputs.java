package packageone;

import java.util.Scanner;

public class EntertInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the sentence ");
		String sentence = input.nextLine();
		System.out.println("You entered the sentence as ----"  +sentence);
		System.out.println("Please enter the integer ");
		int number = input.nextInt();
		System.out.println("You entered the integer as --->"  +number);
		System.out.println("Please enter the character");
		char c = input.next().charAt(0);
		System.out.println("You entered the characters as ----"  +c);
		

	}

}

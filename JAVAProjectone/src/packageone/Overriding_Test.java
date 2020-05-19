package packageone;

public class Overriding_Test {
	
	public static void main (String [] args) {
		Bank_SBI s = new Bank_SBI();
		Bank_icici i = new Bank_icici();
		System.out.println("SBI ROI---->" +s.getrateofinterest());
		System.out.println("ICICI ROI --->"  +i.getrateofinterest());
	}

}

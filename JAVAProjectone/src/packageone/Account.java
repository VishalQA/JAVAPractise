package packageone;

public class Account {
	
	int acc_no;
	String name;
	float amount;
	



  void insert (int a , String n,float amt) {
	  acc_no = a;
	  name = n;
	  amount = amt;
	  
	  
	  
  }
  
  void deposit(float amt ) {
	  amount = amount +amt;
	  System.out.println("deposited amount ---->"  +amt);
	  
  }
  
  void withdraw(float amt) {
	  if (amount < amt) {
		  System.out.println("Insufficient balance");}
		  else {
			  amount = amount - amt;
			  System.out.println("The withdraw amount is --->"  +amt);
					  
		  }
	  }
  void checkbalance() {
	  System.out.println("The new balance is ---->"  +amount);
  }
  
  void display() {
	  System.out.println("The account number is --->  "  +acc_no+    "\n The name of the account holder is --->  "  +name+    "  \n The current balance in the account is ---->  "  +amount);
  }
  }




package polymorphismexamples;
abstract class BankAccount{  //abstract class
	int account_number;
	int balance;
	abstract void deposit() ;  //abstract methods
	abstract void withdraw();
	
}
class CheckingAccount extends BankAccount{
	void deposit() {  //implementation of abstract methods of parent class
		account_number = 56443557;
		System.out.println("account no for debit amount is: "+account_number);
	}
	void withdraw() {
		balance = 7000;
		System.out.println("balance after withdraw is: "+balance);

	}
}

public class AbstractAssignment {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}
	

}

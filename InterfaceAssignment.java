package interfaceexamples;
interface BankAccount{  //interface
	void deposit() ;  //by default abstract methods
	void withdraw();
	
}
class CheckingAccount implements BankAccount{
	public void  deposit() {  //implementation of abstract methods of parent class
		System.out.println("this is deposit method");
	}
	 public void withdraw() {
		System.out.println("this is withdraw method");

	}
}

public class InterfaceAssignment {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.deposit();
		obj.withdraw();
	}
	

}

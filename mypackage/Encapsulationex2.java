package mypackage;

public class Encapsulationex2 {
	public static void main(String[] args) {
		 Bank obj = new Bank();  //create object of bank class
	     //setting all values
		 obj.setAccnt_no(876563678989988L);
	     obj.setName("pinki");
	     obj.setEmail("p@gmail.com");
	     obj.setAmount(25756f);
	     //getting all data
	     System.out.println("account no is : "+obj.getAccnt_no());
	     System.out.println("name is : "+obj.getName());
	     System.out.println("email is : "+obj.getEmail());
	     System.out.println("ammount  is : "+obj.getAmount());
	
	}
   
}

package mypackage;

public class EncapsulatedExample {
	public static void main(String[] args) {
		Person obj = new Person(); //created object of encapsulated person class
		obj.setName("Alice");  //setting value in name
		obj.setAge(25);  //setting value in age
		//getting value of name and age
		System.out.println("name is : "+obj.getName());
		System.out.println("age is : "+obj.getAge());
		
	}

}

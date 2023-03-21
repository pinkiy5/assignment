package Exceptionpack;

public class ExceptionAssignment {
	public void display() { //method
				try {
					//division by zero
					int i = 10/0; 
					System.out.println(i);}
				catch(Exception e) {
					System.out.println("Invalid Division");
				}
				try {
					//string parsed to a numeric variable
					String s1="riya";
					int n = Integer.parseInt(s1);
					System.out.println(n);}
				catch(Exception e) {
					System.out.println("format mismatch");
				}
				try {
					//Accessing an invalid calculation
					int k = 10/0;
					System.out.println(k);}
					catch(Exception e) {
						System.out.println("calculation invalid");
					}
				try {
					//Accessing an invalid index in array
					int arr[]=new int[5];
					arr[7]=9;}
					catch(Exception e) {
						System.out.println("array index is invalid");
					}
				
		//after try-catch block
				String b = "exception handling completed";
				System.out.println(b);
				
			}
			public static void main(String[] args) {
				ExceptionAssignment ep = new ExceptionAssignment();
				ep.display();
			}

}

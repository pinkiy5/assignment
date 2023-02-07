package methodpac;
import java.util.*;

public class Method2 {
	public static void main(String[] args) {
		// create scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		//read number from user
		int num=sc.nextInt();
		//call method
		findprime(num);
		
	}
	//delairing method
	public static void findprime(int num) {
		   int count = 0;
		for (int i = 1; i <= num; i++) {  
			    if (num % i == 0) {
			     count++;
			    }}

			   if (count == 2) {
			    System.out.println(num+ " prime no ");
			   }
			   else {
				    System.out.println(num+ " not prime  ");

			   }
	}
}
	



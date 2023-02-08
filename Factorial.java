//find factorial of a number

package Assignment;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
         //inputting number from user to find out factorial
		  Scanner num=new Scanner(System.in);
		  System.out.println("enter the number: ");
		  int i=num.nextInt();
		  int factorial = i;
        //for loop to implement factorial logic
		  for (int j = (i - 1); j > 1; j--) {
		   factorial = factorial * j;
		  }

		  System.out.println("Factorial of " + i + " is " + factorial); //print  factorial of the number
		 }

}

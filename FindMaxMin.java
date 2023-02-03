//accept two integer from user and then print maximum and minimum integer

package Assignment;
import java.util.Scanner;
public class FindMaxMin {
	public static void main(String[] args) {
       //to take input from user
		Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.print("Input second number: ");
        int b = input.nextInt();
        //condition of maximum 
        if(a>b) {
             System.out.println("maximum number is: "+a); // printing maximum number
        }
        
        	System.out.println("minimum number is: "+b); // printing minimum number
        
        		
        }

	}



package Assignment;
import java.util.Scanner;
public class CheckOdd {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the number: ");
	 int n = sc.nextInt();
	 System.out.println(test(n));
  }
  public static boolean test(int n) {
	  while(n>0) {
		  int digit = n % 10;
		  n = n/10;
		  if(digit % 2 == 0) {  //even
			  return false;
		  }
	  }
	  //all digits are odd
	  return true;
}}

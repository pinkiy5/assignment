package Assignment;

public class PrintPrime {
	public static void main(String[] args) {
		int number;
		  int n = 1;
		  int count;

		  while (n <= 150) {
		   count = 0;
		   number = 2;
		   while (number <= n / 2) {
		    if (n % number == 0) {
		     count++;
		     break;
		    }
		    number++;
		   }
		   if (count == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		  }
}}



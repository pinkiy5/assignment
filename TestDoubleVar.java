//accepts two double variables and test if both strictly between 0 and 1 and otherwise false 

package Assignment;
import java.util.Scanner;
public class TestDoubleVar {
	public static void main(String[] args) {
		//input two number
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
        double n1 = in.nextDouble();
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();
        //test for given condition
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}

}

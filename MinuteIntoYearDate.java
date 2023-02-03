//convert 3456789 minute into a number of year and days

package Assignment;
import java.util.Scanner;
public class MinuteIntoYearDate {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);  //to take input from user

        System.out.print("Input minutes: ");
        long year1=60*24*365;

        double min = input.nextDouble();
        // performing calculation
        long years = (long) (min / year1);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println("years : "+years+ "  days : "+days);//printing year and date of given minute
    }
}



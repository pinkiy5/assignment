package arrayexamples;
import java.util.Scanner;
//write a program to find index of an array element

public class ArrayAssignment1 {
	public static void main(String[] args) {
		int a[]=new int[5];  //array initializing
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array: ");
		for(int i =0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter element to be searched: ");
		int b= sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				System.out.println("index position is: "+i);
			}
		}
	}

}

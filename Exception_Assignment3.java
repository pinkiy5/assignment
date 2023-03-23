package Exceptionpack;
import java.util.Scanner;

public class Exception_Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//Arithmetic
			int i = 10/0; 
			System.out.println(i);}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			//null pointer
			String s =null;
			System.out.println(s.length());}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			//number format
			String s1="pinki";
			int n = Integer.parseInt(s1);
			System.out.println(n);}
			catch(Exception e) {
				System.out.println(e);
			}
		try {
			//Arrayindexoutofbound
			int arr[]=new int[7];
			arr[7]=9;}
			catch(Exception e) {
				System.out.println(e);
			}
		    //input mismatch
		System.out.println("enter an integer: ");
		try {
			int a = sc.nextInt();
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		    //finally block
		finally {
			System.out.println("this is finally block");
		}
	}

}

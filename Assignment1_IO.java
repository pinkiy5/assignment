package io;
import java.util.Scanner;
import java.io.*;


public class Assignment1_IO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for store or 2 for print: ");
		int i  = sc.nextInt();
		if(i==1) {  // for storing in file
			try {
				//destination
				FileOutputStream f = new FileOutputStream("E:\\assignment.txt");
				String s = "this is assignment";
				byte b[]=s.getBytes(); //converting string into byte array
				f.write(b);
				f.close();
				System.out.println("done");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else {  //for retrieving from file
			try {
				FileInputStream f = new FileInputStream("E:\\assignment.txt");  //source path
				//reading All character
				int j = 0;
				while((j=f.read()) != -1){
				System.out.print((char)j);  //convert it into character
			}
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	}

}

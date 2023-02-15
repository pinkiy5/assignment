package com.cognizant.shapes;

import java.util.Scanner;
class MyCalculator{
	int divisor_sum(int n) {
		int result = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				result = result+i;
			}}
		return result;
}}

public class AdvancedArithmatic extends MyCalculator {
	public static void main(String[] args) {
		AdvancedArithmatic obj = new AdvancedArithmatic();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no: ");
		int c = sc.nextInt();
		int p =obj.divisor_sum(c);
		System.out.println("the sum of divisors of "+c+" is :"+p);

		
	}
}
	
	
		
	


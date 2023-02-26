//Problem Statement 1
package com.cognizant.tax;
public class TaxCalculator {
	float basicSalary;
	boolean citizenship;
	float tax;
	int nettSalary;
     //Problem Statement 2
	void calculateTax() {
		 tax = 30*basicSalary/100;
		System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
	}
	//Problem Statement 3
   void deductTax() {
	    nettSalary = (int) (basicSalary-tax);
	   System.out.println("The nett salary of the employee "+nettSalary);
   }
   //Problem Statement 4
   void validateSalary() {
	   boolean response = basicSalary > 100000 && citizenship == true;
	   if(response){
		   System.out.println("The salary and citizenship eligibility: "+response);
	   }
	   else {
		   System.out.println("The salary and citizenship eligibility: "+response);
	   }
	   
   }}


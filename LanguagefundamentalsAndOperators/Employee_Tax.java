package com.cognizant.tax;
//Problem Statement 5
public class Employee_Tax {
	public static void main(String[] args) {
		//Test Case 1
		TaxCalculator  obj = new TaxCalculator();
		obj.basicSalary=25000;
		obj.citizenship=true;
		obj.calculateTax();
		obj.deductTax();
		obj.validateSalary();
		//Test Case 2
		obj.basicSalary=125000;
		obj.citizenship=true;
		obj.calculateTax();
		obj.deductTax();
		obj.validateSalary();
	}
}

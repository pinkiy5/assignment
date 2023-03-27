package Exceptionpack;

class CountryNotValidException extends Exception{  
	public CountryNotValidException(String msg) {  //constructor
		super(msg);  //passing msg to super class
	}
}
class EmployeeNameInvalidException extends Exception{  
	public EmployeeNameInvalidException(String msg) {  //constructor
		super(msg);  //passing msg to super class
	}
}
class TaxNotEligibleException extends Exception{  
	public TaxNotEligibleException(String msg) {  //constructor
		super(msg);  //passing msg to super class
	}
}
 // creating taxcalculator class
class TaxCalculator{ 
	public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception{
		double amount =0;
		if(isIndian == false) { //checking condition
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		} else if (empName == null) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		} else if (empSal > 100000 && isIndian == true ) {
			amount = (empSal*8)/100;  //assigning calculated value to amount
		} else if (empSal > 50000 && empSal < 100000 && isIndian == true) {
			amount = (empSal*6)/100;
		} else if (empSal > 30000 && empSal < 50000 && isIndian == true) {
			amount = (empSal*5)/100;
		} else if (empSal > 10000 && empSal < 30000 && isIndian == true) {
			amount = (empSal*4)/100;
		} else { // if any condition don't match this line will execute
			throw new TaxNotEligibleException("The employee doest not need to pay tax");
		}
		return amount;
	}}

public class CalculatorSimulator {  //main class
	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator();  //creating calculator object
		try { //code here may throw exception
			System.out.println(taxCalculator.calculateTax("ron", false, 34000));
		} catch(Exception ex) {
			System.out.println(ex.getMessage()); //for printing message
		}
		try {
			System.out.println(taxCalculator.calculateTax("tim", true, 1000));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(taxCalculator.calculateTax("jack", true, 55000));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(taxCalculator.calculateTax(null, true, 30000));
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}}



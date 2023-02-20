package FridayActivity;
class Employee{  //problem 1
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	public Employee(int id, String name,String address,int phone){  //overload constructor
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		}
	void calculateSalary() {  //method for calculating salary
	double	salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*hra/100);
	System.out.println("the salary of "+employeeName+" is :"+salary);
	}
	//default transport allowance method
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport allowance of "+employeeName+" is :"+transportAllowance);
	}
}

class Manager extends Employee{ //sub class which extends Employee
	Manager(int id ,String name,String address,int phone,double salary){  //using sub class overloading parent class constructor
		super(id,name,address,phone);
	    super.basicSalary=salary;

	}
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("Transport allowance of "+employeeName+" is :"+transportAllowance);
	}
}
class Trainee extends Employee{
	Trainee(int id ,String name,String address,int phone,double salary){
		super(id,name,address,phone);
	    super.basicSalary=salary;

	}

	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport allowance is :"+transportAllowance);
	}
}







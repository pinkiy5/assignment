package inheritancepac;

class Addition{  //parent class
	int a =10;
	int b = 8;
	int sum = a+b;
	void printaddition() {
		System.out.println("addition is :"+sum);
	}
  
}
 class Subtraction extends Addition{// parent class of area and child class of addition
	 int sub = a-b;
	 void printsubtraction() {
		 System.out.println("subtraction is :"+sub);
	 }
 }
 class Area1 extends Subtraction { //child class
	int rectanlearea = a*b;
	void printarea(){
		System.out.println("area is :"+rectanlearea);
	}
 }
public class Assignment2ofMultilevel{  //main class
	
  public static void main(String args[]) {
	  Area1 obj = new Area1();
	  obj.printaddition();
	  obj.printsubtraction();
	  obj.printarea();

}}


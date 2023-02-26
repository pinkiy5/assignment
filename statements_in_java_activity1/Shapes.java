package com.cognizant.shapes1;

public class Shapes {
	int numberOfSides;
	int sideLength;
	void calculateShapeArea(int numberOfSides, int sideLength) {
		if(numberOfSides == 1) {
			Circle obj=new Circle ();
			obj.calculateArea(sideLength);
		}
		else if(numberOfSides == 3) {
			Triangle obj1 = new Triangle();
			obj1.calculateArea(sideLength);
		}
		else if(numberOfSides == 4) {
			Square obj3 = new Square();
			obj3.calculateArea(sideLength);
		}
		else {
			System.out.println("No Shapes Present");
		}
		
	}
	 public static void main(String[] args) {
		 Shapes s = new Shapes();
		 //Test Case 1
		  s.calculateShapeArea(3, 12);
		  //Test Case 2
		  s.calculateShapeArea(4, 15);
	   // Test Case 3
		  s.calculateShapeArea(5, 15);

	
}
}

package com.cognizant.shapes1;

public class Triangle {
	float area;
	void calculateArea(int sides) {
		area = (float) (0.433 * sides  * sides );
		System.out.println("The area of triangle is: "+area);
		
	}

}

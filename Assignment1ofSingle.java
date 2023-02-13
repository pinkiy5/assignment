package inheritancepac;

class Details { //parent class
	int length = 6;
	int breadth = 8;
}

class Area extends Details {  //child class
	int area = length * breadth;
	void printarea() {
		System.out.println("area of rectanle is : "+area);
	}
}

public class Assignment1ofSingle {   //main class
	public static void main(String[] args) {
		Area obj = new Area();
		obj.printarea();
	}

}

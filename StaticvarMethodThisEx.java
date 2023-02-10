package variablepac;

class StaticvarMethodThisEx1 {
	//instance variable 
	int id ;
	//static variable
	static String batch ="JAVA";
	//static method
	static void changebatch() {
		batch = "python";
	}
	StaticvarMethodThisEx1(int id){  //constructor
		this.id=id;         //this keyword
	}
	//user defined method
	void printdetail(){
		System.out.println(id+" "+batch);
	}
	
public static void main(String[] args) { //main class
	//calling static method
	StaticvarMethodThisEx1.changebatch();
	//object
	StaticvarMethodThisEx1 s1=new StaticvarMethodThisEx1(1);
	s1.printdetail(); //calling method 
	
}
}

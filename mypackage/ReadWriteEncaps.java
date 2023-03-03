package mypackage;
//we can read only (getter method)
//we can write only(setter method)

public class ReadWriteEncaps {
	//private String name = "pinki";
	private String name;

    //getting the name
	/*public String getName() {
		return name;
	}*/
   //setting the name
	public void setName(String name) {
		this.name = name;
	}
	
	
public static void main(String[] args) {
	ReadWriteEncaps a = new ReadWriteEncaps();
	//a.setName("sapna"); //we cant change value of name as we assigned already
	//System.out.println(a.name);
	
	a.setName("pinki"); //we can not get value there is no get method
	System.out.println("name is :"+a.getName()); //error as there is no getname method
	System.out.println(a.name); //we get name by this way now
}	
	

}

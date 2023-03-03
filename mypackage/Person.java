package mypackage;
//if we create fully encapsulated class in java than we have to make 
//all data members of class private
//we can use getter setter methods to set and get data
public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

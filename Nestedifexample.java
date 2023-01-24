class Nestedifexample{
public static void main(String[] args){
String address = "kolkata,india";

if(address.endsWith("india")){
if(address.contains("dunlop")){
System.out.println("your city is dunlop");
}else if(address.contains("newtown")){
System.out.println("your city is newtown");
}else {
System.out.println(address.split(",")[1]);
}
}else {
System.out.println("you are not living in india");
}
}
}
package stringexamples;
import java.util.StringTokenizer;
//wap which creates string "Welcome to Java World" and perform following
public class StringAssignment1 {
public static void main(String[] args) {
//problem statement 1
	String str = "Welcome to Java World";
	
	System.out.println("original string is: "+str);
	//return character at 5th position and display it
	System.out.println("character at 5th position is : "+str.charAt(5));
	//compare above string with "welcome" lexicographically ignoring case difference
	String b = "Welcome";
	int com = str.compareToIgnoreCase(b);
	System.out.println("compare str to b : "+com);
    //concatenate "let us learn"
	String str1 = str.concat(" Let us learn");
	System.out.println(str1);
	//return position of first occurrence of a
	int index = str.indexOf('a');
	System.out.println("position of a : "+index);
	//replace all occurrence of a with e
	
    System.out.println("replace a with e :"+str.replace('a','e'));	
	//return string b/t 4th and 10th position
    System.out.println("substring is: "+str.substring(4, 10));
	//return lowercase of string
	System.out.println("lower case is: "+str.toLowerCase());
	
//problem statement 2
    StringBuffer s = new StringBuffer("This is StringBuffer");  //object of StringBuffer class
    s.append(" This is a sample program");
    System.out.println("after append string is: "+s);
    s.insert(21, "object");
    System.out.println("after insert string is: "+s);
    s.replace(14, 19, "Builder");
    System.out.println("after replace string is: "+s);
    s.reverse();
    System.out.println("after reverse string is: "+s);
//problem statement 3
    StringTokenizer st = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
    while(st.hasMoreTokens()) {
		System.out.println(st.nextToken("\\"));
	}
    	
    
 }}


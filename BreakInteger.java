//break an integer into a sequence of digits

package Assignment;
public class BreakInteger {
	public static void main(String[] args) {
		int i = 123456;
		//claculate individual digit
        int a = i / 100000 % 10;
        int b = i / 10000 % 10;
        int c = i / 1000 % 10;
        int d = i / 100 % 10;
        int e = i / 10 % 10;
        int f = i % 10;
        int g= i / 10;
        
        System.out.println(+a+" "+b+" "+c+" "+d+" "+e+" "+f);//printing individual digits
        System.out.println(+g);

	}

}

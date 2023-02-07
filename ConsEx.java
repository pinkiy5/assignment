package methodpac;

public class ConsEx {
	ConsEx(){//default constructor created
		System.out.println("example of both default and parameterized constructor");}
		int sum;
		ConsEx(int a, int b){  //parameterized constructor created addition of two no
			sum=a+b; 
		}
		void show() {
			System.out.println("sum is: "+sum);
			}
		public static void main(String[] args) {
			ConsEx o=new ConsEx();
			ConsEx obj=new ConsEx(20,30);
			obj.show();
		}
	

	}

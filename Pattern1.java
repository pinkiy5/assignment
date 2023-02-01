package controlstatement;

public class Pattern1 {
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) //outer loop for row number
        { 
            
          for (int j=5; j>i; j-- ) //inner loop print space before *
            { 
        	  System.out.print(" ");
             }
          for (int k=1; k<=i; k++ )   //inner loop for print *
          {   
            System.out.print("* "); 
        } 

        System.out.println(); //new line
    } 
} 
	
}

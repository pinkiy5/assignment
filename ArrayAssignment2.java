package arrayexamples;
import java.util.Scanner;
import java.util.Arrays; 
//program to remove an element from array
public class ArrayAssignment2 {
	public static void main(String[] args) {
			int flag =1,loc =0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no of elemets: ");
			int length = sc.nextInt();  //array size initialization
			int arr[]=new int[length];  //array declaration
			System.out.println("enter array elements: ");
			for(int i =0;i<length;i++) {  //array initialization
				arr[i]=sc.nextInt();
				}
			System.out.println("original array: "+Arrays.toString(arr));
            System.out.println("enter index no of element to remove: ");
            int e = sc.nextInt();
            for(int i = e;i<arr.length-1;i++) {
            	arr[i]=arr[i+1];
            }
            //we cannot alter size of an array,after removal,
            //the last and second last element in the array will exist twice
          System.out.println("after removing element: "+Arrays.toString(arr));	
	}
	}



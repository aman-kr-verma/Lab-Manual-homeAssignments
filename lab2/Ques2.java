/*
 * : Create a method that can accept an array of 
 * String objects and sort in alphabetical order.
 * The elements in the left half should be
 * completely in uppercase and the elements
 *  in the right half should be completely in lower case. Return the resulting array.
 */
package lab2;
import java.util.*;
public class Ques2 {
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	String[] arr=new String[size];
	for (int i=0;i<size;i++) {
		arr[i]=sc.next();
	}
	Arrays.sort(arr);
	for (int i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	}
	}

}

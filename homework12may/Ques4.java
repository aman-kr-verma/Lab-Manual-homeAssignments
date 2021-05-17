/*
 * Write a Java Program to find sum of numbers 
a) even index
b) odd index
 */

package homework12may;
import java.util.*;
public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sumeven=0,sumodd=0;
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the values to the array");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(i%2==0) {
				sumeven+=arr[i];
			}
			else {
				sumodd+=arr[i];
			}
			
		}
		System.out.println("Sum of elements at even index " + sumeven);
		System.out.println("Sum of elements at odd index " + sumodd);
		sc.close();		
	}
}

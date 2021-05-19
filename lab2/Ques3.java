/*
 * Create a method which accepts an integer array,
 * reverse the numbers in the array and returns the resulting array in sorted order
 */
package lab2;
import java.util.*;
public class Ques3 {
	 static int reverse(int n) {
		int rem,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	
	 static int[] func(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			arr[i]=reverse(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int[] res=func(arr);
		System.out.println("Desired output: ");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	sc.close();
	}
}
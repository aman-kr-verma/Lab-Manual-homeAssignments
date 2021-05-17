//Write a program to print array elements in the reverse order using swapping method?

package homework12may;
import java.util.*;
public class Ques5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the values to the array");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		sc.close();
	}

}

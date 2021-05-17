//write a Java program to remove an element by taking an index from the user?
package homework12may;
import java.util.Scanner;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the values to the array");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to remove element from");
		int index=sc.nextInt();
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		for(int i=0;i<arr.length-1;i++)
			System.out.println(arr[i] + " ");
		sc.close();
	}

}

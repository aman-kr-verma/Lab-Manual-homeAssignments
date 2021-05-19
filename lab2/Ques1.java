//Create a method which accepts an array of integer elements and return the second smallest element in the array
package lab2;
import java.util.Scanner;
import java.util.Arrays;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}	
		Arrays.sort(arr);
		System.out.println("2nd smallest element: " + arr[1]);
		
	sc.close();
	}
}

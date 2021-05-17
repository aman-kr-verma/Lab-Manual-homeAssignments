//Write a Java program to merge two unsorted arrays of differnt lengths?

package homework12may;
import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int x=sc.nextInt();
		int[] arr1=new int[x];
		for (int i=0;i<x;i++) {
			arr1[i]=sc.nextInt();		
		}
		System.out.println("Enter size of 2nd array");
		int y=sc.nextInt();
		int[] arr2=new int[y];
		for (int i=0;i<y;i++) {
			arr2[i]=sc.nextInt();			
		}
		int[] arr=new int[x+y];
		for (int j=0;j<x;j++) {
			arr[j]=arr1[j];	
			}
		int a=0;
		for(int j=(x);j<(x+y);j++) {
			arr[j]=arr2[a];
			a+=1;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	sc.close();
	}
}

//Create a method which accepts an integer array and
//removes all the duplicates in the array. Return the resulting array in descending order
package lab2;
import java.util.*;
public class Ques4 {
	static int removeDuplicates(int arr[],int n) {
        int j = 0;
        for (int i = 0; i <n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];
        return j;
    }
	
	public static void main(String[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		for (int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		int[] revarr=new int[arr1.length];
		int j=0;
		for (int i=arr1.length-1;i>=0;i--) {
			revarr[j]=arr1[i];
			j+=1;
		}
		int n = revarr.length;
		n=removeDuplicates(revarr,n);
		System.out.println("Desired output:");
		for (int i=0;i<n;i++) {
			System.out.print(revarr[i] + " ");
		}
	sc.close();	
	}
}

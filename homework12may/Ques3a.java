/* 
Write  a Java Program to count number of duplicated values in
a) integer array
b) char array (create the char array in lower case)
 */

package homework12may;

public class Ques3a {
	public static void dup(int[] arr) {
		int[] arr1=new int[10];
		for (int i=0;i<arr.length;i++) {
			int ele=arr[i];
			arr1[ele]+=1;
		}
		for(int j=0;j<10;j++) {
			if(arr1[j]>1) {
				System.out.println(j + " appeared " + arr1[j] + " times.");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,3,4,5};
		
		dup(arr);
		
		

	}

}

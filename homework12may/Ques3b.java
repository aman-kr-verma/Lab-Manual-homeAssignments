/* 
Write  a Java Program to count number of duplicated values in
a) integer array
b) char array (create the char array in lower case)
 */

package homework12may;
import java.util.Scanner;

public class Ques3b {  
	public static void main(String[] args) {      
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array length::");
        int n = sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the array elements::");
        for(int i=0;i<n;i++)
        	arr[i]=sc.next().charAt(0);     
        System.out.println("Duplicate characters in given array:: ");    
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }
        }
	}
}
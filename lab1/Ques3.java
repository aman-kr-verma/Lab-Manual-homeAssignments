/* 
 *The Fibonacci sequence is defined by the following rule.
 *The first 2 values in the sequence are 1, 1. Every subsequent value is
 *the sum of the 2 values preceding it.
 *Write a Java program that uses both recursive and non-recursive functions
 *to print the nth value of the Fibonacci sequence?
 */


package lab1;
import java.util.Scanner;
public class Ques3 {
		public static void iter(int i) {
			int count=0,n1=1,n2=1,num=0;
			while(true) {
				num=n1+n2;
				n1=n2;
				n2=num;
				count+=1;
			if(count+2==i) {
				System.out.println("Nth fibb no. using iteration "+num);
				break;
			}
			}	
		}
		public static int rec(int n) {
		    if (n <= 1)
		       return n;
		    return rec(n-1) + rec(n-2);
		    }
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int x= sc.nextInt();
			int res=rec(x);
			System.out.println("Nth fibb no. using reccursion "+ res);
			iter(x);
			
		sc.close();
		}
}

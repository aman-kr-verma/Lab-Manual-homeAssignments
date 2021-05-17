/*
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */

package lab1;
import java.util.Scanner;
public class Ques1 {
	public static void m1(int i) {
		int rem,sum=0;
		while(i!=0) {
			rem=i%10;
			sum+=rem*rem*rem;
			i/=10;	
		}
		System.out.println("Sum of Cube of digits:" + sum);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		m1(x);
		sc.close();
	}
}

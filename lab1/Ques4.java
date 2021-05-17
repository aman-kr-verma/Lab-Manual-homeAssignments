/*
 * Write a Java program that prompts the user
 * for an integer and then prints out all the prime numbers up to that Integer?
 */

package lab1;
import java.util.Scanner;
public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int i=2;
		int flag=0;
		System.out.println("Primes upto " + x);
		while(i<=x) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					flag+=1;
					if(flag>1)
						break;
				}
			}
			if(flag==1) {
				System.out.print( i + " ");
			}
		i+=1;
		flag=0;
		}
		sc.close();
	}

}

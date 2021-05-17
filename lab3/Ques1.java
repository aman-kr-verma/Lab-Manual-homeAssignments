//Write a Java program that reads a line of integers
//and then displays each integer and the sum
//of all integers. (Use String Tokenizer class)?

package lab3;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("Integers in the array:");
		while(st.hasMoreTokens()) {
			int i=Integer.parseInt(st.nextToken());  
			sum+=i;
			System.out.println(i);
		}
		System.out.println("Sum of integers in the Line: " + sum);
	sc.close();
	}
}

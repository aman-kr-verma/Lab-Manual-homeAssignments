/*
 *Create a method that accepts a number and modifies it such that the each of the digit in the
 * newly formed number is equal to
 * the difference between two consecutive digits in the original number.
 * The digit in the units place can be left as it is. 
 */

package lab3;
import java.util.*;
class A2 {
	public String func(int x) {
		String s=String.valueOf(x);
		System.out.println("s" + s);
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length()-1;i++) {
			int curr = Integer.parseInt(String.valueOf(sb.charAt(i)));
			int next = Integer.parseInt(String.valueOf(sb.charAt(i+1)));
			int diff=Math.abs(curr-next);
			char temp = Integer.toString(diff).charAt(0);
			sb.setCharAt(i, temp);
		}
		String res=sb.toString();
		return res;
	}
}

public class Ques4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		A2 obj=new A2();
		System.out.println("Desired output: ");
		System.out.println(obj.func(in));
		sc.close();
	}

}

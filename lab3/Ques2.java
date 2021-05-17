/*: Create a class containing a method to create the mirror
 *  image of a String. The method should return the two Strings
 *  separated with a pipe(|) symbol 
*/
package lab3;
import java.util.Scanner;
class A {
	private String str;
	public A(String s) {
		this.str=s;
	}
	public String func() {
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		return rev;
	}
}
public class Ques2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		A obj=new A(in);
		String out=obj.func();
		System.out.println(in+"|"+out);
	sc.close();
	}
}

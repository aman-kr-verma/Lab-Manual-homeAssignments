/*Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right
 *  each character in the String comes after the previous characters in the
 * Alphabetical order. For Example: ANT is a positive String 
 * (Since T comes after N and N comes after A). 
 * The method should return true if the entered string is positive.


 * 
 */
package lab3;
import java.util.*;
class A4 {
	public boolean func(String s) {
		for(int i=0; i<s.length()-1;i++) {
			int cur=s.charAt(i);
			int nxt=s.charAt(i+1);
			if((nxt-cur)<0) {
				return false;
			}
		}
		return true;
	}
}
public class Ques6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		A4 obj=new A4();
		if(obj.func(in)) {
			System.out.println("POSITIVE NUMBER");
		}
		else {
			System.out.println("NEGATIVE NUMBER");
		}
		sc.close();
	}

}

/*Create a method which accepts a String and
 * replaces all the consonants in the String with the next alphabet. 
 */

package lab3;
import java.util.Scanner;
class A1 {
	public String func(String s) {
		StringBuilder sb=new StringBuilder(s);
		for (int i=0;i<sb.length();i++) {
			char ele=sb.charAt(i);
			if(ele!='a' && ele!='e' && ele!='i' && ele!='o' && ele!='u') {
				int code=ele;
				int out=code+1;
				char outele=(char)out;
				sb.setCharAt(i, outele);
			}
		}
		String res=sb.toString();
		return res;
	}
}

public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		A1 obj=new A1();
		System.out.println("Desired output is: ");
		System.out.println(obj.func(in));
		sc.close();
	}

}

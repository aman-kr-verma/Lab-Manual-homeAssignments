//Write a Java program that displays the number of characters, lines and words in a text? 
package lab3;
import java.util.*;



public class Ques5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int i=0;
		int words=1;
		int lines=0;
		int chrs=0;
		while(i<text.length()) {
			if(text.charAt(i)=='.') {
				lines+=1;
			}
			else if(text.charAt(i)==' ') {
				words+=1;
			}
			else {
				chrs+=1;
			}
			i+=1;
		}
		System.out.println("No. of characters: " + chrs);
		System.out.println("No. of lines: " + lines);
		System.out.println("No. of words: " + words);
		sc.close();
	}

}

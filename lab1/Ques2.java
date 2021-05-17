/*
 * Write a java program that simulates a traffic light.
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons.
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in 
 * the console .Initially there is no message shown
 */

package lab1;
import java.util.Scanner;
public class Ques2 {
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char c='y';
		
		do {
			System.out.println("Press 'R' for Red ");
			System.out.println("Press 'Y' for Yellow ");
			System.out.println("Press 'G' for Green ");
			System.out.println("Enter your choice");
			char ch=input.next().trim().charAt(0);
		switch (ch) {
		case 'R':
			System.out.println("Stop!!!");
			break;
		case 'Y':
			System.out.println("Ready");
			break;	
		case 'G':
			System.out.println("Go!!!");
			break;
		default:
			break;
			
		}
		System.out.println("Do you want to continue(y/n)");
		c=input.next().trim().charAt(0);
		} while(c=='y');
		input.close();
	}

}

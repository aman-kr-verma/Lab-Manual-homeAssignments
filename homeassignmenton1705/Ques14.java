package homeassignmenton1705;
import java.util.*;
public class Ques14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		int i=0;
		boolean at=false;
		boolean dot=false;
		while(i<email.length()) {
			if(email.charAt(i)=='@') {
				at=true;
			}
			else if(email.charAt(i)=='.') {
				dot=true;
			}
		i+=1;	
		}
		if(at==true && dot==true) {
			System.out.println("Contains both @ and . ");
		}
		else {
			System.out.println("Do not contains both @ and . ");
		}
		sc.close();
	}

}

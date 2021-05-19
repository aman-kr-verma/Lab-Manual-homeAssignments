package payrollpolymorphism;
import java.util.*;
public class Mainpayroll {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("Enter Salary");
		int sal=sc.nextInt();
		System.out.println("Select any one:\n1. Admin Panel\n 2.Academic Panel");
		int ch=sc.nextInt();
		if(ch==1) {
			Admin obj=new Admin(name,sal);
			obj.adjustSalary(sal);
			obj.printDetails();
		}
		else if(ch==2) {
			Academic obj1=new Academic(name,sal);
			obj1.adjustSalary(sal);
			obj1.printDetails();
		}
		else {
			System.out.println("INVALID CHOICE!");
		}
		sc.close();
	}

}

package polymorphism2;
import java.util.*;
public class MainTransaction {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one choice: \n1. Balance Enquiry \n2. Withdrawal\n3. Deposit");
		int ch=sc.nextInt();
		if(ch==1) {
			BalanceInquiry obj=new BalanceInquiry();
			obj.execute();
		}
		else if(ch==2) {
			System.out.println("Enter amount ");
			double amt=sc.nextDouble();
			Withdrawal obj1=new Withdrawal(amt);
			obj1.execute();
			obj1.printDetails();
		}
		else if(ch==3) {
			System.out.println("Enter amount ");
			double amt1=sc.nextDouble();
			Deposit obj2=new Deposit(amt1);
			obj2.execute();
			obj2.printDetails();
		}
		else {
			System.out.println("INVALID CHOICE");
		}
	}

}

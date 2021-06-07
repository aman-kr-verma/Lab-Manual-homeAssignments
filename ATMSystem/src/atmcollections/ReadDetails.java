package atmcollections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Aman 
 * 
 */
public class ReadDetails {
	
	public void readDetails() {
		Scanner sc=new Scanner(System.in);
		BankCustomer cust=new BankCustomer();
		Account cust_acc=new Account();
		ATMCard cust_atm=new ATMCard();
		System.out.println("Welcome to the Banking System..");
		ArrayList<BankCustomer> customers=new ArrayList<BankCustomer>();
		System.out.println("Create a User Account");
		System.out.println("Enter the details as prompted\nEnter the customer name ");
		String cName=sc.next();
		System.out.println("Enter Address");
		String add=sc.next();
		sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.next();
		sc.nextLine();
		cust.setCustomerName(cName);
		cust.setAddress(add);
		cust.setEmail(email);
		//account details
		System.out.println("Enter the account details");
		System.out.println("Enter the account number.");
		int accno=sc.nextInt();
		System.out.println("Enter the account Balance");
		double accbal=sc.nextDouble();
		cust_acc.setAccountNumber(accno);
		cust_acc.setBalance(accbal);
		//atm card details
		System.out.println("Enter ATM CARD details ");
		System.out.println("set atm pin");
		int pin=sc.nextInt();
		System.out.println("Enter CardID");
		long cardid=sc.nextLong();
		cust_atm.setPIN(pin);
		cust_atm.setCardID(cardid);
		cust.setAcc(cust_acc);
		cust.setCard(cust_atm);
		System.out.println(cust.toString());
	}
	
}

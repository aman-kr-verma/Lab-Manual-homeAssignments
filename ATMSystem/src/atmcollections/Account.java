package atmcollections;

/*
 * @author Aman 
 * 
 */

public class Account extends BankCustomer {
	private int accountNumber;
	private double balance;
	//private Transaction trans;
	
	public Account() {
		super();
	}
	public Account(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void calculateInterest() {
		
	}
	public void updateAccount() {
		
	}
	public void verifyWithdrawAmount() {
		
	}
	
	
}

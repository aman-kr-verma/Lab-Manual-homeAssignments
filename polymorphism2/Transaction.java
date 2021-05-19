package polymorphism2;

public class Transaction {
	private int accountNumber;
	
	public Transaction() {
		
	}
	public Transaction(int accno) {
		this.accountNumber=accno;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	public void execute() {
		System.out.println("Ececute in Transaction class");
	}
	public void printDetails() {
		System.out.println("Account Number: " + this.getAccountNumber());;
	}
}

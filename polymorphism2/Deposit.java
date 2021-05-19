package polymorphism2;

public class Deposit extends Transaction {
	private double amount;
	public Deposit(double amt) {
		this.amount=amt;
	}
	
	public void execute() {
		System.out.println("Execute in Deposit class");
	}
	public void printDetails() {
		System.out.println("Amount: " + this.amount);
	}
}

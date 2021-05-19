package polymorphism2;

public class Withdrawal extends Transaction {
	public double amount;
	
	public Withdrawal(double amt) {
		this.amount=amt;
	}
	public void execute() {
		System.out.println("Execute in withdrawal class");
	}
	public void printDetails() {
		System.out.println("Amount: " + this.amount);
	}
}

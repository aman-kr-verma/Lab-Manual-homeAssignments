package atmcollections;

/*
 * @author Aman 
 * 
 */

public class CardScanner {
	public void acceptCard() {
		System.out.println("Welcome User!\nInsert the Card");
	}
	public void readCard() {
		System.out.println("Please hold on, Reading the card..It will take maximum of 30 seconds..");
	}
	public void ejectCard() {
		System.out.println("ejecting the card");
	}
	public void validatePIN() {
		System.out.println("Validating PIN, please wait...");
	}
}

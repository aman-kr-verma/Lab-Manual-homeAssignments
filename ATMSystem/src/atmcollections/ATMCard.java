package atmcollections;

/*
 * @author Aman 
 * 
 */

public class ATMCard {
	private int PIN;
	private long cardID;
	private Account acc;
	
	
	
	public ATMCard() {
		super();
	}
	public ATMCard(int pIN, long cardID, Account acc) {
		super();
		PIN = pIN;
		this.cardID = cardID;
		this.acc = acc;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	
	
	
	public long getCardID() {
		return cardID;
	}
	public void setCardID(long cardID) {
		this.cardID = cardID;
	}
	public Account getAccount() {
		return acc;
	}
	
	
	
	
}

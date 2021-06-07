package atmcollections;
/*
 * @author Aman 
 * 
 */

public class BankCustomer {
	private String customerName,address,email;
	private ATMCard card;
	private Account acc;
	
	
	
	public BankCustomer() {
		super();
	}
	public BankCustomer(String customerName, String address, String email) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
//		this.card=card;
//		this.acc=acc;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public ATMCard getCard() {
		return card;
	}
	public void setCard(ATMCard card) {
		this.card = card;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public void insertCard() {
		return;
	}
    public void selectTransaction() {
		return;
	}
    public void enterPIN(int inNumber) {
		return;
	}
    public void changePIN() {
		return;
	}
    public void withdrawCash() {
		return;
	}
    public void requestTransactionSummary() {
		return;
	}
    public void acceptAmount() {
		return;
	}
	@Override
	public String toString() {
		return "BankCustomer [customerName=" + customerName + ", address=" + address + ", email=" + email + ", card="
				+ card.getCardID() + ", acc=" + acc.getAccountNumber() + "]";
	}
    
    

}

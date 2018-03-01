package week3.day10.exam._04_casting;

public class CheckingAccount extends Account {
	private String _cardNo;
	
	public CheckingAccount(String ownerName, String accountNo, String cardNo, int balance) {
		super(ownerName, accountNo ,balance);
		_cardNo = cardNo;
	}
	
	void setCardNo(String cardNo) {
		_cardNo = cardNo;
	}
	
	String getCardNo() {
		return _cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(_cardNo) || (_balance < amount))
			throw new Exception("Cannot pay");
		return withdraw(amount);
	}

}

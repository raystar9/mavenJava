package week3.day09.exam.polymorphism;

public class CheckingAccount extends Account {
	private String _cardNo;
	
	public CheckingAccount(String ownerName, String accountNo, String cardNo, int balance) {
		super(ownerName, accountNo ,balance);
		_cardNo = cardNo;
	}
	
	void setCardNo(String cardNo) {
		_cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(_cardNo) || (_balance < amount))
			throw new Exception("Cannot pay");
		return withdraw(amount);
	}

}

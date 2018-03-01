package week2.day8.exam.inheritance;

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

package week3.day09.exam.polymorphism;

public class MinusAccount extends Account {
	private int _minusLimit;
	
	public MinusAccount(String ownerName, String accountNo, int balance, int minusLimit) {
		super(ownerName, accountNo, balance);
		_minusLimit = minusLimit;
	}
	
	@Override
	int withdraw(int amount) throws Exception {
		if(_balance + _minusLimit < amount) {
			throw new Exception("low balance");
		}
		_balance -= amount;
		return amount;
	}
}

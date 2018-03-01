package week3.day09.exam.polymorphism;

public class PointAccount extends Account{
	private int _bonusPoint;

	public PointAccount(String ownerName, String accountNo, int balance, int bonusPoint) {
		super(ownerName, accountNo, balance);
		_bonusPoint = bonusPoint;
	}

	@Override
	void deposit(int amount) {
		super.deposit(amount);
		_bonusPoint += (int)(amount / 200);
	}
	
	public int getBonusPoint() {
		return _bonusPoint;
	}
}

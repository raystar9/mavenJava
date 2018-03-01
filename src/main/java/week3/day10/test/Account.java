package week3.day10.test;

public class Account {
	String _accountNo;
	String _ownerName;
	int _balance;
	
	public Account(String ownerName, String accountNo, int balance) {
		_ownerName = ownerName;
		_accountNo = accountNo;
		_balance = balance;
	}
	
	void deposit(int amount) {
		_balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if(_balance < amount) {
			throw new Exception("low balance");
		}
		_balance -= amount;
		return amount;
	}
	
	public int getBalance() {
		
		return _balance;
	}
	
	public String getOwnerName() {
		
		return _ownerName;
	}
	
	public String getAccountNo() {
		
		return _accountNo;
	}
	
}

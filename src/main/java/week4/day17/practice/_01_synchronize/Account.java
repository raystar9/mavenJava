package week4.day17.practice._01_synchronize;

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
	
	int withdraw(int amount){
		if(_balance < amount) {
			return 0;
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

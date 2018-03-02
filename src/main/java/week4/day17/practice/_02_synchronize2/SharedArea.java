package week4.day17.practice._02_synchronize2;

class SharedArea {
	Account _account1;
	Account _account2;
	
	//동기화 블럭 사용
	/*void transfer() {
		synchronized (this) {
			_account1.withdraw(1000000);
//		System.out.println("Lee withdrawal 1M won");
			_account2.deposit(1000000);
//		System.out.println("Seong deposit 1M won");
		}
	}*/			
	
	//동기화 메서드 사용
	synchronized void transfer() {
		_account1.withdraw(1000000);
		_account2.deposit(1000000);
	}
	
	synchronized int getBalance() {
		return _account1.getBalance() + _account2.getBalance();
		
	}
}

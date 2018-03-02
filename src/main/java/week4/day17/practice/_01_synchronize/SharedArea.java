package week4.day17.practice._01_synchronize;

class SharedArea {
	Account _account1;
	Account _account2;

	synchronized void transfer() {
		this._account1.withdraw(1000000);
		System.out.println("Lee withdrawal 1M won");
		this._account2.deposit(1000000);
		System.out.println("Seong deposit 1M won");
	}
	
	synchronized void getTotal() {
		
	}

}

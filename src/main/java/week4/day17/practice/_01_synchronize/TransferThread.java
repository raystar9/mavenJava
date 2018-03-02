package week4.day17.practice._01_synchronize;

class TransferThread extends Thread {

	SharedArea _sharedArea;
	
	TransferThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int i = 0; i < 12; i++) {
			synchronized (_sharedArea) {
				_sharedArea._account1.withdraw(1000000);
				System.out.println("Lee withdrawal 1M won");
				_sharedArea._account2.deposit(1000000);
				System.out.println("Seong deposit 1M won");
			}
		}
	}
}

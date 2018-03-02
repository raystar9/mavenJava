package week4.day16.exam._13_synProblem;

class TransferThread extends Thread {

	SharedArea _sharedArea;
	
	TransferThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int i = 0; i < 12; i++) {
			_sharedArea._account1.withdraw(1000000);
			System.out.println("Lee withdrawal 1M won");
			_sharedArea._account2.deposit(1000000);
			System.out.println("Seong deposit 1M won");
		}
		
	}
	
	
}

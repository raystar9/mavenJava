package week4.day16.exam._13_synProblem;

class PrintThread extends Thread {
	SharedArea _sharedArea;
	
	PrintThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			int sum = _sharedArea._account1.getBalance() + _sharedArea._account2.getBalance();
			System.out.println("sum of two : " + sum);
		}
		try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

package week4.day17.practice._02_synchronize2;

class PrintThread extends Thread {
	SharedArea _sharedArea;
	
	PrintThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("sum of two : " + _sharedArea.getBalance());
			try {
				Thread.sleep(2);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

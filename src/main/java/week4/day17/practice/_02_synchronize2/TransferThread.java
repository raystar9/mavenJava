package week4.day17.practice._02_synchronize2;

class TransferThread extends Thread {

	SharedArea _sharedArea;
	
	TransferThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int i = 0; i < 12; i++) {
			_sharedArea.transfer();
		}
	}
}

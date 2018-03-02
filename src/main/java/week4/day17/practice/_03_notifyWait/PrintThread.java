package week4.day17.practice._03_notifyWait;

class PrintThread extends Thread{
	
	private SharedArea _sharedArea;
	
	PrintThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		if(!_sharedArea.isReady()) {
			try {
				synchronized (_sharedArea) {
					_sharedArea.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Print from PrintThread : %.2f\n", _sharedArea.getResult());
	}
}

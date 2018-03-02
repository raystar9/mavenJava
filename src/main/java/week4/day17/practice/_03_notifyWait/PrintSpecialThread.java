package week4.day17.practice._03_notifyWait;

class PrintSpecialThread extends Thread{
	
	private SharedArea _sharedArea;
	
	PrintSpecialThread(SharedArea sharedArea){
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
		System.out.println("**** " + _sharedArea.getResult() + " ****");
	}
}

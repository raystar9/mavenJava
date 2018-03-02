package week4.day17.practice._04_threadState;

class PrintMoreThread extends Thread{
	
	private SharedArea _sharedArea;
	
	PrintMoreThread(SharedArea sharedArea){
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
		System.out.println("Print from PrintMoreThread : " + _sharedArea.getResult());
	}
}

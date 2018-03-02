package week4.day16.exam._12_threadCommunication;

class PrintThread extends Thread{
	
	private SharedArea _sharedArea;
	
	PrintThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}
	
	
	@Override
	public void run() {
		while(!_sharedArea.isReady()) {
			System.out.println("running");
		}
		System.out.println("Data in sharedArea : " + _sharedArea.getResult());
	}
}

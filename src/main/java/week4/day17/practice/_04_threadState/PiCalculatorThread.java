package week4.day17.practice._04_threadState;

class PiCalculatorThread extends Thread{

	private SharedArea _sharedArea;
	
	PiCalculatorThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}
	@Override
	public void run() {
		double total = 0.0;
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt/2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}
		_sharedArea.setResult(total * 4);
		_sharedArea.ready();
		
		synchronized (_sharedArea) {
//			_sharedArea.notify();
			_sharedArea.notifyAll();
			
		}
	}

}

package week4.day16.exam._12_threadCommunication;

class PiCalculatorThread implements Runnable{

	private SharedArea _sharedArea;
	
	PiCalculatorThread(SharedArea sharedArea){
		_sharedArea = sharedArea;
	}
	@Override
	public void run() {
		double total = 0.0;
		double pi;
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt/2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}
		pi = total * 4;
		_sharedArea.ready();
		_sharedArea.setResult(pi);
		System.out.println(pi);
	}

}

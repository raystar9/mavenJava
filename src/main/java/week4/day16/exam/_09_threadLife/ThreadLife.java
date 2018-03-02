package week4.day16.exam._09_threadLife;

class ThreadLife implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Current thread name : " + Thread.currentThread().getName());
			System.out.println("Iterate : " + i);
		}

	}

}

package week4.day16.exam._10_threadPriority;

class ThreadLife implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Current thread name : " + Thread.currentThread().getName());
			System.out.println("Iterate : " + i);
		}

	}

}

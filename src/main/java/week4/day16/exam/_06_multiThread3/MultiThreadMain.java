package week4.day16.exam._06_multiThread3;

class MultiThreadMain {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		Thread thread2 = new DigitThread();
		thread2.start();
		Thread thread3 = new AlphabetThread();
		thread3.start();
	}
}

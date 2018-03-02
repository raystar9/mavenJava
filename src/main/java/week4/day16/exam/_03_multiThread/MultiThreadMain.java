package week4.day16.exam._03_multiThread;

class MultiThreadMain {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		thread.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("Thread name = " + Thread.currentThread().getName());
	}
}

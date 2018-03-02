package week4.day16.exam._10_threadPriority;

class ThreadMain {
	public static int MAX_PRIROITY = 1;
	public static int MIN_PRIROITY = 10;

	public static void main(String[] args) {
		ThreadLife threadLife = new ThreadLife();
		Thread thread1 = new Thread(threadLife, "first");
		Thread thread2 = new Thread(threadLife, "second");
		Thread thread3 = new Thread(threadLife, "third");

		thread1.setPriority(MIN_PRIROITY);
		thread2.setPriority(MAX_PRIROITY);
		System.out.println("first priority = " + thread1.getPriority());
		System.out.println("second priority = " + thread2.getPriority());
		System.out.println("third priority = " + thread3.getPriority());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

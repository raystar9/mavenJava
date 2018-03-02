package week4.day16.exam._09_threadLife;

class ThreadMain {

	public static void main(String[] args) {
		ThreadLife threadLife = new ThreadLife();
		Thread thread1 = new Thread(threadLife, "first");
		Thread thread2 = new Thread(threadLife, "second");
		Thread thread3 = new Thread(threadLife, "third");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

package week4.day17.practice._05_join;

class JoinMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " Start");
		Runnable r = new MyRunnable();
		Thread myThread = new Thread(r);
		
		myThread.start();
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End");
	}
}

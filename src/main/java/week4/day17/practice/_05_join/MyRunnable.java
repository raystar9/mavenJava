package week4.day17.practice._05_join;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
		third();
	}
	
	public void third() {
		System.out.println("third");
	}
}

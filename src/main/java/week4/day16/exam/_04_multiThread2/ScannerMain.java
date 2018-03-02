package week4.day16.exam._04_multiThread2;

class ScannerMain {

	public static void main(String[] args) {
		Thread thread = new ScannerThread();
		thread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}

}

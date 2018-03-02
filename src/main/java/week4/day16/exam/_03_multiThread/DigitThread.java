package week4.day16.exam._03_multiThread;

class DigitThread extends Thread {

	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
		System.out.println();
		System.out.println("Second Thread name =" + Thread.currentThread().getName());
	}
}

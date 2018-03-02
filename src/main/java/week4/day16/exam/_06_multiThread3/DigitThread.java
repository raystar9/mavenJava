package week4.day16.exam._06_multiThread3;

class DigitThread extends Thread {

	@Override
	public void run() {
		try {
			for (int cnt = 0; cnt < 10; cnt++) {
				Thread.sleep(750);
				System.out.print(cnt);
			}
			System.out.println();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

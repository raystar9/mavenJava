package week4.day16.exam._06_multiThread3;

class AlphabetThread extends Thread {

	@Override
	public void run() {
		try {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				Thread.sleep(300);
				System.out.print(ch);
			}
			System.out.println();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

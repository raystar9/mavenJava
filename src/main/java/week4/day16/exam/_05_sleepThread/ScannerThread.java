package week4.day16.exam._05_sleepThread;

class ScannerThread extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.print(i);
		}
	}
	
}

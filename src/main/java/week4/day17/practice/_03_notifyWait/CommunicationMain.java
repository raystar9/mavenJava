package week4.day17.practice._03_notifyWait;

class CommunicationMain {

	public static void main(String[] args) {
		SharedArea sharedArea = new SharedArea();
		
		PrintThread printThread = new PrintThread(sharedArea);
		PrintMoreThread pmThread = new PrintMoreThread(sharedArea);
		PrintSpecialThread psThread = new PrintSpecialThread(sharedArea);
		PiCalculatorThread calThread = new PiCalculatorThread(sharedArea);
		
		
		calThread.start();
		pmThread.start();
		psThread.start();
		printThread.start();
		

	}

}

package week4.day16.exam._12_threadCommunication;

class CommunicationMain {

	public static void main(String[] args) {
		SharedArea sharedArea = new SharedArea();
		
		PrintThread printThread = new PrintThread(sharedArea);
		PiCalculatorThread pThread = new PiCalculatorThread(sharedArea);
		
		pThread.run();
		printThread.run();

	}

}

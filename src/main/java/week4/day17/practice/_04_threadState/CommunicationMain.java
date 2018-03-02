package week4.day17.practice._04_threadState;

class CommunicationMain {

	public static void main(String[] args) {
		SharedArea sharedArea = new SharedArea();
		
		PrintThread printThread = new PrintThread(sharedArea);
		PiCalculatorThread calThread = new PiCalculatorThread(sharedArea);
		
		MonitorThread printMonitor = new MonitorThread(printThread);
		MonitorThread piMonitor = new MonitorThread(calThread);
		
		calThread.setName("Calculator Thread");
		printThread.setName("PrintThread");
		
		calThread.start();
		
		printThread.start();
		
		printMonitor.start();
		piMonitor.start();
	}

}

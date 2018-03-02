package week4.day16.exam._11_daemonThread;

class DaemonThreadMain {

	public static void main(String[] args) {
		AutosaveThread autosaveThread = new AutosaveThread();
		Thread thread = new Thread(autosaveThread);
		
		thread.setDaemon(true);
		
		thread.start();
		
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 5) {
				autosaveThread.autosave = true;
			}
		}
		System.out.println("main thread ended");
	}

}

package week4.day16.exam._11_daemonThread;

class AutosaveThread implements Runnable{
	
	static boolean autosave = false;
	@Override
	public void run() {
		
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(autosave) {
				autosave();
			}
		}
	}
	private void autosave(){
		System.out.println("Automatically saved");
	}
	
}

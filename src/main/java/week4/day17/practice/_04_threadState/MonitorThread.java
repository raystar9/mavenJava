package week4.day17.practice._04_threadState;

class MonitorThread extends Thread{

	Thread _thread;
	
	MonitorThread(Thread thread){
		_thread = thread;
	}
	
	@Override
	public void run() {
		Thread.State state;
		while(true) {
			state = _thread.getState();
			
			System.out.println(_thread.getName() + " : "+ state);
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

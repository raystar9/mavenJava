package week4.day16.exam._07_timeCheck;

import java.text.SimpleDateFormat;
import java.util.Date;

class SleepThread extends Thread{

	@Override
	public void run() {
		Date date = new Date();
		long targetTime = System.currentTimeMillis()/1000*1000+500;
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd E / a H:mm:ss:SSS");
		while(true) {
			if(System.currentTimeMillis() >= targetTime) {
				date.setTime(System.currentTimeMillis());
				System.out.println(form.format(date));
				targetTime += 1000;
			}
		}
	}
	
}

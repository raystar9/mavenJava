package week5.day18.practice._09_buffer2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferOutMain {

static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(resourceAddress + "123.txt");
			bos = new BufferedOutputStream(fos, 5);
			
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			//버퍼가 차지 않더라도 flush() method 호출을 통해 남은 버퍼를 보내준다.
//			bos.flush();
			fos.close();
		} catch (IOException e){
			System.out.println("IO exception occurred");
		} 
	}


}

package week5.day18.practice._08_buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferOutMain {

static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(resourceAddress + "output1"))){
			byte[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
			
			for(int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
			}
		} catch (IOException e){
			System.out.println("IO exception occurred");
		} 
	}


}

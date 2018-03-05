package week5.day18.practice._01_fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

class OutputMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(resourceAddress + "output1.dat");
			byte[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
			
			for(int i = 0; i < arr.length; i++) {
				out.write(arr[i]);
			}
		} catch (IOException e){
			System.out.println("IO exception occurred");
		} finally {
			try {
				out.close();
				System.out.println("file save success");
			} catch (IOException e) {
				System.out.println("error occured on close stream");;
			}
		}

	}

}

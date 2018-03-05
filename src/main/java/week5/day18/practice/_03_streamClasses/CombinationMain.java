package week5.day18.practice._03_streamClasses;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CombinationMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(resourceAddress + "output4"));
			
			out.writeUTF("Name");
			out.writeInt(5);
			out.writeDouble(3.14);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

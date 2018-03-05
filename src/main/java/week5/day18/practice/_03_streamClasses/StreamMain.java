package week5.day18.practice._03_streamClasses;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class StreamMain {

	static final String resourceAddress = "src/main/resources/";
	
	public static void main(String[] args) {
		DataOutputStream dos = null;
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		try {
			dos = new DataOutputStream(new FileOutputStream(resourceAddress + "output2.dat"));
			
			for(int i = 0; i < arr.length; i++) {
				dos.writeInt(arr[i]);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("cannot write");
		} finally {
			try {
				if(dos != null) 
					dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		DataInputStream dis = null;
		int number;
		try {
			dis = new DataInputStream(new FileInputStream(resourceAddress + "output2.dat"));
			while((number = dis.readInt()) != -1) {
				System.out.println(number);
			}
			
		} catch (EOFException e) {
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
